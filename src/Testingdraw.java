abstract class Draw{
    abstract public void drawing();
}

class Line extends Draw{
    public void drawing(){
        System.out.println("Drawing Line");
    }
}

class Circle extends Draw{
    public void drawing(){
        System.out.println("Drawing Circle");
    }

}

public class TestingDraw {
    public static void main(String[] args) {
        Line x = new Line();
        letsDraw(x);
        Circle c = new Circle();
        letsDraw(c);
    }
    public static void letsDraw(Draw d){
        d.drawing();
    }
}
