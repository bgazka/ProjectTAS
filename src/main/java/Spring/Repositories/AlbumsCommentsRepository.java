package Spring.Repositories;

import Spring.Entities.AlbumsComments;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlbumsCommentsRepository extends CrudRepository<AlbumsComments, Integer>, PagingAndSortingRepository<AlbumsComments, Integer> {
}
