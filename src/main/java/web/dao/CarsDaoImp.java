package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDaoImp implements CarsDao {
    private List<Car> cars;

    @Override
    public void addCars() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Land Cruiser", 200));
        cars.add(new Car("Toyota", "Camry", 70));
        cars.add(new Car("Mercedes", "S", 600));
        cars.add(new Car("Lexus", "ES", 350));
        cars.add(new Car("Daewoo", "Matiz", 1));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

}
