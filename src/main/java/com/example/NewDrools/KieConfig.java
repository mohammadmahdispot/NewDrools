package com.example.NewDrools;


import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KieConfig {

    @Bean
    public KieContainer kieContainer() {

        KieServices kieServices = KieServices.Factory.get();
        return kieServices.getKieClasspathContainer();
    }
}
