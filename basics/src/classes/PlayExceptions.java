package classes;

public class PlayExceptions {

    private static void procedure() throws Throwable {
        System.out.println("внутри процедуры");
        throw new IllegalAccessException("пример выбрасывания");
    }

    public static void main(String args[]) throws Throwable {
        try {
            procedure();
        } catch (Throwable throwable){
            throwable.printStackTrace();
        } finally {
            System.out.println("this is finally");
        }

        try {
            throw new ArithmeticException("in the main");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("from the main");
        }
    }
}
