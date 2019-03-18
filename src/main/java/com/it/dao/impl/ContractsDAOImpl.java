package com.it.dao.impl;

import com.it.dao.ContractsDAO;
import com.it.model.Contracts;

public class ContractsDAOImpl extends GenericDAOImpl<Contracts, Long> implements ContractsDAO {
    private static com.it.dao.impl.ContractsDAOImpl instance;

    private ContractsDAOImpl() {
        super(Contracts.class);
    }

    synchronized public static com.it.dao.impl.ContractsDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.ContractsDAOImpl();
        }
        return instance;
    }
}