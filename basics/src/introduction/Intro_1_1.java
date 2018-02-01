package introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Intro_1_1 {

    private static boolean validateLetters(String txt) {

        String regx = "^[a-zA-Zа-яёА-ЯЁ]+[\\-'\\s]?[a-zA-Zа-яёА-ЯЁ ]+$";
        Pattern pattern = Pattern.compile(regx, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(txt);
        return matcher.find();

    }

    private static void greatUser(String name) {

        System.out.println("Hi, " + name);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (validateLetters(s)) {
            greatUser(s);
        } else
            throw new IllegalArgumentException("Name is not valid.");
    }
}
