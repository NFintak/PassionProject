package PassionProject.UntitledGame;

import java.awt.List;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "locations", path = "locations")
public interface LocationsRepo extends ListPagingAndSortingRepository<Locations, String>,
        CrudRepository<Locations, String> {

    List findByName(@Param("name") String name);
}
