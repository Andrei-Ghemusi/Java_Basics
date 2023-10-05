package OOP;

import java.util.HashSet;
import java.util.Set;

public class Car {
    // Attributes: brand, model, maximum_speed, current_speed, color, available_colors (set), registered (bool)
    //  Color = grey - all cars come out of the factory in grey color
    //  Current_speed = 0 - all cars stay stationary when they come out of the factory
    //  Available colors = choose 5-7 colors
    //  Brand = choose - the factory produces a single brand but multiple models
    //  Registered = False
    //  Constructor: model, maximum_speed
    //  Methods:
    //● describe() - all attributes will be printed, except available_colors
    //● register() - will change the registered attribute to True
    //● paint(color) - the car will be painted in the new color ONLY if the new color is in the available colors option, otherwise, display an error
    //● accelerate(speed) - the car will accelerate to a certain speed, if the speed is negative - error, if the speed is greater than maximum_speed - the car will accelerate to the maximum speed
    //● brake() - the car will stop and have a speed of 0.

    private final String brand = "Dacia";
    private String model;
    private Integer maximum_speed;
    private Integer current_speed = 0;
    private String color = "grey";
    private Set<String> availableColors;
    private Boolean registered = false;

    public Car(String model, Integer maximum_speed) {
        this.model = model;
        this.maximum_speed = maximum_speed;
        this.availableColors = getAvailableColors();
    }

    private Set<String> getAvailableColors() {
        Set<String> colors = new HashSet<>();
        colors.add("brown");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        return colors;
    }

    public void describe() {
        System.out.printf("Brand: %s%n", this.brand);
        System.out.printf("Model: %s%n", this.model);
        System.out.printf("Maximum Speed: %d%n", this.maximum_speed);
        System.out.printf("Current Speed: %d%n", this.current_speed);
        System.out.printf("Color: %s%n", this.color);
        System.out.printf("Registered: %b%n", this.registered);
    }

    public void changeRegister() {
        this.registered = true;
        System.out.println("Car registered successfully!");
    }

    public void paintCar(String newColor) {
        if (availableColors.contains(newColor.toLowerCase())) {
            this.color = newColor;
        } else {
            System.out.println("Error: Invalid color option.");
        }
    }

    public void accelerateSpeed(Integer speed) {
        if(speed<=0){
            System.out.println("Error: Invalid speed.");
        } else if (speed>maximum_speed) {
            this.current_speed = this.maximum_speed;
            System.out.println("Car accelerated to maximum speed.");
        } else {
            this.current_speed = speed;
            System.out.printf("Car accelerated to %d km/h%n", this.current_speed);
        }
    }

    public void brake() {
        System.out.println("We press the break!");
        this.current_speed = 0;
        System.out.println("The car stopped.");
    }
}
