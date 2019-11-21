package pl.mpas.spotifybackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import pl.mpas.spotifybackend.MyConfig;
import pl.mpas.spotifybackend.entity.Album;
import pl.mpas.spotifybackend.exception.NoAlbumFound;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@RestController
public class SpotifyRestController {

    private static final Logger logger = LoggerFactory.getLogger(SpotifyRestController.class);

    private MyConfig config;
    private RestTemplate restTemplate;

    @Autowired
    public SpotifyRestController(MyConfig config, RestTemplate restTemplate) {
        this.config = config;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/albums")
    public List<Album> getAlbumsOfArtist(@RequestParam("artist") String artistName) {
        logger.info("getAlbumsOfArtist() - artist name: [{}]", artistName);
        URI uri = URI.create(String.format(config.getAllAlbumsOfArtistUrlTemplate(),
                artistName));
        HttpEntity<?> httpEntity = getHttpEntityWithAuthorizationHeader();
        ResponseEntity<Album[]> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, httpEntity, Album[].class);

        return Arrays.asList(responseEntity.getBody());
    }

    private HttpEntity<?> getHttpEntityWithAuthorizationHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", config.getAuthorizationHeader());
        return new HttpEntity<>(headers);
    }

    @GetMapping("/albums/{name}")
    public Album findAlbumByName(@PathVariable("name") String albumName) {
        logger.info("findAlbumByName() - album name [{}]", albumName);

        URI uri = URI.create(String.format(config.getAlbumByIdUrlTemplate(), albumName));
        HttpEntity<?> httpEntity = getHttpEntityWithAuthorizationHeader();
        ResponseEntity<Album> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, httpEntity, Album.class);

        return responseEntity.getBody();
    }

    @ExceptionHandler({NoAlbumFound.class, RestClientException.class})
    public ResponseEntity<?> handleNoAlums(RuntimeException exc) {

        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
