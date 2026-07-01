import java.util.ArrayList;

public class Restaurant {

    private ArrayList<FoodItem> menu;
    private ArrayList<Order> orders;
    private double revenue;
    private int orderIdCounter;

    // Constructor
    public Restaurant() {

        menu = new ArrayList<>();
        orders = new ArrayList<>();
        revenue = 0;
        orderIdCounter = 1;

        // ================= SOUTH INDIAN =================

        menu.add(new FoodItem(101,"Masala Dosa","South Indian","Veg",90,30));
        menu.add(new FoodItem(102,"Plain Dosa","South Indian","Veg",70,30));
        menu.add(new FoodItem(103,"Ghee Roast","South Indian","Veg",120,20));
        menu.add(new FoodItem(104,"Idli","South Indian","Veg",50,40));
        menu.add(new FoodItem(105,"Pongal","South Indian","Veg",80,25));

        // ================= NORTH INDIAN =================

        menu.add(new FoodItem(201,"Paneer Butter Masala","North Indian","Veg",220,20));
        menu.add(new FoodItem(202,"Butter Naan","North Indian","Veg",45,40));
        menu.add(new FoodItem(203,"Veg Kadai","North Indian","Veg",210,20));
        menu.add(new FoodItem(204,"Butter Chicken","North Indian","Non-Veg",350,15));
        menu.add(new FoodItem(205,"Chicken Tikka","North Indian","Non-Veg",280,20));

        // ================= CHINESE =================

        menu.add(new FoodItem(301,"Veg Fried Rice","Chinese","Veg",180,20));
        menu.add(new FoodItem(302,"Veg Noodles","Chinese","Veg",170,20));
        menu.add(new FoodItem(303,"Chicken Fried Rice","Chinese","Non-Veg",230,20));
        menu.add(new FoodItem(304,"Chicken Noodles","Chinese","Non-Veg",220,20));
        menu.add(new FoodItem(305,"Gobi Manchurian","Chinese","Veg",180,20));

        // ================= ITALIAN =================

        menu.add(new FoodItem(401,"Margherita Pizza","Italian","Veg",300,20));
        menu.add(new FoodItem(402,"Farmhouse Pizza","Italian","Veg",380,15));
        menu.add(new FoodItem(403,"Chicken Pizza","Italian","Non-Veg",420,15));
        menu.add(new FoodItem(404,"White Sauce Pasta","Italian","Veg",280,20));
        menu.add(new FoodItem(405,"Chicken Alfredo Pasta","Italian","Non-Veg",350,15));

        // ================= CONTINENTAL =================

        menu.add(new FoodItem(501,"Veg Steak","Continental","Veg",380,15));
        menu.add(new FoodItem(502,"Grilled Chicken Steak","Continental","Non-Veg",450,15));
        menu.add(new FoodItem(503,"Fish and Chips","Continental","Non-Veg",420,15));
        menu.add(new FoodItem(504,"Garlic Bread","Continental","Veg",120,30));
        menu.add(new FoodItem(505,"Creamy Mushroom Pasta","Continental","Veg",280,20));

        // ================= ASIAN =================

        menu.add(new FoodItem(601,"Veg Sushi","Asian","Veg",380,10));
        menu.add(new FoodItem(602,"Chicken Sushi","Asian","Non-Veg",450,10));
        menu.add(new FoodItem(603,"Veg Ramen","Asian","Veg",300,15));
        menu.add(new FoodItem(604,"Chicken Ramen","Asian","Non-Veg",350,15));
        menu.add(new FoodItem(605,"Thai Green Curry","Asian","Veg",320,15));

        // ================= ARABIAN =================

        menu.add(new FoodItem(701,"Chicken Shawarma","Arabian","Non-Veg",180,25));
        menu.add(new FoodItem(702,"Chicken Mandi","Arabian","Non-Veg",420,15));
        menu.add(new FoodItem(703,"Mutton Mandi","Arabian","Non-Veg",550,10));
        menu.add(new FoodItem(704,"Falafel Wrap","Arabian","Veg",150,20));
        menu.add(new FoodItem(705,"Hummus with Pita","Arabian","Veg",220,15));

        // ================= FAST FOOD =================

        menu.add(new FoodItem(801,"Veg Burger","Fast Food","Veg",120,25));
        menu.add(new FoodItem(802,"Chicken Burger","Fast Food","Non-Veg",180,20));
        menu.add(new FoodItem(803,"French Fries","Fast Food","Veg",100,30));
        menu.add(new FoodItem(804,"Chicken Nuggets","Fast Food","Non-Veg",220,20));
        menu.add(new FoodItem(805,"Veg Sandwich","Fast Food","Veg",140,20));

        // ================= BEVERAGES =================

        menu.add(new FoodItem(901,"Cold Coffee","Beverages","Veg",150,20));
        menu.add(new FoodItem(902,"Cappuccino","Beverages","Veg",160,20));
        menu.add(new FoodItem(903,"Fresh Lime Juice","Beverages","Veg",80,30));
        menu.add(new FoodItem(904,"Mango Juice","Beverages","Veg",120,25));
        menu.add(new FoodItem(905,"Mineral Water","Beverages","Veg",30,100));

        // ================= DESSERTS =================

        menu.add(new FoodItem(1001,"Gulab Jamun","Desserts","Veg",90,20));
        menu.add(new FoodItem(1002,"Brownie","Desserts","Veg",180,15));
        menu.add(new FoodItem(1003,"Chocolate Lava Cake","Desserts","Veg",220,15));
        menu.add(new FoodItem(1004,"Vanilla Ice Cream","Desserts","Veg",120,20));
        menu.add(new FoodItem(1005,"Fruit Salad","Desserts","Veg",150,20));

    }
        // ================= ADD FOOD ITEM =================

