package introduction;

public class Intro_1_5 {


    // 1. 5. Ввести целые числа как аргументы командной строки,
    // подсчитать их суммы (произведения) и вывести результат на консоль.
    public static void main(String[] args) {

        int sum = 0;
        for (String s : args) {

            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
                // e.printStackTrace();
            }
        }

        System.out.println(sum);
    }
}