package pl.mpas.spotifybackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.spotifybackend.entity.PlayList;
import pl.mpas.spotifybackend.entity.Track;

@RestController
public class PlayListController {
    public ResponseEntity<PlayList> createPlayList(String name, Track[] tracks) {
        return null;
    }

    public ResponseEntity<PlayList> addTrackToPlaylist(Track track, String playListName) {
        return null;
    }

    public ResponseEntity<PlayList> removeTrackFromPlaylist(String name, Track track) {
        return null;
    }

    public ResponseEntity<String> removePlaylist(String name) {
        ResponseEntity<String> result = new ResponseEntity<>("You lost!", HttpStatus.OK);

        return result;
    }
}
