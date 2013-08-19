package euler.problem014;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheableGollatzSequenceMeasurer {

    private final Map<Long, Long> cachedMeasures;

    public CacheableGollatzSequenceMeasurer() {
        this.cachedMeasures = new HashMap<Long, Long>();
    }

    public long calculateLength(final long from) {
        final Long cached = this.cachedMeasures.get(from);

        if (cached != null) {
            return cached;
        }

        final List<Long> elements = new ArrayList<Long>();
        elements.add(from);

        long current = from;
        Long found = null;

        while (current != 1 && found == null) {
            current = nextElement(current);
            found = this.cachedMeasures.get(current);

            if (found == null) {
                elements.add(current);
            }
        }

        long count = elements.size();
        long index = 0;
        long base = found == null ? 0 : found;

        for (final Long element : elements) {
            this.cachedMeasures.put(element, count - index + base);

            ++index;
        }

        return this.cachedMeasures.get(from);
    }

    public static long nextElement(final long current) {
        return current % 2 == 0 ? current / 2 : 3 * current + 1;
    }

}
