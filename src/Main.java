import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Bogie IDs (can be unsorted)
        String[] bogieIDs = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 1: Sort array (required for binary search)
        Arrays.sort(bogieIDs);

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIDs[mid].compareTo(key);

            if (result == 0) {
                found = true;
                break;
            }
            else if (result < 0) {
                low = mid + 1; // search right
            }
            else {
                high = mid - 1; // search left
            }
        }

        // Output result
        if (found) {
            System.out.println("Bogie found using Binary Search.");
        } else {
            System.out.println("Bogie not found.");
        }

        sc.close();
    }
}