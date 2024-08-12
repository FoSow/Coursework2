import java.util.Random;
public static void main() {

}
class PaintMixGame2 {
    private char[] solution;

    // Constructor with user-defined solution
    public PaintMixGame2(char[] solution) {
        this.solution = solution;
    }

    // Constructor with random solution
    public PaintMixGame2() {
        this.solution = generateRandomSolution();
    }

    private char[] generateRandomSolution() {
        Random random = new Random();
        char[] randomSolution = new char[5];
        for (int i = 0; i < 5; i++) {
            randomSolution[i] = (char) ('A' + random.nextInt(6)); // Generating random capital letters
        }
        return randomSolution;
    }
}
