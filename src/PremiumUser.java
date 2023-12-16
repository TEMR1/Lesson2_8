public class PremiumUser extends UserType {
    private int activityLevel;
    private String status;

    private static PremiumUser premiumUser;
    private RegularUser regularUser = RegularUser.getInstance();

    private PremiumUser(){

    }

    public static PremiumUser getInstance(){
        if (premiumUser == null)
            premiumUser = new PremiumUser();

        return premiumUser;
    }

    public void setParameters(String name, String surname, String email, int activityLevel, String status){
        this.name = name;
        this.surName = surname;
        this.email = email;
        this.activityLevel = activityLevel;
        this.status = status;
    }

    @Override
    public String getUserInfo() {
        return this.name + " " + this.surName + ". Email користувача: " + this.email + ". Рівень користувача: " + this.activityLevel + ". Статус користувача: " + status;
    }
}