
public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(SingleItem singleItem, int quantity, DiscountType discountType, double discountAmount, boolean isGiftCard){
        super(singleItem, quantity, discountType, discountAmount, isGiftCard);
    }

    public double getTaxRate(){
        return taxRate;
    }
}
