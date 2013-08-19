package euler.common;

public class PrimeWithPower {

    public final long prime;
    public final long power;

    public PrimeWithPower(final long prime, final long power) {
        this.prime = prime;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrimeWithPower that = (PrimeWithPower) o;

        if (power != that.power) return false;
        if (prime != that.prime) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (prime ^ (prime >>> 32));
        result = 31 * result + (int) (power ^ (power >>> 32));
        return result;
    }

}
