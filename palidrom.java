// WAP to accept string input and find the input is palidrom or not
import java.util.Scanner;

class palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str, rev = "";

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Check palindrome
        if (str.equals(rev)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
    }
}
