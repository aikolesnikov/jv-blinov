package multythreading;

public class PriorityRunner {
    public static void main(String[] args) {

        PriorThread min = new PriorThread("Min");
        PriorThread max = new PriorThread("Max");
        PriorThread norm = new PriorThread("Norm");

        min.setPriority(Thread.MIN_PRIORITY); // 1
        norm.setPriority(Thread.NORM_PRIORITY); // 5
        max.setPriority(Thread.MAX_PRIORITY); // 10

        min.start();
        norm.start();
        max.start();

        ThreadGroup tg = new ThreadGroup("Группа потоков 1.");
        tg.setMaxPriority(Thread.NORM_PRIORITY);

        Thread thread_01 = new Thread(tg, "Thread_01");
        Thread thread_02 = new Thread(tg, "Thread_02");
        Thread thread_03 = new Thread(tg, "Thread_03");

        thread_01.setPriority(4);
        System.out.println(thread_01.getPriority());
        thread_01.setPriority(6);
        System.out.println(thread_01.getPriority());

        thread_01.start();
        System.out.println(tg.activeCount());
        System.out.println(tg.toString());
    }
}
