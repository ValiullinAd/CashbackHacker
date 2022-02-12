import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

   @Test
    public void shouldRemain900() {
       CashbackHackService cashbackHackService = new CashbackHackService();
       int amount = 900;

       int actual = cashbackHackService.remain(amount);
       int expected = 100;

       assertEquals(expected, actual);
   }
    @Test
    public void shouldRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}