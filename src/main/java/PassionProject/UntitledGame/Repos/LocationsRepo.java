package PassionProject.UntitledGame.Repos;

import org.springframework.data.repository.CrudRepository;
import PassionProject.UntitledGame.Locations;
import org.springframework.data.repository.query.Param;

public interface LocationsRepo extends CrudRepository<Locations, Integer>{

    Iterable<Locations> findByLevelId(@Param("level_id") Integer id);
    Iterable<Locations> findByLevelIdAndId(@Param("level_id") Integer level_id, @Param("location_id") Integer id);
}
