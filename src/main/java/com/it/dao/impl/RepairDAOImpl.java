package com.it.dao.impl;

import com.it.dao.RepairDAO;
import com.it.model.Repair;

public class RepairDAOImpl extends GenericDAOImpl<Repair, Long> implements RepairDAO {
    private static com.it.dao.impl.RepairDAOImpl instance;

    private RepairDAOImpl() {
        super(Repair.class);
    }

    synchronized public static com.it.dao.impl.RepairDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.RepairDAOImpl();
        }
        return instance;
    }
}