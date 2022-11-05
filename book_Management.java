package oopl_or_oopc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class books
{
    Scanner d = new Scanner(System.in);
    int id[] = new int[20];
    String name[] = new String[20];
    books(){
        for(int i=0;i<20;i++)
        {
            id[i]=i;
        }
        name[0] = "the god of small things ";
        name[1] = "a suitable boy ";
        name[2] = "the white tiger ";
        name[3] = "the inheritance of loss ";
        name[4] = "the great indian novel ";

        name[5] = "the god of small things ";
        name[6] = "a suitable boy ";
        name[7] = "the white tiger ";
        name[8] = "the inheritance of loss ";
        name[9] = "the great indian novel ";

        name[10] = "the god of small things ";
        name[11] = "a suitable boy ";
        name[12] = "the white tiger ";
        name[13] = "the inheritance of loss ";
        name[14] = "the great indian novel ";

        name[15] = "the god of small things ";
        name[16] = "a suitable boy ";
        name[17] = "the white tiger ";
        name[18] = "the inheritance of loss ";
        name[19] = "the great indian novel ";
    }
    void historical_books()
    {

    }
    void comic_book()
    {

    }
    void novel()
    {
        System.out.println("-----------------------------------------");
        File fn = new File("novel.txt");
        try {
            if(fn.createNewFile())
            {
                System.out.println("the novels :");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("novel.txt");
            String nd =
                    "NOVEL ID \t NOVEL NAME \n " +
                            " 10      \t the god of small things \n " +
                            " 11      \t a suitable boy \n " +
                            " 12      \t the white tiger \n " +
                            " 13      \t the inheritance of loss \n " +
                            " 14      \t the great indian novel ";
            fileWriter.write(nd);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Scanner s = new Scanner(fn);
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(" to read this file is not found !");
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------");

    }


    void engineering_books()
    {

    }
    public void view_books()
    {
        System.out.println("------------------------------------");
        int c=0;
        while(c!=5) {
            System.out.println("We have these types of books in library :");
            System.out.println("1. historical books \n2. comic book \n3. novel \n4. engineering books \n5. exit");
            System.out.print("select which type of books you want to see :");
            c = d.nextInt();
            switch (c)
            {
                case 1 :
                    historical_books();
                    break;
                case 2 :
                    comic_book();
                    break;
                case 3 :
                    novel();
                    new issue_book();
                    break;
                case 4 :
                    engineering_books();
                    break;
                case 5 :
                    break;

            }
            String yesORno;
            System.out.print("Do you want to issue more books ? : ");
            yesORno = d.next();
            if(yesORno.equalsIgnoreCase("yes")){
                c=0;
            }
            else
            {
                c=5;
            }
        }



    }

}
class issue_book extends books
{
    Scanner s = new Scanner(System.in);
    int no_of_books;
    int ids[];
    int ib =0;
    void issue_book()
    {
        System.out.println("------------------------------");
        System.out.print("Enter the no. of books :");
        no_of_books = s.nextInt();
        System.out.println("enter the ids of books you want to purchase :");
        int ids[] = new int[no_of_books] ;
        for(int i=0;i<no_of_books;i++)
        {  ids[i]=s.nextInt(); }
        System.out.println("you issued the books :");
        for(int i=0;i<no_of_books;i++) {
            System.out.println(id[ids[i]] +"-"+ name[i]);
        }
        System.out.println("you issued the books successfully  ");
        ib=1;
        System.out.println("--------------------------------------");


    }
}
class view_issued_books extends issue_book
{
    void view_issued_books()
    {
        if(ib==1) {
            System.out.println("---------ISSUED BOOKS-------------------------");
            for (Integer i : ids) {
                System.out.println(i + " - " + name[i]);
            }
        }
        else{
            System.out.println("sorry you havent issued any books !");
        }

    }
}

class Account {
    public String username;
    public String password;
    Scanner s = new Scanner(System.in);

    public void create_account() {
        System.out.println("----------CREATING ACCOUNT-------------------");
        System.out.print("Enter Username :");
        username = s.nextLine();
        System.out.print("Enter password :");
        password = s.nextLine();

        System.out.println("congrats ! you have successfully created your account");
    }

    public int delete_accout() {
        System.out.println("------------DELETING ACCOUNT-------------------");
        String p;
        System.out.print("Enter your password again :");
        p = s.nextLine();
        if (p.equals(password)) {
            System.out.println("you have successfully deleted your account !");
            return 3;
        }
        else
        {
            System.out.println("Sorry ! we couldn't remove your account ");
            login();
        }
    return 0;}


    public int login() {
        String u, p;
        System.out.println("------------LOGIN---------------------");
        System.out.print("Enter Username :");
        u = s.nextLine();
        System.out.print("Enter password :");
        p = s.nextLine();

        if (u.equals(username) && p.equals(password)) {
            System.out.println("Hi !! " + username + " welcome to the library ");

            System.out.println("--------------------------------------");

            int ch = 0;
            Scanner s = new Scanner(System.in);
            while (ch != 4) {
                System.out.println("-----------------------------------------");
                System.out.println("1. View books \n2. delete account \n3. view issued books \n4. exit ");
                System.out.print("enter your choice :");
                ch = s.nextInt();
                switch (ch) {
                    case 1:
                        books b = new books();
                        b.view_books();
                        break;
                    case 2:
                        delete_accout();
                        ch=4;
                        return 4;
                    case 3 :
                        view_issued_books vib = new view_issued_books();
                        vib.view_issued_books();
                        break;

                    case 4:
                        break;
                }

            }
        }
        else
        {
            System.out.println("Sorry !! wrong password or the username  ");
        }

    return 0;}
}

public class book_Management {
    public static void main(String[] args) {
            Account a = new Account();
            int ch = 0;
            int ca=0;
            Scanner s = new Scanner(System.in);
            while (ch != 3) {
                System.out.println("-----------------------------------------");
                System.out.println("1. create account \n2. login \n3. exit from the library ");
                System.out.print("enter your choice :");
                ch = s.nextInt();
                switch (ch) {
                    case 1:
                        if(ca == 0) {
                            a.create_account();
                            ca =1;
                        }
                        else
                        {
                            System.out.println("you have created your account already !!");
                        }
                        break;
                    case 2:
                        ch=a.login();
                        break;
                    case 3:
                        System.out.println("Thank you and visit again !!  :) ");
                        break;
                }
            }
        }
    }

