package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatSolutionTest {
    @Test
    public void test4a() {
        assertEquals("aaaa", RepeatSolution.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", RepeatSolution.repeatStr(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", RepeatSolution.repeatStr(5, ""));

    }

    @Test
    public void test0kata() {
        assertEquals("", RepeatSolution.repeatStr(0, "kata"));
    }
}
