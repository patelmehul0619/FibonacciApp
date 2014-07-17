package com.mehulpatel.unittest;

import android.test.InstrumentationTestCase;

/**
 * Created by vivianaranha on 7/17/14.
 */
public class FibonacciTest extends InstrumentationTestCase {
    public void test() throws Exception {
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}
