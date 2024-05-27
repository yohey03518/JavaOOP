package factorPattern.otp;

public class OtpFactory {
    public BaseOtp Create(User user, String otpType) {
        return switch (otpType) {
            case "email" -> new EmailOtp("10.12.50.11", "25", "otpUser", "1234qwer");
            case "sms" -> new SmsOtp("https://api.twilio.com", "67290H!@*8798==", "dh124as");
            // app
            default -> throw new IllegalArgumentException("Invalid otp type");
        };
    }
}
