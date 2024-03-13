package oving4;

import java.util.ArrayList;

public class Merchant {
    
    private ArrayList<Item> inventory = new ArrayList<>();
    private double balance;

    public Merchant(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("A merchant cannot have a negative balance.");
        }

        this.balance = balance;
    }

    public void obtainItem(Item item) {
        inventory.add(item);
        item.changeOwner(this);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public void sellItem(Item item, Merchant purchaser) {
        if (purchaser.getBalance() < item.getPrice()) {
            throw new IllegalStateException("The merchant does not have enough money.");
        }

        if (!this.getInventory().contains(item)) {
            throw new IllegalStateException("A merchant cannot sell an item they do not own.");
        }
        if (this == purchaser) {
            throw new IllegalStateException("A merchant cannot sell an item to themselves");
        }

        removeItem(item);
        setBalance(getBalance() + item.getPrice());
        item.changeOwner(purchaser);
        purchaser.obtainItem(item);
        purchaser.setBalance(purchaser.getBalance() - item.getPrice());
    }

    public void inventorySale(double percentageOff) {
        for (Item item : inventory) {
            item.setPrice(item.getPrice()*(1-percentageOff));
        }
    }

    public void itemSale(double percentageOff, Item item) {
        if (!inventory.contains(item)) {
            throw new IllegalStateException("A merchant cannot start a sale on an item they do not own.");
        }
        if (!(percentageOff >= 0 && percentageOff <= 1)) {
            throw new IllegalArgumentException("Invalid sale percentage");
        }
        item.setPrice(item.getPrice()*(1-percentageOff));
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Item> getInventory() {
        return new ArrayList<>(inventory);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
