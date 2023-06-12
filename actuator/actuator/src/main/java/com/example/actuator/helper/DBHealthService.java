package com.example.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class DBHealthService implements HealthIndicator {
    public boolean checkHealth(){
        //custom logic...
        return true;
    }
    @Override
    public Health health() {
        if(checkHealth()){
            return Health.up().withDetail("Database service","database service is running").build();
        }
        return Health.down().withDetail("Database service","database service is down").build();
    }
}
