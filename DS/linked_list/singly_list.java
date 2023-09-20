package DS.linked_list;

public class singly_list {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            next = null;
        }

    }
    public static singly_list insert(singly_list list, int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
        {
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;

        }
        return list;

    }
    public static singly_list addFirst(singly_list list, int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
        {
            list.head = new_node;

        }
        else{
            Node temp = list.head;
            list.head = new_node;
            list.head.next = temp;
        }
        return list;
    }

    public static void print(singly_list list)
    {
        Node current_node = list.head;

        while(current_node != null)
        {
            System.out.println(current_node.data + " ");
            current_node = current_node.next;
        }
    }

    public static singly_list delete(singly_list list, int data)
    {
        Node n1 = list.head;
        Node temp = null;
        if(n1 != null && n1.data == data)
        {
            temp = n1.next;
            list.head = temp;
        }
        else{

            while(n1 != null && n1.data!=data)
            {
                temp = n1;
                n1 = n1.next;
            }
            if(n1!=null)
            {
                temp.next = n1.next;

            }
            else{
                System.out.println("NOT FOUND");
            }
            

        }
        return list;
    }


    public static singly_list delete_by_index(singly_list list, int position)
    {
        Node curr_node = list.head;
        Node prev = null;
        int count = 0;
        if(position == 0 && curr_node!= null)
        {
            list.head = list.head.next;
        }
        else{
            while(curr_node!=null)
            {
                if(count == position)
                {
                    prev.next = curr_node.next;
                    
                }
                else{
                    prev = curr_node;
                    curr_node = curr_node.next;
                    count++;
                }
            }

            if(curr_node==null)
            {
                System.out.println("positon  not found");
            }
            

        }
        




        return list;
    }
    public static int middle(singly_list list)
    {
        if(list.head == null)
        {
            return 0;
        }
        else if(list.head.next == null)
        {
            return list.head.data;
        }
        else
        {
            Node slow = list.head;
            Node fast = list.head;
            
            while(fast != null && fast.next !=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    }
    public static void main(String[] args)
    {
        // singly_list list = new singly_list();
        // list = insert(list, 1);
        // list = insert(list, 2);
        // list = insert(list, 3);
        // list = insert(list, 4);
        // list = insert(list, 5);
        // list = insert(list, 6);
        // list = insert(list, 7);
        // list = insert(list, 8);
        // list = insert(list, 9);

        // print(list);

        // list = addFirst(list, 11);
        // print(list);

        // list = delete_by_index(list, 20);
        // System.out.println("delete");
        // print(list);

        singly_list list = new singly_list();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        System.out.println(middle(list));



        

    }
    
}
