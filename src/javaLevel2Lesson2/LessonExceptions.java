package javaLevel2Lesson2;

import java.util.Arrays;

public class LessonExceptions {

    private static final class ExtraRows extends RuntimeException {
        ExtraRows(String message) {
            super("Rows exception: " + message);
        }
    }

    private static final class ExtraCollums extends RuntimeException {
        ExtraCollums(String message) {
            super("Columns exception: " + message);
        }
    }

    private static final class NotANumber extends RuntimeException {
        NotANumber(String message) {
            super("Not a number found: " + message);
        }
    }

        private static final String ARRAY = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        private static final String LONG_ARRAY = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0\n 9";
        private static final String LONGCOLLUMN_ARRAY = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0 9 10";
        private static final String SYMBOL_ARRAY = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 x";

        private static final int ROWS = 4;
        private static final int COLLUMS = 4;

        private static String[][] stringToArray(String range) {
            String[] arr = range.split("\n");
            if (arr.length != ROWS)
                throw new ExtraRows(arr.length + ":\n" + range);

            String[][] matrixArray = new String[ROWS][];
            for (int i = 0; i < matrixArray.length; i++) {
                matrixArray[i] = arr[i].split(" ");
                if (matrixArray[i].length != COLLUMS)
                    throw new ExtraCollums(matrixArray[i].length + ":\n" + range);
            }
            return matrixArray;
        }

        private static float calcArray(String[][] matrixArray) {
            int summ = 0;
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    try {
                        summ += Integer.parseInt(matrixArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new NotANumber(matrixArray[i][j] + " on position + " + i + ":" + j);
                    }
                }
            }
            return summ/ 2f;
        }


        public static void main(String[] args) {

            try {
                //final String[][] arrayMatrix = stringToArray(ARRAY);
                //final String[][] arrayMatrix = stringToArray(LONG_ARRAY);
                //final String[][] arrayMatrix = stringToArray(LONGCOLLUMN_ARRAY);
                final String[][] arrayMatrix = stringToArray(SYMBOL_ARRAY);
                System.out.println(Arrays.deepToString(arrayMatrix));
                System.out.println("Half sum = " + calcArray(arrayMatrix));
            } catch (NotANumber e) {
                System.out.println("A NumberFormatException is thrown: " + e.getMessage());
            } catch (ExtraRows | ExtraCollums e) {
                System.out.println("A RuntimeException successor is thrown: " + e.getMessage());
            }

        }

}

