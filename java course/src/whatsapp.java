public class whatsapp {
    static void send(int a){
        System.out.println(a);
    }
    static  void send(int b,String c){
        System.out.println(b+" "+c);
    }
    static  void send(String d,int e){
        System.out.println(d+" "+e);
    }

    public static void main(String[] args) {
        send(10);
        send(10, "hii");
        send("hello", 15);
    }
}

