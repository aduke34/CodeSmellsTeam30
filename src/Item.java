class Item {
    private String name;
    private double price;
    private int quantity;
    private DiscountType discountType;
    private double discountAmount;
    private boolean isGiftCard;

    public Item(SingleItem singleItem, int quantity, DiscountType discountType, double discountAmount, boolean isGiftCard) {
        this.name = singleItem.getName();
        this.price = singleItem.getPrice();
        this.quantity = quantity;
        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.isGiftCard = isGiftCard;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public boolean getIsGiftCard() { return isGiftCard; }

    public boolean inStock() {
        return quantity != 0;
    }
}
