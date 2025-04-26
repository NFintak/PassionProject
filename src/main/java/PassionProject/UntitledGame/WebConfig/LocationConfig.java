package PassionProject.UntitledGame.WebConfig;

import PassionProject.UntitledGame.Locations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class LocationConfig {

    @Bean
    public Locations location() {
        List empty = new List();
        return new Locations("testName", "testShortDesc", "testLongerDesc", empty);
    }

}
