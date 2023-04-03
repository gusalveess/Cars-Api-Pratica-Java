package com.api.cars.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.cars.DTO.CarsDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    @PostMapping
    public void createCar(@RequestBody CarsDTO req) {
        System.out.println(req.modelo());
        System.out.println(req.fabricante());
        System.out.println(req.dataFabricacao());
        System.out.println(req.Valor());
        System.out.println(req.anoModelo());
    }
}
