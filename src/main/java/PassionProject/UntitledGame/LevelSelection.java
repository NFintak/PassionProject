package PassionProject.UntitledGame;

import jakarta.persistence.*;

@Entity
@Table(name = "level_selection")
public class LevelSelection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "level_id")
    private Integer id;

    @Column(name = "level_name")
    private String levelName;

    @Column(name = "start_point")
    private Integer startPoint;

    public LevelSelection(String levelName, Integer startPoint) {
        this.levelName = levelName;
        this.startPoint = startPoint;
    }

    public LevelSelection() {
        this.levelName = "";
        this.startPoint = 0;
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


}
