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

@Entity
@Table(name = "locations")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title", nullable = false)
    private String name;

    @Column(name = "inital_desc", nullable = false)
    private String initDesc;

    @Column(name = "longer_desc", nullable = false)
    private String longDesc;

    @Column(name = "paths")
    private List paths;

    public Locations(String name, String initDesc, String longDesc, List emptyList) {
        this.id = id;
        this.name = name;
        this.initDesc = initDesc;
        this.longDesc = longDesc;
        this.paths = emptyList;
    }

//     @Bean
//     @OneToMany(mappedBy="name")
//     public Locations location(String name, String initDesc, String longDesc, List paths) {
//         return new Locations(name, initDesc, longDesc, paths);
//     }

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

}
