import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayerList {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Player> players = new ArrayList<>();
        boolean stop = false;

        while (stop == false) {
            System.out.println("Give the player name or stop: ");
            String name = scanner.nextLine();

            if (name.equals("stop")) {
                stop = true;
            } else {
                System.out.println("Give the player score: ");
                int score = scanner.nextInt();
                scanner.nextLine();
                Player player = new Player(name, score);
                players.add(player);
            }
        }

        Collections.sort(players, new SortPlayers());
        CsvGenerator csvGenerator = new CsvGenerator(players);
        csvGenerator.printFile();
    }
}
