public class RegularUser extends UserType {
    private int activityLevel = 0;
    private static RegularUser regularUser;

    private RegularUser(){

    }

    public static RegularUser getInstance(){
        if (regularUser == null)
            regularUser = new RegularUser();

        return regularUser;
    }

    public void setParameters(String name, String surname, String email, int activityLevel){
        this.name = name;
        this.surName = surname;
        this.email = email;
        this.activityLevel = activityLevel;
    }

    @Override
    public String getUserInfo() {
        return this.name + " " + this.surName + ". Email користувача: " + this.email + ". Рівень користувача: " + this.activityLevel;
    }
}