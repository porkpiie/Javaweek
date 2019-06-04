class Bank2{
    private int amount;

    public void deposit (int money){
        amount += money;
    }
    public void withdraw (int money){
        if (money < amount) {
            amount -= money;
        }
        else{
            System.out.println("Not Enough Funds");
        }
    }
    public void balance(){
        System.out.println("Your balance is: " + amount);
    }
    public Bank2(){
        System.out.println("Spend Wisely");
    }
}

public class NBS {
    public static void main(String[] args) {
        Bank ref;
        ref = new Bank();
        ref.deposit(400);
        ref.withdraw(200);
        ref.balance();

    }
}
