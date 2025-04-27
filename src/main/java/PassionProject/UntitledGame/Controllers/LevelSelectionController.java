package PassionProject.UntitledGame.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import PassionProject.UntitledGame.LevelSelection;
import PassionProject.UntitledGame.Repos.LevelSelectionRepo;

@RestController
@RequestMapping("/levelselect")
public class LevelSelectionController {

    public LevelSelectionRepo levelSelectionRepo;

    @Autowired
    public LevelSelectionController(LevelSelectionRepo levelBuilderRepo) {
        this.levelSelectionRepo = levelBuilderRepo;
    }

    @GetMapping
    public Iterable<LevelSelection> getLevels() {
        return levelSelectionRepo.findAll();
    }

    @GetMapping("/list")
    public Iterable<LevelSelection> getAllLevels() {
        return levelSelectionRepo.findAll();
    }

    @GetMapping("/{id}")
    public LevelSelection getPathsById(@PathVariable Integer id) {
        return levelSelectionRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Path not found")
        );
    }

}
