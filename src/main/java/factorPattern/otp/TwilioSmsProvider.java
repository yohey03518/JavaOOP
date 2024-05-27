package factorPattern.otp;

public class TwilioSmsProvider {
    private final String url;
    private final String authToken;
    private final String accountSid;

    public TwilioSmsProvider(String url, String authToken, String accountSid) {

        this.url = url;
        this.authToken = authToken;
        this.accountSid = accountSid;
    }

    public void SendSms(String toMobile, String body) {
        System.out.println("OTP is sent to " + toMobile + " with body: " + body);
    }
}
