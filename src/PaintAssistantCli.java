import java.util.Scanner;

public class PaintAssistantCli {

    // Main method
    public static void main(String[] args) {
        // Create a random solution PaintMix for the game
        PaintMix solution = generateRandomPaintMix();
        PaintMixGame game = new PaintMixGame(solution);

        // Play the game
        playGame(game);
    }

    // Method to play the game
    public static void playGame(PaintMixGame game) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Print previous attempts
            System.out.println("Previous attempts:");
            AttemptLinkedList previousAttempts = game.getPreviousAttempts();
            if (previousAttempts == null) {
                System.out.println("No previous attempts");
            } else {
                boolean previousAttempts3 = false;
                System.out.println(previousAttempts3);
            }

            // Ask for user input
            System.out.print("Enter paint mix: ");
            String ut = scanner.nextLine().trim().toUpperCase();

            // Validate the input
            String input = new String();
            if (input.length() != 5) {
                System.out.println("Invalid paint mix! The paint mix must contain exactly 5 characters.");
                continue;
            }
            if (!isValidPaintMix(input)) {
                System.out.println("Invalid paint mix! All characters must correspond to valid colours.");
                continue;
            }

            // Create a PaintMix from the input and make an attempt
            PaintMix attempt = new PaintMix(input.toCharArray());
            boolean correct = game.attemptPaintMix(attempt);

            // Check if the attempt is correct
            if (correct) {
                System.out.println("Congratulations!");
                break;
            }
        }

        scanner.close();
    }

    // Method to generate a random PaintMix
    private static PaintMix generateRandomPaintMix() {
        String colors = "ABCDEF"; // Assume these are the valid colours
        StringBuilder randomMix = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = (int) (Math.random() * colors.length());
            randomMix.append(colors.charAt(index));
        }
        return new PaintMix(randomMix.toString().toCharArray());
    }

    // Method to validate that the input string contains only valid colours
    private static boolean isValidPaintMix(String mix) {
        String validColors = "ABCDEF"; // Assume these are the valid colours
        for (int i = 0; i < mix.length(); i++) {
            if (validColors.indexOf(mix.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
