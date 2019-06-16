class Maths{
    public void addition(int a, int b){
        int result = a + b;
        System.out.println("Result: " + result);
    }
    public int subtraction(int a, int b){
        int answer = a - b;
        return answer;
    }
}

public class SimpleMathematics {
    public static void main(String[] args) {
        Maths x;
        x = new Maths();
        x.addition(2,10);
        System.out.println("Result is: " + x.subtraction(100,87));
    }
}
