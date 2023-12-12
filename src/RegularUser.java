public class RegularUser extends UserType{
    User user;

    private int activityLevel = 0;

    RegularUser(String name, String surname, String email, int activityLevel){
        super(name,surname,email);
        this.activityLevel = activityLevel;
    }


    @Override
    public void userInfo(User user) {
        System.out.println("Звичайний користувач: " + user.getName() + " " + user.getSurName() + ". Email користувача: " + user.getEmail());
    }
}