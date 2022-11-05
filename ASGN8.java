// file handling

package oopl_or_oopc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class student
{
    int id,marks, rollno;
    public String address;
    public String s_class;
    String filename;
    Scanner s = new Scanner(System.in);
    public void display_record()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println(" student id :"+id+
                           "\n rollno     :"+rollno+
                           "\n marks      :"+marks+
                           "\n class      :"+s_class+
                           "\n address    :"+address+"\n");
    }

    public void modify_record()
    {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            System.out.println("-------------------------------------------------");
            System.out.println("enter your modified student data :");
            System.out.print("student id :");
            id = s.nextInt();
            System.out.print("roll no    :");
            rollno= s.nextInt();
            System.out.print("marks      :");
            marks = s.nextInt();
            System.out.print("address    :");
            address = s.next();
            System.out.print("class      :");
            s_class = s.next();
            System.out.println("\n");

            fileWriter.write("student id :"+id+"\n rollno :"+rollno+"\n marks :"+marks+"\n class :"+s_class+"\n address :"+address+"\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class add_record extends student
{

    File f;
    public add_record(int i)
    {
        System.out.print("enter the name of file "+i+" :");
        filename = s.next();
        f = new File(filename);
        try{
            if(f.createNewFile()){
                System.out.println("the new file "+f.getName()+" is created ");
            }
            else
            {
                System.out.println(" problem occured");
            }
        }
        catch(IOException e)
        {
            System.out.println("file is not created !!");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(filename);
            System.out.println("-------------------------------------------------");
            System.out.println("enter your student data :");
            System.out.print("student id :");
            id = s.nextInt();
            System.out.print("roll no    :");
            rollno= s.nextInt();
            System.out.print("marks      :");
            marks = s.nextInt();
            System.out.print("address    :");
            address = s.next();
            System.out.print("class      :");
            s_class = s.next();
            System.out.println("\n");

            fileWriter.write("student id :"+id+"\n rollno :"+rollno+"\n marks :"+marks+"\n class :"+s_class+"\n address :"+address+"\n");
            fileWriter.close();


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void clear_record()
    {


    }

}

public class ASGN8 {
        public static void main(String[] args)
    {
        System.out.println("**you are supposed to create record of 5 students** ");
        System.out.println("**fill this records one by one**");
        add_record a[] = new add_record[5];
        for(int i=0;i<5;i++) {
            a[i] = new add_record(i+1);
        }

        int ch=0,search_id;
        Scanner d = new Scanner(System.in);
        while(ch!=3)
        {
            System.out.println("--------------------------------");
            System.out.println("1. search n modify data \n2. display records \n3. clear records and exit");
            System.out.print("enter your choice :");
            ch=d.nextInt();
            switch(ch)
            {
                case 1 :
                    System.out.print("enter the search id :");
                    search_id = d.nextInt();
                    for(int i=0;i<5;i++)
                    {
                        if(search_id == a[i].id)
                        {
                            a[i].modify_record();
                        }
                    }
                    break;
                case 2 :
                    for(int i=0;i<5;i++)
                    {
                        a[i].display_record();
                    }
                    break;
                case 3 :
                    System.out.println("deleted all files");
                    System.out.println("end of the program !!");
                    for(int i =0;i<5;i++)
                    {
                        a[i].f.delete();
                    }
                    break;
                default :
                    System.out.println("plz enter valid choice !");

            }
        }
    }
}

