package com.example.NewDrools;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fuel")
public class FuelController {
    private final FuelService fuelService;

    public FuelController(FuelService fuelService) {
        this.fuelService = fuelService;
    }

    @PostMapping("/calculate")
    public int calculateFuelLimit(@RequestBody VehicleCategory vehicleCategory) {
        return fuelService.calculateFuelLimit(vehicleCategory);
    }
}
