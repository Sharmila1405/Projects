package DS.linked_list;

public class double_list {
    Node head;
    Node tail;

    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }

    }

    public static double_list insert(double_list list, int data)
    {
        Node new_node = new Node(data);

        if(list.head==null )
        {
            list.head = new Node(data);
            list.tail = list.head;
        }
        else
        {
            list.tail.next = new_node;
            new_node.prev = list.tail;
            list.tail = new_node;

        }
        return list;
    }

    public static double_list insert_at_first(double_list list, int data){
        
        Node new_node = new Node(data);
        Node temp = list.head;
        list.head = new_node;
        list.head.next = temp;
        temp.prev = new_node;
        
        return list;
    }
    public static double_list insert_at_position(double_list list, int data)
    {
        return list;
    }
    public static void print(double_list list)
    {
        Node curr_node = list.head;
        while(curr_node!=null)
        {
            System.out.println(curr_node.data);
            curr_node = curr_node.next;
        }
    }
    public static double_list delete_by_key(double_list list, int data)
    {
        Node curr_node = list.head;
        Node prev = null;
        if(list.head == list.tail)
        {
            list.head = null;
            list.tail=null;

        }
        else if(curr_node !=null && curr_node.data == data)
        {
            list.head = curr_node.next;
            list.head.prev = null;
            curr_node.next = null;
        }
        else if(curr_node!=null && list.tail.data == data)
        {
            prev = list.tail;
            list.tail.prev.next = null;
            list.tail.prev = null;
            list.tail = prev.prev;
            

        }
        else
        {
            while(curr_node!=null && curr_node.data != data)
            {
                prev = curr_node;
                curr_node = curr_node.next;
            }
            if(curr_node!=null)
            {
                prev.next = curr_node.next;
                curr_node.next.prev = prev;
                curr_node.prev = null;
                curr_node.next = null;

            }
            if(curr_node==null)
            {
                System.out.println("NOT FOUND");
            }

            // while(curr_node!=null && curr_node.data != data)
            // {
            //     curr_node = curr_node.next;
            // }
            // if(curr_node!=null)
            // {
            //     prev = curr_node.prev;
            //     curr_node.prev.next = curr_node.next;
            //     curr_node.next.prev = prev;

            // }
        }
        return list;
    }
    public static void main(String[] args) {
        double_list list  = new double_list();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        print(list);
        System.out.println("delete");
        list = delete_by_key(list, 5);
        print(list);

        list = insert_at_first(list, 10);
        System.out.println("first");
        print(list);
        

    }
    
}
