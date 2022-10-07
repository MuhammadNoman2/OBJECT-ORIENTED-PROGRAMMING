import java.util.Scanner;
public class AreaofCircle {
        public static void main(String arg[])
        {
            int a;
            float b;
            long c;
            byte d;
            char e;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Radius r =  ");
            double r = sc.nextDouble();
            double pi=3.14;
             a = (int)pi*(int)r*(int)r;
            b = (float)pi*(float)r*(float)r;
            c=(short)pi*(short)r*(short)r;
            d=(byte)(pi*r*r);
            e=(char)(pi*r*r);
            System.out.println("Integer value Area of Circle  = " + a);
            System.out.println("Float value Area of Circle  = " + b);
            System.out.println("Short value Area of Circle  = " + c);
            System.out.println("Byte value Area of Circle  = " + d);
            System.out.println("Character value Area of Circle  = " + e);
        }
}
