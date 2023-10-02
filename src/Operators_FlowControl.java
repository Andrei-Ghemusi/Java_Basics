import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operators_FlowControl {
    public static void main(String[] args) {

        // Ex_1 - Verify and show if x is a natural number.
        System.out.println("\nEx_1");
        System.out.println("Input an integer: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x>=0) {
            System.out.printf("%s is a natural number%n", x);
        } else {
            System.out.printf("%s is not a natural number%n", x);
        }


        // Ex_2 Verify and show if x is a positive, negative or neutral number.
        System.out.println("\nEx_2");
        if (x>0) {
            System.out.printf("%s is a positive number%n", x);
        } else if (x<0) {
            System.out.printf("%s is a negative number%n", x);
        } else {
            System.out.printf("%s is a neutral number%n", x);
        }


        // Ex_3 - Verify and show if x is between -2 and 13 (including -2 and 13).
        System.out.println("\nEx_3");
        if (x>-2 && x<13){
            System.out.printf("%s is between -2 and 13%n", x);
        } else {
            System.out.printf("%s is NOT between -2 and 13%n", x);
        }


        // Ex_4 - Verify and show if the difference between x and y is lower than 5.
        System.out.println("\nEx_4");
        System.out.println("Input another integer: ");
        int y = sc.nextInt();
        int difference = x - y;
        if (difference > 5) {
            System.out.printf("The difference between %s and %s is not lower than 5%n", x, y);
        } else {
            System.out.printf("The difference between %s and %s is lower than 5%n", x, y);
        }


        // Ex_5 - Verify if x is NOT inbetween 5 and 27 (including 5 and 27).
        System.out.println("\nEx_5");
        if (x>6 && x <28){
            System.out.printf("%s is between 5 and 27%n", x);
        } else {
            System.out.printf("%s is not between 5 and 27%n", x);
        }


        // Ex_6 - Verify if x and y are equal, if not show which is higher.
        System.out.println("\nEx_6");
        if (x==y){
            System.out.println("x and y are equal");
        } else if (x>y) {
            System.out.printf("x %s is higher than y which is %s%n", x, y);
        } else {
            System.out.printf("y %s is higher than x which is %s%n", y, x);
        }


        // Ex_7 - Having integers x, y, z - all triangle sides,
        //                    # show if the triangle is isosceles (two sides are equal),
        //                    # equilateral (all sides are equal)
        //                    # no side is equal to another.
        System.out.println("\nEx_7");
        System.out.println("Input another integer: ");
        int z = sc.nextInt();
        if (x==y && y==z) {
            System.out.println("Triangle is equilateral");
        } else if (x!=y && x!=z && y!=z) {
            System.out.println("No side equal to another");
        } else {
            System.out.println("Triangle is isosceles");
        }


        // Ex_8 - Input a letter then verify if it is a vowel or not.
        System.out.println("\nEx_8");
        System.out.println("Input one letter: ");
        char input_letter = sc.next().toLowerCase().charAt(0);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;

        for (char letter: vowels) {
            if (letter == input_letter){
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.printf("Input letter %c is a vowel%n", input_letter);
        } else {
            System.out.printf("Input letter %c is not a vowel%n", input_letter);
        }


        // Ex_9 - Transform the grades from the romanian grading system to the US grading system as follows:
        //# Over 9 => A
        //# Over 8 => B
        //# Over 7 => C
        //# Over 6 => D
        //# Over 4 => E
        //# 4 or under => F
        System.out.println("\nEx_9");
        System.out.print("Enter the grade in the Romanian grading system(from 1-10): ");
        int ro_grade = sc.nextInt();

        char us_grade;

        if (ro_grade > 9) {
            us_grade = 'A';
        } else if (ro_grade > 8) {
            us_grade = 'B';
        } else if (ro_grade > 7) {
            us_grade = 'C';
        } else if (ro_grade > 6) {
            us_grade = 'D';
        } else if (ro_grade > 4) {
            us_grade = 'E';
        } else {
            us_grade = 'F';
        }
        System.out.printf("In the US grading system, the equivalent grade is: %c%n", us_grade);


        // Ex_10 - Verify if x has a minimun of 4 digits.
        System.out.println("\nEx_10");
        String x_to_string = Integer.toString(x);
        int x_length = x_to_string.length();
        if (x_length >= 4) {
            System.out.println("x has at least 4 digits");
        } else {
            System.out.println("x does not have even 4 digits");
        }


        // Ex_11 - Verify if x is even or odd.
        System.out.println("\nEx_11");
        if (x%2 == 0){
            System.out.printf("%s is even%n", x);
        } else {
            System.out.printf("%s is odd%n", x);
        }

        // Ex_12 - Having integers x, y, z - all triangle angles
        // Verify and show if the triangle is valid (if the sum of all angles is 180 degrees)
        System.out.println("\nEx_12");
        if (x+y+z == 180) {
            System.out.println("The triangle is valid");
        } else {
            System.out.println("The triangle is invalid");
        }

        // Ex_13 - Having the string: 'Coral is either the stupidest animal or the smartest rock'
        // Show the string without the last x characters
        System.out.println("\nEx_13");
        String coral = "Coral is either the stupidest animal or the smartest rock";
        int coral_index = coral.length() - x;
        String final_coral = coral.substring(0, coral_index);
        System.out.printf("The string without the final %s characters is %s%n", x, final_coral);


        // Ex_14 - Using the same string from ex_13, declare a new string made from the first 5 characters and the last 5.
        System.out.println("\nEx_14");
        String first_5 = coral.substring(0, 4);
        String last_5 = coral.substring(coral.length()-5, coral.length()-1);
        String combined_5 = first_5 + last_5;
        System.out.printf("The combined first 5 characters and last 5 characters string is %s%n", combined_5);


        // Ex_15 - Using the same string from ex_13, declare in a variable and show the index of 'rock'.
        //            - show the whole string until this word
        System.out.println("\nEx_15");
        int rock_index = coral.indexOf("rock");
        String coral_no_rocks = coral.substring(0,rock_index);
        System.out.printf("The coral without rocks is \"%s\"%n", coral_no_rocks);


        // Ex_16 - Having the STRING '0123456789' show only even digits and then show only odd the odd ones
        System.out.println("\nEx_16");
        String numbers_string = "0123456789";
        String[] numbers_array = numbers_string.split("");
        List<Integer> even_numbers = new ArrayList<>();
        List<Integer> odd_numbers = new ArrayList<>();

        for (String i: numbers_array){
            Integer number_int = Integer.parseInt(i);

            if (number_int%2 == 0){
                even_numbers.add(number_int);
            } else {
                odd_numbers.add(number_int);
            }
        }
        System.out.printf("The even numbers are %s%n", even_numbers);
        System.out.printf("The odd numbers are %s%n", odd_numbers);


        // Ex_17 - Input a string then verify if the first and the last character are the same using an 'assert'
        System.out.println("\nEx_17");
        System.out.println("Input a string: ");
        String new_string = sc.next().toLowerCase();
        char first_char = new_string.charAt(0);
        char last_char = new_string.charAt(new_string.length()-1);

        assert (first_char == last_char): String.format("Error: The first character %c and the last character %c are not the same", first_char, last_char);
    }
}
