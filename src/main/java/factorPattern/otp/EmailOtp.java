package factorPattern.otp;

public class EmailOtp extends BaseOtp {

    private final String host;
    private final String port;
    private final String userName;
    private final String password;

    public EmailOtp(String host, String port, String userName, String password) {
        this.host = host;
        this.port = port;
        this.userName = userName;
        this.password = password;
    }

    protected int GetMaxSendTimes() {
        return 5;
    }

    protected int GetMaxTryTimes() {
        return 3;
    }

    protected void SendToUser(User user, String otpAnswer) {
        String email = user.GetEmail();
        String emailBody = "Your OTP is " + otpAnswer + ". Please do not reply this email.";

        System.out.println("login to machine " + host + ":" + port + " username:" + userName + " password:" + password);
        System.out.println("Send email to " + email + " with body: " + emailBody);
    }
}
