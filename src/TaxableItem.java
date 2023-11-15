
public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(String name, double price, int quantity, DiscountType discountType, double discountAmount, boolean isGiftCard){
        super(name, price, quantity, discountType, discountAmount, isGiftCard);
    }

    public double getTaxRate(){
        return taxRate;
    }
}
