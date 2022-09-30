import java.util.Scanner;

public class PlayerB implements Player {
    public PlayerB() {
    }

    public String play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player B - Select 1. Rock, 2. Paper, 3. Scissors");
        int choice = scanner.nextInt();
        return CHOICES[choice - 1];
    }
}