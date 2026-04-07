import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create HashSet for bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }
    }
}