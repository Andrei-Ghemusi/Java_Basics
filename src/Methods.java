
import java.util.*;

public class Methods {
    // Ex_1 - Function that calculates and returns the sum of 2 numbers
    public static int sum(int a, int b){
        System.out.println("\nEx_1");
        return Math.addExact(a,b);
    }


    // Ex_2 - Function that returns TRUE if a number is even, FALSE for odd.
    public static boolean odd_or_even(int number){
        System.out.println("\nEx_2");
        return number % 2 == 0;
    }


    // Ex_3 - Function that returns the total number of characters in your full name. (last name, first name, middle name)
    public static int TotalCharactersFullName(String first_name, String last_name){
        System.out.println("\nEx_3");
        return last_name.length() + first_name.length();
    }

    // we overload the method now, in case the person does have a middle name
    public static int TotalCharactersFullName(String first_name, String middle_name, String last_name){
        System.out.println("\nEx_3");
        return first_name.length() + middle_name.length() +last_name.length();
    }


    // Ex_4 - Function that returns rectangle area
    public static int RectangleArea(int length, int width){
        System.out.println("\nEx_4");
        return length*width;
    }


    // Ex_5 - Function that returns circle area
    public static double CircleArea(int radius){
        System.out.println("\nEx_5");
        return 3.14 * Math.pow(radius, 2);  // used Math to get radius power 2, and 3.14 is PI
    }


    // Ex_6 - Function that returns True if a character x is found in a given string. False if not.
    public static boolean SearchCharacter(char x, String myString){
        System.out.println("\nEx_6");
        return myString.indexOf(x) != -1;  // if the index is -1 then the character x is not in the String
    }


    // Ex_7 - Function without return, receives a string and prints on the screen:
    // The number of lower case characters is x,
    // The number of upper case characters is y.
    public static void CountCharacters(String myString){
        System.out.println("\nEx_7");
       int lowercase = 0;
       int uppercase = 0;

       for (char i:myString.toCharArray()){
           if (Character.isLowerCase(i)){
               lowercase++;
           } else {
               uppercase++;
           }
       }
        System.out.printf("The number of lowercase characters is %s%n", lowercase);
        System.out.printf("The number of uppercase characters is %s%n", uppercase);
    }


    // Ex_8 - Function that receives a LIST of numbers and returns a LIST with only the positive numbers.
    public static List<Integer> filterPositives(List<Integer>numbers){
        System.out.println("\nEx_8");
        List<Integer>positiveNumbers = new ArrayList<>();
        for (int i:numbers){
            if (i>0){
                positiveNumbers.add(i);
            }
        }
        return positiveNumbers;
    }


    // Ex_9 - Function that doesn't return anything. Receives 2 numbers and PRINTS:
    // First number x is greater than the second number y,
    // Second number y is greater than the first number x,
    // The numbers are equal.
    public static void compareNumbers(int x, int y){
        System.out.println("\nEx_9");
        if (x>y){
            System.out.printf("First number %s is greater than the second number %s%n", x, y);
        } else if (x<y) {
            System.out.printf("Second number %s is greater than the first number %s%n", x, y);
        } else {
            System.out.println("The numbers are equal");
        }
    }


    // Ex_10 - Function that receives a number and a set of numbers.
    //  Prints 'added the new number to the set' + returns True
    //  or Prints 'did not add the number to the set. It already exists' + returns False.
    public static boolean addNumberToSet(int number, Set<Integer> numberSet){
        System.out.println("\nEx_10");
        if (numberSet.contains(number)){
            System.out.printf("Did not add the number %s to the set. It already exists%n", number);
            return false;
        } else {
            numberSet.add(number);
            System.out.printf("Added the new number %s to the set%n", number);
            return true;
        }
    }

    // Ex_11 - Function that receives a month of the year and returns how many days that month has.
    public static int returnMonthDays(String month) {
        System.out.println("\nEx_11");
        Map<String, Integer> allMonths = new HashMap<>();
        allMonths.put("january", 31);
        allMonths.put("february", 28);
        allMonths.put("march", 31);
        allMonths.put("april", 30);
        allMonths.put("may", 31);
        allMonths.put("june", 30);
        allMonths.put("july", 31);
        allMonths.put("august", 31);
        allMonths.put("september", 30);
        allMonths.put("october", 31);
        allMonths.put("november", 30);
        allMonths.put("december", 31);

        String lowMonth = month.toLowerCase();

        if (allMonths.containsKey(lowMonth)){
            return allMonths.get(lowMonth);
        } else {
            System.out.printf("The month %s you added is invalid.", month);
            return -1;
        }
    }


    // Ex_12 - Calculator function that returns 4 values: Sum, difference, multiplication, and division of 2 numbers.
    public static Map<String, Double> calculateOperations(int x, int y){
        System.out.println("\nEx_12");
        Map<String, Double> operations = new HashMap<>();

        double difference = x-y;
        double multiplication = x*y;
        double sum = x+y;
        if (y==0){
            System.out.println("Division by 0 is not allowed!");
            operations.put("The division is: ", Double.NaN);
        } else {
            double division = (double) x / y;
            operations.put("The division is: ", division);
        }

        operations.put("The sum is: ", sum);
        operations.put("The difference is: ", difference);
        operations.put("The multiplication is: ", multiplication);
        return operations;
    }


