package decorator.after;

public class SmsValidator implements ISmsProvider {
    private final ISmsProvider smsProvider;

    public SmsValidator(ISmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public boolean SendSms(String toMobile, String body) {
        // 1. If mobile number does not start with "+", system needs to add "+"
        if (!toMobile.startsWith("+")) {
            return smsProvider.SendSms("+" + toMobile, body);
        }

        return smsProvider.SendSms(toMobile, body);
    }
}
