public class User {
    private String name;
    private String surName;
    private String email;


    public User (String name, String surName, String email){
        this.name = name;
        this.surName = surName;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }
}
