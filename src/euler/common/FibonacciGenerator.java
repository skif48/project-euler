package euler.common;

public class FibonacciGenerator {

    private int index;
    private int first;
    private int second;

    public FibonacciGenerator() {
        this.index = 0;

        this.first = 0;
        this.second = 1;
    }

    public int next() {

        if (this.index < 2) {
            final int result = this.index;

            ++this.index;

            return result;
        }

        final int current = this.first + this.second;

        this.first = this.second;
        this.second = current;

        return current;
    }

}