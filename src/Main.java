import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIDs) {
            if (id.equals(key)) {
                found = true;
                break; // stop when found
            }
        }

        // Output result
        if (found) {
            System.out.println("Bogie found in the train.");
        } else {
            System.out.println("Bogie not found.");
        }

        sc.close();
    }
}