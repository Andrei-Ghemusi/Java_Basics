package OOP;

public class Invoice {
    //  Class Invoice
    //  Attributes: SERIES (constant, no need for constructor, all invoices will have the same SERIES), number, product_name, quantity, price_per_unit
    //  Constructor: all attributes except SERIES
    //  Methods:
    //● change_quantity(quantity)
    //● change_price(price)
    //● change_product_name(name)
    //● generate_invoice() - will print the table if you can

    private static final String SERIES = "INV";
    private final Integer number;
    private String product_name;
    private Integer quantity;
    private Integer price_per_unit;

    public Invoice(Integer number, String product_name, Integer quantity, Integer price_per_unit) {
        this.number = number;
        this.product_name = product_name;
        this.quantity = quantity;
        this.price_per_unit = price_per_unit;
    }

    public void changeQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void changePrice(Integer price) {
        this.price_per_unit = price;
    }

    public void changeProductName(String product_name) {
        this.product_name = product_name;
    }

    public double calculateTotalAmount() {
        return this.quantity * this.price_per_unit;
    }

    public void generateInvoice() {
        System.out.println("Invoice Details:");
        System.out.println("------------------------------------------------------");
        System.out.printf("| Series: %-11s | Number: %-12d |%n", SERIES, this.number);
        System.out.printf("| Product: %-10s | Quantity: %-10d |%n", this.product_name, this.quantity);
        System.out.printf("| Price per Unit: %-3s | Total Amount: %-3.2f |%n", this.price_per_unit, calculateTotalAmount());
        System.out.println("------------------------------------------------------");
    }


}
