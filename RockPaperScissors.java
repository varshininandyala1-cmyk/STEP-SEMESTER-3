import java.util.*;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int N = 5;
        int wins = 0, losses = 0, draws = 0;

        String[] playerMoves = new String[N];
        String[] computerMoves = new String[N];
        String[] results = new String[N];

        for (int i = 0; i < N; i++) {

            System.out.print("Round " + (i + 1) + " - Enter Rock, Paper or Scissors: ");
            String playerMove = sc.next();

            String computerMove = moves[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);

            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;

            System.out.println("Computer Move: " + computerMove);
            System.out.println("Result: " + result);
            System.out.println();

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        // Summary table
        System.out.println("\nFinal Summary");
        System.out.println("---------------------------------------------");
        System.out.println("Round\tPlayer Move\tComputer Move\tResult");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + "\t" + playerMoves[i] + "\t\t"
                    + computerMoves[i] + "\t\t" + results[i]);
        }

        double winPercentage = (wins * 100.0) / N;

        System.out.println("---------------------------------------------");
        System.out.println("Wins: " + wins +
                " | Losses: " + losses +
                " | Draws: " + draws);

        System.out.println("Win %: " + winPercentage + "%");

        sc.close();
    }
}