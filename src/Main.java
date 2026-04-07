import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // محاولة duplicate (intentional duplicate)
        train.add("Sleeper"); // will be ignored

        // Display final train formation
        System.out.println("Final Train Formation:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}