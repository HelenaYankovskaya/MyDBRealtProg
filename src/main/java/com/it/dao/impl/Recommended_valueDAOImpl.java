package com.it.dao.impl;

import com.it.dao.Recommended_valueDAO;
import com.it.model.Recommended_value;

public class Recommended_valueDAOImpl extends GenericDAOImpl<Recommended_value, Long> implements Recommended_valueDAO {
    private static com.it.dao.impl.Recommended_valueDAOImpl instance;

    private Recommended_valueDAOImpl() {
        super(Recommended_value.class);
    }

    synchronized public static com.it.dao.impl.Recommended_valueDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.Recommended_valueDAOImpl();
        }
        return instance;
    }
}
