package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticTest {

    @Test
    public void testAdd() {
        assertEquals(5, Arithmetic.add(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(1, Arithmetic.sub(3, 2));
    }

    @Test
    public void testMul() {
        assertEquals(6, Arithmetic.mul(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(2, Arithmetic.div(4, 2));
    }
}