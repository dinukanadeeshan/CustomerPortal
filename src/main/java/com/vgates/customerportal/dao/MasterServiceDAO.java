package com.vgates.customerportal.dao;

import com.vgates.customerportal.model.MasterService;

/**
 * Created by Chamith on 11/21/2016.
 */
public interface MasterServiceDAO {

    void addNewMasterService(MasterService service);

    void updateMasterService(MasterService service);

    void changeServiceStatus(boolean status, long paymentID);

    MasterService findMasterServiceByID(long id);
}