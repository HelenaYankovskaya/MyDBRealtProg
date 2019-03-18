package com.it.dao.impl;

import com.it.dao.FlatsDAO;
import com.it.model.Flats;
import com.it.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class FlatsDAOImpl extends GenericDAOImpl<Flats, Long> implements FlatsDAO {
    private static com.it.dao.impl.FlatsDAOImpl instance;

    private FlatsDAOImpl() {
        super(Flats.class);
    }

    synchronized public static com.it.dao.impl.FlatsDAOImpl getInstance() {
        if (instance == null) {
            instance = new com.it.dao.impl.FlatsDAOImpl();
        }
        return instance;
    }
/**
 * Find page of All Cars
 * HQL implementation
 *
 * @param firstResult - firstResult
 * @param maxResult   - maxResult
 * @return List<Flats>
 */
@Override
public List<Flats> findAll(Integer firstResult, Integer maxResult) {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        String hql = "FROM Flats";
        Query query = session.createQuery(hql);
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResult);
        return query.list();
    }
}


    /**
     * Find Car by Model and Date
     * HQL implementation
     *
     * @param square - square
     * @param number_of_rooms -  number_of_rooms
     * @return Flats
     */
    @Override
    public Flats  findBySquareAndRooms(Double square, int number_of_rooms) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM Flats flat WHERE flat.square = :square and flat.number_of_rooms = :number_of_rooms";
            Query query = session.createQuery(hql);
            query.setParameter("square",square);
            query.setParameter("number_of_rooms", number_of_rooms);

            return (Flats) query.getSingleResult();
        }
    }
}
