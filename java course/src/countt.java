public class countt {
    public static void main(String[] args) {
        int count = 0;
        int a = 12747672;
        while (a > 0) {
            int rem = a % 10;
            if (rem == 7) {
                count++;

            }
            a = a / 10;


        }
        System.out.println(count);
    }
}
