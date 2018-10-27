package com.zawadalukasz.triangulation;

public class WordWrap {

    public static String wrap(final String inputLine, final int lineLength) {
        final StringBuilder accumulator = new StringBuilder();

        final int length = inputLine.length();
        accumulator.append(inputLine, 0, Math.min(length, lineLength));

        int split = lineLength;
        if (length > split) {
            while (length > split) {
                accumulator.append("\n");
                accumulator.append(inputLine, split, split + lineLength);
                split += lineLength;
            }
        }

        return accumulator.toString();
    }
}
