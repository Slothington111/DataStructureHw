import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.HashMap;

public class MusicPlayer 
{
    static class Song
    {
        String id;
        String title;
        String artist;

        Song(String id, String title, String artist)
        {
            this.id = id;
            this.title = title;
            this.artist = artist;
        }
    }
    
    LinkedList<Song> playlist = new LinkedList<>();
    HashMap<String, Song> library = new HashMap<>();
    ArrayDeque<Song> upNext = new ArrayDeque<>();
    ArrayDeque<Song> history = new ArrayDeque<>();
    HashMap<String, Integer> playCounts = new HashMap<>();

    Song current = null;

    public boolean addSong(String id, String title, String artist) 
    {
        if (library.containsKey(id)) 
        {
            return false; 
        }
        Song newSong = new Song(id, title, artist);
        library.put(id, newSong);
        playlist.add(newSong);
        return true;
    }

    public Song findSong(String id) 
    {
        return library.get(id);
    }

    public LinkedList<String> showPlaylist() 
    {
        LinkedList<String> titles = new LinkedList<>();

        for (Song song : playlist) 
        {
            titles.add(song.title);
        }
        return titles;
    }
    public Song play(String id)
    {
        Song song = library.get(id);

        if (song == null) 
        {
            return null;
        }

        if (current != null)
        {
            history.push(current);
        }
        start(song);
        return song;
    }
    public void start(Song song)
    {
        current = song;
        playCounts.put(song.id, playCounts.getOrDefault(song.id, 0) + 1);
    }
    public int playCount(String id)
    {
        return playCounts.getOrDefault(id, 0);
    }
    public Song nowPlaying()
    {
        return current;
    }
    public boolean queueLater(String id)
    {
        Song song = library.get(id);
        if (song == null) 
        {
            return false;
        }
        upNext.addLast(song);
        return true;
    }
    public boolean queueNext(String id)
    {
        Song song = library.get(id);
        if (song == null) 
        {
            return false;
        }
        upNext.addFirst(song);
        return true;
    }
    public LinkedList<String> showUpNext()
    {
        LinkedList<String> titles = new LinkedList<>();
        
        for (Song song : upNext) 
        {
            if (library.containsKey(song.id)) 
            {
                titles.add(song.title);
            }
        }

        return titles;
    }
    public Song next()
    {
        while (!upNext.isEmpty())
        {
            Song nextSong = upNext.pollFirst();

            if (!library.containsKey(nextSong.id)) 
            {
                continue; 
            }
            if (current != null) 
            {
                history.push(current);
            }
            start(nextSong);
            return nextSong;
        }
        if (current == null)
            {
                return null;
            }
            int currentIndex = playlist.indexOf(current);
            if (currentIndex == -1 || currentIndex + 1 >= playlist.size()) 
            {
                return null;
            }
            Song nextSong = playlist.get(currentIndex + 1);
            history.push(current);
            start(nextSong);
            return nextSong;
    
    } 
    public Song back()
    {
        Song previousSong = null;
        while (!history.isEmpty())
        {
            Song candidate = history.pop();

            if (library.containsKey(candidate.id)) 
            {
                previousSong = candidate;
                break;
            }
        }
        if (previousSong == null) 
        {
            return null;
        }
        if (current != null) 
        {
            upNext.addFirst(current);
        }

        start(previousSong);
        return previousSong;
    }

    public LinkedList<String> showHistory()
    {
        LinkedList<String> titles = new LinkedList<>();

        for (Song song : history) 
        {
            if (library.containsKey(song.id)) 
            {
                titles.add(song.title);
            }
        }

        return titles;
        
    }
    public boolean removeSong(String id)
    {
        if (!library.containsKey(id)) 
        {
            return false;
        }

        if (current != null && current.id.equals(id))
        {
            return false; 
        }
        library.remove(id);
        playlist.removeIf(song -> song.id.equals(id));
        playCounts.remove(id);

        return true;
    }
}
