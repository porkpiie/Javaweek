class Bank3{
    static int Dollar;

    public void setDollar(int A){
        Dollar=A;
    }
    public void amount(int B){
        System.out.println("Amount is " + (B*Dollar));
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank3 HSBC, NatWest, NBS;
        HSBC = new Bank3();
        NatWest = new Bank3();
        NBS = new Bank3();
        HSBC.setDollar(100);
        NBS.amount(2);
        NBS.setDollar(50);
        NatWest.amount(2);
    }
}
