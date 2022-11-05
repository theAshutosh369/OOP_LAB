// collections and generic

package oopl_or_oopc;
import java.util.ArrayList;
import java.util.Scanner;

public class ASGN7
{
    static int count=0;

    // palindrome
    static void check_palindrome(String x)
    {
        String str ="";
        char c;
        for(int i=0;i<x.length();i++)
        {
            c=x.charAt(i);
            str=c+str;
        }
        if(x.equals(str))
        {
            System.out.println(x+" is palindrome ");
            count+=1;
        }
        else
        {
            System.out.println(x+" is not palindrome ");
        }
    }
    // even or odd
    static void even_odd(int x)
    {
        if(x%2==0)
        {
            System.out.println(x+" is even ");
            count+=1;
        }
        else
        {
            System.out.println(x+" is odd");
        }
    }

    // prime number
    static void check_prime(int x)
    {
        int c=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.println(x+" is prime number ");
            count+=1;
        }
        else {
            System.out.println(x + " is not a prime number ");
        }
    }
    // function to decide which fn check
    static void check(int x, int ch)
    {
        switch (ch)
        {
            case 1 :
                even_odd(x);
                break;
            case 2 :
                check_prime(x);
                break;
            case 3 :
                break;
            default:
                System.out.println(" plz enter valid choice !!");
        }
    }

    // function for integer array
    static void number_op()
    {
        int element , n;
        count=0;
        ArrayList<Integer> nums  = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        n=s.nextInt();
        System.out.println("enter the all elements :");
        for(int i=0;i<n;i++)
        {
            element=s.nextInt();
            nums.add(element);
        }
        System.out.println("--------------------------------------");

        int ch=0;
        while(ch!=3) {
            count=0;
            System.out.print(" 1. EVEN ODD \n 2. PRIME \n 3. exit \n enter the operation to be performed : ");
            ch = s.nextInt();
            System.out.println("--------------------------------------");

            for (int i = 0; i < nums.size(); i++) {
                check(nums.get(i), ch);
            }
            System.out.println("------------------------------------------------");
            // give the count
            if (ch == 1) {
                System.out.println("the number of even numbers :" + count);
                System.out.println("the number of odd numbers  :" + (nums.size() - count));
            } else if(ch==2){
                System.out.println(" the number of prime numbers     : " + count);
                System.out.println(" the number of non-prime numbers : " + (nums.size() - count));
            }
            else{
                System.out.println(" integer part closed ");
                break;
            }
            System.out.println("----------------------------------");
        }
    }

    // function for string array
    static void string_op()
    {
        int n ;
        String word;
        ArrayList<String > words  = new ArrayList<String>();

        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of words :");
        n=s.nextInt();
        System.out.println(" enter the all words :");
        for(int i=0;i<n;i++)
        {
            word=s.next();
            words.add(word);
        }
        count=0;
        System.out.println("-------------------------------------");


        for(int i=0; i<words.size();i++)
        {
            check_palindrome(words.get(i));
        }
        // give the count
        System.out.println("-----------------------------------");
        System.out.println(" the number of palindromes :"+ count);
        System.out.println("--------------------------------------");

    }
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        int ch=0;

        System.out.println("-------------------------------------------");
        while (ch != 3)
        {
            System.out.print(" 1. Integer \n 2. String \n 3. exit \n enter the choice :");
            ch = s.nextInt();
            if (ch == 1) {
                number_op();
            }
            else if(ch==2){
                string_op();
            }
            else{
                break;
            }
        }
        System.out.println(" end of the program !!");

    }
}
