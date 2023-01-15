import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //create user
        System.out.println("Enter 1 to open SBI account, Enter 2 to open HDFC account");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your password");
        String password = sc.nextLine();
        System.out.println("Enter your balance");
        double balance = sc.nextDouble();
        if(choice==1) {
            SBIUser user = new SBIUser(name, balance, password);
            System.out.println("Account number of new SBI account is " + user.getAccountNo());
            user.setBalance(balance);

            while(true) {
                System.out.println("1.Deposit money, 2.Withdraw money, 3.Check Interest of 10 years, 4.Exit");
                int c = sc.nextInt();
                if(c==1) {
                    //add amount
                    System.out.println("Enter amount to add");
                    System.out.println(user.addMoney(sc.nextInt()));
                }
                else if(c==2) {
                    //withdraw Money
                    System.out.println("Enter amount you want to withdraw");
                    int money = sc.nextInt();
                    System.out.println("Enter your password");
                    sc.nextLine();
                    String pass = sc.nextLine();
                    System.out.println(user.withdrawMoney(money, pass));
                }
                else if(c==3) {
                    //rate of interest
                    System.out.println("Interest for 10 years on " + user.getBalance() + " is " + user.calculateInterest(10));
                }
                else if(c==4) break;
                else System.out.println("Wrong choice");
            }
        }
        else if(choice==2){
            HDFCUser user = new HDFCUser(name, balance, password);
            System.out.println("Account number of new HDFC account is " + user.getAccountNo());
            user.setBalance(balance);

            while(true) {
                System.out.println("1.Deposit money, 2.Withdraw money, 3.Check Interest of 10 years, 4.Exit");
                int c = sc.nextInt();
                if(c==1) {
                    //add amount
                    System.out.println("Enter amount to add");
                    System.out.println(user.addMoney(sc.nextInt()));
                }
                else if(c==2) {
                    //withdraw Money
                    System.out.println("Enter amount you want to withdraw");
                    int money = sc.nextInt();
                    System.out.println("Enter your password");
                    sc.nextLine();
                    String pass = sc.nextLine();
                    System.out.println(user.withdrawMoney(money, pass));
                }
                else if(c==3) {
                    //rate of interest
                    System.out.println("Interest for 10 years on " + user.getBalance() + " is " + user.calculateInterest(10));
                }
                else if(c==4) break;
                else System.out.println("Wrong choice");
            }
        }
        else System.out.println("Wrong choice");
    }
}