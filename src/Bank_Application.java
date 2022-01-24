import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Bank_Application {

    public static void main(String[] args) {
        bankAccount person1 = new bankAccount("ujjwal","sbin00100");
       person1.showMenu();
    }
  static  class bankAccount
    {

        double balance;
        double previousTransaction;
        String customerName;
        String customerId;
        bankAccount(String cname, String cid){
            this.customerName = cname;
            this.customerId = cid;


        }
        void deposit(double amount) {

            balance = balance + amount;
            previousTransaction = amount;


        }
        void withdraw(double amount) {

            balance = balance - amount;
            previousTransaction  = -amount;

        }
        void getPreviousTransaction(){
            if (previousTransaction>0){
                System.out.println("Money is deposited successfully"+" "+previousTransaction);
            }
            else if (previousTransaction<0){
                System.out.println("Money is withdrawn successfully"+" "+Math.abs(previousTransaction));
            }
            else {
                System.out.println("No transaction occured");
            }

        }

        void showMenu(){
            char option = '\0';
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome "+customerName);
            System.out.println("Your ID is - "+customerId);
            System.out.println("\n");
            System.out.println("A) Check Balance");
            System.out.println("B) Deposit");
            System.out.println("C) Withdraw");
            System.out.println("D) Previous Transaction");
            System.out.println("E) Exit");

            do
            {
                System.out.println("===========================================================================================================================================");
                System.out.println("Enter an option");
                System.out.println("===========================================================================================================================================");
                option = sc.next().charAt(0);
                System.out.println("\n");
                switch (option){
                    case 'A' :
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Balance = "+balance);
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n");
                        break;
                    case 'B' :
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Enter an amount to deposit");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        double amount = sc.nextDouble();
                        deposit(amount);
                        System.out.println("\n");
                        break;

                    case 'C' :
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Enter an amount to withdraw");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        double amount2 = sc.nextDouble();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;

                    case 'D' :
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Your previous transaction is ");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("\n");
                        break;
                    case 'E' :
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        break;


                    default :
                        System.out.println("Invalid option!! Please enter again");
                        break;

                }

            } while(option!='E');
            System.out.println("Thank you for using our service");




        }









    }

    }

