package com.it.dao.impl;

import com.it.dao.ServiseDAO;
import com.it.model.Servise;

public class ServiseDAOImpl extends GenericDAOImpl<Servise, Long> implements ServiseDAO {
    private static com.it.dao.impl.ServiseDAOImpl instance;

    private ServiseDAOImpl() {
        super(Servise.class);
    }

    synchronized public static com.it.dao.impl.ServiseDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.ServiseDAOImpl();
        }
        return instance;
    }
}
