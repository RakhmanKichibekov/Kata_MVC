package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Land Cruiser", 200));
        cars.add(new Car("Toyota", "Camry", 70));
        cars.add(new Car("Mercedes", "S", 600));
        cars.add(new Car("Lexus", "ES", 350));
        cars.add(new Car("Daewoo", "Matiz", 1));
        if (count != null) {
            if (count > cars.size()) {
                count = cars.size();
            }
            cars = cars.subList(0, count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
