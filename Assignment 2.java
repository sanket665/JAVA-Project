import java.util.Scanner;
public class SumOfNumbers2
{
    public static void main(String args[])
   { 
 i   int x, y, sum;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the first number:");
     x = sc.nextlnt();
     System.out.print("Enter the second number:");
     y = sc.nextlnt();
     sum = sum(x,y);
     System.out.println("The sum of two number x and y is:" + sum);
    }
    public static int sum(int a, int b)
   {
     int sum = a + b;
     return sum;
   }
}
