import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> trainConsist = new ArrayList<>();

        // UC2: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("General");

        System.out.println("Train consist after adding bogies:");
        for(String bogie : trainConsist){
            System.out.println(bogie);
        }
    }
}