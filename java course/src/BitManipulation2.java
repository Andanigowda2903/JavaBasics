public class BitManipulation2 {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask=1<<1;
        int number=bitMask | n;
        System.out.println(number);
    }
}
