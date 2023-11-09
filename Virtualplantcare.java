import java.util.Scanner;

public class Virtualplantcare {
    private String plantName;
    private int waterLevel;
    private int sunlightLevel;
    private int nutrientLevel;

    public Virtualplantcare(String plantName) {
        this.plantName = plantName;
        waterLevel = 50;
        sunlightLevel = 50;
        nutrientLevel = 50;
    }

    public void waterPlant() {
        waterLevel += 10;
        if (waterLevel > 100) {
            waterLevel = 100;
        }
        System.out.println(plantName + " has been watered.");
    }

    public void adjustSunlight() {
        sunlightLevel += 10;
        if (sunlightLevel > 100) {
            sunlightLevel = 100;
        }
        System.out.println(plantName + " sunlight level has been adjusted.");
    }

    public void addNutrients() {
        nutrientLevel += 10;
        if (nutrientLevel > 100) {
            nutrientLevel = 100;
        }
        System.out.println("Nutrients have been added to " + plantName + ".");
    }

    public void displayPlantStatus() {
        System.out.println("Plant Name: " + plantName);
        System.out.println("Water Level: " + waterLevel);
        System.out.println("Sunlight Level: " + sunlightLevel);
        System.out.println("Nutrient Level: " + nutrientLevel);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your plant:");
        String plantName = scanner.nextLine();

        Virtualplantcare caretaker = new Virtualplantcare(plantName);

        int choice;
        do {
            System.out.println("\n--- Plant Care Menu ---");
            System.out.println("1. Water the plant");
            System.out.println("2. Adjust sunlight");
            System.out.println("3. Add nutrients");
            System.out.println("4. Display plant status");
            System.out.println("0. Exit");

            System.out.println("\nEnter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    caretaker.waterPlant();
                    break;
                case 2:
                    caretaker.adjustSunlight();
                    break;
                case 3:
                    caretaker.addNutrients();
                    break;
                case 4:
                    caretaker.displayPlantStatus();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
