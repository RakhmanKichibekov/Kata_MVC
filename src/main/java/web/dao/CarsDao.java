package web.dao;

import web.model.Car;

import java.util.List;

public interface CarsDao {
    void add(Car car);
    void clearCars();
    List<Car> getCars();
}
