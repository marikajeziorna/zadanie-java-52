import java.util.Comparator;

public class SortPlayers implements Comparator<Player> {
    public int compare(Player a, Player b) {
        return a.getScore() - b.getScore();
    }
}
