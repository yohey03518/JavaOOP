package factoryPattern.otp;

public class Main1 {
    public static void main(String[] args) {
//        String otpType = "email";
        String otpType = args[0];
        User user = new User("+886912345678", "myemail@gmail.com", "zh-TW");

        BaseOtp userOtp = switch (otpType) {
            case "email" -> new EmailOtp(user
                    , new EmailSmtpProvider("10.12.50.11", "25", "otpUser", "1234qwer"));
            case "sms" -> new SmsOtp(user
                    , new TwilioSmsProvider("https://api.twilio.com", "67290H!@*8798==", "dh124as"));
            // more option: app, phone, etc.
            default -> throw new IllegalArgumentException("Invalid otp type");
        };

        userOtp.Send();
        userOtp.Send();
        userOtp.Send();

        userOtp.VerifyOtp("123456");
        userOtp.VerifyOtp("123456");
        userOtp.VerifyOtp("123456");
        userOtp.VerifyOtp("123456");
    }
}
