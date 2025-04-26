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
@RequestMapping("/location")
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
    public String getLocations(Model model) {
        Iterable<Locations> allLocations = getAllLocations();
        model.addAttribute("locations", allLocations);
        return "location_list";
    }

    @GetMapping("/{id}")
    public String getLocation(@PathVariable(required = true) Integer id, Model model) {
        Locations location = locationsRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Room unknown")
        );
        model.addAttribute("location", location);
        return "location";
    }


    //getmapping connects to thymeleaf
    //postmapping to post full list
    // pathvariable for getting primary key (id num)
    // requestbody for getting the formatting


}
