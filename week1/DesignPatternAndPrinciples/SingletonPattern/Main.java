package week1.DesignPatternAndPrinciples.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        logger1.log("This is the first log.");
        logger2.log("This is the second log.");

        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger exists.");
        } else {
            System.out.println("Different instances created! (Error)");
        }
    }
}