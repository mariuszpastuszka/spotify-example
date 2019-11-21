package pl.mpas.spotifybackend.entity;

import java.util.Arrays;

public class Artist {

    private String id;
    private String name;
    private String type;
    private String[] genres;
    private Image[] images;

    public Artist() {
    }

    public Artist(String id, String name, String type, String[] genres, Image[] images) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.genres = genres;
        this.images = images;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", genres=" + Arrays.toString(genres) +
                ", images=" + Arrays.toString(images) +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }
}
