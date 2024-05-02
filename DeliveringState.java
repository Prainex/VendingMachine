public class DeliveringState implements VendingState {

  public void changeState(VendingMachine vendingMachine) {
    System.out.println("Thank you for your purchase! Select an Item...");
    vendingMachine.setState(new IdleState());
  }
}