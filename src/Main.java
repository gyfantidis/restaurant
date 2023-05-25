import items.Drink;
import items.Hamburger;

public class Main {
    public static void main(String[] args) {

        String drinksType[] = {"Drink", "CocaCola", "Fanta", "Soda", "Beer"};
        double[] drinksSize = {0, 2.49, 3.29, 3.99, 4.22};


//        Item item = new Item();
//        item.takeOrder(drinksType, drinksSize);

//        Drink drink = new Drink();
//        drink.takeOrder(drinksType, drinksSize);

//        System.out.println(drink.getType());
//        System.out.println(drink.getPrice());
//        System.out.println(drink.getSize());


        Hamburger hamburger = new Hamburger();
        hamburger.takeOrder(drinksType,drinksSize);

        System.out.println(hamburger.getType());
        System.out.println(hamburger.getPrice());
        System.out.println(hamburger.getExtraToppings().get(0).getType());
        System.out.println(hamburger.getExtraToppings().get(1).getType());
      //  System.out.println(hamburger.getExtraToppings());


    }
}