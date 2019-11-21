package pl.mpas.spotifybackend.entity;

import org.hibernate.cfg.NotYetImplementedException;
import pl.mpas.spotifybackend.entity.Track;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class PlayList {

    @Id
    private Long id;
    private String playListName;
    private Track[] favorites;

    public PlayList(String playListName, Track[] favorites) {
        this.playListName = playListName;
        this.favorites = favorites;
    }

    public PlayList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void addTrack(Track track) {

        throw new NotYetImplementedException();
    }
}
