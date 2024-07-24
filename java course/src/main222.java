 class Sample {
    private int a=10;

    public int getA() {
        return a;
    }
    public  void setA(int a){
        this.a=a;

    }
}
public class main222{
    public static void main(String[] args) {
        Sample s1=new Sample();
        System.out.println(s1.getA());
        s1.setA(30);
        System.out.println(s1.getA());
    }
}
