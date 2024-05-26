package decorator.after;

public class OtpFactory {
    public BaseOtp Create(User user, String otpType) {
        return switch (otpType) {
//            case "email" -> new EmailOtp(user, new EmailSmtpProvider("10.12.50.11", "25", "otpUser", "1234qwer"));
//            case "sms" -> new SmsOtp(user, new TwilioSmsProvider("https://api.twilio.com", "67290H!@*8798==", "dh124as"));
//            // app
//            default -> throw new IllegalArgumentException("Invalid otp type");
            case "email" -> new EmailOtp(user, new EmailSmtpProvider("10.12.50.11", "25", "otpUser", "1234qwer"));
            case "sms" -> new SmsOtp(user,
                    new SmsValidator(
                            new SmsSplit(
                                    new SmsRetry(
                                            new SmsLog(
                                                    new TwilioSmsProvider("https://api.twilio.com", "67290H!@*8798==", "dh124as")
                                            )
                                    )
                            )
                    )
            );
            // app
            default -> throw new IllegalArgumentException("Invalid otp type");

        };
    }
}
