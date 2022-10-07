import java.util.Scanner;
public class promotion {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = sc.nextDouble();
        System.out.print("Enter b : ");
        double b = sc.nextDouble();
        System.out.print("Enter c : ");
        double c = sc.nextDouble();
        double Q1,Q2;
       double discriminant = b * b - 4 * a * c;
        Q1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        Q2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println(Q1);
        System.out.println(Q2);
    }
}
