import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String teamScore = getScore();
        String winner = getWinner(teamScore);
        displayWinner(winner);
    }

    public static String getScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game score (format: Team1:Team2|Score1:Score2): ");
        return scanner.nextLine();
    }

    public static String getWinner(String teamScore) {
        // Find the indices of key characters
        int team1Index = teamScore.indexOf(':');
        int team2Index = teamScore.indexOf('|');
        int score1Index = teamScore.indexOf(':', team2Index);

        // Extract team names and scores
        String team1 = teamScore.substring(0, team1Index);
        String team2 = teamScore.substring(team1Index + 1, team2Index);
        int score1 = Integer.parseInt(teamScore.substring(team2Index + 1, score1Index));
        int score2 = Integer.parseInt(teamScore.substring(score1Index + 1));

        // Determine the winner based on scores
        return score1 > score2 ? team1 : team2;
    }

    public static void displayWinner(String winner) {
        System.out.println("Winner: " + winner);
    }
}