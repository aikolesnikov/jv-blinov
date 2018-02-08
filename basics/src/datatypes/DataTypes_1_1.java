package datatypes;

import java.util.Arrays;

public class DataTypes_1_1 {

    // 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
    private static int[] getSortedByLongByMode(int[] intAr, boolean mode) {

        int[] arr = Arrays.copyOf(intAr, intAr.length);

        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (mode) {
                    if (getIntLength(arr[j - 1]) > getIntLength(arr[j])) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (getIntLength(arr[j - 1]) < getIntLength(arr[j])) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }

    // 1. Найти самое длинное число. Вывести найденные числа и их длину.
    private static int getIndexOfLongestInIntAr(int[] intAr) {

        if (intAr == null) return -1;

        int s = 0;
        for (int i = 1; i < intAr.length; i++) {
            if (getIntLength(intAr[i]) > getIntLength(intAr[s])) {
                s = i;
            }
        }

        return s;
    }

    // 1. Найти самое короткое число. Вывести найденные числа и их длину.
    private static int getIndexOfShortestInIntAr(int[] intAr) {

        if (intAr == null) return -1;

        int s = 0;
        for (int i = 1; i < intAr.length; i++) {
            if (getIntLength(intAr[i]) < getIntLength(intAr[s])) {
                s = i;
            }
        }

        return s;
    }

    private static int getIntLength(int i){
        return getCharArFromInt(i).length;
    }

    private static char[] getCharArFromInt(int i) {
        return Integer.toString(i).toCharArray();
    }


    public static void main(String[] args) {
        int[] intArr = introduction.Intro_1_7.inputData();

        System.out.println("Array: " + Arrays.toString(intArr));
        System.out.println("Index of shortest: " + getIndexOfShortestInIntAr(intArr));
        System.out.println("Index of longest: " + getIndexOfLongestInIntAr(intArr));
        System.out.println("Sorted by long direct:" + Arrays.toString(getSortedByLongByMode(intArr, true)));
        System.out.println("Sorted by long direct:" + Arrays.toString(getSortedByLongByMode(intArr, false)));

    }


}
