//@author Maddison Kiefer

import java.util.Scanner;


public class Pets {
    // Class variables
    public String type;
    public String name;
    public double weight;
    public int age;
    public String sound = " ";
    
    // Constructor to initialize the pets attributes
    public Pets(String type, String name, double weight, int age) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.age = age;
        // Sets the sound based on the pet type
        if(this.type.equals("cat")) {
            this.sound = "meow";
        }
        if(this.type.equals("dog")) {
            this.sound = "ruff ruff";
        }
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String name;
        String type;
        String sound;
        int age;
        int num;
        double weight;
        
        System.out.println("Please enter the number of pets: ");
        num = scnr.nextInt();
        // Creates an array of pets
        Pets[] pet = new Pets[num];
        
        // Loop for getting information about each pet
        for(int i = 0; i < num; i++) {
            System.out.println("Enter the type of pet: ");
            type = scnr.next();
            System.out.println("Enter the name of the pet: ");
            name = scnr.next();
            System.out.println("Enter the age of the pet: ");
            age = scnr.nextInt();
            System.out.println("Enter the weight of the pet: ");
            weight = scnr.nextDouble();
            
            // Create a new Pets object and stores it in the array
            pet[i] = new Pets(type, name, weight, age);
        }
        
        // Displays the information about each pet
        for(int i = 0; i < num; i++) {
            System.out.println();
            System.out.println("Pet's name: " + pet[i].name);
            System.out.println("Pet's Age: " + pet[i].age);
            System.out.println("Pet's Weight: " + pet[i].weight + " pounds");
            System.out.println("Pet's Sound: " + pet[i].sound);
        }
    }
}
