package PassionProject.UntitledGame.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import PassionProject.UntitledGame.LevelSelection;
import PassionProject.UntitledGame.Repos.LevelSelectionRepo;

@RestController
@RequestMapping("/level_selection")
public class LevelSelectionController {

    @Autowired
    public LevelSelectionRepo levelSelectionRepo;

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
                () -> new RuntimeException("Level not found")
        );
    }

}
