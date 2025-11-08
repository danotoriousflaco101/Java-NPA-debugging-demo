import java.util.ArrayList;
import java.util.List;

// File 3 (Phase 2): The entry point for the shopping cart scenario.
public class Main2 {

    public static void main(String[] args) {
        
        System.out.println("--- Starting Phase 2: Cart Debugging ---");
        CartService service = new CartService();

        // 1. Let's create our cart
        List<Item> cart = new ArrayList<>();
        cart.add(new Item("Baker Deck 8.5", 75.00));
        cart.add(new Item("Shake Junt Triple OGs Bearings", 25.00));

        // The subtotal (75 + 25) is 100.
        // Shipping fees (5.00) and VAT (22%) should bring the total
        // to (100 + 5) * 1.22 = 128.10
        System.out.println("Cart created with 2 items. Expected total: 128.10");

        // 2. Call the method that CONTAINS THE BUG
        double calculatedTotal = service.calculateTotal(cart);

        // 3. Print the WRONG result
        // (Due to the bug, this will print a much higher value!)
        System.out.println("FINAL RESULT (with bug): " + calculatedTotal);
        System.out.println("--- End of Phase 2 ---");
    }
}