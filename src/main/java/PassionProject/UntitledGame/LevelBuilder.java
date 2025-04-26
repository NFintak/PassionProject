package PassionProject.UntitledGame;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "location_paths")
public class LevelBuilder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "path_id")
    private Integer id;

    @Column(name = "start_point")
    private Integer startPoint;

    @Column(name = "path_options")
    private java.util.List<Integer> paths;

    public LevelBuilder(Integer startPoint, List<Integer> paths) {
        this.startPoint = startPoint;
        this.paths = paths;
    }

    public LevelBuilder() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Integer start) {
        this.startPoint = start;
    }

    public java.util.List<Integer> getPaths() {
        return paths;
    }

    public void setPaths(List<Integer> paths) {
        this.paths = paths;
    }

    public void addPath(Integer path) {
        this.paths.add(path);
    }


}
