// WAP to demonstrat the use of the bitwise operator
import java.util.*;
class Bit {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = SC.nextInt();
        System.out.print("Enter B: ");
        int b = SC.nextInt();


        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a & b = " + (a & b));

        System.out.println("a | b = " + (a | b));

        System.out.println("a ^ b = " + (a ^ b));

        System.out.println("~a = " + (~a));

        System.out.println("a << 1 = " + (a << 1));

        System.out.println("a >> 1 = " + (a >> 1));
    }
}
