package PassionProject.UntitledGame;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

import java.awt.List;
import java.util.ArrayList;

@Entity
@Table(name = "locations")
public class Locations {

    @Column(name = "level_id", nullable = false)
    private Integer levelId;

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
    private int[] paths;

//    @OneToMany
//    @JoinTable(
//            name = "location_paths",
//            joinColumns = @JoinColumn(name = "location_id"),
//            inverseJoinColumns = @JoinColumn(name = "path_id")
//    )
//
//    private ArrayList<Locations> locationsList = new ArrayList<>();

    public Locations() {
        this.name = "";
        this.initDesc = "";
        this.longDesc = "";
        this.paths = new int[4];
    }

    public Locations(String name, String initDesc, String longDesc, int[] path) {
        this.name = name;
        this.initDesc = initDesc;
        this.longDesc = longDesc;
        this.paths = path;
    }

    public Integer getLocationId() {
        return id;
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

    public int[] getLocations() {
        return paths;
    }

    public void setPath(int[] path) {
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
