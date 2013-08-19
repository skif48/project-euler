package fast.common.primes;

import euler.common.PrimesGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimesGeneratorTest {

    @Test
    public void smoke() {
        final PrimesGenerator generator = new PrimesGenerator();

        assertEquals(2, generator.next());
        assertEquals(3, generator.next());
        assertEquals(5, generator.next());
        assertEquals(7, generator.next());
        assertEquals(11, generator.next());
        assertEquals(13, generator.next());
        assertEquals(17, generator.next());
        assertEquals(19, generator.next());
        assertEquals(23, generator.next());
        assertEquals(29, generator.next());
        assertEquals(31, generator.next());
        assertEquals(37, generator.next());
        assertEquals(41, generator.next());
        assertEquals(43, generator.next());
        assertEquals(47, generator.next());
        assertEquals(53, generator.next());
        assertEquals(59, generator.next());
        assertEquals(61, generator.next());
        assertEquals(67, generator.next());
        assertEquals(71, generator.next());
        assertEquals(73, generator.next());
        assertEquals(79, generator.next());
        assertEquals(83, generator.next());
        assertEquals(89, generator.next());
        assertEquals(97, generator.next());
        assertEquals(101, generator.next());
        assertEquals(103, generator.next());
        assertEquals(107, generator.next());
        assertEquals(109, generator.next());
        assertEquals(113, generator.next());
        assertEquals(127, generator.next());
        assertEquals(131, generator.next());
        assertEquals(137, generator.next());
        assertEquals(139, generator.next());
        assertEquals(149, generator.next());
        assertEquals(151, generator.next());
        assertEquals(157, generator.next());
    }

}
