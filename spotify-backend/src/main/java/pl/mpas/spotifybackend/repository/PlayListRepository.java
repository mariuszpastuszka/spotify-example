package pl.mpas.spotifybackend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.mpas.spotifybackend.entity.PlayList;

public interface PlayListRepository extends PagingAndSortingRepository<PlayList, Long> {

    PlayList findByPlayListName(String playListName);
}
