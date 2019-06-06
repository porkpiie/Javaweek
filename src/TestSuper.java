class Ninth {
    public Ninth() {
        System.out.println(7);
    }
}

class Eigth extends Ninth {
    public Eigth() {
        super();
        System.out.println(6);
    }
}

class One extends Eigth{
    public One(){
        super();
        System.out.println(1);
    }
}

class Two extends One{
    public Two(int A) {
        super();
        System.out.println(2);
    }
    public Two(){
        super();
        System.out.println(3);
    }
}


public class TestSuper{
    public static void main(String[] args) {
        Two x = new Two(7);
    }
}
