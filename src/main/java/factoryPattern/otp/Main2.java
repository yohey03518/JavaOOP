package factoryPattern.otp;

public class Main2 {
    public static void main(String[] args) {
        String otpType = "sms";
        User user = new User("+886912345678", "myemail@gmail.com", "zh-TW");

        BaseOtp userOtp = new OtpFactory().Create(user, otpType);

        userOtp.Send();
        userOtp.Send();
        userOtp.Send();

        userOtp.VerifyOtp("123456");
        userOtp.VerifyOtp("123456");
        userOtp.VerifyOtp("123456");
        userOtp.VerifyOtp("123456");
    }
}
