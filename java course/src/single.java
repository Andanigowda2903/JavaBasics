class sample{
    void hi(){
        System.out.println("HIEEEE!!");
    }
}
class demo extends sample{
    void bye(){
        System.out.println("get lost");

    }
}
public class single {
    public static void main(String[] args) {
        demo d1=new demo();
        d1.hi();
        d1.bye();
    }
}
