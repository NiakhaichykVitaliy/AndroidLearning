package com.example.androidlearning;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgorithmicsTest {
    private AlgorithmicsUtils algorithmicsUtils;

    @Before
    public void setUp() throws Exception {
        algorithmicsUtils = AlgorithmicsUtils.getInstance();
    }

    @Test
    public void stringToInteger() throws Exception {
        assertEquals("10", algorithmicsUtils.stringToInteger("1234"));
    }

    @Test
    public void reverseStringByThreeSymbols() throws Exception {
        assertEquals("cba", algorithmicsUtils.reverseStringByThreeSymbols("abc"));
    }
}