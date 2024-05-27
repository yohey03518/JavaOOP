package factorPattern.otp;

public class SmsOtp extends BaseOtp {
    private final String url;
    private final String authToken;
    private final String accountSid;

    public SmsOtp(String url, String authToken, String accountSid) {

        this.url = url;
        this.authToken = authToken;
        this.accountSid = accountSid;
    }

    protected int GetMaxSendTimes() {
        return 3;
    }

    protected int GetMaxTryTimes() {
        return 3;
    }

    protected void SendToUser(User user, String otpAnswer) {
        String mobile = user.GetMobile();
        String content = "Your OTP is " + otpAnswer + ". Thanks for using our service.";

        System.out.println("Call API to " + url + " with accountSid:" + accountSid + " authToken:" + authToken);
        System.out.println("Send SMS to " + mobile + " with content: " + content);
    }
}
