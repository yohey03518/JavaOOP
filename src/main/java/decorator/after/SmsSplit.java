package decorator.after;

public class SmsSplit implements ISmsProvider {
    private final ISmsProvider smsProvider;
    public static final int maxLength = 80;

    public SmsSplit(ISmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public boolean SendSms(String toMobile, String body) {
        System.out.println("SmsSplit Start");
        // 2. If the message is too long, need to split it
        String[] messages;
        if (body.length() > maxLength) {
            messages = body.split("(?<=\\G.{" + maxLength + "})");
        } else {
            messages = new String[]{body};
        }
        for (String message : messages) {
            if (!smsProvider.SendSms(toMobile, message)) {
                System.out.println("SmsSplit End");
                return false;
            }
        }
        System.out.println("SmsSplit End");
        return true;
    }
}
