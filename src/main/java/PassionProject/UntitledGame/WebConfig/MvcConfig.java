package PassionProject.UntitledGame.WebConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/menu").setViewName("menu");
        registry.addViewController("/").setViewName("menu");
        registry.addViewController("/levelSelect").setViewName("levelSelect");
        registry.addViewController("/cabin").setViewName("cabin");
    }
}
