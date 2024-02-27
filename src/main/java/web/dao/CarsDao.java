package web.dao;

import web.model.Car;

import java.util.List;

public interface CarsDao {
    void addCars();
    List<Car> getCars();
}
