import java.util.*;
class Box {
    double w;
    double h;
    double d;
    double volume() {
        return w * h * d;
    }
}
class BoxDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        
        System.out.println("Enter width, height and depth of Box 1:");
        box1.width = sc.nextDouble();
        box1.height = sc.nextDouble();
        box1.depth = sc.nextDouble();
        
        System.out.println("Enter width, height and depth of Box 2:");
        box2.width = sc.nextDouble();
        box2.height = sc.nextDouble();
        box2.depth = sc.nextDouble();

        System.out.println("Enter width, height and depth of Box 3:");
        box3.width = sc.nextDouble();
        box3.height = sc.nextDouble();
        box3.depth = sc.nextDouble();
        
        System.out.println("Volume of Box 1 = " + box1.volume());
        System.out.println("Volume of Box 2 = " + box2.volume());
        System.out.println("Volume of Box 3 = " + box3.volume());
    }
}