package web.service;

import web.model.Car;

import java.util.List;

public interface CarsService {
    void addCar(Car car);
    void clearCars();
    List<Car> getCarsCount(Integer count);
}
