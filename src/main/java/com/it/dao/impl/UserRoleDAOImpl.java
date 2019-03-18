package com.it.dao.impl;

import com.it.dao.UserRoleDAO;
import com.it.model.UserRole;

public class UserRoleDAOImpl extends GenericDAOImpl<UserRole, Long> implements UserRoleDAO {
    private static com.it.dao.impl.UserRoleDAOImpl instance;

    private UserRoleDAOImpl() {
        super(UserRole.class);
    }

    synchronized public static com.it.dao.impl.UserRoleDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.UserRoleDAOImpl();
        }
        return instance;
    }
}

