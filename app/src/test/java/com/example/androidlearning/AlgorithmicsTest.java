package com.example.androidlearning;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgorithmicsTest {
    private AlgorithmicsUtils string;

    @Before
    public void setUp() throws Exception {
        string = AlgorithmicsUtils.getInstance();
    }

    @Test
    public void stringToInteger() throws Exception {
        assertEquals("10", string.stringToInteger("1234"));
    }

    @Test
    public void reverseStringByThreeSymbols() throws Exception {
        assertEquals("cba", string.reverseStringByThreeSymbols("abc"));
    }
}