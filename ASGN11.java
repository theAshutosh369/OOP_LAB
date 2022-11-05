// case study
// operations on bank account

package oopl_or_oopc;

import java.util.Scanner;
class Bank_account
{
    String name , acc_type;
    int acc_id, age;
    long acc_balance;
    Scanner s = new Scanner(System.in);
    public void create_acc()
    {
        System.out.println("---------------------------------------------");

        System.out.print("enter your name        :");
        name = s.nextLine();
        System.out.print("enter your age         :");
        age = s.nextInt();
        do{
            if(age<18)
            {
                System.out.println("enter valid age ! you can create account only if your age is above 18 ");
                age =s.nextInt();
            }
        }while(age<18);
        System.out.print("enter account id       :");
        acc_id = s.nextInt();
        System.out.print("enter account type     :");
        acc_type = s.next();
        System.out.print("enter account balance  :");
        acc_balance = s.nextLong();
    }
    public void display_acc()
    {
        System.out.println("-----------------------------------------");
        System.out.println("name                 :"+name );
        System.out.println("age                  :"+age );
        System.out.println("account id           :"+acc_id );
        System.out.println("account type         :"+acc_type );
    }
    public void check_bal()
    {
        System.out.println("------------------------------------");
        System.out.println("account balance      :"+acc_balance );
    }
    public void deposit_bal()
    {
        System.out.println("-------------------------------------");
        System.out.print("enter the amount you want to deposit :");

        int deposit =s.nextInt();
        acc_balance= acc_balance+deposit;
        System.out.println("your amount is deposited ");
        System.out.println("now your total account balance is - "+acc_balance);

    }
    public void withdraw_bal()
    {
        System.out.println("-------------------------------------");
        System.out.print("enter the amount you want to withdraw :");
        Scanner s = new Scanner(System.in);
        int withdraw = s.nextInt();
        acc_balance= acc_balance-withdraw;
        System.out.println("your amount is withdrew ");
        System.out.println("now your total account balance is - "+acc_balance);

    }

}

public class ASGN11 {
    public static void main(String[] args)
    {

        int ch =0;
        Bank_account ba = new Bank_account();


        while (ch != 6)
        {
            Scanner f = new Scanner(System.in);
            System.out.println("---------------------------------------------------");
            System.out.println(" 1. create account \n 2. display account \n 3. check balance \n 4. deposit balance \n 5. withdraw balance \n 6. exit  ");
            System.out.println("---------------------------------------------------");
            System.out.print("enter the choice : ");
            ch = f.nextInt();
            switch (ch) {
                case 1:
                    ba.create_acc();
                    break;
                case 2:
                    ba.display_acc();
                    break;
                case 3:
                    ba.check_bal();
                    break;
                case 4:
                    ba.deposit_bal();
                    break;
                case 5:
                    ba.withdraw_bal();
                    break;
                case 6:
                    System.out.println("end of the program !");
                    break;
                default:
                    System.out.println(" enter the valid choice !");
                    break;
            }
        }
    }
}
