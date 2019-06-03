class Third {
    int phy,che;
    public void message(){
        System.out.println("Hello");
        System.out.println("My Friends");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Third x;
        x = new Third();
        x.phy =75;
        x.message();
    }
}