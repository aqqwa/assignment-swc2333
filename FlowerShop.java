package swc2333;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			Flower[] flowerInventory = new Flower[10];
			int flowerCount = 0;

			while (true) {
			    System.out.println("1. Add Flower");
			    System.out.println("2. Display All Flowers");
			    System.out.println("3. Calculate Total Value");
			    System.out.println("4. Search Flower");
			    System.out.println("5. Restock Flower");
			    System.out.println("6. Exit");
			    System.out.print("Enter your choice: ");
			    int choice = scanner.nextInt();
			    scanner.nextLine();

			    switch (choice) {
			        case 1:
			            System.out.print("Enter flower name: ");
			            String name = scanner.nextLine();
			            System.out.print("Enter flower color: ");
			            String color = scanner.nextLine();
			            System.out.print("Enter flower price: ");
			            double price = scanner.nextDouble();
			            System.out.print("Enter flower quantity: ");
			            int quantity = scanner.nextInt();
			            flowerInventory[flowerCount++] = new Flower(name, color, price, quantity);
			            break;
			        case 2:
			            for (int i = 0; i < flowerCount; i++) {
			                System.out.println(flowerInventory[i]);
			            }
			            break;
			        case 3:
			            double totalValue = 0;
			            for (int i = 0; i < flowerCount; i++) {
			                totalValue += flowerInventory[i].getPrice() * flowerInventory[i].getQuantity();
			            }
			            System.out.println("Total value of flower inventory: " + totalValue);
			            break;
			        case 4:
			            System.out.print("Enter flower name to search: ");
			            String searchName = scanner.nextLine();
			            for (int i = 0; i < flowerCount; i++) {
			                if (flowerInventory[i].getName().equalsIgnoreCase(searchName)) {
			                    System.out.println(flowerInventory[i]);
			                    break;
			                }
			            }
			            break;
			        case 5:
			            System.out.print("Enter flower name to restock: ");
			            String restockName = scanner.nextLine();
			            boolean found = false;
			            for (int i = 0; i < flowerCount; i++) {
			                if (flowerInventory[i].getName().equalsIgnoreCase(restockName)) {
			                    System.out.print("Enter quantity to restock: ");
			                    int restockQuantity = scanner.nextInt();
			                    flowerInventory[i].setQuantity(flowerInventory[i].getQuantity() + restockQuantity);
			                    System.out.println("Flower restocked successfully.");
			                    found = true;
			                    break;
			                }
			            }
			            if (!found) {
			                System.out.println("Flower not found in inventory.");
			            }
			            break;
			        case 6:
			            System.out.println("Exiting...");
			            System.exit(0);
			            break;
			        default:
			            System.out.println("Invalid choice. Please try again.");
			            break;
			    }
			}
		}
    }
}
