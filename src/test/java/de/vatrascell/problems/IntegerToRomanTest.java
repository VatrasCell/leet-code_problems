package de.vatrascell.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void integerToRoman_III() {

        //arrange
        IntegerToRoman integerToRoman = new IntegerToRoman();

        //act
        String result = integerToRoman.integerToRoman(3);

        //assert
        assertEquals("III", result);
    }

    @Test
    void integerToRoman_LVIII() {

        //arrange
        IntegerToRoman integerToRoman = new IntegerToRoman();

        //act
        String result = integerToRoman.integerToRoman(58);

        //assert
        assertEquals("LVIII", result);
    }

    @Test
    void integerToRoman_MCMXCIV() {

        //arrange
        IntegerToRoman integerToRoman = new IntegerToRoman();

        //act
        String result = integerToRoman.integerToRoman(1994);

        //assert
        assertEquals("MCMXCIV", result);
    }
}