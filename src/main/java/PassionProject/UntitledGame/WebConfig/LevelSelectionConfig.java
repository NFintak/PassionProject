package PassionProject.UntitledGame.WebConfig;

import PassionProject.UntitledGame.LevelSelection;
import org.springframework.context.annotation.Bean;

//@Configuration
public class LevelSelectionConfig {

    @Bean
    public LevelSelection levelSelection() {
        return new LevelSelection("");
    }
}
