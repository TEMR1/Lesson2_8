public class AccountCreateManager implements AccountCreate{
    @Override
    public User createUser(String name, String surname, String email) {
        return new User(name,surname,email);
    }

    @Override
    public Currency createCurrency(String code, double exchangeRate) {
        return new Currency(code,exchangeRate);
    }
}
