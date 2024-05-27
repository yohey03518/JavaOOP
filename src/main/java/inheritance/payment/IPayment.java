package inheritance.payment;

public interface IPayment {
    public String GetPaymentUrl(Company myCompany);
    public boolean IsAvailable();
}