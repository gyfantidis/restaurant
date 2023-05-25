package items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hamburger extends Item{
    private List<ExtraTopping> extraToppings;

    public Hamburger(String type, double price, List<ExtraTopping> extraToppings) {
        super(type, price);
        this.extraToppings = extraToppings;

    }

    public Hamburger(String type, double price) {
        super(type, price);
        extraToppings = new ArrayList<>();
    }

    public Hamburger() {
        extraToppings = new ArrayList<>();
    }


    public void addTopping(ExtraTopping topping){
        extraToppings.add(topping);
    }

    public Hamburger(List<ExtraTopping> extraToppings) {
        this.extraToppings = extraToppings;
    }



    public List<ExtraTopping> getExtraToppings() {
        return extraToppings;
    }



    public void setExtraToppings(List<ExtraTopping> extraToppings) {
        if (extraToppings != null) {
            this.extraToppings = new ArrayList<>(extraToppings);
        } else {
            this.extraToppings = new ArrayList<>();
        }
    }



    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }



    @Override
    public void takeOrder(String[] itemType, double[] itemPrice) {
        super.takeOrder(itemType, itemPrice);
        newTopping();
    }


    public void newTopping(){
        String[] extraToppingsType = {"", "Lettuce", "Tomato", "Bacon", "Pickles", "Avocado", "Onion", "Tsatsiki"};
        double[] extraToppingsPrice = {0, 0.4, 0.4, 0.4, 0.4, 0.4, 0.4, 0.4};

        int counter = 0;
        while (counter < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want extra topping? press 'y' for yes or 'n' for no : ");
            String extraChoice = scanner.nextLine();
            System.out.println(extraChoice);
            if (extraChoice.toLowerCase().equals("y")) {
                counter = counter + 1;
                ExtraTopping extraTopping = new ExtraTopping();
                extraTopping.takeOrder(extraToppingsType, extraToppingsPrice);
                addTopping(extraTopping);
            } else {
                break;
            }


        }
    }







}
