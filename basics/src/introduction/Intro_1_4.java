package introduction;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Intro_1_4 {

    // 1. 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.


    public static void main(String[] args) throws Exception {
        try {

            Scanner sc = new Scanner(System.in);
            Console console = System.console();

            System.out.println("String:");
            String s = sc.nextLine();

            char[] pass = console.readPassword("Password:");

            if (Arrays.equals(s.toCharArray(), pass))
                System.out.println("yes");

            Arrays.fill(pass, ' ');

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
