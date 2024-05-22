package encapsulation.otp;

import java.util.Random;

public abstract class BaseOtp {
  protected abstract int GetMaxSendTimes();
  protected abstract int GetMaxTryTimes();

  private int sendTimes = 0;
  private int tryTimes = 0;
  private String lastAnswer = "";

  public void SendOtp() {
    if (sendTimes < GetMaxSendTimes()) {
      sendTimes++;
      int otp = new Random().nextInt(900000) + 100000;
      lastAnswer = String.valueOf(otp);
      // send OTP to real mobile number or email
      System.out.println("OTP sent successfully.");
    } else {
      System.out.println("OTP sending failed. Maximum send times reached.");
    }
  }

  public boolean VerifyOtp(String otp) {
    if (tryTimes >= GetMaxSendTimes()) {
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
