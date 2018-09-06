package test;

import model.ConvertRomanNumerals;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ConvertRomanNumeralsTest {

    private  ConvertRomanNumerals convertRomanNumerals;

    private static int numberDefault = 5;
    private static String numberRoman = "D";

    private static String inputNumberRoman = "V";
    private static int inputNumberDefault = 500;

    @BeforeEach
    void setUp() {
        convertRomanNumerals = new ConvertRomanNumerals(numberDefault, numberRoman);
    }

    @Test
    void valueIsExpected() {

        assertAll( () -> assertEquals( inputNumberRoman, convertRomanNumerals.getConvertToNumberRoman()),
                   () -> assertEquals( inputNumberDefault, convertRomanNumerals.getConvertToNumber()));
    }

    @Test
    @Disabled
    void valueIsNull() {
        convertRomanNumerals = new ConvertRomanNumerals(0, null);

        assertNull(convertRomanNumerals.getConvertToNumber());
    }

    @Test
    void fieldIsTrue() {
         assertAll( () -> assertTrue(convertRomanNumerals.getConvertToNumberRoman().equals(inputNumberRoman)),
                    () -> assertTrue(convertRomanNumerals.getConvertToNumber() == inputNumberDefault));
    }
}