package oving6.observable;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private double price;
    private String tick;
    private List<StockListener> listenerList = new ArrayList<StockListener>();

    //Constructor
    public Stock(String tick, double price){
        this.tick = tick;
        this.price = price;
    }
    //setters
    public void setPrice(double price){
        double old_price = this.price; 
        if(price<1){
            throw new IllegalArgumentException();
        } else{
            this.price = price;
            listenerList.stream().forEach(listener ->{
                listener.stockPriceChanged(this, old_price, price);
            });
            this.price = price;
        }
    }
    //Getters
    public double getPrice(){
        return price;
    }
    public String getTicker(){
        return tick;
    }
    public void addStockListener(StockListener SL){
        listenerList.add(SL);
    }
    public void removeStockListener(StockListener SL){
        listenerList.remove(SL);
    }
}
