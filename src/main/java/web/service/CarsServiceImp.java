package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;

import java.util.List;

@Service
public class CarsServiceImp implements CarsService {

    private final CarsDao carsDao;

    @Autowired
    public CarsServiceImp(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public void addCar(Car car) {
        carsDao.add(car);
    }

    @Override
    public void clearCars() {
        carsDao.clearCars();
    }

    @Override
    public List<Car> getCarsCount(Integer count) {
        List<Car> cars = carsDao.getCars();
        if (count != null) {
            if (count > cars.size()) {
                count = cars.size();
            }
            cars = cars.subList(0, count);
        }
        return cars;
    }
}
