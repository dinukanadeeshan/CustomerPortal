package com.vgates.customerportal.dao.impl;

import com.vgates.customerportal.dao.MasterItemDAO;
import com.vgates.customerportal.model.MasterItem;
import com.vgates.customerportal.session.HibernateSessionManager;
import com.vgates.customerportal.util.MethodResult;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * @author Chamith
 */
public class MasterItemDAOImpl implements MasterItemDAO {

    private final static Logger LOGGER = Logger.getLogger(MasterItemDAOImpl.class);

    private final Session session;

    public MasterItemDAOImpl() {
        session = HibernateSessionManager.getSessionFactory().openSession();
    }

    @Override
    public MethodResult addNewMasterItem(MasterItem item) {
        MethodResult result = new MethodResult();
        result.setOk(false);
        try {
            session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
            result.setOk(true);
            result.setMessage("Item Details Successfully Added !");
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            result.setMessage("Sorry Item Detail Add Error !");
            result.setStackMessage(ex.getMessage());
        }
        return result;
    }

    @Override
    public MethodResult updateMasterItem(MasterItem item) {
        MethodResult result = new MethodResult();
        result.setOk(false);
        try {
            session.beginTransaction();
            session.update(item);
            session.flush();
            session.getTransaction().commit();
            result.setOk(true);
            result.setMessage("Item Details Successfully Updated !");
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            result.setMessage("Sorry Item Detail Update Error !");
            result.setStackMessage(ex.getMessage());
        }
        return result;
    }

    @Override
    public MethodResult changeItemStatus(boolean status, long itemID) {
        MethodResult result = new MethodResult();
        result.setOk(false);
        try {
            session.beginTransaction();
            Query query = session.createQuery("UPDATE MasterItem item SET item.active = :status WHERE item.id= :id");
            query.setParameter("status", status);
            query.setParameter("id", itemID);
            query.executeUpdate();
            session.flush();
            session.getTransaction().commit();
            result.setOk(true);
            result.setMessage("Item Status Successfully Updated !");
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            result.setMessage("Sorry Item Status Change Error !");
            result.setStackMessage(ex.getMessage());
        }
        return result;
    }

    @Override
    public MasterItem findMasterItemByID(long id) {
        MasterItem item = null;
        try {
            Query query = session.createQuery("SELECT item FROM MasterItem item WHERE item.id= :id");
            query.setParameter("id", id);
            List<MasterItem> resultList = (List<MasterItem>) query.list();
            if (resultList != null && !resultList.isEmpty()) {
                item = resultList.get(0);
            }
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
        return item;
    }

    @Override
    public MasterItem findMasterItemByName(String name) {
        MasterItem item = null;
        try {
            Query query = session.createQuery("SELECT item FROM MasterItem item WHERE item.itemName= :name");
            query.setParameter("name", name);
            List<MasterItem> resultList = (List<MasterItem>) query.list();
            if (resultList != null && !resultList.isEmpty()) {
                item = resultList.get(0);
            }
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
        return item;
    }

    @Override
    public List<MasterItem> findMasterItemByNameAndCategory(String name, String category) {
        List<MasterItem> resultList;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT item FROM MasterItem item WHERE item.active =true  ");
            if (name != null && !name.isEmpty()) {
                sb.append(" AND item.itemName LIKE :name ");
            }
            if (category != null && !category.isEmpty()) {
                sb.append(" AND item.category LIKE :category");
            }
            Query query = session.createQuery(sb.toString());
            query.setParameter("name", name);
            resultList = (List<MasterItem>) query.list();
        } catch (Exception ex) {
            resultList = null;
            LOGGER.error(ex.getMessage(), ex);
        }
        return resultList;
    }

    @Override
    public List<MasterItem> findAllActiveMasterItems() {
        List<MasterItem> resultList = null;
        try {
            Query query = session.createQuery("SELECT item FROM MasterItem item WHERE item.active= true ");
            resultList = (List<MasterItem>) query.list();
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
        return resultList;
    }
}
