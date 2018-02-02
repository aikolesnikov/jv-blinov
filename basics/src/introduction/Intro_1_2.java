package introduction;


// 1. 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class Intro_1_2 {

    public static void main(String[] args) {
        for (String s : args
                ) {
            System.out.print(s);
            System.out.println();
        }


        System.out.println();

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i]);
            System.out.println();
        }

    }
}
