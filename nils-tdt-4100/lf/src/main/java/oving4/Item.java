package oving4;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    private String name;
    private String type;
    private double price;
    private Merchant owner;

    private final ArrayList<String> POSSIBLETYPES = new ArrayList<>(Arrays.asList("Weapon", "Armour", "Potion", "Valuable"));
    
    public Item(String name, String type, double price) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("A name must be bestowed upon the item.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("The item must have a positive value.");
        }
        if (!POSSIBLETYPES.contains(type)) {
            throw new IllegalArgumentException("What kind of item type is this, traveler?");
        }

        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Merchant getOwner() {
        if (this.owner == null) {
            return null;
        }
        return this.owner;
    }

    public void changeOwner(Merchant newOwner) {
        this.owner = newOwner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("An item cannot be worth less than nothing");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " [" + type +  " item. Value: "+ price + " gold coins]";
    }
}
