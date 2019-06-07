public class Exceptions1 {
    public static void main(String[] args) {
        int a, b, c;
        a=b=c=0;
        try{
            a = 4;
            b = 0;
            c = a / b;
            System.out.println("Result" + c);
        }
        catch (ArithmeticException Exc1) {
            System.out.println("You cannot divide by zero, muppet");
        }
    }
}
