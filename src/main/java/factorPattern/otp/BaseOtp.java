package factorPattern.otp;

import java.util.Random;

public abstract class BaseOtp {
  protected abstract int GetMaxSendTimes();
  protected abstract int GetMaxTryTimes();
  protected abstract void SendToUser(User user, String otpAnswer);

  private int sendTimes = 0;
  private int tryTimes = 0;
  private String lastAnswer = "";

  public void Send(User user) {
    if (sendTimes < GetMaxSendTimes()) {
      sendTimes++;
      int otp = new Random().nextInt(900000) + 100000;
      lastAnswer = String.valueOf(otp);
      SendToUser(user, lastAnswer);

      System.out.println("OTP sent successfully.");
    } else {
      System.out.println("OTP sending failed. Maximum send times reached.");
    }
  }

  public boolean VerifyOtp(String otp) {
    if (tryTimes >= GetMaxTryTimes()) {
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
