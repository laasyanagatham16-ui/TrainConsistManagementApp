import java.util.*;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {
        try {
            // Rule: Rectangular cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment process completed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Safe case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        System.out.println();

        // Unsafe case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        System.out.println();

        // Program continues
        System.out.println("Program continues safely...");
    }
}