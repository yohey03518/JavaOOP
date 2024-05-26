package decorator.after;

public class SmsLog implements ISmsProvider {
    private final ISmsProvider smsProvider;
    private static int systemFailCount;
    private static int systemSuccessCount;

    public SmsLog(ISmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public boolean SendSms(String toMobile, String body) {
        // 3. System needs to record total success and fail count
        boolean isSuccess = smsProvider.SendSms(toMobile, body);
        if (isSuccess) {
            systemSuccessCount++;
        } else {
            systemFailCount++;
        }
        return isSuccess;
    }

    public static double GetSuccessRate() {
        return (double) systemSuccessCount / (systemSuccessCount + systemFailCount);
    }
}
