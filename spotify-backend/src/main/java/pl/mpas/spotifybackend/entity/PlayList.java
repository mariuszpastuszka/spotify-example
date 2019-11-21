package pl.mpas.spotifybackend.entity;

import pl.mpas.spotifybackend.entity.Track;

import java.util.Arrays;
import java.util.List;

public class PlayList {

    private String playListName;
    private Track[] favorites;

    public PlayList(String playListName, Track[] favorites) {
        this.playListName = playListName;
        this.favorites = favorites;
    }

    public PlayList() {
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "playListName='" + playListName + '\'' +
                ", favorites=" + Arrays.toString(favorites) +
                '}';
    }

    public Track[] getFavorites() {
        return favorites;
    }

    public void setFavorites(Track[] favorites) {
        this.favorites = favorites;
    }
}
