package factorPattern.otp;

public class OtpFactory {
    public BaseOtp Create(User user, String otpType) {
        return switch (otpType) {
            case "email" -> new EmailOtp(user);
            case "sms" -> new SmsOtp(user);
            // app
            default -> throw new IllegalArgumentException("Invalid otp type");
        };
    }
}
