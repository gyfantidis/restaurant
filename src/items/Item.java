package items;

import java.util.Scanner;

public class Item {
    private String type;
    private double price;

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Item() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void takeOrder(String itemType[], double itemPrice[]){
        Scanner itemChoice = new Scanner(System.in);
        System.out.println("Choice your "+itemType[0]);
        for(int i=1; i<itemType.length; i++){
            System.out.println(i +") for " +itemType[i] +" ($ " +itemPrice[i] +")");
        }
        int choice = itemChoice.nextInt();
        setType(itemType[choice]);
        setPrice(itemPrice[choice]);

    }


}
