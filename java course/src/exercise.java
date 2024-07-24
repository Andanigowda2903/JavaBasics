import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
 /*1. float a=7/4f*9/2f;
        System.out.println(a);*/
   /*2.     char grade='C';
        grade=(char)(grade+8);
        System.out.println(grade);
        grade=(char) (grade-8);
        System.out.println(grade);*/
        Scanner sc=new Scanner(System.in);
        //int a= sc.nextInt();
        //System.out.println(a>10);
        int a =sc.nextInt();
        int v=sc.nextInt();
        int u= sc.nextInt();
        int s=sc.nextInt();
        int b=(v*v-u*u)/(2*a*s);
        System.out.println(b);
    }
}
