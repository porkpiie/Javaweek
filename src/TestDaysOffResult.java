class AbsenteesException extends Exception {
    public AbsenteesException(String message) {
        super(message);
    }
}

class accountsNBS {
    public double Tax(int salary, int Absences) throws AbsenteesException {

        if (Absences >= 5) {
            AbsenteesException F = new AbsenteesException("Too many absences..");
            throw F;
        }
        return salary * 20 / 100;
    }
}

class AccountsHR {
    public void SalarySlip2() throws AbsenteesException {
        accountsNBS x = new accountsNBS();
        try{
            double NetSalary = 2000 - x.Tax(2000, 7);
        }
        catch (AbsenteesException E) {
            System.out.println("HR: Sorry too many absences");
        }
    }
}

class AccountsIT {
    public void SalarySlip() throws AbsenteesException {
        accountsNBS x = new accountsNBS();
        try {
            double NetSalary = 2000 - x.Tax(3000, 6);
        } catch (AbsenteesException E) {
            System.out.println("IT: You have had too many days off..");
        }
    }
}

public class TestDaysOffResult {
    public static void main(String[] args) throws AbsenteesException {
        AccountsIT one;
        one = new AccountsIT();
        AccountsHR two;
        two = new AccountsHR();
        one.SalarySlip();
        two.SalarySlip2();

    }
}