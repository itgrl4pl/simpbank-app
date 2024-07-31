import java.util.Scanner;

public class bankProg {
  static double balance;
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.println("Welcome to the Bank");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.print("Enter an option: ");
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("Your current balance is $" + balance);
          break;
        case 2:
          System.out.print("Enter the amount to deposit: $");
          balance += scanner.nextDouble();
          System.out.println("Deposit successful.");
          break;
        case 3:
          System.out.print("Enter the amount to withdraw: $");
          double amount = scanner.nextDouble();
          if (amount > balance) {
            System.out.println("Insufficient funds.");
          } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
          }
          break;
        case 4:
          System.out.println("Thank you for banking with us. Have a great day!");
          return;
        default:
          System.out.println("Invalid option. Try again.");
          break;
      }
    }
  }
}
