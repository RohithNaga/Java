package practisePrograms;

class bankaccount {
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println(amount + " deposited successfully");
        } else {
            System.out.println("invalid amount of deposit");
        }
    }
    public void withdraw(int amount) {
        if(amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println(amount + " withdraw successfully");
        } else {
            System.out.println("insufficient funds or invalid amount entered");
        }
    }

    public int getbalance() {
        return this.balance;
    }

}
public class encapsulation {
    public static void main(String[] args) {
        bankaccount person = new bankaccount();
        person.setBalance(1000000000);
        System.out.println("the intial balance: " + person.getbalance());

        person.deposit(9500000);
        System.out.println("current balance: " + person.getbalance());

        person.withdraw(500000);
        System.out.println("current balance: " + person.getbalance());

        person.deposit(400000);
        System.out.println("current balance: " + person.getbalance());

    }
}
