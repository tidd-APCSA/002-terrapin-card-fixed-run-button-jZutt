public class TerrapinCard {
  private double balance;
  public TerrapinCard() {
    balance = 0;
  }
  public TerrapinCard(double balance) {
    this.balance = balance;
  }
  public void payEconomical() {
    balance -= 2.5 <= balance ? 2.5 : 0;
  }
  public void payGourmet() {
    balance -= 4 <= balance ? 4 : 0;
  }
  public void loadMoney(double amount) {
    balance += amount < 0 ? 0 : amount + balance > 150 ? 150 - balance : amount;
  }
  public double getBalance() {
    return balance;
  }
  public String toString() {
    return "The card has " + balance + " dollars";
  }
}