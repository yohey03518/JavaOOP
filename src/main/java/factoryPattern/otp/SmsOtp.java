package factoryPattern.otp;

public class SmsOtp extends BaseOtp {
    private final TwilioSmsProvider provider;

    public SmsOtp(User user, TwilioSmsProvider provider) {
        super(user);
        this.provider = provider;
    }

    protected int GetMaxSendTimes() {
        return 3;
    }

    protected int GetMaxTryTimes() {
        return 3;
    }

    protected void SendToUser(User user, String otpAnswer) {
        System.out.println("OTP sent to phone: " + user.GetMobile());
        provider.SendSms(user.GetMobile(), "Your OTP is " + otpAnswer + ". Thanks for using our service.");
    }
}
