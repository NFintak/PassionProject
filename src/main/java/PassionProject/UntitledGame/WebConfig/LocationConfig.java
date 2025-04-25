package PassionProject.UntitledGame.WebConfig;

import PassionProject.UntitledGame.Locations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class LocationConfig {

    @Bean
    //@OneToMany(mappedBy="name")
    public Locations location() {
        List empty = new List();
        return new Locations("testName", "testShortDesc", "testLongerDesc", empty);
    }

}
