public class Operations {
    public static void main(String[] args) {
        double a, b, c;
        a = b = c = 0;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = a / b;
            System.out.println("Result:" + c);
        } catch (NumberFormatException E) {
            System.out.println("Please enter a whole number within the Integer range..");
        } catch (ArithmeticException E) {
            System.out.println("Cannot Divide by Zero..");
        } catch (ArrayIndexOutOfBoundsException E) {
            System.out.println("Not enough values entered...");
        }
    }
}
