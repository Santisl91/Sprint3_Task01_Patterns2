package N1_Ex01;

public class StockBroker implements StockObserver {
    private String name;

    public StockBroker(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("Broker " + name + " notified. Stock Price: " + stockPrice);
    }
}
