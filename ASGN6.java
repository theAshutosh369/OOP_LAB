// exception handling

package oopl_or_oopc;
import java.util.Scanner;
public class ASGN6
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n=========================================");
            System.out.println("1: Arithmetic Exception: \n2: Null Pointer Exception: \n3: Number Format Exception \n4: Array Index out of bound exception: \n5: Exit:");
            System.out.println("=========================================\n");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    try{
                        int t=10;
                        int r=0;
                        int c=t/r;
                        System.out.println(c);
// Exception in thread "main"java.lang.ArithmeticException: / by zero
                    }catch(ArithmeticException e){
                        System.out.println("Can't divide a number by zero:\n");
                    }
                    finally{
                        System.out.println("Finally statement:\n");
                    }
                    break;
                case 2:
                    try{
                        String s=null;
                        System.out.println(s.length());
//Exception in thread "main"java.lang.NullPointerException: Cannot invoke "String.length()" because "s" isnull
                    }catch(NullPointerException t){
                        System.out.println("String has zero elements:\n");
                    }
                    break;
                case 3:
                    try{
                        String t="abc";
                        int i=Integer.parseInt(t);
// Exception in thread "main"java.lang.NumberFormatException: For input string: "abc"
                    }catch(NumberFormatException q){
                        System.out.println("Different data types:\n");
                        System.out.println(q.getMessage()+"\n");
                    }
                    break;
                case 4:
                    try{
                        int arr[]={33,3,4,5};
                        System.out.println(arr[5]);
//Exception in thread "main"java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
                    }catch(ArrayIndexOutOfBoundsException c){
                        System.out.println("Arry out of bound:\n");
                    }
                    break;
                case 5:
                    System.out.println("Program Terminated:");
                    break;
                default:
                    System.out.println("Invalid Operation: ");
                    break;
            }
        }while(choice!=5);
        sc.close();
    }
}