package pl.mpas.spotifybackend;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("spotify")
public class MyConfig {
    private String baseUrl;
    private String authorizationHeader;


    private String allAlbumUrlTemplate;
    private String albumByIdUrlTemplate;
    private String albumTracksUrlTemplate;

    private String artistByIdUrlTemplate;
    private String allAlbumsOfArtistUrlTemplate;

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getAuthorizationHeader() {
        return authorizationHeader;
    }

    public String getAllAlbumUrlTemplate() {
        return allAlbumUrlTemplate;
    }

    public String getAlbumByIdUrlTemplate() {
        return albumByIdUrlTemplate;
    }

    public String getAlbumTracksUrlTemplate() {
        return albumTracksUrlTemplate;
    }

    public String getArtistByIdUrlTemplate() {
        return artistByIdUrlTemplate;
    }

    public String getAllAlbumsOfArtistUrlTemplate() {
        return allAlbumsOfArtistUrlTemplate;
    }
}
