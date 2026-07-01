public class Order {

    // Instance Variables
    private int orderId;
    private int foodId;
    private String foodName;
    private int quantity;
    private double totalAmount;

    // Constructor
    public Order(int orderId, int foodId, String foodName,
                 int quantity, double totalAmount) {

        this.orderId = orderId;
        this.foodId = foodId;
        this.foodName = foodName;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Display Order
    public void displayOrder() {

        System.out.println("\n==========================================");
        System.out.println("             ORDER BILL");
        System.out.println("==========================================");
        System.out.println("Order ID      : " + orderId);
        System.out.println("Food ID       : " + foodId);
        System.out.println("Food Name     : " + foodName);
        System.out.println("Quantity      : " + quantity);
        System.out.printf("Total Amount  : ₹%.2f%n", totalAmount);
        System.out.println("==========================================");
    }
}