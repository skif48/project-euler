package euler.problem017;

public class NumberToTextConverter {

    public static String toText(final int number) {
        final char[] digits = String.valueOf(number).toCharArray();

        switch (digits.length) {
            case 3 : return convertThreeDigits(digits);
            case 2 : return convertTwoDigits(digits);
            case 1 : return convertOneDigit(digits[0]);
            default : return "";
        }
    }


    private static String convertThreeDigits(final char[] digits) {
        String start = convertOneDigit(digits[0]) + "hundred";

        if (digits[1] != '0' || digits[2] != '0') {
            start += "and";
        }

        final char[] twoDigits = new char[]{digits[1], digits[2]};
        final String end = convertTwoDigits(twoDigits);

        return start + end;
    }

    private static String convertTwoDigits(final char[] digits) {
        return digits[0] == '1' ? convertFromSecondDecade(digits) : convertFromAnotherDecades(digits);
    }

    private static String convertFromAnotherDecades(final char[] digits) {
        final String start;

        switch (digits[0]) {
            //case '1' : start = "one"; break;
            case '2' : start = "twenty"; break;
            case '3' : start = "thirty"; break;
            case '4' : start = "forty"; break;
            case '5' : start = "fifty"; break;
            case '6' : start = "sixty"; break;
            case '7' : start = "seventy"; break;
            case '8' : start = "eighty"; break;
            case '9' : start = "ninety"; break;
            default : start =  "";
        }

        final String end = convertOneDigit(digits[1]);

        return start + end;
    }

    private static String convertFromSecondDecade(final char[] digits) {

        switch (digits[1]) {
            case '0' : return "ten";
            case '1' : return "eleven";
            case '2' : return "twelve";
            case '3' : return "thirteen";
            case '4' : return "fourteen";
            case '5' : return "fifteen";
            case '6' : return "sixteen";
            case '7' : return "seventeen";
            case '8' : return "eighteen";
            case '9' : return "nineteen";
            default : return "";
        }
    }

    private static String convertOneDigit(final char digit) {

        switch (digit) {
            case '1' : return "one";
            case '2' : return "two";
            case '3' : return "three";
            case '4' : return "four";
            case '5' : return "five";
            case '6' : return "six";
            case '7' : return "seven";
            case '8' : return "eight";
            case '9' : return "nine";
            default : return "";
        }
    }

    private NumberToTextConverter() {
        // empty
    }

}
