package com.zawadalukasz.triangulation;

public class WordWrap {

    public static String wrap(final String inputLine, final int lineLength) {
        final StringBuilder accumulator = new StringBuilder();

        final int length = inputLine.length();
        accumulator.append(inputLine, 0, Math.min(length, lineLength));

        if (length > lineLength) {
            for (int i = lineLength; i < length; i+=lineLength) {
                accumulator.append("\n");
                accumulator.append(inputLine.substring(i, i + Math.min(lineLength, length-i) ));
            }
        }

        return accumulator.toString();
    }
}
