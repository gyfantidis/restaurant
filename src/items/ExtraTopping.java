package items;

public class ExtraTopping extends Item{
    public ExtraTopping(String type, double price) {
        super(type, price);
    }

    public ExtraTopping() {
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
    }
}
