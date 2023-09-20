package DS.Array_list;

import java.util.ArrayList;


public class array_list {
    public static void main(String[] args) {
        
        // we cannot create arraylist of primitive data types we have to use wrapper class as Integer,String,Double(objects)
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        //add
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);

        //add at index
        list1.add(1,40);
        System.out.println(list1);

        //get at index elemnt
        list1.get(2);
        System.out.println(list1.get(2));

        //update element -- set
        list1.set(2,50);
        System.out.println(list1);

        //remove 
        list1.remove(2);
        System.out.println(list1);

        // remove from end
        list1.remove(list1.size()-1);
        System.out.println(list1);

        //size
        System.out.println(list1.size());

    }
    
}
