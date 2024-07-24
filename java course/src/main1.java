import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        System.out.println("Taking the input from the user");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=sc.nextInt();
        System.out.print("enter the second number:");
        int b =sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of 2 numbers is:"+sum);

    }
}
