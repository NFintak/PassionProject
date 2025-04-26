package PassionProject.UntitledGame;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

import java.awt.List;
import java.util.ArrayList;

@Entity
@Table(name = "locations")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "location_id")
    private Integer id;

    @Column(name = "title", nullable = false)
    private String name;

    @Column(name = "initial_desc", nullable = false)
    private String initDesc;

    @Column(name = "longer_desc", nullable = false)
    private String longDesc;

    @Column(name = "paths")
    private Integer paths;

    @OneToMany
    @JoinTable(
            name = "location_paths",
            joinColumns = @JoinColumn(name = "location_id"),
            inverseJoinColumns = @JoinColumn(name = "path_id")
    )

    private ArrayList<Locations> locationsList = new ArrayList<>();

    public Locations(String name, String initDesc, String longDesc, Integer path) {
        this.id = id;
        this.name = name;
        this.initDesc = initDesc;
        this.longDesc = longDesc;
        this.paths = path;
    }

    public String getLocationName() {
        return name;
    }

    public void setLocationName(String name) {
        this.name = name;
    }

    public String getInitDesc() {
        return initDesc;
    }

    public void setInitDesc(String initDesc) {
        this.initDesc = initDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public Integer getLocations() {
        return paths;
    }

    public void setPath(Integer path) {
        this.paths = path;
    }

//    public ArrayList<Locations> getLocationsList() {
//        return this.locationsList;
//    }
//
//    public void setLocationsList(ArrayList<Locations> list) {
//        this.locationsList = list;
//    }

}
