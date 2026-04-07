/*
 * Train Consist Management App
 *
 * UC1: Initialize Train and Display Consist Summary
 * This use case initializes an empty train consist
 * and displays its initial state.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (Dynamic List)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial State
        System.out.println("Train consist initialized successfully.");

        // Display Initial Bogie Count
        System.out.println("Initial number of bogies: " + trainConsist.size());

        System.out.println("System is ready for further operations...");
    }
}