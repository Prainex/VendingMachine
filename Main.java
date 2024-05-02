public class Main {
  public static void main(String[] args) {
    
    VendingMachine vendingMachine = new VendingMachine();

    System.out.println(vendingMachine.getState());
    vendingMachine.setState(new IdleState());
    System.out.println(vendingMachine.getState());
    vendingMachine.setState(new SelectingState());
    System.out.println(vendingMachine.getState());
    vendingMachine.setState(new DeliveringState());
    System.out.println(vendingMachine.getState());    
  }
}