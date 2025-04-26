package PassionProject.UntitledGame.WebConfig;

import PassionProject.UntitledGame.LevelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Arrays;

@Configuration
public class LevelBuilderConfig {

    @Bean
    public LevelBuilder levelBuilder() {
        List<Integer> path = Arrays.asList(0);
        return new LevelBuilder(0, path);
    }
}
