package factorPattern.otp;

public class EmailOtp extends BaseOtp {

    public EmailOtp(User user){
        super(user);
    }

    protected int GetMaxSendTimes() {
        return 5;
    }

    protected int GetMaxTryTimes() {
        return 3;
    }

    protected void SendToUser(User user, String otpAnswer) {
        System.out.println("OTP sent to email: " + user.GetEmail());
    }
}
