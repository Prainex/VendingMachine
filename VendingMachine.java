public class VendingMachine {
  private VendingState currentState;

  public VendingMachine(){
    this.currentState = new IdleState();
  }

  public void setState(VendingState state){
    this.currentState = state;
  }

  public VendingState getState(){
    return this.currentState;
  }
  
  public void changeState(){
    currentState.changeState(this);
  }
}