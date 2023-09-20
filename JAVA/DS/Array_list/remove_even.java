package DS.Array_list;

import java.util.ArrayList;

public class remove_even {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(10);
        list1.add(4);
        list1.add(15);
        list1.add(8);
        list1.add(21);
        list1.add(3);
        list1.add(2);

        for(int i=list1.size()-1; i>=0; i--)
        {
            if(list1.get(i) %2 == 0)
            {
                list1.remove(i);
            }
            
        }
        System.out.println(list1);


        
    }
}