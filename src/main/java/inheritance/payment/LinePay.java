package inheritance.payment;

public class LinePay implements IPayment {
  public String GetPaymentUrl(Company myCompany) {
    return "https://line.com/" + myCompany.GetCompanyId();
  }
  public boolean IsAvailable() {
    return true;
  }
}
