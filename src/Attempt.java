//HelloWorld
public class Attempt {
    private PaintMix suggestedMix;
    private PaintMix solutionMix;

    public Attempt(PaintMix suggestedMix, PaintMix solutionMix) {
        this.suggestedMix = suggestedMix;
        this.solutionMix = solutionMix;
    }

    public PaintMix getPaintMix() {
        return suggestedMix;
    }

    public int getNumGood() {
        // Implement logic to calculate the number of correct colors
        return 0; // Placeholder, implement the actual logic
    }

    public int getNumWrongQuantity() {
        // Implement logic to calculate the number of colors in the wrong quantity
        return 0; // Placeholder, implement the actual logic
    }

    @Override
    public String toString() {
        return suggestedMix + " (Good " + getNumGood() + ", Wrong quantity " + getNumWrongQuantity() + ")";
    }

    public boolean isCorrect() {
        // Implement logic to check if the suggestion fully matches the solution
        return false; // Placeholder, implement the actual logic
    }
}
