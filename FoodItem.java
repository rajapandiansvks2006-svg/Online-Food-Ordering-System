public class FoodItem {

    // Instance Variables
    private int foodId;
    private String foodName;
    private String cuisine;
    private String category;
    private double price;
    private int availableQuantity;
    private int orderCount;

    // Constructor
    public FoodItem(int foodId, String foodName, String cuisine,
                    String category, double price, int availableQuantity) {

        this.foodId = foodId;
        this.foodName = foodName;
        this.cuisine = cuisine;
        this.category = category;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.orderCount = 0;
    }

    // Getters
    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public int getOrderCount() {
        return orderCount;
    }

    // Setters
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    // Display Food Details
    public void displayFood() {

        System.out.printf(
                "%-8d %-25s %-18s %-10s ₹%-8.2f %-10d%n",
                foodId,
                foodName,
                cuisine,
                category,
                price,
                availableQuantity
        );
    }
}
