package com.vgates.customerportal.dao.impl;

import com.vgates.customerportal.dao.UserDetailDAO;
import com.vgates.customerportal.model.UserDetail;
import com.vgates.customerportal.session.HibernateSessionManager;
import com.vgates.customerportal.util.MethodResult;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import javax.persistence.NoResultException;
import java.util.List;

/**
 * @author Chamith
 */
public class UserDetailDAOImpl implements UserDetailDAO {
    private final static Logger LOGGER = Logger.getLogger(UserDetailDAOImpl.class);

    private final Session session;

    public UserDetailDAOImpl() {
        session = HibernateSessionManager.getSessionFactory().openSession();
    }

    public MethodResult addNewUserDetail(UserDetail userDetail) {
        MethodResult result = new MethodResult();
        result.setOk(false);
        try {
            session.beginTransaction();
            session.save(userDetail);
            session.getTransaction().commit();
            session.close();
            result.setOk(true);
            result.setMessage("User Details Successfully Added !");
        } catch (Exception ex) {
            LOGGER.error("Sorry User Detail Add Error !", ex);
            result.setMessage("Sorry User Detail Add Error !");
            result.setStackMessage(ex.getMessage());
        }
        return result;
    }

    public MethodResult updateUserDetail(UserDetail userDetail) {
        MethodResult result = new MethodResult();
        result.setOk(false);
        try {
            session.beginTransaction();
            session.update(userDetail);
            session.flush();
            session.getTransaction().commit();
            result.setOk(true);
            result.setMessage("User Details Successfully updated !");
        } catch (Exception ex) {
            LOGGER.error("Sorry User Detail Update Error !", ex);
            result.setMessage("Sorry User Detail Update Error !");
            result.setStackMessage(ex.getMessage());
        }
        return result;
    }

    public MethodResult changeUserStatus(boolean status, long userID) {
        MethodResult result = new MethodResult();
        result.setOk(false);
        try {
            session.beginTransaction();
            Query query = session.createQuery("UPDATE UserDetail user SET user.active = :status WHERE user.id= :id");
            query.setParameter("status", status);
            query.setParameter("id", userID);
            query.executeUpdate();
            session.flush();
            session.getTransaction().commit();
            result.setOk(true);
            result.setMessage("User status Successfully updated !");
        } catch (Exception ex) {
            LOGGER.error("Sorry User Status Change Error !", ex);
            result.setMessage("Sorry User Status Change Error !!");
            result.setStackMessage(ex.getMessage());
        }
        return result;
    }

    public UserDetail findUserDetailByID(long id) {
        UserDetail userDetail = null;
        try {
            Query query = session.createQuery("SELECT user FROM UserDetail user WHERE user.id= :id");
            query.setParameter("id", id);
            List<UserDetail> resultList = (List<UserDetail>) query.list();
            userDetail = resultList.get(0);
        } catch (NoResultException ex) {
            LOGGER.error("Sorry Cannot Find User Detail !", ex);
        }
        return userDetail;
    }

    public UserDetail findUserDetailForActiveLogin() {
        UserDetail userDetail = null;
        try {
            Query query = session.createQuery("SELECT user FROM UserDetail user WHERE user.activeUser= true");
            List<UserDetail> resultList = (List<UserDetail>) query.list();
            userDetail = resultList.get(0);
        } catch (NoResultException ex) {
            LOGGER.error("Sorry Cannot Find User Detail !", ex);
        }
        return userDetail;
    }

    public boolean loginUser(String userName, String password) {
        boolean loginSuccess = false;
        try {
            Query query = session.createQuery("SELECT user FROM UserDetail user WHERE user.userName= :userName AND user.password= :password AND user.active=true ");
            query.setParameter("userName", userName);
            query.setParameter("password", password);
            List<UserDetail> resultList = (List<UserDetail>) query.list();
            if (resultList != null && !resultList.isEmpty()) {
                UserDetail userDetail = resultList.get(0);
                userDetail.setActiveUser(Boolean.TRUE);
                loginSuccess = Boolean.TRUE;
                updateUserDetail(userDetail);
            }
        } catch (NoResultException ex) {
            LOGGER.error("Sorry Cannot Find User Detail To Login !", ex);
        }
        return loginSuccess;
    }

    public boolean logoutUser(String userName) {
        boolean logoutSuccess = false;
        try {
            session.beginTransaction();
            Query query = session.createQuery("UPDATE UserDetail user SET user.activeUser=false,user.lastActDate =current_timestamp WHERE user.userName= :userName ");
            query.setParameter("userName", userName);
            query.executeUpdate();
            session.flush();
            session.getTransaction().commit();
            logoutSuccess = Boolean.TRUE;
        } catch (NoResultException ex) {
            LOGGER.error("Logout Failed !", ex);
        }
        return logoutSuccess;

    }

    public boolean logoutAllUsers() {
        boolean logoutSuccess = false;
        try {
            session.beginTransaction();
            Query query = session.createQuery("UPDATE UserDetail user SET user.activeUser=false, user.lastActDate =CURRENT_TIMESTAMP ");
            query.executeUpdate();
            session.flush();
            session.getTransaction().commit();
            logoutSuccess = Boolean.TRUE;
        } catch (NoResultException ex) {
            LOGGER.error("Logout Failed !", ex);
        }
        return logoutSuccess;

    }
}
