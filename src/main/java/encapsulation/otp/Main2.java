package encapsulation.otp;

public class Main2 {
  public static void main(String[] args) {

//     UserOtp userOtp = new UserOtp();
    UserOtp userOtp = new UserOtp(2);

    userOtp.SendOtp();
    userOtp.VerifyOtp("123456" /* assume this is the OTP entered by the user */);
    
  }  
}
