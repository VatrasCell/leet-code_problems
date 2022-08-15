package de.vatrascell.problems;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer/">link</a>
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        HashMap<String, Integer> letterHashMap = new HashMap<>();
        letterHashMap.put("I", 1);
        letterHashMap.put("IV", 4);
        letterHashMap.put("V", 5);
        letterHashMap.put("IX", 9);
        letterHashMap.put("X", 10);
        letterHashMap.put("XL", 40);
        letterHashMap.put("L", 50);
        letterHashMap.put("XC", 90);
        letterHashMap.put("C", 100);
        letterHashMap.put("CD", 400);
        letterHashMap.put("D", 500);
        letterHashMap.put("CM", 900);
        letterHashMap.put("M", 1000);

        for(int i = 0; i < s.length(); ++i) {
            if(i != s.length() - 1) {
                String doubleString = String.format("%s%s", s.charAt(i), s.charAt(i + 1));
                if(letterHashMap.containsKey(doubleString)) {
                    result += letterHashMap.get(doubleString);
                    ++i;
                    continue;
                }
            }

            result += letterHashMap.get(String.valueOf(s.charAt(i)));
        }

        return  result;
    }
}
