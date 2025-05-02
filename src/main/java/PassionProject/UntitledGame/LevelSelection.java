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

    @Column(name = "long_desc")
    private String longDesc;

    public LevelSelection(String levelName, String desc, String longDesc) {
        this.levelName = levelName;
        this.desc = desc;
        this.longDesc = longDesc;
    }

    public LevelSelection() {
        this.levelName = "";
        this.desc = "";
        this.longDesc = "";
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

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }


}
