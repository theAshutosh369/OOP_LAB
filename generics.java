package oopl_or_oopc;

import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);

        System.out.println(" al1 arraylist is : "+al1);

        System.out.println(" accessing using for each :");
        for(Integer i : al1)
        {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        al1.set(0,100);
        al1.set(4,200);
        System.out.println(" after updating the arraylist al1 is :"+ al1);
        System.out.println(" the 2nd element in arraylist al1 is : "+al1.get(1));
        al1.remove(3);
        System.out.println("after removing element at 3rd index list is : "+al1);



    }
}
