package sweden.test;

public class StringPractice {

    public static void main(String[] args) {
        String helloUser = "My name is Suruchi.";
        String greeting = "Good Morning.";
        String space = " ";

        System.out.println(helloUser.charAt(0));
        System.out.println(helloUser.charAt(1));
        System.out.println(helloUser.charAt(2));
        System.out.println(helloUser.charAt(3));
        System.out.println(helloUser.charAt(4));
        System.out.println(helloUser.charAt(5));
        System.out.println(helloUser.charAt(6));
        System.out.println(helloUser.charAt(7));
        System.out.println(helloUser.charAt(8));
        System.out.println(helloUser.charAt(9));
        System.out.println(helloUser.charAt(10));
        System.out.println(helloUser.charAt(11));
        System.out.println(helloUser.charAt(18));

        System.out.println(helloUser.length());

        System.out.println(greeting.equals(helloUser));

        System.out.println(greeting + space + helloUser);

        System.out.println(greeting.concat(space).concat(helloUser));

        helloUser = helloUser.toUpperCase();
        System.out.println(helloUser);

        helloUser = helloUser.toLowerCase();
        System.out.println(helloUser);

        System.out.println(greeting.equals(helloUser));

    }

}
