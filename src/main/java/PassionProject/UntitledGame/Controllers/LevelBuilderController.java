package PassionProject.UntitledGame.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import PassionProject.UntitledGame.LevelBuilder;
import PassionProject.UntitledGame.Repos.LevelBuilderRepo;

@RestController
@RequestMapping("/levelselect")
public class LevelBuilderController {

    public LevelBuilderRepo levelBuilderRepo;

    @Autowired
    public LevelBuilderController(LevelBuilderRepo levelBuilderRepo) {
        this.levelBuilderRepo = levelBuilderRepo;
    }

    @GetMapping
    public Iterable<LevelBuilder> getAllLevels() {
        return levelBuilderRepo.findAll();
    }

    @GetMapping("{id}")
    public LevelBuilder getPathsById(@PathVariable Integer id) {
        return levelBuilderRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Path not found")
        );
    }

}
