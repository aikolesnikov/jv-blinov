/*
Наибольшее и наименьшее число.
Числа, которые делятся на 3 или на 9.
Числа, которые делятся на 5 и на 7.
Элементы, расположенные методом пузырька по убыванию модулей.
Все трехзначные числа, в десятичной записи которых нет одинаковых
цифр.
7. Наибольший общий делитель и наименьшее общее кратное этих чисел.
8. Простые числа. (isProbablePrime)
9. Отсортированные числа в порядке возрастания и убывания.
10. Числа в порядке убывания частоты встречаемости чисел.
11. «Счастливые» числа.
12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
13. Числа-палиндромы, значения которых в прямом и обратном порядке совпа-
дают.
14. Элементы, которые равны полусумме соседних эле­ментов.
15. Период десятичной дроби p = m/n для первых двух целых положительных
чисел n и m, расположенных подряд.
16. Построить треугольник Паскаля для первого положительного числа.
 */


package introduction;

import java.util.*;

public class Intro_1_7 {


    private static int getMax(int[] intAr) {

        int max = intAr[0];


        for (int i = 1; i < intAr.length; i++) {
            if (intAr[i] > max)
                max = intAr[i];
        }

        return max;
    }


    private static int getMin(int[] intAr) {

        int min = intAr[0];


        for (int i = 1; i < intAr.length; i++) {
            if (intAr[i] < min)
                min = intAr[i];
        }

        return min;
    }

    private static ArrayList<Integer> getOdd(int[] intAr) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int x : intAr) {
            if (x % 2 != 0)
                integerArrayList.add(x);
        }

        return integerArrayList;
    }

    private static ArrayList<Integer> getEven(int[] intAr) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int x : intAr) {
            if (x % 2 == 0)
                integerArrayList.add(x);
        }

        return integerArrayList;
    }

    private static int[] inputData() {


        //        int n = 0;
//        try {
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        int[] iAr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            Scanner sc = new Scanner(System.in);
//            try {
//                iAr[i] = sc.nextInt();
//            } catch (Exception e) {
//                // e.printStackTrace();
//            }
//        }

        int[] iAr = new int[new Random(System.currentTimeMillis()).nextInt(9) + 1];  // 1-10
        for (int i = 0; i < iAr.length; i++) {
            iAr[i] = new Random().nextInt(100);
        }

        return iAr;
    }


    public static void main(String[] args) throws Exception {

        int[] intArr = inputData();

        System.out.println("Array: " + Arrays.toString(intArr));
        System.out.println();

        System.out.println("Even: " + getEven(intArr));
        System.out.println("Odd: " + getOdd(intArr));
        System.out.println("Min: " + getMin(intArr));
        System.out.println("Max: " + getMax(intArr));

    }

}
