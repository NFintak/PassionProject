package PassionProject.UntitledGame;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Bean;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.awt.List;

@Entity
@Table(name = "location")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String initDesc;
    private String longDesc;
    private List paths;


    public Locations(String name, String initDesc, String longDesc, List emptyList) {
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
