class Accounts{
    public void tax(){
        System.out.println("Tax Rate is: " + 22.7);
    }
    public void tax(int salary){
        double t;
        t = salary*22.7/100;
        System.out.println("Your Tax is" + t);
    }
    public void tax(int salary, float tax_rate){
        float t;
        t=salary*tax_rate/100;
        System.out.println("Your tax is" + t);
    }
}


public class AccountsTest {
    public static void main(String[] args) {
        Accounts ref = new Accounts();
        ref.tax();
        ref.tax(2000);
        ref.tax(2000,19);
    }
}
