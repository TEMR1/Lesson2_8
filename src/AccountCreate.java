interface AccountCreate {
    User createUser(String name, String surname, String email);
    Currency createCurrency (String code, double exchangeRate);
}
