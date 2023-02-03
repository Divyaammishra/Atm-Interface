import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the YOUR ATM");

        System.out.println("Enter your card number");
        int cNum = sc.nextInt();

        System.out.println("Enter your PIN");
        int pin = sc.nextInt();

        System.out.println("Congratulations! You successfully loggedIn into YOUR ATM");

        System.out.println("Choose...");
        System.out.println("1 :- Balance check");
        System.out.println("2 :- Cash withdrawal");
        System.out.println("3 :- Cash Deposit");
        System.out.println("4 :- Change ATM PIN");
        System.out.println("5 :- Bank Transfer");

        int balance = 5000;
        int availableBalance;
        int key = sc.nextInt();

        switch (key)
        {
            case 1:
            {
                System.out.println("Your current balance is :" + balance);
                break;
            }
            case 2:
            {
                System.out.println("Please enter the amount you want :");
                int cw = sc.nextInt();
                if(cw<=balance)
                {
                    System.out.println("Collect your cash");
                    System.out.println("Current balance is :" + (availableBalance = balance-cw));

                }
                else
                {
                    System.out.println("Insufficient balance !");
                }
                break;
            }
            case 3:
            {
                System.out.println("Please enter the amount you want to deposit :");
                int cd = sc.nextInt();

                System.out.println("Your cash has been successfully deposited");
                System.out.println("Current balance is :" + (availableBalance = cd + balance));
                break;
            }
            case 4:
            {
                System.out.println("Please enter new PIN :");
                int newPin = sc.nextInt();

                System.out.println("Your PIN has been changed");
                break;
            }
            case 5:
            {
                System.out.println("Please enter the second person account number :");
                int sA = sc.nextInt();

                System.out.println("Enter the amount you want to transfer :");
                int cT = sc.nextInt();
                {
                    if(cT<=balance)
                    {
                        System.out.println("Please enter your ATM PIN to confirm the money transfer :");
                        int tP = sc.nextInt();

                        System.out.println("The amount has been successfully transferred");
                        System.out.println("Current balance is :" + (availableBalance = balance - cT));
                    }
                    else
                    {
                        System.out.println("Insufficient Balance !");
                    }
                }
                break;
            }
            default:
            {
                System.out.println("Invalid Option !");
                return;
            }
        }


    }
}