public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraTopping();
//        basePizza.addExtraCheese();
//        basePizza.takeaway();
//        basePizza.getBill();


        DeluxPizza dp = new DeluxPizza(false);
        dp.takeaway();
        dp.getBill();
    }
}