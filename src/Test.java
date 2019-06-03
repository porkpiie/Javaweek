class Second {
    int x;
    int y;
}

public class Test{
    public static void main(String[] args) {
        Second ref;
    ref = new Second();
    ref.x=15;
    ref.y=20;
        System.out.println(ref.x + ref.y);
    }
}