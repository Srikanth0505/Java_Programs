package myjava.programs;

public class upperCaseAllFirst {


    public static String upperCaseAllFirst(String value) {

        char[] array = value.toCharArray();
       
        array[0] = Character.toUpperCase(array[0]); // Uppercase first letter.

        // Uppercase all letters that follow a whitespace character.
        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }

        // Result.
        return new String(array);
    }

    public static void main(String[] args) {

        String value = "cat 123 456";
        String value2 = "one two three";

        // Test our code.
        String result = upperCaseAllFirst(value);
        System.out.println(value);
        System.out.println(result);

        result = upperCaseAllFirst(value2);
        System.out.println(value2);
        System.out.println(result);
    }

}
