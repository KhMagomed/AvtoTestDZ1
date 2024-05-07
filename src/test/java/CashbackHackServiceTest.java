import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void shouldCountboundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1_200);
        int expected = 800;
        Assert.assertEquals(actual, expected);

    }


}
