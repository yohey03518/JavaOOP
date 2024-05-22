package encapsulation.otp;

public class Main3 {
  public static void main(String[] args) {
    String otpType = "sms"; // simulate selected otp type
    switch (otpType) {
      case "sms":
        new SmsOtp().SendOtp();
        break;
      case "email":
        new EmailOtp().SendOtp();
        break;
      default:
        System.out.println("Invalid OTP type");
        break;
    }
  }
}
