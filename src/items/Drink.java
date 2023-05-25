package items;

import java.util.Scanner;

public class Drink extends Item{


    private String size;


    public Drink(String type, double price, String size) {
        super(type, price);
        this.size = size;
    }

   public Drink(){

   }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Drink(String type, double price) {
        super(type, price);
    }

//    public Drink() {
//        super();
//    }

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
        String drinksSize[] = {"Regular", "Large", "XXLarge"};
        super.takeOrder(itemType, itemPrice);
        Scanner itemChoice = new Scanner(System.in);
        System.out.println("Drinks Size: ");

        for(int i=0; i<drinksSize.length; i++){
            System.out.println((i+1) +") for " +drinksSize[i] +" +($ " +(i*1.1) +")");
        }
        int choice = itemChoice.nextInt();
        setSize(drinksSize[choice-1]);
        setPrice(getPrice() + ((choice-1) * 1.1) );
    }
}
