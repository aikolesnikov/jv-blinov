/*

7. Наибольший общий делитель и наименьшее общее кратное этих чисел.
10. Числа в порядке убывания частоты встречаемости чисел.
11. «Счастливые» числа.
12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
13. Числа-палиндромы, значения которых в прямом и обратном порядке совпа-
дают.
14. Элементы, которые равны полусумме соседних элементов.
15. Период десятичной дроби p = m/n для первых двух целых положительных
чисел n и m, расположенных подряд.
16. Построить треугольник Паскаля для первого положительного числа.
 */


package introduction;

import java.math.BigInteger;
import java.util.*;

public class Intro_1_7 {

    private static ArrayList<Integer> getPrimes(int count) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        int i = 0;
        int primeQty = 0;
        while (primeQty < count) {
            if ((new BigInteger("" + i).isProbablePrime(1))) {
                integerArrayList.add(i);
                primeQty++;
            }
            i++;
        }

        return integerArrayList;
    }

    private static ArrayList<Integer> getPrimesInRange(int rangeFrom, int rangeTo) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int x = rangeFrom; x < rangeTo; x++) {
            if ((new BigInteger("" + x).isProbablePrime(1))) {
                integerArrayList.add(x);
            }
        }

        return integerArrayList;
    }

    // 8. Простые числа. (isProbablePrime)
    private static ArrayList<Integer> getPrimes(int[] intAr) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int x : intAr) {
            if ((new BigInteger("" + x).isProbablePrime(1))) {
                integerArrayList.add(x);
            }
        }

        return integerArrayList;
    }

    // 9. Отсортированные числа в порядке возрастания и убывания.
    private static int[] getSortedByMode(int[] intAr, boolean mode) {

        int[] arr = Arrays.copyOf(intAr, intAr.length);

        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (mode) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (arr[j - 1] < arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }

    // Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
    private static ArrayList<Integer> getTripleAndUnique(int[] intAr) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int x : intAr) {
            if (isTripleAndUnique(x)) {
                integerArrayList.add(x);
            }
        }

        return integerArrayList;
    }

    private static boolean isTripleAndUnique(int x) {
        if (x < 100 || x > 999) return false;

        String s = Integer.toString(x);

        return s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2) && s.charAt(1) != s.charAt(2);
    }

    // Элементы, расположенные методом пузырька по убыванию модулей.
    private static int[] getBubleSortByModule(int[] intAr) {

        int[] arr = Arrays.copyOf(intAr, intAr.length);

        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Math.abs(arr[j - 1]) > Math.abs(arr[j])) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    private static ArrayList<Integer> getDividedByFiveAndSeven(int[] intAr) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int x : intAr) {
            if (x % 5 == 0) {
                if (x % 7 == 0) {
                    integerArrayList.add(x);
                }
            }
        }

        return integerArrayList;
    }

    private static ArrayList<Integer> getDividedByThreeOrNine(int[] intAr) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int x : intAr) {
            if (x % 3 == 0)
                integerArrayList.add(x);
        }

        return integerArrayList;
    }

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
            iAr[i] = new Random().nextInt(Integer.MAX_VALUE) - Integer.MAX_VALUE / 2;   //   new Random().nextInt(1000)-500  -> (-500 500)
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
        System.out.println("Div_3_9: " + getDividedByThreeOrNine(intArr));
        System.out.println("Div_5_7: " + getDividedByFiveAndSeven(intArr));
        System.out.println("Sorted by module:" + Arrays.toString(getBubleSortByModule(intArr)));
        System.out.println("Sorted by Mode:" + Arrays.toString(getSortedByMode(intArr, true)));
        System.out.println("Sorted by Mode:" + Arrays.toString(getSortedByMode(intArr, false)));
        System.out.println("Primes:" + getPrimes(intArr));
        System.out.println(getPrimesInRange(1000, 2000));
        System.out.println(getPrimes(508));

        // System.out.println(isTripleAndUnique(4567));


    }

}
