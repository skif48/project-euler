package fast.problems.problem018;

import euler.problem018.RouteGenerator;
import org.junit.Assert;
import org.junit.Test;

public class RouteGeneratorTest {

    @Test
    public void smoke() {
        final RouteGenerator generator = new RouteGenerator(3);

        byte[] route = generator.next();
        assertRouteIs(route, (byte) 0, (byte) 0, (byte) 0);

        route = generator.next();
        assertRouteIs(route, (byte) 0, (byte) 0, (byte) 1);

        route = generator.next();
        assertRouteIs(route, (byte) 0, (byte) 1, (byte) 0);

        route = generator.next();
        assertRouteIs(route, (byte) 0, (byte) 1, (byte) 1);

        route = generator.next();
        assertRouteIs(route, (byte) 1, (byte) 0, (byte) 0);

        route = generator.next();
        assertRouteIs(route, (byte) 1, (byte) 0, (byte) 1);

        route = generator.next();
        assertRouteIs(route, (byte) 1, (byte) 1, (byte) 0);

        route = generator.next();
        assertRouteIs(route, (byte) 1, (byte) 1, (byte) 1);

        route = generator.next();
        Assert.assertNull(route);
    }

    private void assertRouteIs(byte[] route, byte ... elements) {
        Assert.assertEquals(route.length, elements.length);

        int index = 0;

        for (final byte element : elements) {
            Assert.assertEquals(route[index], element);

            ++index;
        }

    }

}
