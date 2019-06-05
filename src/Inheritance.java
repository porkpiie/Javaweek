class Maths4 {
    public void add(int A, int B){
        int result = A + B;
        System.out.println("Addition Result is: " + result);
    }
    public void subtraction(int A, int B){
        System.out.println(A - B);
    }
}

class Maths5 extends Maths4{
    public void multiplication(int x, int y){
        System.out.println("Multiplication Result is: " + (x*y));
    }
    public void subtraction(int x, int y){
        System.out.println("Subtraction Result is: " + (x-y));
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Maths5 x = new Maths5();
        x.multiplication(69, 10);
        x.subtraction(99,15);
        x.add(88,73);
    }
}
