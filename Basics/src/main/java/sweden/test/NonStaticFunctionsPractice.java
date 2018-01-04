package sweden.test;

public class NonStaticFunctionsPractice {

    static NonStaticFunctionsPractice o1 = new NonStaticFunctionsPractice();

    public static void main(String[] args) {

        NonStaticFunctionsPractice o = new NonStaticFunctionsPractice();

        // Static function accessing Static function :
        add();

        // Static function accessing Non - Static function :
        o1.multiply();

        // Non-Static function accessing Static function :
        o.add();

        // Non-Static function accessing Non - Static function :
        o.multiply();

    }


    public static void add() {

        int a = 5;
        int b = 10;
        int sum = a + b;

        System.out.println("Value of Add is " + sum);
    }


    public void multiply() {

        int a = 4;
        int b = 5;
        int product = a * b;

        System.out.println("A multiply B = " + product);
    }

}
