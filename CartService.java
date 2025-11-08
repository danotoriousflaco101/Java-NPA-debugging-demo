import java.util.List;

public class CartService {

    /**
     * * 
     * RULES:
     * 1. Sum the price of all 'items'.
     * 2. Add a VAT tax (22%) to the subtotal.
     * 3. Add a flat shipping fee of 5.00 (only if the cart is not empty).
     *
     */
    public double calculateTotal(List<Item> items) {
        
        System.out.println("DEBUG: 'calculateTotal' method started.");
        double subtotal = 0.0;
        double vat = 0.22; // 22%
        double shippingFee = 5.00;

        // 1. Sum all 'items'
        for (Item item : items) {
            System.out.println("--- DEBUG: Loop start for " + item.getName() + " ---");
            subtotal += item.getPrice();
            System.out.println("DEBUG: Subtotal after adding item: " + subtotal);

            // --- INTENTIONAL LOGIC BUG ---
            // The shipping fee should be added ONLY ONCE,
            // *after* the loop. Instead, it's being added *for every item*
            // in the cart. This is our bug.
            if (subtotal > 0) {
                subtotal += shippingFee;
                System.out.println("THE BUG: Subtotal after adding SHIPPING: " + subtotal);
            }
            // --- END BUG ---
        }

        System.out.println("--- DEBUG: Loop Finished ---");
        System.out.println("DEBUG: Subtotal before VAT: " + subtotal);

        // 2. Calculate and add VAT
        double totalVAT = subtotal * vat;
        double finalTotal = subtotal + totalVAT;
        System.out.println("DEBUG: Final total (with VAT): " + finalTotal);


        // 3. Round to 2 decimal places for a clean output
        return Math.round(finalTotal * 100.0) / 100.0;
    }
}