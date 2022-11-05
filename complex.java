// Design a class ‘Complex ‘with data members for real and imaginary part.
// Provide default and Parameterized constructors.
// Write a program to perform arithmetic operations of two complex numbers.

package oopl_or_oopc;

import java.util.Scanner;
public class complex {
    float real;
    float imaginary;
     public complex()
    {
        // this is default constructor
        real=0; // sets default value of real part of complex number
        imaginary=0;  // sets default value of imaginary part of complex number
    }
    public complex(float a, float b)
    {
        // this is parametrised constructor
        real=a;
        imaginary=b;
    }
    public void display(complex c1 , complex c2 )
    {
        // displays the 2 complex numbers
        System.out.println("first complex number =("+c1.real+")+("+c1.imaginary+")i");  // printing first complex number
        System.out.println("second complex number =("+c2.real+")+("+c2.imaginary+")i");  // printing second complex number
    }

    public void addNumbers(complex c1, complex c2)
    {
        // addition of two complex numbers
        float real,imaginary;
        real=(c1.real+c2.real); // real part of complex number
        imaginary = (c1.imaginary+c2.imaginary); // imaginary part of complex number

        System.out.println("Addition of complex numbers = ("+real+")+("+imaginary+")i"); // printing addition of 2 complex numbers
    }

    public void subNumbers(complex c1,complex c2)
    {
        // subtraction of two complex numbers
        float real,imaginary;
        real=(c1.real-c2.real); // real part of complex number
        imaginary = (c1.imaginary-c2.imaginary); // imaginary part of complex number

        System.out.println("subtraction of complex numbers = ("+real+")+("+imaginary+")i"); // printing subtraction of 2 complex numbers

    }

    public void multiNumbers(complex c1, complex c2 )
    {
        // multiplication of two complex numbers
        float real,imaginary;
        real=(c1.real*c2.real - c1.imaginary*c2.imaginary); // real part of complex number
        imaginary = (c1.real*c2.imaginary + c1.imaginary*c2.real); // imaginary part of complex number

        System.out.println("multiplication of complex numbers = ("+real+")+("+imaginary+")i"); // printing multiplication of 2 complex numbers

    }

    public void divNumbers(complex c1, complex c2 )
    {
        // division of two complex numbers
        float real,imaginary;
        float dino;
        dino = (c2.real*c2.real + c2.imaginary*c2.imaginary);

        real=(c1.real*c2.real + c1.imaginary*c2.imaginary)/ dino ; // real part of complex number
        imaginary = (c1.imaginary*c2.real - c1.real*c2.imaginary) / dino ; // imaginary part of complex number

        System.out.println("division of complex numbers = ("+real+")+("+imaginary+")i"); // printing division of 2 complex numbers


    }


    public static void main(String[] args)
    {
        float n1, n2;
        complex cal = new complex();
        Scanner sc = new Scanner(System.in);
        System.out.println("----- enter the complex number in a+bi format -----");


        // taking input for first number
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("enter the real part of first number (a) : ");
        n1= sc.nextFloat();
        System.out.println("enter the img part of first number (b) : ");
        n2= sc.nextFloat();
        complex c1 =  new complex(n1,n2);
        System.out.println("-----------------------------------------------------");


        // taking input for second number
        System.out.println("enter the real part of second number (a) : ");
        n1= sc.nextFloat();
        System.out.println("enter the img part of second number (b) : ");
        n2= sc.nextFloat();
        complex c2 =  new complex(n1,n2);

        System.out.println("------------------------------------------------------");

        System.out.println("----------------------------------------------------");
        System.out.println("\n");
        cal.display(c1,c2); // calling display function
        System.out.println("\n");
        System.out.println("----------------------------------------------------");

        int choice=0;
        while(choice!=5) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1. addition \n2. subtraction \n3. multiplication \n4. division \n5. exit\n ");
            System.out.print("enter the choice to perform operation : ");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    cal.addNumbers(c1, c2);
                    break;
                case 2:
                    cal.subNumbers(c1, c2);
                    break;
                case 3:
                    cal.multiNumbers(c1, c2);
                    break;
                case 4:
                    cal.divNumbers(c1, c2);
                    break;
                case 5:
                    System.out.println("you chose to exit,");
                    System.out.println("program ended !! ");
                    break;
                default:
                    System.out.println("plz enter valid choice !!");
            }
        }


    }
}