    public void addFoodItem(FoodItem food) {

        menu.add(food);

        System.out.println("\nFood Item Added Successfully.");

    }

    // ================= VIEW MENU =================

    public void viewFoodItems() {

        String[] cuisines = {

            "South Indian",
            "North Indian",
            "Chinese",
            "Italian",
            "Continental",
            "Asian",
            "Arabian",
            "Fast Food",
            "Beverages",
            "Desserts"

        };

        System.out.println("\n===============================================================");
        System.out.println("              GRAND FLAVOURS RESTAURANT MENU");
        System.out.println("===============================================================");

        for (String cuisine : cuisines) {

            System.out.println("\n************* " + cuisine.toUpperCase() + " *************");

            System.out.printf("%-8s %-28s %-12s %-10s %-10s%n",
                    "ID",
                    "Food Name",
                    "Category",
                    "Price",
                    "Available");

            System.out.println("--------------------------------------------------------------------------");

            for (FoodItem food : menu) {

                if (food.getCuisine().equalsIgnoreCase(cuisine)) {

                    System.out.printf("%-8d %-28s %-12s ₹%-9.2f %-10d%n",
                            food.getFoodId(),
                            food.getFoodName(),
                            food.getCategory(),
                            food.getPrice(),
                            food.getAvailableQuantity());

                }

            }

        }

    }

    // ================= SEARCH FOOD =================

    public FoodItem searchFoodItem(int foodId) {

        for (FoodItem food : menu) {

            if (food.getFoodId() == foodId) {

                return food;

            }

        }

        return null;

    }
        // ================= PLACE ORDER =================

    public void placeOrder(int foodId, int quantity) {

        FoodItem food = searchFoodItem(foodId);

        if (food == null) {
            System.out.println("\nFood Item Not Found.");
            return;
        }

        if (food.getAvailableQuantity() < quantity) {
            System.out.println("\nSorry! Only " + food.getAvailableQuantity() + " item(s) available.");
            return;
        }

        food.setAvailableQuantity(food.getAvailableQuantity() - quantity);
        food.setOrderCount(food.getOrderCount() + quantity);

        double totalAmount = food.getPrice() * quantity;
        revenue += totalAmount;

        Order order = new Order(
                orderIdCounter,
                food.getFoodId(),
                food.getFoodName(),
                quantity,
                totalAmount);

        orders.add(order);

        System.out.println("\n==========================================");
        System.out.println("         ORDER PLACED SUCCESSFULLY");
        System.out.println("==========================================");

        order.displayOrder();

        orderIdCounter++;
    }

    // ================= CANCEL ORDER =================

    public void cancelOrder(int orderId) {

        Order cancelledOrder = null;

        for (Order order : orders) {

            if (order.getOrderId() == orderId) {

                FoodItem food = searchFoodItem(order.getFoodId());

                if (food != null) {

                    food.setAvailableQuantity(
                            food.getAvailableQuantity() + order.getQuantity());

                    food.setOrderCount(
                            food.getOrderCount() - order.getQuantity());

                }

                revenue -= order.getTotalAmount();

                cancelledOrder = order;

                break;
            }

        }

        if (cancelledOrder != null) {

            orders.remove(cancelledOrder);

            System.out.println("\nOrder Cancelled Successfully.");

        } else {

            System.out.println("\nInvalid Order ID.");

        }

    }

    // ================= UPDATE QUANTITY =================

    public void updateQuantity(int foodId, int quantity) {

        FoodItem food = searchFoodItem(foodId);

        if (food == null) {

            System.out.println("Food Item Not Found.");
            return;

        }

        food.setAvailableQuantity(quantity);

        System.out.println("Quantity Updated Successfully.");

    }

    // ================= DISPLAY REVENUE =================

    public void displayRevenue() {

        System.out.printf("\nTotal Revenue Generated : ₹%.2f%n", revenue);

    }

    // ================= MOST ORDERED FOOD =================

    public void displayMostOrderedFood() {

        FoodItem mostOrdered = null;

        for (FoodItem food : menu) {

            if (mostOrdered == null ||
                    food.getOrderCount() > mostOrdered.getOrderCount()) {

                mostOrdered = food;

            }

        }

        if (mostOrdered == null || mostOrdered.getOrderCount() == 0) {

            System.out.println("\nNo Orders Placed Yet.");

            return;

        }

        System.out.println("\n==========================================");
        System.out.println("          MOST ORDERED FOOD");
        System.out.println("==========================================");

        System.out.println("Food ID      : " + mostOrdered.getFoodId());
        System.out.println("Food Name    : " + mostOrdered.getFoodName());
        System.out.println("Cuisine      : " + mostOrdered.getCuisine());
        System.out.println("Category     : " + mostOrdered.getCategory());
        System.out.println("Price        : ₹" + mostOrdered.getPrice());
        System.out.println("Order Count  : " + mostOrdered.getOrderCount());

    }

}