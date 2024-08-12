public class PaintMixGame {
    public static void main(String[] args) {

    }
    private PaintMix solution;
    private AttemptLinkedList previousAttempts;

    public PaintMixGame(PaintMix solution) {
        this.solution = solution;
        this.previousAttempts = new AttemptLinkedList();
    }

    public boolean attemptPaintMix(PaintMix paintMix) {
        Attempt newAttempt = new Attempt(paintMix, solution);
        previousAttempts.addFirst(newAttempt);
        return false; // Placeholder, actual logic to be implemented
    }

    public AttemptLinkedList getPreviousAttempts() {
        return previousAttempts;
    }

    public PaintMix getSolution() {
        return solution;
    }

    public class Node {
    }
}

class AttemptLinkedList {
    private AttemptNode head;

    public void addFirst(Attempt attempt) {
        AttemptNode newNode = new AttemptNode(attempt);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        AttemptNode current = head;
        while (current != null) {
            sb.append(current.attempt.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}

class AttemptNode {
    Attempt attempt;
    AttemptNode next;

    public AttemptNode(Attempt attempt) {
        this.attempt = attempt;
        this.next = null;
    }
}
//-----------------------------------------
