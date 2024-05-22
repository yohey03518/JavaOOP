package encapsulation.otp;

import java.util.Random;

public class Main1 {
  private static final int MAX_SEND_TIMES = 3;
  private static final int MAX_TRY_TIMES = 3;
  private static int sendTimes;
  private static String lastAnswer;
  private static int tryTimes;

  public static void main(String[] args) {
    if (sendTimes < MAX_SEND_TIMES) {
      sendTimes++;
      int otp = new Random().nextInt(900000) + 100000;
      lastAnswer = String.valueOf(otp);
      System.out.println("OTP sent successfully.");
    } else {
      System.out.println("OTP sending failed. Maximum send times reached.");
    }

    String otp = "123456"; // assume this is the OTP entered by the user
    if (tryTimes >= MAX_TRY_TIMES) {
      System.out.println("OTP verification failed. Maximum try times reached.");
    }
    if (otp.equals(lastAnswer)) {
      System.out.println("OTP verified successfully.");
    } else {
      tryTimes++;
      System.out.println("OTP verification failed.");
    }
  }  
}
