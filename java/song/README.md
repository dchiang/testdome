# [Song](https://www.testdome.com/questions/java/song/88836 "Song")

A playlist is considered a repeating playlist if any of the songs contain a reference to a previous song in the playlist. Otherwise, the playlist will end with the last song which points to null.

Implement a function isRepeatingPlaylist that, **efficiently** with respect to time used, returns true if a playlist is repeating or false if it is not.

For example, the following code prints `true` as both songs point to each other.

```java
Song first = new Song("Hello");
Song second = new Song("Eye of the tiger");

first.setNextSong(second);
second.setNextSong(first);

System.out.println(first.isRepeatingPlaylist());
```