class Manchester{
    public Manchester(int A){
        System.out.println("This doesn't make sense");
    }
    public Manchester(int A, int B){
        System.out.println("It really doesn't");
    }
}

public class ManchesterTest {
    public static void main(String[] args) {
        Manchester x = new Manchester(9);
        Manchester y = new Manchester(8,7);
    }
}
