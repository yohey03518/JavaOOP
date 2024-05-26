package decorator.after;

public class SmsRetry implements ISmsProvider {
    private final ISmsProvider smsProvider;
    private final static int maxRetry = 3;

    public SmsRetry(ISmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public boolean SendSms(String toMobile, String body) {
        // 4. If sending fail, system needs to retry
        for (int i = 0; i < maxRetry; i++) {
            if (smsProvider.SendSms(toMobile, body)) {
                return true;
            }
        }
        return false;
    }
}
