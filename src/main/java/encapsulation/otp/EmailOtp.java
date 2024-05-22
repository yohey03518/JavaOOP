package encapsulation.otp;

public class EmailOtp extends BaseOtp {
  protected int GetMaxSendTimes() {
    return 5;
  }

  protected int GetMaxTryTimes() {
    return 3;
  }
}
