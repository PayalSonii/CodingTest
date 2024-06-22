package com.hsbc.reverser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsciiReverseImplTest {


    private IAsciiReverse asciiReverse = new AsciiReverseImpl();

    @Test
    public void testReverseBasicString() {
        String input = "Hello, world!";
        String expectedOutput = "!dlrow ,olleH";

        String reversed = asciiReverse.reverseContent(input);
        assertEquals(expectedOutput, reversed);
    }

    @Test
    public void testReverseEmptyString() {
        String input = "";
        String expectedOutput = "";

        String reversed = asciiReverse.reverseContent(input);
        assertEquals(expectedOutput, reversed);
    }

    @Test
    public void testReverseSingleCharString() {
        String input = "a";
        String expectedOutput = "a";

        String reversed = asciiReverse.reverseContent(input);
        assertEquals(expectedOutput, reversed);
    }

    @Test
    public void testReverseStringWithSpaces() {
        String input = "   Hello,  world!   ";
        String expectedOutput = "   !dlrow  ,olleH   ";

        String reversed = asciiReverse.reverseContent(input);
        assertEquals(expectedOutput, reversed);
    }
}