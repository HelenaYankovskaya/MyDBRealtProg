package com.it.dao;

import com.it.model.Flats;
import java.util.List;

public interface FlatsDAO extends GenericDAO<Flats,Long>
{
    List<Flats> findAll(Integer firstResult, Integer maxResult);

    Flats findBySquareAndRooms(Double square, int number_of_rooms);
}
