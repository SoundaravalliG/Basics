import java.util.Scanner;

public class PerimeterCircle
{
    public static void main(String[] args) {
        double r;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        System.out.flush();
        r=s.nextDouble();
        System.out.println("Perimeter: " +(2*3.14*r));
    }
}
