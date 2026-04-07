import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 60));

        // Grouping
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display
        for (String type : grouped.keySet()) {
            System.out.println(type + ":");
            for (Bogie b : grouped.get(type)) {
                System.out.println("  " + b.capacity);
            }
        }
    }
}