import java.util.Scanner;

public class SmartHomeAutomation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Smart Home Automation System");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Simulated user interface for controlling devices
        while (true) {
            System.out.println("\nHello, " + userName + "! What would you like to do?");
            System.out.println("1. Control Devices");
            System.out.println("2. Schedule Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = getValidChoice(scanner, 1, 3);

            switch (choice) {
                case 1:
                    controlDevices(scanner);
                    break;
                case 2:
                    scheduleTasks(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using Smart Home Automation System. Goodbye!");
                    return;
            }
        }
    }

    public static int getValidChoice(Scanner scanner, int min, int max) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (choice >= min && choice <= max) {
                    return choice;
                }
            }
            System.out.println("Invalid choice. Please enter a number between " + min + " and " + max + ".");
            System.out.print("Enter your choice: ");
            scanner.nextLine(); // Consume invalid input
        }
    }

    public static void controlDevices(Scanner scanner) {
        System.out.println("\nDevice Control:");
        System.out.println("1. Turn on Lights");
        System.out.println("2. Turn off Lights");
        System.out.println("3. Adjust Thermostat");
        System.out.println("4. Go back");
        System.out.print("Enter your choice: ");
        int choice = getValidChoice(scanner, 1, 4);

        switch (choice) {
            case 1:
                System.out.println("Lights turned on.");
                break;
            case 2:
                System.out.println("Lights turned off.");
                break;
            case 3:
                System.out.println("Thermostat adjusted.");
                break;
            case 4:
                return;
        }
    }

    public static void scheduleTasks(Scanner scanner) {
        System.out.println("\nSchedule Tasks:");
        System.out.println("1. Turn on Lights at 6:00 PM");
        System.out.println("2. Set Thermostat to 72°F at 8:00 AM");
        System.out.println("3. Go back");
        System.out.print("Enter your choice: ");
        int choice = getValidChoice(scanner, 1, 3);

        switch (choice) {
            case 1:
                System.out.println("Lights scheduled to turn on at 6:00 PM.");
                break;
            case 2:
                System.out.println("Thermostat scheduled to set to 72°F at 8:00 AM.");
                break;
            case 3:
                return;
        }
    }
}
