package compare.comparator;

import java.util.Comparator;

public class SongYearComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) { return Integer.compare(s1.getYear(), s2.getYear());}
}
