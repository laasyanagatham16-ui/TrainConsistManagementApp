/*
 * Train Consist Management App
 *
 * UC1: Basic Train Consist Setup
 * This use case demonstrates the creation of train coaches
 * and displaying their details.
 */

class Coach {
    private String coachId;
    private String coachType;

    // Constructor
    public Coach(String coachId, String coachType) {
        this.coachId = coachId;
        this.coachType = coachType;
    }

    // Getter methods
    public String getCoachId() {
        return coachId;
    }

    public String getCoachType() {
        return coachType;
    }

    // Display method
    public void displayCoach() {
        System.out.println("Coach ID: " + coachId + ", Type: " + coachType);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management System ===");

        // Creating coaches
        Coach c1 = new Coach("C1", "Sleeper");
        Coach c2 = new Coach("C2", "AC");
        Coach c3 = new Coach("C3", "General");

        // Displaying coach details
        c1.displayCoach();
        c2.displayCoach();
        c3.displayCoach();
    }
}