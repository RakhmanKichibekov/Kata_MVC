package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

@Controller
public class CarsController {

    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        carsService.clearCars();
        carsService.addCar(new Car("Toyota", "Land Cruiser", 200));
        carsService.addCar(new Car("Toyota", "Camry", 70));
        carsService.addCar(new Car("Mercedes", "S", 600));
        carsService.addCar(new Car("Lexus", "ES", 350));
        carsService.addCar(new Car("Daewoo", "Matiz", 1));
        model.addAttribute("cars", carsService.getCarsCount(count));
        return "cars";
    }
}
