package com.it.dao.impl;


import com.it.dao.ClientDAO;
import com.it.model.Client;

public class ClientDAOImpl  extends GenericDAOImpl<Client, Long> implements ClientDAO {
    private static com.it.dao.impl.ClientDAOImpl instance;

    private ClientDAOImpl() {
        super(Client.class);
    }

    synchronized public static com.it.dao.impl.ClientDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.ClientDAOImpl();
        }
        return instance;
    }
}

