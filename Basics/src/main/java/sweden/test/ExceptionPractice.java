package sweden.test;

public class ExceptionPractice {

    public static void main(String[] args) {

        divide(0, 10);
        System.out.println("Good Morning");

        System.out.println("Have a nice day !!");
        divide(10, 100);
    }

    public static void divide(int a, int b) {

        try {
            int value = b / a;
            System.out.println("The value is " + value);
        } catch (ArithmeticException e) {
            System.out.println("Error corrected with Exception");
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println("Execution is complete");
        }

    }
}