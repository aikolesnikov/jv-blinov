package multythreading;

// получатель значения атомарного поля
public class Broker extends Thread{

    private Market market;
    private static final int PAUSE = 500; // in millis
    Broker(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Current index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
