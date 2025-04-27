package PassionProject.UntitledGame;

import jakarta.persistence.*;

@Entity
@Table(name = "level_selection")
public class LevelSelection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@OneToMany
    //@JoinColumn(name = "level_id")
    @Column(name = "level_id")
    private Integer id;

    @Column(name = "level_name")
    private String levelName;

    @Column(name = "description")
    private String desc;

    public LevelSelection(String levelName, String desc) {
        this.levelName = levelName;
        this.desc = desc;
    }

    public LevelSelection() {
        this.levelName = "";
        this.desc = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
