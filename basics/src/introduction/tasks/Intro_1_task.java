package introduction.tasks;

/**
 * book tasks
 */
public class Intro_1_task {

    public static void main(String[] args) {
        String s; // 1
        int i = 0;

        if ((s = "java") == "java") {// 2
            System.out.println(s + " true");
        } else {
            System.out.println(s + " false");
        }

        String ss;
        System.out.println((ss = "abc") == "abc");
        System.out.println((ss = "abc"));
        System.out.println(i=2);
    }


}

