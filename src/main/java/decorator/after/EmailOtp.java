package decorator.after;

public class EmailOtp extends BaseOtp {

    private final EmailSmtpProvider provider;

    public EmailOtp(User user, EmailSmtpProvider provider){
        super(user);
        this.provider = provider;
    }

    protected int GetMaxSendTimes() {
        return 5;
    }

    protected int GetMaxTryTimes() {
        return 3;
    }

    protected void SendToUser(User user, String otpAnswer) {
        System.out.println("OTP sent to email: " + user.GetEmail());
        provider.SendEmail(user.GetEmail(), "Your OTP is " + otpAnswer + ". Please do not reply this email.");
    }
}
