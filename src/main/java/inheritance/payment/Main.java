package inheritance.payment;

public class Main {
  public static void main(String[] args) {
    Company myCompany = new Company("53670366", "Titansoft Co. Ltd.");
    IPayment[] paymentMethods = new IPayment[] { new LinePay(), new Visa() };

    for (IPayment payment : paymentMethods) {
      if (payment.IsAvailable()) {
        System.out.println("Payment URL: " + payment.GetPaymentUrl(myCompany));
      }
      }
  }
}
