import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        int choice;

        System.out.println("=========================================================");
        System.out.println("         WELCOME TO GRAND FLAVOURS RESTAURANT");
        System.out.println("=========================================================");

        restaurant.viewFoodItems();

        do {

            System.out.println("\n=================== MAIN MENU ===================");
            System.out.println("1. View Food Menu");
            System.out.println("2. Search Food Item");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Add Food Item (Admin)");
            System.out.println("6. Update Food Quantity");
            System.out.println("7. Display Total Revenue");
            System.out.println("8. Display Most Ordered Food");
            System.out.println("9. Exit");
            System.out.println("=================================================");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    restaurant.viewFoodItems();
                    break;

                case 2:

                    System.out.print("Enter Food ID : ");
                    int searchId = sc.nextInt();

                    FoodItem food = restaurant.searchFoodItem(searchId);

                    if (food != null) {

                        System.out.println("\nFood Found");
                        System.out.printf("%-8s %-25s %-18s %-10s %-10s %-10s%n",
                                "ID",
                                "Food Name",
                                "Cuisine",
                                "Category",
                                "Price",
                                "Available");

                        food.displayFood();

                    } else {

                        System.out.println("Food Item Not Found.");

                    }

                    break;

                case 3:

                    System.out.print("Enter Food ID : ");
                    int orderFoodId = sc.nextInt();

                    System.out.print("Enter Quantity : ");
                    int quantity = sc.nextInt();

                    restaurant.placeOrder(orderFoodId, quantity);

                    break;

                case 4:

                    System.out.print("Enter Order ID : ");
                    int orderId = sc.nextInt();

                    restaurant.cancelOrder(orderId);

                    break;

                case 5:

                    sc.nextLine();

                    System.out.print("Enter Food ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Food Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Cuisine : ");
                    String cuisine = sc.nextLine();

                    System.out.print("Enter Category (Veg/Non-Veg) : ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Available Quantity : ");
                    int available = sc.nextInt();

                    FoodItem newFood = new FoodItem(
                            id,
                            name,
                            cuisine,
                            category,
                            price,
                            available);

                    restaurant.addFoodItem(newFood);

                    break;

                case 6:

                    System.out.print("Enter Food ID : ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity : ");
                    int newQuantity = sc.nextInt();

                    restaurant.updateQuantity(updateId, newQuantity);

                    break;

                case 7:

                    restaurant.displayRevenue();

                    break;

                case 8:

                    restaurant.displayMostOrderedFood();

                    break;

                case 9:

                    System.out.println("\n======================================");
                    System.out.println("Thank You for Visiting");
                    System.out.println("GRAND FLAVOURS RESTAURANT");
                    System.out.println("Visit Again!");
                    System.out.println("======================================");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 9);

        sc.close();

    }

}