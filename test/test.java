public class test {
    static int i=0;
    public test() {
        i=i+1;
    }
    static void  afficher(){
        System.out.println("hello");
    }
    public static void main(String[] tutu) {
        
        System.out.println(i);
        afficher();
    }
}
