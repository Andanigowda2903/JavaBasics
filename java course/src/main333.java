interface Gmail{
    void login();
}
class Gmail1 implements Gmail{
    public void login(){
        System.out.println("Hieeeeee");
    }

}
class Gmail2 implements Gmail{
    public void login(){
        System.out.println("byeeee");
    }
}
class Gmail3 implements Gmail{
    public void login(){
        System.out.println("  Get Lostttt");
    }
}
class Stimulator{
    static  void loginis(Gmail g1){
        g1.login();
    }
}

public class main333 {
    public static void main(String[] args) {
        Gmail1 g1=new Gmail1();
    }
}
