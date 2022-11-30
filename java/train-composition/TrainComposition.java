import java.util.LinkedList;

public class TrainComposition extends LinkedList {

    public void attachWagonFromLeft(int wagonId) {
        this.add(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        this.addFirst(wagonId);
    }

    public int detachWagonFromLeft() {
        return (int) this.pollLast();
    }

    public int detachWagonFromRight() {
        return (int) this.poll();
    }

    public static void main(String[] args) {
        TrainComposition train = new TrainComposition();
        train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        System.out.println(train.detachWagonFromRight()); // 7
        System.out.println(train.detachWagonFromLeft()); // 13
    }
}