package PassionProject.UntitledGame.WebConfig;

import PassionProject.UntitledGame.LevelSelection;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Arrays;

//@Configuration
public class LevelBuilderConfig {

    @Bean
    public LevelSelection levelBuilder() {
        return new LevelSelection("", 0);
    }
}
