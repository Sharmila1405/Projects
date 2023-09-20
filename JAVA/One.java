import java.util.Hashtable;
import java.util.Map;

public class One  
{  
    /* declaration of instance variables. */  
    public String name; //public instance  
    String division;    //default instance  
    private int age;    //private instance  
  
    /* Method to display the values of instance variables. */  
    public void printstud()  
    {  
        System.out.println("Student Name: " + name );  
        System.out.println("Student Division: " + division);   
        System.out.println("Student Age: " + age);  
    }  
  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        One s = new One();  
        s.printstud();  


//         Output is :
//         Student Name: null
//         Student Division: null
//         Student Age: 0


        System.out.println("Number of Command Line Argument = "+args.length);
		
		for(int i = 0; i< args.length; i++) {
			System.out.println(String.format("Command Line Argument %d is %s", i, args[i])); }


        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("sharmila", 23);

        for (Map.Entry<String,Integer> e: ht.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }  
}  