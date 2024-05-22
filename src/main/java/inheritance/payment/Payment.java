package inheritance.payment;

public interface Payment {
    public String GetPaymentUrl(Company myCompany);
    public boolean IsAvailable();
}