package decorator.after;

public class SmsValidator implements ISmsProvider {
    private final ISmsProvider smsProvider;

    public SmsValidator(ISmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public boolean SendSms(String toMobile, String body) {
        System.out.println("SmsValidator Start");
        // 1. If mobile number does not start with "+", system needs to add "+"
        if (!toMobile.startsWith("+")) {
            boolean isSuccess = smsProvider.SendSms("+" + toMobile, body);
            System.out.println("SmsValidator End");
            return isSuccess;
        }

        boolean isSuccess = smsProvider.SendSms(toMobile, body);
        System.out.println("SmsValidator End");
        return isSuccess;
    }
}
