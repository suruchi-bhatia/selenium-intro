package sweden.test;

public class FunctionsPractice {

    public static void main(String[] args) {

        System.out.println("Functions starting from here");

        doMultiply();

        sayGoodBye("Suruchi");
        goodMorning("Asha");
        // Just concentrate on calling the function, String or Input Parameters will come automatically.

        valueIsFifty();

        getProduct(2, 3);
        getProduct(5, 10);

        System.out.println("Functions end here");
    }

    // 1. Function without Return Type & without Input parameters

    public static void doMultiply() {
        int a = 5;
        int b = 10;
        int Product = a * b;

        System.out.println("The outcome of multiply is " + Product);
    }

    // 2. Function without Return Type & with Input parameters

    public static void sayGoodBye(String userName) {

        System.out.println("Good Bye " + userName);

    }

    public static void goodMorning(String name) {

        System.out.println("Good Morning " + name);

    }

    // 3. Function with Return Type & without Input parameters

    public static int valueIsFifty() {

        int x = 5;
        int y = 10;
        int result = x / y;
        int result1 = x * y;

        System.out.println(result == 50);
        System.out.println("X divided by Y = " + result);
        System.out.println("X multiply by Y = " + result1);
        System.out.println(result1 == 50);

        return 50;
    }

    // 4. Function with Return Type & with Input parameters

    public static int getProduct(int a, int b) {
        int multiply = a * b;

        System.out.println("The product of two numbers are " + multiply);

        return multiply;
    }

}