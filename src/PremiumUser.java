public class PremiumUser extends UserType {
    private int activityLevel = 0;

    public PremiumUser(String name, String surname, String email) {
        super(name, surname, email);
    }


    @Override
    public void userInfo(User user) {
        System.out.println("Преміум користувач: " + user.getName() + " " + user.getSurName() + ". Email користувача: " + user.getEmail());
    }
}