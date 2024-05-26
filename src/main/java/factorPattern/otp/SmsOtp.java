package factorPattern.otp;

public class SmsOtp extends BaseOtp {
    public SmsOtp(User user) {
        super(user);
    }

    protected int GetMaxSendTimes() {
        return 3;
    }

    protected int GetMaxTryTimes() {
        return 3;
    }

    protected void SendToUser(User user, String otpAnswer) {
        System.out.println("OTP sent to phone: " + user.GetMobile());
    }
}
