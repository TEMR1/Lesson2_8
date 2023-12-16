public class BankAccount {
    private UserType user;
    private Currency currency;

    private double interestRate;
    private double creditLimit;
    private double balance;
    public BankAccount(UserType user, Currency currency, double balance){
        this.user = user;
        this.currency = currency;
        this.balance = balance;
    }


//-------------------------------------ACTIONS WITH BALANCE-------------------------------------
    public void deposit(int money){
        balance += money;
        System.out.println(money + " " +  currency.getCode() + " покладено на депозит");
    }

    public void withdraw(int money){
        if (money <= balance){
            balance -= money;
            System.out.println(money + " " + currency.getCode() + " знято з рахунку");
        }
        else
            System.out.println("На вашому рахунку недостатньо коштів для зняття потрібної вам суми!");

    }

    public void convertCurrency(Currency newCurrency){
        double newBalance = balance * (newCurrency.getExchangeRate() / currency.getExchangeRate());
        System.out.println("Баланс конвертовано в " + newCurrency.getCode() + ". Ваш баланс: " + newBalance + " " +  newCurrency.getCode());

        currency = newCurrency;
        balance = newBalance;
    }
//----------------------------------------CHANGER-----------------------------------------

    public void changeCreditLimit(double newLimit){
        creditLimit = newLimit;
        System.out.println("Ліміт кредиту змінено на: " + creditLimit);
    }

    public void changeInterestRate(double newInterestRate){
        interestRate = newInterestRate;
        System.out.println("Процентні ставки зміненно на: " + interestRate);
    }



//-----------------------------------------------INFORMATION--------------------------------------------------------
    public void balanceInfo(){
        System.out.println("Власник акаунта: " + user.getUserInfo());
        System.out.println("Баланс: " + balance + " " +  currency.getCode());
    }
}
