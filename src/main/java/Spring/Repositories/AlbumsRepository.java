package Spring.Repositories;

import Spring.Entities.Albums;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlbumsRepository extends CrudRepository<Albums, Integer>, PagingAndSortingRepository<Albums, Integer> {

    Albums findById(int id);

    @Query("select a from Albums a where a.albumName like ?1")
    Iterable<Albums> findByAlbumName(String albumName);

    @Query("select a from Albums a where a.averangeRateOfAlbum <= ?1")
    Iterable<Albums> findAlbumsWithLowerOrEqualAverangeRate(float averangeRateOfAlbum);

    @Query("select a from Albums a where a.averangeRateOfAlbum >= ?1")
    Iterable<Albums> findAlbumsWithHigherOrEqualAverangeRate(float averangeRateOfAlbum);
}
