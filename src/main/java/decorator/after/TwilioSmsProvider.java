package decorator.after;

import java.util.Random;

public class TwilioSmsProvider implements ISmsProvider {
    private final String url;
    private final String authToken;
    private final String accountSid;

    public TwilioSmsProvider(String url, String authToken, String accountSid) {

        this.url = url;
        this.authToken = authToken;
        this.accountSid = accountSid;
    }

    public boolean SendSms(String toMobile, String body) {
        // Use random to simulate send sms sometimes success and sometimes fail
        if (new Random().nextInt(10) > 3) {
            System.out.println("OTP is sent to " + toMobile + " with body: " + body);
            return true;
        } else {
            System.out.println("OTP sending failed.");
            return false;
        }
    }
}
