package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private CarService service = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model) {

        model.addAttribute("cars", service.listCarWithCount((count == null) ? 5 : count));

        return "cars";
    }
}
