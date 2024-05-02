import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class VendingTest {

    @Test
    public void testIdleToSelecting() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.changeState();
        assertTrue(vendingMachine.getState() instanceof SelectingState);
    }

    @Test
    public void testIdleToDelivering() {
      VendingMachine vendingMachine = new VendingMachine();
      vendingMachine.changeState(); //toSelecting
      vendingMachine.changeState(); //toDelivering
      assertTrue(vendingMachine.getState() instanceof DeliveringState);
    }
}
