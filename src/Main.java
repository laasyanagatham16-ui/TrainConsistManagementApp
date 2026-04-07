import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("Passenger Bogies after adding:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}