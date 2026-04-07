import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Bogie IDs (try empty {} to test exception)
        String[] bogieIDs = {"BG101", "BG205", "BG309"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // 🔥 Fail-fast validation
        if (bogieIDs.length == 0) {
            throw new IllegalStateException("No bogies available for search!");
        }

        boolean found = false;

        // Linear Search
        for (String id : bogieIDs) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Output
        if (found) {
            System.out.println("Bogie found.");
        } else {
            System.out.println("Bogie not found.");
        }

        sc.close();
    }
}