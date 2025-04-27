package PassionProject.UntitledGame.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import PassionProject.UntitledGame.Repos.LocationsRepo;
import PassionProject.UntitledGame.Locations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Optional;

@RestController
@RequestMapping("/levelselect/locations")
public class LocationController {

    //@Autowired
    public LocationsRepo locationsRepo;

    @Autowired
    public LocationController(LocationsRepo locationsRepo) {
        this.locationsRepo = locationsRepo;
    }

    @GetMapping
    @ResponseBody
    public Iterable<Locations> getAllLocations() {
        return locationsRepo.findAll();
    }

    @GetMapping("/list")
    public Iterable<Locations> getLocations(Model model) {
        return locationsRepo.findAll();
    }

    @GetMapping("/{id}")
    public Locations getLocation(@PathVariable(required = true) Integer id, Model model) {
        return locationsRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Room unknown")
        );
    }


    //getmapping connects to thymeleaf
    //postmapping to post full list
    // pathvariable for getting primary key (id num)
    // requestbody for getting the formatting


}
