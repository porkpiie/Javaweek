class Nine{
    public void msg1(){
        System.out.println("Hello");
    }
}

class Ten extends Nine{
    public void msg1(){
        System.out.println("Manchester");
    }
}

public class Test00 {
    public static void main(String[] args) {
        Nine ref;
        Nine x;
        ref = new Ten();
        x = new Nine();
        x.msg1();
        ref.msg1();

    }
}
