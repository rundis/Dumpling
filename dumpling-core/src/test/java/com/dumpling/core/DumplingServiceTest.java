package com.dumpling.core;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by: magnus
 */
public class DumplingServiceTest {

    private DumplingService service;

    @Before
    public void setUp() {
        service = new DumplingService();
    }

    @Test
    public void findAll() {
        List<Dumpling> dumplings = service.findAll();

        assertTrue(dumplings.size() > 0);
    }
}
