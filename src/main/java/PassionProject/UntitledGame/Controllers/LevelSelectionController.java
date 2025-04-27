package PassionProject.UntitledGame.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
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
    public String getAllLevels(Model model) {
        Iterable<LevelSelection> levels = levelSelectionRepo.findAll();
//        for (LevelSelection level : levels) {
//            System.out.println("Name: " + level.getLevelName() + "\nDescription: " + level.getDesc());
//        }
        model.addAttribute("level", levels);
        return "level_selection/list";
    }

    @GetMapping("/{id}")
    public LevelSelection getPathsById(@PathVariable Integer id) {
        return levelSelectionRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Level not found")
        );
    }

}
