package com.it;

import com.it.dao.FlatsDAO;
import com.it.dao.impl.FlatsDAOImpl;
import com.it.model.Flats;
import com.it.util.HibernateUtil;
import org.hibernate.Session;

import java.time.LocalDate;
import java.util.List;

public class App {

    private static final FlatsDAO flatsDAO = FlatsDAOImpl.getInstance();

    public static void main(String[] args) {

        createFlat();
        Flats persistFlat = flatsDAO.getOne(1L);
        hqlQuery();
    }

    private static void hqlQuery() {
        List<Flats> flatsList = flatsDAO.findAll(0, 5);

        Flats flats = flatsDAO.findBySquareAndRooms(56.0, 2);
        System.out.println("Square = " + flats.getSquare() + "and " + flats.getNumber_of_rooms() + "rooms");

    }

    private static void createFlat() {
        Flats transientFlats = new Flats();
        transientFlats.setNumber_of_rooms(2);
        transientFlats.setSquare(56.0);
        transientFlats.setIs_balcon(true);
        flatsDAO.save(transientFlats);
    }

}


