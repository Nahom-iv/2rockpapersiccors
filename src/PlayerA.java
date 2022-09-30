import java.util.Scanner;

public class PlayerA implements Player {
    public PlayerA() {
    }

    public String play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player A - Select 1. Rock, 2. Paper, 3. Scissors");
        int choice = scanner.nextInt();
        return CHOICES[choice - 1];
    }
}
