// // Enter five Student data as follows: EntollmentNo, Name,5 Subject marks, Total matks,PR, Grade-A B C D and the final list of student data. 

// import java.util.*;
// class P2{
//        public static void main(String args[]){
//             Scanner SEn = new Scanner(System.in);
//             System.out.print("Enter EnrollmentNo : ");
//                 int EnrollmentNo = SEn.nextInt();
//             Scanner SName = new Scanner(System.in);
//             System.out.print("Enter Name : ");
//                 String Name = SName.nextLine();
//             for (int i = 1; i <=5; i++) {
//                 Scanner SubN = new Scanner(System.in);
//                 System.out.print("Enter Subject Marks");
//                 System.out.print(i + ":");
//                 String Sub = SubN.nextLine();
//             }    

//        }
// }
import java.util.Scanner;

class Student {
    int enrollmentNo;
    String name;
    int[] marks = new int[5];
    int total;
    float pr;
    char grade;

    void calculate() {
        total = 0;
        for (int m : marks) {
            total += m;
        }
        pr = total / 5.0f;

        if (pr >= 75)
            grade = 'A';
        else if (pr >= 60)
            grade = 'B';
        else if (pr >= 50)
            grade = 'C';
        else
            grade = 'D';
    }
}

public class P2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];

        for (int i = 0; i < 5; i++) {
            s[i] = new Student();
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enrollment No: ");
            s[i].enrollmentNo = sc.nextInt();

            System.out.print("Name: ");
            s[i].name = sc.next();

            System.out.println("Enter 5 Subject Marks:");
            for (int j = 0; j < 5; j++) {
                s[i].marks[j] = sc.nextInt();
            }

            s[i].calculate();
        }

        System.out.println("\n----- Final Student List -----");
        System.out.println("EnrollNo\tName\tTotal\tPR\tGrade");

        for (int i = 0; i < 5; i++) {
            System.out.println(
                s[i].enrollmentNo + "\t\t" +
                s[i].name + "\t" +
                s[i].total + "\t" +
                String.format("%.2f", s[i].pr) + "\t" +
                s[i].grade
            );
        }

        sc.close();
    }
}
