package PassionProject.UntitledGame.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import PassionProject.UntitledGame.Repos.LocationsRepo;
import PassionProject.UntitledGame.Locations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/locations")
public class LocationController {

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
    @ResponseBody
    public String getLocations(Model template) {
        Iterable<Locations> allLocations = this.getAllLocations();
        template.addAttribute("location", allLocations);
        return "locations_list";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getRoomName(@PathVariable Integer id, Model template) {
        Locations location = locationsRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Room unknown")
        );
        template.addAttribute("location", location);
        return location.getLocationName() + "\n" + location.getInitDesc();
    }


    //getmapping connects to thymeleaf
    // use /testlist for full list of test rooms
    // putmapping is for editing
    //postmapping to post full list
    // pathvariable for getting primary key (id num)
    // requestbody for getting the formatting


}
