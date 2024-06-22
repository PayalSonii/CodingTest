package com.hsbc.reverser;

public class AsciiReverseImpl implements IAsciiReverse{
    @Override
    public String reverseContent(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
