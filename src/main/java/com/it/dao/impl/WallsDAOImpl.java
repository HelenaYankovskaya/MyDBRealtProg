package com.it.dao.impl;


import com.it.dao.WallsDAO;

import com.it.model.Walls;

public class WallsDAOImpl extends GenericDAOImpl<Walls, Long> implements WallsDAO {
    private static com.it.dao.impl.WallsDAOImpl instance;

    private WallsDAOImpl() {
        super(Walls.class);
    }

    synchronized public static com.it.dao.impl.WallsDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.WallsDAOImpl();
        }
        return instance;
    }
}
