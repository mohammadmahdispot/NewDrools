package com.example.NewDrools;


import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service

public class FuelService {
    private final KieContainer kieContainer;

    public FuelService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public int calculateFuelLimit(VehicleCategory vehicleCategory) {
        KieSession kieSession = kieContainer.newKieSession("fuelKieSession");
        kieSession.insert(vehicleCategory);
        kieSession.fireAllRules();
        kieSession.dispose();

        return vehicleCategory.getFuelId();
    }
}
