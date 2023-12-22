package N1_Ex01;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        StockBroker broker1 = new StockBroker("Broker1");
        StockBroker broker2 = new StockBroker("Broker2");

        stockMarket.addObserver(broker1);
        stockMarket.addObserver(broker2);

        stockMarket.setStockPrice(150.00);
        stockMarket.setStockPrice(155.50);
        stockMarket.setStockPrice(145.75);

        stockMarket.removeObserver(broker1);

        stockMarket.setStockPrice(160.25);
    }
}

