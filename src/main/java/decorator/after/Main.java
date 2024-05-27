package decorator.after;

public class Main {
    public static void main(String[] args) {
        String otpType = "sms";
        User user = new User("+886912345678", "myemail@gmail.com", "zh-TW");

        BaseOtp userOtp = new OtpFactory().Create(user, otpType);

        userOtp.Send();

        System.out.println("Sms success rate: " + SmsLog.GetSuccessRate()*100 + "%");
    }
}
