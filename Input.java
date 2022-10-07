import java.util.Scanner;
public class Input {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int a = sc.nextInt();
        System.out.print("Enter second number- ");
        int b = sc.nextInt();

        int sum = a + b;
        int div = a / b;
        int mul = a * b;
        int mod = a % b;
        System.out.print("Enter Operator ( + , * , / , % ) to perform Operations- ");
        char d = sc.next().charAt(0);
        if (d == '+') {
            System.out.println("Sum = " + sum);
        } else if (d == '*') {
            System.out.println("multiplication = " + mul);
        } else if (d == '/') {
            System.out.println("Division = " + div);
        } else if (d == '%') {
            System.out.println("mod = " + mod);
        }
    }
}
