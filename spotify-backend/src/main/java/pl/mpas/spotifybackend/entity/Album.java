package pl.mpas.spotifybackend.entity;


public class Album {

    private String[] genres;
    private String id;
    private String albumType;
    private Artist[] artists;
    private String releaseDate;
    private Track[] tracks;
    public Album() {
    }
    public Album(String[] genres, String id, String albumType, Artist[] artists, String releaseDate, Track[] tracks) {
        this.genres = genres;
        this.id = id;
        this.albumType = albumType;
        this.artists = artists;
        this.releaseDate = releaseDate;
        this.tracks = tracks;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    public Artist[] getArtists() {
        return artists;
    }

    public void setArtists(Artist[] artists) {
        this.artists = artists;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Track[] getTracks() {
        return tracks;
    }

    public void setTracks(Track[] tracks) {
        this.tracks = tracks;
    }
}
