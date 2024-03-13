package oving6.observable;

import java.util.ArrayList;
import java.util.List;

public class StockIndex implements StockListener {
    private List<Stock> Stocks = new ArrayList<Stock>();
    private double price;

    // Constructor
    public StockIndex(String navn, Stock... stocks) {
        for (Stock stk : stocks) {
            stk.addStockListener(this);
            addStock(stk);
        }
    }

    // Methods
    public void addStock(Stock stk) {
        if (!Stocks.contains(stk)) {
            stk.addStockListener(this);
            Stocks.add(stk);
            updateIndexPrice();
        }
    }

    public void removeStock(Stock stk) {
            stk.removeStockListener(this);
            Stocks.remove(stk);
            updateIndexPrice();
    }

    public double getIndex() {
        return price;
    }

    @Override
    public void stockPriceChanged(Stock stock, double oldValue, double newValue) {
        System.out.println("Stock price "+stock.getPrice());
        System.out.println("Index price before update "+ getIndex());
        updateIndexPrice();
        System.out.println("Index price after update "+getIndex());


    }

    // Private Methods
    private void updateIndexPrice() {
        double sum = 0f;
        for (Stock stk : Stocks) {
            sum += stk.getPrice();
        }
        price = sum;
    }
}
