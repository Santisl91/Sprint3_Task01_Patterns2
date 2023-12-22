package N1_Ex01;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<StockObserver> observers = new ArrayList<>();
    private double stockPrice;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setStockPrice(double price) {
        if (price != stockPrice) {
            stockPrice = price;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockPrice);
        }
    }
}
