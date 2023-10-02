import java.util.*;

public class DataStructures {
    public static void main(String[] args) {

        // - Ex_1 Declare a list named "musical_notes" and add the notes "do re mi" etc. until "do"
        // Print the list
        // Reverse the order of the list and overwrite the original list
        // Print the current version of the list (reversed)
        System.out.println("\nEx_1");
        List<String> musical_notes = new ArrayList<>();
        musical_notes.add("do");
        musical_notes.add("re");
        musical_notes.add("mi");
        musical_notes.add("fa");
        musical_notes.add("so");
        musical_notes.add("la");
        musical_notes.add("si");
        musical_notes.add("do");

        Collections.reverse(musical_notes);
        System.out.printf("Reversed musical_notes are %s%n", musical_notes);


        // Ex_2 - Print how many times 'do' appears in the list.
        System.out.println("\nEx_2");
        int count_do = 0;
        for(String i:musical_notes) {
            if (i.equals("do")) {
                count_do++;
            }
        }
        System.out.printf("\"do\" appears %s times%n", count_do);


        // Ex_3 - Given 2 lists, [3, 1, 0, 2] and [6, 5, 4, 9], merge them into a single list.
        System.out.println("\nEx_3");
        List<Integer> first_list = Arrays.asList(3,1,0,2);
        List<Integer> second_list = Arrays.asList(6,5,4,9);

        List<Integer> big_list = new ArrayList<>(first_list);
        big_list.addAll(second_list);
        System.out.printf("The first method merged list is %s%n", big_list);


        // Ex_4 - Sort and display the list generated in the previous exercise.
        // Delete the number 0 from the list using a function and then display the list again.
        System.out.println("\nEx_4");
        Collections.sort(big_list);
        System.out.printf("The sorted list is %s%n", big_list);


        // Ex_5 - Using an if statement, check the list generated in exercise 3 and display the following on each branch:
        //# The list is empty (IF)
        //# The list is not empty (ELSE)
        System.out.println("\nEx_5");
        if (big_list.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }


        // Ex_6 - Given the map {'Ana': 8, 'Gigel': 10, 'Dorel': 5}, use a method to display the Students (keys).
        System.out.println("\nEx_6");
        Map<String,Integer> first_map = new HashMap<>()
        {{
            put("Ana", 5);
            put("George", 7);
            put("Andrei", 10);
        }};
        System.out.printf("The students are %s%n", first_map.keySet());


        // Ex_7 - Print the three students from the above dictionary and their respective grades:
        System.out.println("\nEx_7");
        System.out.println("Students and their grades:");
        for (Map.Entry<String, Integer> entry : first_map.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }


        // Ex_8 Imagine that Ana has contested her grade and received a 6.
        // Modify Ana's grade to 6
        // Print her grade after the modification
        System.out.println("\nEx_8");
        first_map.put("Ana", 6);
        System.out.printf("Ana's grade after modification: %s%n", first_map.get("Ana"));


        // Ex_9 Imagine that Andrei is transferring out of class.
        // Find a method to remove him
        // A new classmate arrives.
        // Add Ion to the map with a grade of 9
        // Print the map with the new students.
        System.out.println("\nEx_9");
        first_map.remove("Andrei", 10);
        first_map.put("Ion", 9);
        System.out.printf("The class after the transfers is: %s%n", first_map);


        // Ex_ 10 You have the following sets:
        // week_days - formed with days from monday to sunday
        // weekend - formed with saturday and sunday
        // Add the day 'monday' to the set week_days
        // Display the set week_days
        System.out.println("\nEx_10");
        Set<String> week_days = new HashSet<>()
        {{
            add("monday");
            add("tuesday");
            add("wednesday");
            add("thursday");
            add("friday");
            add("saturday");
            add("sunday");
        }};

        Set<String> weekend = new HashSet<>()
        {{
            add("saturday");
            add("sunday");
        }};

        week_days.add("monday");
        System.out.printf("The days of a week are: %s%n", week_days);


        // Ex_11 Use an if statement and check if:
        // weekend is a subset of the days of the week
        // weekend is not a subset of the days of the week
        System.out.println("\nEx_11");
        if (week_days.containsAll(weekend)) {
            System.out.println("Weekend is a subset of the days of the week.");
        } else {
            System.out.println("Weekend is not a subset of the days of the week.");
        }


        // Ex_12 Show the differences between these 2 sets.
        System.out.println("\nEx_12");
        Set<String> differences = new HashSet<>(week_days);
        differences.removeAll(weekend);
        System.out.printf("Differences between days of the week and weekend: %s%n", differences);


        // Ex_13 Display the intersection of elements from these 2 sets:
        System.out.println("\nEx_13");
        Set<String> intersection = new HashSet<>(week_days);
        intersection.retainAll(weekend);
        System.out.println("Intersection of days of the week and weekend: " + intersection);

    }
}
