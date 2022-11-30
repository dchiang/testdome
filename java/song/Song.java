import java.util.*;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
      if(this.nextSong == null){
        return false;
      }else{
        Set<Song> songs = new HashSet<Song>();
        songs.add(this);
        Song next = this.nextSong;
        while(next != null){
          if (songs.add(next)){
            next = next.nextSong;
          } else {
            return true;
          }
        }
        return false;
      }
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}