    // Ex_13 - Function that receives 3 numbers and returns the maximum value among them.
    public static int getHighestNumber(int x, int y, int z){
        System.out.println("\nEx_13");
        return Math.max(Math.max(x, y), z);
    }


    // Ex_14 - Function that receives a list of digits (i.e., only 0-9)
    //Returns a map that tells us how many times each digit appears.
    public static Map<Integer, Integer> countDigits(List<Integer> numbers){
        System.out.println("\nEx_14");
        Map<Integer, Integer> counter = new HashMap<>();

        for (int digit : numbers) {
            counter.put(digit, counter.getOrDefault(digit, 0) + 1);
        }

        return counter;
    }


    // Ex_15 - Function that receives a number and returns the sum of all numbers from 0 to that number.
    public static int AddNumbersUntil(int x){
        System.out.println("\nEx_15");
        int sum = 0;
        for(int i=0; i<=x; i++){
            sum = sum +i;
        }
        return sum;
    }


    // Ex_16 - Function that receives 2 lists of numbers (numbers can be duplicated) and returns the common numbers.
    public static Set<Integer> Intersection(List<Integer>first_list, List<Integer>second_list){
        System.out.println("\nEx_16");
        Set<Integer> common_numbers = new HashSet<>();

        for(int i: first_list){
            for (int j: second_list){
                if (i == j){
                    common_numbers.add(i);
                }
            }
        }
        return common_numbers;
    }


    // Ex_17 - Function that applies a discountPercentage price.
    //  If the product costs 100 lei, and we apply a 10% discountPercentage, the price will be 90.
    //  Handle cases where the discountPercentage is invalid. For example, a 110% discountPercentage is invalid.
    public static double applyDiscount(double price, double discountPercentage){
        System.out.println("\nEx_17");
        if (price>0 && discountPercentage >=0 & discountPercentage <=100){
            double discount = price * (discountPercentage/100);
            return price - discount;
        } else {
            System.out.printf("Invalid price %s or invalid discount %s%n", price, discountPercentage);
            return -1;
        }
    }

    public static void main(String[] args) {
        // Ex_1
        int a = 2;
        int b = 3;
        System.out.printf("The sum of a=%s and b=%s is %s", a, b, sum(a,b));


        // Ex_2
        int number = 13;
        System.out.printf("The number %s is odd %s%n", number, odd_or_even(number));


        // Ex_3
        String first_name = "Andrew";
        String middle_name = "Tom";
        String last_name = "Robinson";
        System.out.printf("The number of characters in my full name is: %s%n", TotalCharactersFullName(first_name, middle_name, last_name));


        // Ex_4
        int wid = 4;
        int len = 7;
        System.out.printf("The are of a rectangle is %s%n", RectangleArea(wid,len));


        // Ex_5
        int rad = 10;
        System.out.printf("The are of a circle is %s%n",CircleArea(rad));


        // Ex_6
        char character = 'A';
        String mystring = "Almanah";
        System.out.printf("The character %s is in the string %s: %s%n", character, mystring, SearchCharacter(character, mystring));


        // Ex_7
        String coral = "Coral is an animal";
        CountCharacters(coral);


        // Ex_8
        List<Integer> my_numbers = new ArrayList<>();
        my_numbers.add(1);
        my_numbers.add(-2);
        my_numbers.add(9);
        my_numbers.add(4);
        my_numbers.add(0);
        my_numbers.add(-4);
        my_numbers.add(11);
        my_numbers.add(9);
        my_numbers.add(1);
        System.out.printf("The list with only positives is: %s%n", filterPositives(my_numbers));


        // Ex_9
        int x = 24;
        int y = 32;
        compareNumbers(x,y);


        // Ex_10
        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.add(4);
        numbersSet.add(5);
        numbersSet.add(6);

        int setNumber = 5;
        int notinSet = 8;

        System.out.println(addNumberToSet(setNumber, numbersSet));
        System.out.println(addNumberToSet(notinSet, numbersSet));


        // Ex_11
        String month = "January";
        System.out.printf("The month %s has %s days %n", month, returnMonthDays(month));


        // Ex_12
        int first_number = 9;
        int second_number = 7;
        System.out.printf("The operations between the numbers %s and %s are %s%n",
                first_number, second_number, calculateOperations(first_number, second_number));


        // Ex_13
        int number1= 45;
        int number2 = 67;
        int number3 = 1;
        System.out.printf("The highest number out of %s,%s and %s, is %s%n",
                number1, number2, number3, getHighestNumber(number1, number2, number3));


        // Ex_14
        System.out.printf("Here you can see how many time each number repeats itself from the list %s: %s%n",
                my_numbers, countDigits(my_numbers));


        // Ex_15
        int my_number = 9;
        System.out.printf("The sum of all numbers until %s(including it) is %s%n",
                my_number, AddNumbersUntil(my_number));


        // Ex_16
        List<Integer> more_numbers = new ArrayList<>();
        more_numbers.add(1);
        more_numbers.add(5);
        more_numbers.add(4);
        more_numbers.add(12);
        more_numbers.add(19);
        more_numbers.add(-2);

        System.out.printf("The intersection between the list %s and the list %s is %s%n",
                my_numbers, more_numbers, Intersection(my_numbers, more_numbers));


        // Ex_17
        double price = 150;
        double discount = 19;
        System.out.printf("After applying a discount of %s%% to the price %s, the final price is %s%n", discount, price, applyDiscount(price, discount));
    }
}
