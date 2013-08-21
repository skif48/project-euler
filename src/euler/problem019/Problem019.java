package euler.problem019;

import euler.common.Problem;

import java.util.Calendar;

public class Problem019 implements Problem {

    @Override
    public long solve() {
        final Calendar calendar = Calendar.getInstance();

        int count = 0;

        for (int year = 1901; year <= 2000; ++year) {

            for (int month = 1; month <= 12; ++month) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, 1);

                final int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek == Calendar.SUNDAY) {
                    count++;
                }
            }
        }

        return count;
    }

}
