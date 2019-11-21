package pl.mpas.spotifybackend.exception;

public class NoAlbumFound extends RuntimeException {

    public NoAlbumFound() {
    }

    public NoAlbumFound(String message) {
        super(message);
    }

    public NoAlbumFound(String message, Throwable cause) {
        super(message, cause);
    }

    public NoAlbumFound(Throwable cause) {
        super(cause);
    }

    public NoAlbumFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
