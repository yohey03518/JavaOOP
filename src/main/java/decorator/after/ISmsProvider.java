package decorator.after;

public interface ISmsProvider {
    boolean SendSms(String toMobile, String body);
}
