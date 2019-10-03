package ru.atom;

/**
 * In this assignment you need to implement the following util methods.
 * Note:
 * throw new UnsupportedOperationException(); - is just a stub
 */
public class Util {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        System.out.println("max: " + max(myArray));
        System.out.println("sum: " + max(myArray));
        System.out.println(getHelloWorld());
    }

    public static String getHelloWorld() {
        return "Hello, World!";
    }

    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) {
        int max = values[0];
        for(int i = 0; i < values.length; i++)
            if(max < values[i])
                max = values[i];
        return max;
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {
        long max = 0;
        for(int i = 0; i < values.length; i++)
            max+=values[i];
        return max;
    }


}
