package euler.common;

import java.math.BigInteger;

public class FibonacciGenerator {

    private int index;
    private BigInteger first;
    private BigInteger second;

    public FibonacciGenerator() {
        this.index = 0;

        this.first = BigInteger.ZERO;
        this.second = BigInteger.ONE;
    }

    public BigInteger next() {

        if (this.index < 2) {
            return BigInteger.valueOf(this.index++);
        }

        final BigInteger current = this.first.add(this.second);

        this.first = this.second;
        this.second = current;

        return current;
    }

}