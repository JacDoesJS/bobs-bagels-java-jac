import java.util.ArrayList;

public class Basket {
    private int basketCapacity;
    private ArrayList<Item> basketItems = new ArrayList();

    public Basket(int basketCapacity) {
        this.basketCapacity = basketCapacity;
    }


    public String addItem(Item item) {
        if(isBasketFull() ==  false){
            basketItems.add(item);
        }
        return "Can't do that - basket is full";
    }

    public void removeItem(Item item){
        basketItems.remove(item);
    }

    public ArrayList<Item> getBasketItems() {
        return basketItems;
    }

    public int getBasketCapacity() {
        return basketCapacity;
    }
    public String increaseBasketCapacity() {
        basketCapacity += 3;
        return "Basket capacity has been increased and is now " + basketCapacity;
    }

    public boolean isBasketFull() {
        if(basketItems.size() == basketCapacity) {
            return true;
        }
        return false;
    }

    public boolean isItemInBasket(Item item) {
        return (basketItems.contains(item)) ? true : false;
    }
};
