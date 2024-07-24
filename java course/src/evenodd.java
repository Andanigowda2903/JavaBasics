import java.util.Scanner;
public class evenodd {
    public static void findEvenOrOdd(int n){
        if (n%2==0){
            System.out.println(n+"  is a even number");
        }
        else {
            System.out.println(n+" is a odd number");
        }
        return;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        findEvenOrOdd(n);
    }
}
