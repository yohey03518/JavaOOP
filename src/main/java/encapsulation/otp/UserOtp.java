package encapsulation.otp;

import java.util.Random;

public class UserOtp {
  private final int MAX_SEND_TIMES = 3;
  private final int MAX_TRY_TIMES = 3;
  private int sendTimes = 0;
  private int tryTimes = 0;
  private String lastAnswer = "";

  public UserOtp() {
    this.sendTimes = 0;
  }

  public UserOtp(int sendTimes) {
    this.sendTimes = sendTimes;
  }

  public void SendOtp() {
    if (sendTimes < MAX_SEND_TIMES) {
      sendTimes++;
      int otp = new Random().nextInt(900000) + 100000;
      lastAnswer = String.valueOf(otp);
      System.out.println("OTP sent successfully.");
    } else {
      System.out.println("OTP sending failed. Maximum send times reached.");
    }
  }

  public boolean VerifyOtp(String otp) {
    if (tryTimes >= MAX_TRY_TIMES) {
      System.out.println("OTP verification failed. Maximum try times reached.");
      return false;
    }
    if (otp.equals(lastAnswer)) {
      System.out.println("OTP verified successfully.");
      return true;
    } else {
      tryTimes++;
      System.out.println("OTP verification failed.");
      return false;
    }
  }

}
