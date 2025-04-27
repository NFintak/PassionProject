package PassionProject.UntitledGame.WebConfig;

import PassionProject.UntitledGame.Locations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class LocationConfig {

    @Bean
    public Locations location() {
        return new Locations("testName", "testShortDesc", "testLongerDesc", new int[4]);
    }

}
