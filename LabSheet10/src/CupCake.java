public class CupCake extends Bakery {
    private int piece;
    public CupCake (int piece,String flavor,double unitPrice){
        super(flavor,unitPrice);
        this.piece = piece;
    }
    public boolean isPackingBox(){
        return  piece >= 6;
    }
    public int getBoxNumber(){
        if(isPackingBox()){
            return  this.piece/6;
        }
        return 0;
    }
    public int getBegNumber(){
        return this.piece % 6;
    }
    @Override
    public int getPackingcost(){
        if (isPackingBox())
            return getBegNumber() * super.getPackingcost();
        return  0;
    }
    @Override
    public double calculateTotalPrice(){
        return (this.piece * getUnitPrice()) + getPackingcost() +(getBegNumber() * 0.5);
    }
    public String toString(){
        return  super.toString() +
                "\nCup cake (" + getFlavor() +") With" +
                (isPackingBox() ? getBoxNumber() + "Box" : "") +getBegNumber() + "Bag" +
                "\nTotal price of Cup Cake = " + calculateTotalPrice();
    }
}
