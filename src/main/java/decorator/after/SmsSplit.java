package decorator.after;

public class SmsSplit implements ISmsProvider {
    private final ISmsProvider smsProvider;

    public SmsSplit(ISmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public boolean SendSms(String toMobile, String body) {
        // 2. If the message is too long, need to split it
        String[] messages;
        if (body.length() > 80) {
            messages = body.split("(?<=\\G.{80})");
        } else {
            messages = new String[]{body};
        }
        for (String message : messages) {
            if (!smsProvider.SendSms(toMobile, message)) {
                return false;
            }
        }
        return true;
    }
}
