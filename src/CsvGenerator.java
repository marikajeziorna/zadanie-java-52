import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvGenerator {
    private ArrayList<Player> players;

    public CsvGenerator(ArrayList<Player> players) throws IOException {
        this.players = players;
    }

    public void printFile() throws IOException {
        FileWriter fileWriter = new FileWriter("PlayersList.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < players.size(); i++) {
            bufferedWriter.append(players.get(i).getName());
            bufferedWriter.append(";");
            bufferedWriter.append(players.get(i).getScoreString());
            bufferedWriter.append("\n");
        }
        bufferedWriter.close();
    }
}
