public class PaintMix {
    private final char[] paintMix;

    public PaintMix(char[] paintMix) {
        this.paintMix = paintMix;
    }

    public char getPaint(int i) {
        return paintMix[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char paint : paintMix) {
            sb.append(paint).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        char[] colors = {'A', 'B', 'C', 'D', 'E'};
        PaintMix mix = new PaintMix(colors);
        System.out.println("Paint Mix: " + mix);
        System.out.println("Paint at position 2: " + mix.getPaint(2));
    }
}
