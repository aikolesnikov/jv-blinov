package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Intro_1_3 {


    // 1. 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
    private static List<Integer> getRandomN(int n) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integerList.add(new Random().nextInt(100));
        }

        return integerList;
    }


    private static void printList(List<Integer> list, boolean isNewString) {
        if (isNewString)
            for (Integer aList : list) {
                System.out.print(aList);
                System.out.println();
            }
        else {
            System.out.println(list);
        }
    }


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            boolean isNewString = true;

            if (n <= 0)
                throw new Exception("n must be >= 0");
            getRandomN(n);
            printList(getRandomN(n), true);

        } catch (Exception e) {
            System.err.println("Wrong input");
        }
    }
}
