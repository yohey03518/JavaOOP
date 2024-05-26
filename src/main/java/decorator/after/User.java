package decorator.after;

public class User {
    private final String mobileNumber;
    private final String email;
    private final String language;
    public User (String mobileNumber, String email, String language) {
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.language = language;
    }

    public String GetMobile()
    {
        return mobileNumber;
    }
    public String GetEmail()
    {
        return email;
    }
    public String GetLanguage()
    {
        return language;
    }
}
