public class BitManipulation3 {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<2;
        int notBitMask=~(bitmask);
        int number=notBitMask & n;
        System.out.println(number);
    }
}
