package PassionProject.UntitledGame.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import PassionProject.UntitledGame.Repos.LocationsRepo;
import PassionProject.UntitledGame.Locations;

@RestController
@RequestMapping("/levelselect/{level_id}/")
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
    public Iterable<Locations> getLocations() {
        return locationsRepo.findAll();
    }

    @GetMapping("/{id}")
    public Locations getLocation(@PathVariable(required = true) Integer id) {
        return locationsRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Path not found")
        );
    }


    //getmapping connects to thymeleaf
    //postmapping to post full list
    // pathvariable for getting primary key (id num)
    // requestbody for getting the formatting


}
