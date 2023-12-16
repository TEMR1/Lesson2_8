public abstract class UserType extends User {
    public UserType (String name, String surName, String email) {
        super(name, surName, email);
    }

    public UserType() {

    }

    public abstract String getUserInfo();
}
