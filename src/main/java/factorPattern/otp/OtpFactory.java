package factorPattern.otp;

public class OtpFactory {
    public BaseOtp Create(User user, String otpType) {
        return switch (otpType) {
            case "email" -> new EmailOtp(user);
            case "sms" -> new SmsOtp(user, new TwilioSmsProvider("https://api.twilio.com", "67290H!@*8798==", "dh124as"));
            // app
            default -> throw new IllegalArgumentException("Invalid otp type");
        };
    }
}
