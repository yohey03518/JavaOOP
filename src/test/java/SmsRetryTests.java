import decorator.after.ISmsProvider;
import decorator.after.SmsRetry;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class SmsRetryTests {
    @Test
    public void send_success() {
        ISmsProvider mock = Mockito.mock(ISmsProvider.class);
        ISmsProvider smsRetry = new SmsRetry(mock);
        when(mock.SendSms(any(), any())).thenReturn(true);

        boolean isSuccess = smsRetry.SendSms("+1234567890", "message");

        verify(mock, times(1)).SendSms("+1234567890", "message");
        assertTrue(isSuccess);
    }

    @Test
    public void send_always_fail() {
        ISmsProvider mock = Mockito.mock(ISmsProvider.class);
        ISmsProvider smsRetry = new SmsRetry(mock);
        when(mock.SendSms(any(), any())).thenReturn(false);

        boolean isSuccess = smsRetry.SendSms("+1234567890", "message");

        verify(mock, times(SmsRetry.maxRetry)).SendSms("+1234567890", "message");
        assertFalse(isSuccess);
    }

    @Test
    public void send_fail_then_retry_success() {
        ISmsProvider mock = Mockito.mock(ISmsProvider.class);
        ISmsProvider smsRetry = new SmsRetry(mock);
        when(mock.SendSms(any(), any())).thenReturn(false).thenReturn(true);

        boolean isSuccess = smsRetry.SendSms("+1234567890", "message");

        verify(mock, times(2)).SendSms("+1234567890", "message");
        assertTrue(isSuccess);
    }
}
