package com.kylinolap.common.util;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by honma on 10/17/14.
 *
 * Keep this test case to test basic java functionality
 */
public class BasicTest {
    @Test
    public void test() throws IOException {
        double i2 = 3234.4324234324234;
        System.out.println(String.format("%.2f", i2));
    }
}
