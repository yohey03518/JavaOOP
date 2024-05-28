import decorator.after.ISmsProvider;
import decorator.after.SmsSplit;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class SmsSplitTests {
    @Test
    public void no_need_split(){
        ISmsProvider mock = Mockito.mock(ISmsProvider.class);
        ISmsProvider smsSplit = new SmsSplit(mock);

        smsSplit.SendSms("+1234567890", "short message");

        verify(mock, times(1)).SendSms("+1234567890", "short message");
    }

    @Test
    public void need_split() {
        ISmsProvider mock = Mockito.mock(ISmsProvider.class);
        ISmsProvider smsSplit = new SmsSplit(mock);
        when(mock.SendSms(any(), any())).thenReturn(true);

        smsSplit.SendSms("+1234567890", StringWithLength(SmsSplit.maxLength * 2));

        verify(mock, times(2)).SendSms(any(), any());
    }

    private static String StringWithLength(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append("a");
        }
        return stringBuilder.toString();
    }
}
