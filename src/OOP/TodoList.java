package OOP;

import java.util.Map;
import java.util.Scanner;

public class TodoList {
    // Class TodoList
    //Attributes: todo (map, where key is task name and value is task description)
    //Initially, the map is empty, so no constructor is needed.
    //
    //Methods:
    //● add_task(name, description) - adds a task to the dictionary
    //● complete_task(name) - removes a task from the dictionary
    //● show_todo_list() - prints only the keys (task names)
    //● show_additional_details(task_name) - depending on the task name, prints additional details.
    //○ If the task is not in the todo list, ask the user if they want to add it.
    //○ If they answer no - goodbye
    //○ If they answer yes - ask for task details and save the name and details to the dictionary

    private Map<String, String> todo;
    private Scanner scanner = new Scanner(System.in);

    public void addTask(String name, String description) {
        this.todo.put(name, description);
    }

    public void completeTask(String name) {
        if (this.todo.containsKey(name)) {
            this.todo.remove(name);
        } else {
            System.out.println("Invalid task");
        }
    }

    public void showTodoList() {
        System.out.println("The task names are: ");
        for(String task: todo.keySet()){
            System.out.println(task);
        }
    }

    public void showAdditionalDetails(String taskName) {
        if (todo.containsKey(taskName)) {
            String details = todo.get(taskName);
            System.out.printf("Task: %s%n", taskName);
            System.out.printf("Details: %s%n", details);
        } else {
            System.out.println("Task not found in the todo list.");
            System.out.println("Do you want to add it? (yes/no)");
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("yes")) {
                System.out.println("Enter task details:");
                String details = scanner.nextLine();
                addTask(taskName, details);
            } else {
                System.out.println("Goodbye!");
            }
        }
    }
}
