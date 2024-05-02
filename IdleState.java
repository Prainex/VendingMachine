public class IdleState implements VendingState {
  
  public void changeState(VendingMachine vendingMachine){
    System.out.println("Selecting...");
    vendingMachine.setState(new SelectingState());
  }
}