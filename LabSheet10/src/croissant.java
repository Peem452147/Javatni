public class croissant extends Bakery {
    private int piece;

    public croissant(int piece, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.piece = piece;

    }

    public boolean isBox() {
        return piece >= 5;
    }

    @Override
    public int getPackingcost() {
        return super.getPackingcost();
    }

    @Override
    public double calculateTotalPrice() {
        return piece * getUnitPrice() + getPackingcost();
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nCroissant x " + piece +
                "\ntoString piece = " + calculateTotalPrice();
    }
}