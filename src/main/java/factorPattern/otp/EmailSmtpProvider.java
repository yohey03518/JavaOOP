package factorPattern.otp;

public class EmailSmtpProvider {
    private final String host;
    private final String port;
    private final String userName;
    private final String password;

    public EmailSmtpProvider(String host, String port, String userName, String password) {
        this.host = host;
        this.port = port;
        this.userName = userName;
        this.password = password;
    }

    public void SendEmail(String toEmail, String body) {
        System.out.println("OTP is sent to " + toEmail + " with body: " + body);
    };
}
