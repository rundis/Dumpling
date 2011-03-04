package com.dumpling.util;

import com.dumling.util.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * Created by: magnus
 */
public class StringUtilTest {

    @Test
    public void concatDumplingStyle() {
        String arg1 = "Hello";
        String arg2 = "World";

        String result = StringUtil.concatDumplingStyle(arg1, arg2);
        assertTrue(result.contains(arg1));
        assertTrue(result.contains(arg2));
    }
}
