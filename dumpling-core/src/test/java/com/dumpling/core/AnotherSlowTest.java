package com.dumpling.core;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by: magnus
 */
public class AnotherSlowTest {

    @Test
    public void dummy() {
        assertTrue(true);
    }

    //@Test
    public void doUseless() throws Exception {
        Thread.sleep(1000);
    }

    //@Test
    public void doUseless2() throws Exception {
        Thread.sleep(1000);
    }
}
