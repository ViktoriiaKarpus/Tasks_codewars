package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UpperSolutionTest {

    Upper u = new Upper();

    @Test
    public void testSomething() {
        assertEquals("HELLO",u.MakeUpperCase("hello"));
    }

}
