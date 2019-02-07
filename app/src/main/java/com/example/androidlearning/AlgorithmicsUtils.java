package com.example.androidlearning;

public class AlgorithmicsUtils {

    private static AlgorithmicsUtils instance;

    private AlgorithmicsUtils() {
    }

    public static AlgorithmicsUtils getInstance() {
        if (instance == null) {
            instance = new AlgorithmicsUtils();
        }
        return instance;
    }


    public String stringToInteger(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int digitChar = Character.getNumericValue(s.charAt(i));
            sum += digitChar;
        }
        return String.valueOf(sum);
    }


    public String reverseStringByThreeSymbols(String str) {
        String result = "";

        while (str.length() >= 3) {
            String k = str.substring(0, 3);
            result += reverseString(k);
            str = str.substring(3);
        }
        str = reverseString(str);
        result = result + str;

        return result;
    }

    private String reverseString(String s) {
        StringBuffer buffer = new StringBuffer(s);
        s = buffer.reverse().toString();

        return s;
    }
}