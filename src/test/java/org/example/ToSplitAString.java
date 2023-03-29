package org.example;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;



public class ToSplitAString {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, SolutionToSplitAString.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, SolutionToSplitAString.stringToArray("I love arrays they are my favorite"));
    }
}

