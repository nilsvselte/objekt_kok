package oving1;
import java.lang.Math;
public class UpOrDownCounter {
    int Start;
    int Count;
    int End;
    boolean Ended = false;
    boolean reversed;

    public static void main(String[] args) {

    }

    // Contructor
    public UpOrDownCounter(int start, int end) {
        if (start == end) {
            throw new IllegalArgumentException("start and end cannot be equal!");
        }

        this.Start = start;
        this.End = end;
        this.Count = start;
        if (start > end) {
            reversed = true;
        }

    }
    // getters

    public int getCounter() {
        return this.Count;
    }

    public boolean count() {
        System.out.println("This.Count: " + this.Count + " This.End: " + this.End + "Logical eqvivalence" + (this.End == this.Count));
        if (!this.Ended){
            if (this.reversed) {
                this.Count -= 1;
            } else {
                this.Count += 1;
            }
        }
        if (Math.abs(this.Count) == Math.abs(this.End)) {
            this.Ended = true;
            return false;
        } else {
            return true;
        }

    }
}
