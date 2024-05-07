import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void shouldCountboundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1_000);
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }


}
