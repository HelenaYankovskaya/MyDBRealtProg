package com.it.dao.impl;

import com.it.dao.RealtorDAO;
import com.it.model.Realtor;

public class RealtorDAOImpl extends GenericDAOImpl<Realtor, Long> implements RealtorDAO {
    private static com.it.dao.impl.RealtorDAOImpl instance;

    private RealtorDAOImpl() {
        super(Realtor.class);
    }

    synchronized public static com.it.dao.impl.RealtorDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.RealtorDAOImpl();
        }
        return instance;
    }
}

