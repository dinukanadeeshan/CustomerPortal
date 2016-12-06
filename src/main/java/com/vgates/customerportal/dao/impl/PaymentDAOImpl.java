package com.vgates.customerportal.dao.impl;

import com.vgates.customerportal.dao.PaymentDAO;
import com.vgates.customerportal.model.Payment;
import com.vgates.customerportal.session.HibernateSessionManager;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import javax.persistence.NoResultException;
import java.util.List;

/**
 * Created by Chamith on 11/21/2016.
 */
public class PaymentDAOImpl implements PaymentDAO {
    private final static Logger LOGGER = Logger.getLogger(PaymentDAOImpl.class);

    private final Session session;

    public PaymentDAOImpl() {
        session = HibernateSessionManager.getSessionFactory().openSession();
    }

    public void addNewPayment(Payment payment) {
        try {
            session.beginTransaction();
            session.save(payment);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            LOGGER.error("Sorry Payment Detail Add Error !", ex);
        }

    }

    public void updatePayment(Payment payment) {
        try {
            session.beginTransaction();
            session.update(payment);
            session.flush();
            session.getTransaction().commit();
        } catch (Exception ex) {
            LOGGER.error("Sorry Payment Detail Update Error !", ex);
        }
    }

    public void changePaymentStatus(boolean status, long paymentID) {
        try {
            session.beginTransaction();
            Query query = session.createQuery("UPDATE Payment payment SET payment.active = :status WHERE payment.id= :id");
            query.setParameter("status", status);
            query.setParameter("id", paymentID);
            query.executeUpdate();
            session.flush();
            session.getTransaction().commit();
        } catch (Exception ex) {
            LOGGER.error("Sorry Payment Status Change Error !", ex);
        }
    }

    public Payment findPaymentByID(long id) {
        Payment payment = null;
        try {
            Query query = session.createQuery("SELECT payment FROM Payment payment WHERE payment.id= :id");
            query.setParameter("id", id);
            List<Payment> resultList = (List<Payment>) query.list();
            payment = resultList.get(0);
        } catch (NoResultException ex) {
            LOGGER.error("Sorry Cannot Find Payment Detail !", ex);
        }
        return payment;
    }
}