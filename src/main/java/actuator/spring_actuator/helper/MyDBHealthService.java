package actuator.spring_actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class MyDBHealthService implements HealthIndicator {

    public static final String DB_SERVICE = "database service";

    public boolean isHealthGood() {

        return true;
    }

    @Override
    public Health health() {
        if (isHealthGood()) {
            return Health.up().withDetail(DB_SERVICE, "DB IS UP").build();
        }
        return Health.up().withDetail(DB_SERVICE, "DB IS DOWN").build();
    }

}
