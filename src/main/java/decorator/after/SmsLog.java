package decorator.after;

public class SmsLog implements ISmsProvider {
    private final ISmsProvider smsProvider;
    private static int systemFailCount;
    private static int systemSuccessCount;

    public SmsLog(ISmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public boolean SendSms(String toMobile, String body) {
        System.out.println("SmsLog Start");
        // 4. System needs to record total success and fail count
        boolean isSuccess = smsProvider.SendSms(toMobile, body);
        if (isSuccess) {
            systemSuccessCount++;
        } else {
            systemFailCount++;
        }
        System.out.println("SmsLog End");
        return isSuccess;
    }

    public static double GetSuccessRate() {
        return (double) systemSuccessCount / (systemSuccessCount + systemFailCount);
    }
}
