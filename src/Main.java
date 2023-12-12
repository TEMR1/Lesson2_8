public class Main {
    public static void main(String[] args) {
        Currency firstCurrency = new Currency("UAH", 2);
        Currency secondCurrency = new Currency("USD", 5);

        User firstUser = new User("Danylo", "Shpak", "danylo.shpak.2009@gmail.com");
        User secondUser = new User("Petro", "Koval", "petro.koval.2010@gmail.com");

        BankAccount firstAccount = new BankAccount(firstUser,firstCurrency,1000);
        BankAccount secondAccount = new BankAccount(secondUser,secondCurrency,10000);

        firstAccount.changeCreditLimit(1000);
        firstAccount.deposit(2000);
        firstAccount.withdraw(10000);
        firstAccount.changeInterestRate(4);
        firstAccount.convertCurrency(firstCurrency);
        firstAccount.balanceInfo();

        System.out.println("------------------------------------------------");

        secondAccount.changeCreditLimit(2000);
        secondAccount.deposit(500);
        secondAccount.withdraw(3000);
        secondAccount.changeInterestRate(10);
        secondAccount.convertCurrency(secondCurrency);
        secondAccount.balanceInfo();
    }
}
