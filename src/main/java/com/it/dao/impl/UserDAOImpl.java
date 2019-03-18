package com.it.dao.impl;

import com.it.dao.UserDAO;
import com.it.model.User;

public class UserDAOImpl extends GenericDAOImpl<User, Long> implements UserDAO {
        private static com.it.dao.impl.UserDAOImpl instance;

        private UserDAOImpl() {
            super(User.class);
        }

        synchronized public static com.it.dao.impl.UserDAOImpl getInstance() {
            if (instance == null) {
                instance = new com.it.dao.impl.UserDAOImpl();
            }
            return instance;
        }
    }

