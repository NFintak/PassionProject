package PassionProject.UntitledGame;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Bean;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.awt.List;
import java.util.ArrayList;

@Entity
@Table(name = "locations")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String name;

    @Column(name = "initial_desc", nullable = false)
    private String initDesc;

    @Column(name = "longer_desc", nullable = false)
    private String longDesc;

    @Column(name = "paths")
    private List paths;

    private ArrayList<Locations> locationsList = new ArrayList<>();

    public Locations(String name, String initDesc, String longDesc, List emptyList) {
        this.id = id;
        this.name = name;
        this.initDesc = initDesc;
        this.longDesc = longDesc;
        this.paths = emptyList;
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

    public List getLocations() {
        return paths;
    }

    public void addPath(String path) {
        this.paths.add(path);
    }

    public void removePath(String path) {
        this.paths.remove(path);
    }

//    public ArrayList<Locations> getLocationsList() {
//        return this.locationsList;
//    }
//
//    public void setLocationsList(ArrayList<Locations> list) {
//        this.locationsList = list;
//    }

}
