package de.vatrascell.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt_3() {

        //arrange
        RomanToInteger romanToInteger = new RomanToInteger();

        //act
        int result = romanToInteger.romanToInt("III");

        //assert
        assertEquals(3, result);
    }

    @Test
    void romanToInt_58() {

        //arrange
        RomanToInteger romanToInteger = new RomanToInteger();

        //act
        int result = romanToInteger.romanToInt("LVIII");

        //assert
        assertEquals(58, result);
    }

    @Test
    void romanToInt_1994() {

        //arrange
        RomanToInteger romanToInteger = new RomanToInteger();

        //act
        int result = romanToInteger.romanToInt("MCMXCIV");

        //assert
        assertEquals(1994, result);
    }
}