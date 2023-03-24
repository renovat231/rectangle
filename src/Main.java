import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        rect.getData();
        rect.computeField();
        rect.fieldDisplay();
    }
}
class Rectangle {
    private double width;
    private double Length;
    private double Area;

    public void getData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width:");
        this.width = Double.parseDouble(in.nextLine());
        System.out.println("Enter the Length:");
        this.Length = Double.parseDouble(in.nextLine());;
    }

    public void computeField() {
        this.Area = this.width * this.Length;
    }

    public void fieldDisplay() {
        System.out.printf("The area of a rectangle with a length of %f and width of %f is %f", this.Length, this.width, this.Area);
    }
}
