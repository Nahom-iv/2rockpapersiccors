import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorsGame {
    private static boolean continuePlay(Scanner scanner) {
        System.out.println("Do you want to play again? 1: Yes, Any number: N0?");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Welcome to Rock, Paper, Scissors game..!");
                return true;
            default:
                System.out.println("Thanks for playing the game!");
                return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player playerB = new PlayerB();
        Player playerA = new PlayerA();
        System.out.println("Welcome to Rock, Paper, Scissors game..!");
        do {
            String plA = playerA.play();
            String plB = playerB.play();
            System.out.printf("%s vs. %s", plB, plA);
            if (plA.equals(plB)) {
                System.out.println(", IT'S A TIE!");
            } else if ( ("Rock".equals(plA) && "Scissors".equals(plB)) ||
                    ("Scissors".equals(plA) && "Paper".equals(plB)) ||
                    ("Paper".equals(plA) && "Rock".equals(plB)) ) {
                System.out.println("! Player A wins!");
            } else {
                assert (("Rock".equals(plB) && "Scissors".equals(plA)) ||
                        ("Scissors".equals(plB) && "Paper".equals(plA)) ||
                        ("Paper".equals(plB) && "Rock".equals(plA)));
                System.out.println("! Player B wins!");
            }
        } while (continuePlay(scanner));
    }
}