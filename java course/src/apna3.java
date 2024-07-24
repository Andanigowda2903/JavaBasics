import java.util.Scanner;

public class apna3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of the month");
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch (month){
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            default:
                System.out.println("invalid month");
        }

    }
}
