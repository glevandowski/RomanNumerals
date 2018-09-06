package model;

import java.util.Collections;

/***
 * @author Gustavo Levandowski
 * @version 1.0
 */
public class ConvertRomanNumerals {

    private static int[] numberDefault = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] numberConvert = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    private int numberInput;
    private String numberRoman;

    public ConvertRomanNumerals(int numberInput, String numberRoman) {
        this.numberInput = numberInput;
        this.numberRoman = numberRoman;
    }

    /**
     * returns the Roman number for the decimal numbers
     */
    public int getConvertToNumber() {
       if (numberRoman.isEmpty() || numberRoman == null) return 0;

        int result = 0;
        int numberRight = 0;

        for (int i = numberRoman.length() - 1; i >= 0; i--) {

            int value = (int) (Math.floor(Math.pow(10, "IXCM".indexOf(numberRoman.charAt(i))))
                    + 5 * Math.floor(Math.pow(10, "VLD".indexOf(numberRoman.charAt(i)))));

            result += value * Math.signum(value + 0.5 - numberRight);
            numberRight = value;
        }
        return result;
    }

    /**
     * returns the Roman number.
     */
    public String getConvertToNumberRoman() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberDefault.length; i++) {

            int integerValue = (numberInput / numberDefault[i]);

            numberInput -= (numberDefault[i] * integerValue);

            result.append(String.join("", Collections.nCopies(integerValue, numberConvert[i])));
        }
        return result.toString();
    }
}
