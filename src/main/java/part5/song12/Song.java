package part5.song12;

import java.util.Objects;

public class Song {
    private String artist;
    private String name;
    private int durationInSeconds;
    
    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof final Song song)) return false;
    
        if (durationInSeconds != song.durationInSeconds) return false;
        if (!Objects.equals(artist, song.artist)) return false;
        return Objects.equals(name, song.name);
    }
    
    @Override
    public int hashCode() {
        int result = artist != null ? artist.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + durationInSeconds;
        return result;
    }
}
