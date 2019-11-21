package pl.mpas.spotifybackend;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spotify")
@EnableConfigurationProperties
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

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setAuthorizationHeader(String authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
    }

    public void setAllAlbumUrlTemplate(String allAlbumUrlTemplate) {
        this.allAlbumUrlTemplate = allAlbumUrlTemplate;
    }

    public void setAlbumByIdUrlTemplate(String albumByIdUrlTemplate) {
        this.albumByIdUrlTemplate = albumByIdUrlTemplate;
    }

    public void setAlbumTracksUrlTemplate(String albumTracksUrlTemplate) {
        this.albumTracksUrlTemplate = albumTracksUrlTemplate;
    }

    public void setArtistByIdUrlTemplate(String artistByIdUrlTemplate) {
        this.artistByIdUrlTemplate = artistByIdUrlTemplate;
    }

    public void setAllAlbumsOfArtistUrlTemplate(String allAlbumsOfArtistUrlTemplate) {
        this.allAlbumsOfArtistUrlTemplate = allAlbumsOfArtistUrlTemplate;
    }
}

