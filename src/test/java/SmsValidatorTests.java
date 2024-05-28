import decorator.after.ISmsProvider;
import decorator.after.SmsValidator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class SmsValidatorTests {
    @Test
    public void call_to_decorate() {
        ISmsProvider mock = Mockito.mock(ISmsProvider.class);
        ISmsProvider smsValidator = new SmsValidator(mock);

        smsValidator.SendSms("+1234567890", "Hello World");

        verify(mock, times(1)).SendSms(any(), any());
    }

    @Test
    public void send_sms_with_correct_mobile_format() {
        ISmsProvider mock = Mockito.mock(ISmsProvider.class);
        ISmsProvider smsValidator = new SmsValidator(mock);

        smsValidator.SendSms("1234567890", "Hello World");

        verify(mock).SendSms("+1234567890", "Hello World");



//        ISmsProvider smsProviderDecorate = new ISmsProvider() {
//            @Override
//            public boolean SendSms(String toMobile, String body) {
//                return true;
//            }
//        };
    }

}
