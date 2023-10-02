import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // Ex_1 - Having the list:
        // cars = ['Audi', 'Volvo', 'BMW', 'Mercedes', 'Aston Martin', 'Lăstun',
        // 'Fiat', 'Trabant', 'Opel']
        // Use a for loop to iterate through the entire list and print:
        // 'My favorite car is x'.
        // Do the same with a for each loop.
        // Do the same with a while loop.
        System.out.println("\nEx_1");
        List<String> cars = Arrays.asList("Audi", "Volvo", "BMW", "Mercedes", "Aston Martin", "Lastun", "Fiat", "Trabant", "Opel");

        // for loop
        for (String i: cars) {
            System.out.printf("My favorite \"for loop\" car is %s%n", i);
        }

        // while
        int car_index = 0;
        while(car_index<cars.size()) {
            System.out.printf("My favorite \"while\" car is %s%n", cars.get(car_index));
            car_index++;

        }


        // Ex_2 - The same list:
        // Use a for loop
        // In the for loop:
        // Modify the elements in the list so that they are written in uppercase, except for the first and last elements.
        // Print the list.
        System.out.println("\nEx_2");
        for(int index=1; index<cars.size()-1; index++){
            cars.set(index, cars.get(index).toUpperCase());
        }
        System.out.println(cars);


        // Ex_3 - The same list:
        // A buyer comes who wants to buy a Mercedes.
        // Iterate through it using your preferred method.
        // If the car is a Mercedes:
        // Print 'I found the car you are looking for'
        // Exit the loop using a keyword that does this
        // Otherwise:
        // Print 'I found car X. Still searching'
        System.out.println("\nEx_3");
        for(String desired_car: cars){
            if (desired_car.equals("MERCEDES")){
                System.out.printf("I found the car you are looking for and the index is %s%n", cars.indexOf("MERCEDES"));
                break;
            }
        }


        // Ex_4 - Same list;
        // A wealthy but indecisive buyer is coming. We will present him with all the cars except Trabant and Lastun.
        // If the car is Trabant or Lăstun:
        // Use a keyword that skips what follows (no need for else).
        // Print "You might like car x."
        System.out.println("\nEx_4");
        for(String wealthy_car: cars){
            if (wealthy_car.equals("TRABANT") || wealthy_car.equals("LASTUN")) {
                continue;
            } else {
                System.out.printf("You might like the car %s%n", wealthy_car);
            }
        }

        // Ex_5 - Update the car fleet:
        // Create an empty list, old_cars.
        // Iterate through cars.
        // When you find Lastun or Trabant:
        // Save these cars in old_cars.
        // Overwrite them with 'Tesla' (in the original list of cars).
        // Print Old models: x.
        // New models: x.
        System.out.println("\nEx_5");
        List<String> old_cars = new ArrayList<>();

        for (String junk: cars) {
            if (junk.equals("TRABANT") || junk.equals("LASTUN")){
                old_cars.add(junk);
                cars.set(cars.indexOf(junk), "Tesla");
            }
        }

        System.out.printf("Old models: %s%n", old_cars);
        System.out.printf("New models: %s%n", cars);


        // Ex_6 - Given map:
        // car_prices = {
        //    'Dacia': 6800,
        //    'Lăstun': 500,
        //    'Opel': 1100,
        //    'Audi': 19000,
        //    'BMW': 23000
        // }
        // A client comes with a budget of 15000 euros.
        // Present only the cars that fit within this budget.
        // Iterate through the map and access the car and price.
        // Print "For a budget of under 15000 euros you can choose x car" for each car within the budget.
        System.out.println("\nEx_6");
        Map<String, Integer> car_prices = new HashMap<>();
        car_prices.put("Dacia", 6800);
        car_prices.put("Lastun", 500);
        car_prices.put("Opel", 1100);
        car_prices.put("Audi", 19000);
        car_prices.put("Bmw", 23000);

        int budget = 15000;

        for (Map.Entry<String, Integer> entry : car_prices.entrySet()) {
            String car = entry.getKey();
            int price = entry.getValue();

            if (price < budget) {
                System.out.printf("For a budget of under 15000 euros you can choose %s car%n", car);
            }
        }


        // Ex_7 - Having the list:
        // numbers = [5, 7, 3, 9, 3, 3, 1, 0, -4, 3]
        // Iterate through the list.
        // Print how many times 3 appears in the list
        System.out.println("\nEx_7");
        List<Integer> numbers = Arrays.asList(5, 7, 3, 9, 3, 3, 1, 0, -4, 3);

        int count = 0;
        for (int i:numbers){
            if (i==3) {
                count++;
            }
        }
        System.out.printf("3 appears %s times%n", count);


        // Ex_8 - The same list:
        // Iterate through it
        // Calculate and print the sum of the numbers.
        System.out.println("\nEx_8");
        int sum = 0;
        for(int i:numbers){
            sum += i;
        }
        System.out.printf("The sum is %s%n", sum);


        // Ex_9 - Same list:
        // Iterate through it.
        // Display the largest number.
        System.out.println("\nEx_9");
        int max = numbers.get(0);

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.printf("The largest number is: %s%n", max);


        // Ex_10 - The same list:
        // Iterate through it.
        // If the number is positive, replace it with its negative value.
        // Ex: if it's 3, make it -3
        // Display the new list.
        System.out.println("\nEx_10");

        for(int number:numbers) {
            if(number>0){
                numbers.set(numbers.indexOf(number), -number);
            }
        }
        System.out.printf("The new list is %s%n", numbers);


        // Ex_11 - other_numbers = [-5, 7, 2, 9, 12, 3, 1, -6, -4, 3]
        // even_numbers = []
        // odd_numbers = []
        // positive_numbers = []
        // negative_numbers = []
        // Populate the other lists correctly
        // Print the 4 lists at the end
        System.out.println("\nEx_11");

        List<Integer> other_numbers = Arrays.asList(-5, 7, 2, 9, 12, 3, 1, -6, -4, 3);
        List<Integer> even_numbers = new ArrayList<>();
        List<Integer> odd_numbers = new ArrayList<>();
        List<Integer> positive_numbers = new ArrayList<>();
        List<Integer> negative_numbers = new ArrayList<>();

        for(int i:other_numbers){
            if(i>0){
                positive_numbers.add(i);
            } else if (i<0) {
                negative_numbers.add(i);
            }
            if(i%2==0){
                even_numbers.add(i);
            } else {
                odd_numbers.add(i);
            }
        }
        System.out.printf("The even numbers are: %s%n", even_numbers);
        System.out.printf("The odd numbers are: %s%n", odd_numbers);
        System.out.printf("The positive numbers are: %s%n", positive_numbers);
        System.out.printf("The negative numbers are: %s%n", negative_numbers);


        // Ex_12 - Number guessing game:
        // secret_number = Generate a random number between 1 and 30
        // guessed_number = input
        // Using a while loop
        // User chooses a number
        // The program tells them:
        // ● Secret number is greater
        // ● Secret number is smaller
        // ● Congratulations! You guessed it!
        System.out.println("\nEx_12");

        Random random = new Random();
        int secret_number = random.nextInt(30) + 1;
        Scanner sc = new Scanner(System.in);
        int guessed_number = 0;

        while (guessed_number == 0){
            System.out.println("Input a natural number from 1 to 30: ");
            guessed_number = sc.nextInt();

            if (guessed_number == secret_number) {
                System.out.println("Congratulations! You guessed it!");
            } else if (guessed_number < secret_number) {
                System.out.println("Secret number is greater.");
            } else {
                System.out.println("Secret number is smaller.");
            }
        }


        // Ex_13 - Input a number
        //# Write a program that will generate in console a pyramid like this:
        // 1
        // 22
        // 333
        // 4444
        // 55555
        // 666666
        // 7777777
        System.out.println("Enter the number of rows for the half-pyramid: ");
        int numRows = sc.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
