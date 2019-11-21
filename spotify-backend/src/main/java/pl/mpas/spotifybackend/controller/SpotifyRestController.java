package pl.mpas.spotifybackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.mpas.spotifybackend.MyConfig;
import pl.mpas.spotifybackend.entity.Album;
import pl.mpas.spotifybackend.entity.PlayList;
import pl.mpas.spotifybackend.entity.Track;

import java.util.Collections;
import java.util.List;

@RestController
public class SpotifyRestController {

    private static final Logger logger = LoggerFactory.getLogger(SpotifyRestController.class);

    private MyConfig config;
    private RestTemplate restTemplate;

    public SpotifyRestController(MyConfig config, RestTemplate restTemplate) {
        this.config = config;
        this.restTemplate = restTemplate;
    }

    public List<Album> getAlbumsOfArtist(String artistName) {
        return Collections.emptyList();
    }

    public Album findAlbumByName(String albumName) {
        return null;
    }


}
