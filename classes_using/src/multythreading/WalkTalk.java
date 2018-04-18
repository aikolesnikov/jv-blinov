package multythreading;

public class WalkTalk {
    public static void main(String[] args) {

        // все состояния
        Thread.State[] values;
        for (Thread.State c : Thread.State.values())
            System.out.println(c);
        System.out.println();


        // новые объекты потоков
        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());

        long startTime = System.currentTimeMillis();

        // запуск потоков
        System.out.println(talk.getState());
        talk.start();
        System.out.println(talk.getState());

        walk.start();
        try {
            synchronized (talk){
                walk.sleep(2000);
                System.out.println("Walk "+ walk.getState());
                System.out.println("Talk " + talk.getState());
                walk.interrupt();
                System.out.println("Walk "+ walk.getState());
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        synchronized (talk){
            talk.notify();
            System.out.println("Talk " + talk.getState());
        }

/*
        try {
            synchronized (talk){
                talk.sleep(1000);
                System.out.println(talk.getState());
            }
            while ((System.currentTimeMillis() - startTime) < 3000) {
            }
            synchronized (talk){
                talk.notify();
            }
            System.out.println(talk.getState());
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println(talk.getState());
*/


        // WalkRunnable w = new WalkRunnable(); // просто объект, не поток
        // w.run(); или talk.run(); // выполнится метод, но поток не запустится!
    }
}
