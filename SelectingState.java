public class SelectingState implements VendingState {
  
  public void changeState(VendingMachine vendingMachine){
    System.out.println("Delivering...");
    vendingMachine.setState(new DeliveringState());
  }
}