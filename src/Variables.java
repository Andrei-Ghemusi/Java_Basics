
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        // Ex_1 - Write a variable for each of these: string, int, long, double, boolean, char, constant.
        System.out.println("Ex_1");
        String name = "Drew";
        Integer number = 1234;
        long longer_number = 544444567;
        Double fraction = 1.78;
        Boolean is_true = true;
        char first_letter = 'A';
        final double PI = 3.14; // this is a constant


        // Ex_2 Round the double variable and save this modification in the same variable (overwrite).
        System.out.println("\nEx_2");
        fraction = (double) Math.round(fraction);
        System.out.println(fraction);


        // Ex_3 Using the souf() method print in console 8 phrases using the 8 previously declared variables
        System.out.println("\nEx3");
        System.out.printf("My name is %s%n", name);
        System.out.printf("My code is %s%n", number);
        System.out.printf("My longer code is %s%n", longer_number);
        System.out.printf("My height is %s%n", fraction);
        System.out.printf("It is %s that I am learning Java%n", is_true);
        System.out.printf("The first letter from my name is %s%n", first_letter);
        System.out.printf("Pi's value never changes, it will always be %s%n", PI);


        // Ex_4 - Input the name and surname of a person and save each of them in a different variable.
        //				# Show in console the next phrase:'My complete name has x characters'.
        System.out.println("\nEx_4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a name: ");
        String person_name = sc.next();
        System.out.println("Input a surname: ");
        String person_surname = sc.next();
        int compelete_length = person_name.length() + person_surname.length();
        System.out.printf("My complete name has %s characters%n", compelete_length);


        // Ex_5 - Input the length and width of a rectangle and save each of them in different variables.
        //				# Show in console the next phrase: 'Rectangle area is x square meters'.
        System.out.println("\nEx_5");
        System.out.println("Input the rectangle length: ");
        Integer rectangle_len = sc.nextInt();
        System.out.println("Input the rectangle width: ");
        Integer rectangle_wid = sc.nextInt();
        int rectangle_area = rectangle_len * rectangle_wid;
        System.out.printf("Rectangle area is %s square meters%n", rectangle_area);


        // Ex_6 Given the string: 'Coral is either the stupidest animal or the smartest rock' show how many times the word 'the' appears
        System.out.println("\nEx_6");
        String coral = "Coral is either the stupidest animal or the smartest rock";
        String word_to_count = "the";
        String[] words = coral.split(" ");

        int count = 0;
        for (String word: words) {
            if (word.equals(word_to_count)) {
                count++;
            }
        }
        System.out.printf("The word \"%s\" appears %s times%n", word_to_count, count);


        // Ex_7 Using the string from Ex_6, replace 'the' with 'THE' (including 'the' from 'either')
        System.out.println("\nEx_7");
        System.out.println(coral.replace("the", "THE"));


        // Ex_8 Using the string from Ex_6, with an assert verify if this string contains ONLY numbers.
        System.out.println("\nEx_8");
        String all_digits = "\\d*"; // d = represents any digit from 0 to 9.
                                    // * = quantifier that specifies "zero or more occurrences" of the preceding element
        assert !coral.matches(all_digits):"The string has numbers";


        // Ex_9 Input an odd string and show the middle character.
        //					# It won't verify if the string is odd (assuming that we will introduce the correct number of characters)
        System.out.println("\nEx_9");
        System.out.println("Input an odd string: ");
        String odd_string = sc.next();
        int middle_index = (odd_string.length()/2);
        char middle_char = odd_string.charAt(middle_index);
        System.out.printf("The middle character is %s%n", middle_char);

        // Ex_10 Using assert, verify if a string is a palindrome
        System.out.println("\nEx_10");
        String palindrome = "radar";
        boolean isPalindrome=true;

        for (int i=0; i<palindrome.length(); i++){
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

        // Ex_11 - Input a string (ex: 'alabala portocala') on which you shall do:
        // save each word in a variable;
        // print both variables to verify.
        System.out.println("\nEx_11");
        System.out.println("Enter a string with at least two words: ");
        Scanner scan = new Scanner(System.in);
        String multiple_words = scan.nextLine();
        System.out.println(multiple_words);
        String[] multiple_words_array = multiple_words.split("\\s+");
        String firstWord = multiple_words_array[0];
        String second_word = multiple_words_array[1];
        System.out.printf("First variable is %s%n", firstWord);
        System.out.printf("Second variable is %s%n", second_word);

        // Ex_12 - Input a string (ex: 'alabala portocala') on which you shall do:
        // take the first word;
        // Uppercase word everywhere, except the first and last character
        System.out.println("\nEx_12");
        StringBuilder modifiedWord = new StringBuilder();
        modifiedWord.append(Character.toLowerCase(firstWord.charAt(0)));

        for (int i = 1; i < firstWord.length() - 1; i++) {
            modifiedWord.append(Character.toUpperCase(firstWord.charAt(i)));
        }

        if (firstWord.length() > 1) {
            modifiedWord.append(Character.toLowerCase(firstWord.charAt(firstWord.length() - 1)));
        }
        System.out.printf("The modified word is %s%n", modifiedWord);

    }
}