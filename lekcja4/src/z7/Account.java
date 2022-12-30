package z7;
//7
public class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public void credit(double kw){
        balance += kw;
        System.out.println("Wpłacono "+kw+"zł");
    }
    public void debit(double kw){
        if(kw <= balance){
            balance -= kw;
            System.out.println("Wypłacono "+kw+"zł");
        }
        else {
            System.out.println("Niemozesz wypłacić tyle pieniędzy");
        }
    }
    public void transferTo(double kw, Account nazwaa){
        if(kw <= balance){
            balance -= kw;
            System.out.println("Przelano "+kw+"zł");
            nazwaa.balance += kw;
        }
        else {
            System.out.println("Niemozesz przelac takiej kwoty pieniędzy");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
