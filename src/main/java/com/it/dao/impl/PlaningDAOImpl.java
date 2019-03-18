package com.it.dao.impl;

import com.it.dao.PlaningDAO;
import com.it.model.Planing;

public class PlaningDAOImpl extends GenericDAOImpl<Planing, Long> implements PlaningDAO {
    private static com.it.dao.impl.PlaningDAOImpl instance;

    private PlaningDAOImpl() {
        super(Planing.class);
    }

    synchronized public static com.it.dao.impl.PlaningDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.PlaningDAOImpl();
        }
        return instance;
    }
}
