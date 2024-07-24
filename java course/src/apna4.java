import java.util.Scanner;
public class apna4 {
    public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the valid number to perform operation");
        int button=sc.nextInt();
        switch (button){
            case 1:
                System.out.println("the sum of two numbers are:"+(a+b));
                break;
            case 2:
                System.out.println("the difference of two numbers are:"+(a-b));
                break;
            case 3:
                System.out.println("the product of two numbers are:"+(a*b));
                break;
            case 4:
                System.out.println("division of two numbers are:"+(a/b));
                break;
            case 5:
                System.out.println("the remainder of two numbers are:"+(a%b));
                break;
            default:
                System.out.println("invalid operation");
                break;

        }


    }
}
