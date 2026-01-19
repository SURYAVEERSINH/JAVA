// Write a program and take input and find area of cirle, Triangle (1/2*base*height) and rectangle(Length×Breadth)
import java.util.*;

class area{
     public static void main(String args[]){
          double Pi = 3.14;
          Scanner SC = new Scanner(System.in);
          System.out.print("Enter the radius : ");
          int r = SC.nextInt();
          double areaC = (Pi * (r*r));
          System.out.println(areaC);
          System.out.print("Enter the Base : ");
          int b = SC.nextInt();
          System.out.print("Enter the Height : ");
          int h = SC.nextInt();
          double areaT = (0.5 * b * h);
          System.out.println(areaT);
          System.out.print("Enter the length: ");
          int l = SC.nextInt();
          System.out.print("Enter the Breadth: ");
          int Breadth = SC.nextInt();
          double areaR = (l * Breadth);
          System.out.print(areaR);
     }
}