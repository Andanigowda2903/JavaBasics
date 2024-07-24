public class BitManipulation {
    public static void main(String[] args) {
        int n=6;
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask & n)==0){
            System.out.println("its a Zero");
        }
        else {
            System.out.println("its value is one");
        }
    }
}
