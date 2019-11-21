package pl.mpas.spotifybackend.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.spotifybackend.entity.PlayList;
import pl.mpas.spotifybackend.entity.Track;
import pl.mpas.spotifybackend.repository.PlayListRepository;

@RestController
public class PlayListController {

    private PlayListRepository repository;

    public PlayListController(PlayListRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/create-playlist")
    public ResponseEntity<PlayList> createPlayList(@RequestBody String name, @RequestBody Track[] tracks) {
        PlayList newPlayList = new PlayList(name, tracks);
        repository.save(newPlayList);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.LOCATION, String.format("playlist/%d", newPlayList.getId()));

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    public ResponseEntity<PlayList> addTrackToPlaylist(Track track, String playListName) {

        PlayList playList = repository.findByPlayListName(playListName);
        playList.addTrack(track);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.LOCATION, String.format("playlist/%d", playList.getId()));

        return new ResponseEntity<>(headers, HttpStatus.OK);

    }

    public ResponseEntity<PlayList> removeTrackFromPlaylist(String name, Track track) {
        return null;
    }

    public ResponseEntity<String> removePlaylist(String name) {
        ResponseEntity<String> result = new ResponseEntity<>("You lost!", HttpStatus.OK);

        return result;
    }
}
