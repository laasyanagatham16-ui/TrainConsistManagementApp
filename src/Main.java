/*
 * UC1: Basic Train Consist Setup
 * Demonstrates creation of train coaches
 */

class Coach {
    String coachId;
    String type;

    Coach(String coachId, String type) {
        this.coachId = coachId;
        this.type = type;
    }

    void display() {
        System.out.println(coachId + " - " + type);
    }
}

public class Main {
    public static void main(String[] args) {

        Coach c1 = new Coach("C1", "Sleeper");
        Coach c2 = new Coach("C2", "AC");

        c1.display();
        c2.display();
    }
}