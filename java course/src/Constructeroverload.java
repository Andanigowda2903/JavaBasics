public class Constructeroverload {
    public Constructeroverload(int a,String b){
        System.out.println(a+" "+b);
    }
    public Constructeroverload(double c){
        this(10,"hi");
        System.out.println(c);
    }
    public Constructeroverload(String b){
        this(23.45);
        System.out.println(b);
    }
    public  Constructeroverload(int a){
        this("hii");
        System.out.println(a);
    }

    public static void main(String[] args) {
        new Constructeroverload(10);
    }
}
