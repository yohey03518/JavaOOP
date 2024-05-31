package decorator.before;

import java.util.Random;

public class TwilioSmsProvider {
    private final String url;
    private final String authToken;
    private final String accountSid;
    private static int systemSuccessCount;
    private static int systemFailCount;

    public TwilioSmsProvider(String url, String authToken, String accountSid) {

        this.url = url;
        this.authToken = authToken;
        this.accountSid = accountSid;
    }

    public void SendSms(String toMobile, String body) {
        // 1. If mobile number does not start with "+", system needs to add "+"
        if (!toMobile.startsWith("+")) {
            toMobile = "+" + toMobile;
        }
        // 2. If the message is too long, need to split it
        String[] messages;
        if (body.length() > 80) {
            messages = body.split("(?<=\\G.{80})");
        } else {
            messages = new String[]{body};
        }
        for (String message : messages) {
            // 3. If sending fail, system needs to retry 3 times
            // 4. System needs to record total success and fail count
            boolean isSuccess = false;
            for (int i = 0; i < 3; i++) {
                // Use random to simulate send sms sometimes success and sometimes fail
                if (new Random().nextInt(10) > 3) {
                    isSuccess = true;
                    System.out.println("OTP is sent to " + toMobile + " with body: " + message);
                    break;
                }
            }
            if (isSuccess) {
                systemSuccessCount++;
            } else {
                systemFailCount++;
            }
        }

//        for (String message : messages) {
//            // 3. System needs to record total success and fail count
//            // 4. If sending fail, system needs to retry 3 times
//            for (int i = 0; i < 3; i++) {
//                // Use random to simulate send sms sometimes success and sometimes fail
//                if (new Random().nextInt(10) > 3) {
//                    System.out.println("OTP is sent to " + toMobile + " with body: " + message);
//                    systemSuccessCount++;
//                    break;
//                } else {
//                    System.out.println("OTP sending failed.");
//                    systemFailCount++;
//                }
//            }
//        }
    }
}
