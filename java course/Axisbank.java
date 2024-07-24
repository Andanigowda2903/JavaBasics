public class Axisbank {
    private int atmpin=2002;
    public int getAtmpin(){
        return atmpin;
    }
}
public void setAtmpin(int atmpin){
    this.atmpin=atmpin;
}
}
public class main22{
    public static void main(String[] args) {
        Axisbank a1=new Axisbank();
        System.out.println(a1.getAtmpin());
        a1.setAtmpin(2024);
        System.out.println(a1.getAtmpin());
    }
}
