package sweden.test;

public class LoopAssignments {

    public static void main(String[] args) {

        // Print Even numbers between 1-50
        // Print Odd numbers between 1-50
        // Perform add(a, b) with (1, 2), (2, 3) .... (9, 10)

        evenNumber();
        printEvenNumbers();
        printOddNumbers();
        performAdd();
        printNumbers();

    }


    public static void evenNumber() {

        int a = 2;
        while (a <= 50) {
            System.out.println("Print even no. " + a);
            a = a + 2;
        }

    }

    public static void printEvenNumbers() {

        int a = 2;
        do {
            System.out.println("Even Number " + a);
            a = a + 2;
        } while (a <= 50);

    }

    public static void printOddNumbers() {

        int i = 1;
        do {
            System.out.println("Odd Number " + i);
            i = i + 2;
        } while (i <= 50);

    }

    public static void performAdd() {


        // Perform Add
        // a = (a + 1) b = (b+1)
        // print a + b


        int a = 2;
        int b = 4;

        do {
            int Sum = a + b;
            System.out.println("Print the value of Even Numbers : " + Sum);

            a = a + 2;
            b = b + 2;
        }
        while (a <= 10);
    }

    public static void printNumbers() {

        for (int z = 2; z < 100; ) {
            System.out.println("Value of z " + z);
            z = z + 10;
        }
    }


// 2, 12, 22, 32, 42, 52, 62, 72, 82, F, F....
// 1, 2,  3,  4,  5,   6, 7,   8, 9,  F, F, F

        /*
        Condition 1 Condition 2         AND         OR
            T           T               T           T
            T           F               F           T
            F           T               F           T
            F           F               T           F
         */


}



