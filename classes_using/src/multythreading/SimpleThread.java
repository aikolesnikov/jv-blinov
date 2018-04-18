package multythreading;

public class SimpleThread extends Thread {

    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("старт потока-демона");
                // Thread.sleep(10_000); // заменить параметр на 1
                Thread.sleep(1); // заменить параметр на 1
            } else {
                System.out.println("старт обычного потока");
            }
        } catch (InterruptedException e) {
            System.err.print(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("завершение обычного потока");
            } else {
                System.out.println("завершение потока-демона");
            }
        }
    }

}
