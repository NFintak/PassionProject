package PassionProject.UntitledGame;

import java.awt.List;
import java.io.File;
import java.lang.StringBuilder;
import java.io.IOException;
import java.util.Scanner;
import PassionProject.UntitledGame.Locations;
import jakarta.persistence.*;

@Entity
@Table(name = "linkedlocations")
public class LevelBuilder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "link_id")
    private Integer id;

    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "path_id")
    private Integer pathId;

}
