package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDaoImp implements CarsDao {
    private List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void clearCars() {
        cars = new ArrayList<>();
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

}
