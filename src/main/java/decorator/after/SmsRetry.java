package decorator.after;

public class SmsRetry implements ISmsProvider {
    private final ISmsProvider smsProvider;
    private final static int maxRetry = 3;

    public SmsRetry(ISmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public boolean SendSms(String toMobile, String body) {
        System.out.println("SmsRetry Start");
        // 4. If sending fail, system needs to retry
        for (int i = 0; i < maxRetry; i++) {
            if (smsProvider.SendSms(toMobile, body)) {
                System.out.println("SmsRetry End");
                return true;
            } else {
                System.out.println("Send fail. " + (i == maxRetry - 1 ? "Max retry reached." : "Retrying..."));
            }
        }
        System.out.println("SmsRetry End");
        return false;
    }
}
