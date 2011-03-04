package com.dumpling.core;

import org.junit.Test;

import java.lang.Exception;

import static org.junit.Assert.assertTrue;

public class DumplingEndToEndTest {

    @Test
    public void slowTest() throws Exception{
        Thread.sleep(1000);
        assertTrue(true);
    }

}