public class Pizza {

    private int price ;
    private boolean veg ;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice ;
    private boolean isExtraCheesaAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isExtraOptedTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheesaAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraTopping(){
        isExtraToppingAdded= true;
        this.price += extraToppingPrice;
    }

    public void takeaway(){
        isExtraOptedTakeAway = true;
        this.price += backPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: "+basePizzaPrice);
        if (isExtraCheesaAdded){
            bill += "Extra Cheese Added: "+extraCheesePrice+ "\n";
        }
        if (isExtraToppingAdded){
            bill += "Extra Topping Added: "+extraToppingPrice+ "\n";
        }
        if (isExtraOptedTakeAway){
            bill += "Take Away: "+backPackPrice+ "\n";
        }

        bill += "bill: "+this.price +"\n";
        System.out.println(bill);

    }

}
