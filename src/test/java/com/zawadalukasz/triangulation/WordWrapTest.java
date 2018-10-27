package com.zawadalukasz.triangulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordWrapTest {

    public static final int LINE_LENGTH = 5;

    //TO DO implement method that breaks words on specified space with new line
    //like a word processor would

    @Test
    public void lineShouldWrapIfOverLength() {
        String result = WordWrap.wrap("The Sleepy", LINE_LENGTH);
        assertEquals("The s\nleepy", result);
    }
}
