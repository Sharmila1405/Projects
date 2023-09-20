package DS.linked_list;

public class circular_double {

    Node head;

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static circular_double insert(circular_double list,int data)
    {
        Node new_node = new Node(data);

        if(list.head == null)
        {
            list.head = new_node;
            new_node.next =new_node.prev = new_node;
        }
        else{
            Node last = list.head.prev;
            new_node.next = list.head;
            new_node.prev = last;
            last.next = new_node;
            list.head.prev = new_node;   
        }

        return list;
    }
    public static circular_double insert_begin(circular_double list,int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
        {
            list.head = new_node;
            new_node.next =new_node.prev = new_node;
        }
        else
        {
            Node temp = list.head;
            new_node.next = temp;
            new_node.prev = temp.prev;
            temp.prev.next = new_node;
            list.head.prev = new_node;
            list.head = new_node;
            
        }
        return list;
    }
    public static void display(circular_double list)
    {
        Node cur = list.head;
        Node prev = list.head.prev;
        while(cur != null && cur != prev)
        {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.print(cur.data);
    }
    public static void main(String[] args) {
        circular_double list1 = new circular_double();
        list1 = insert(list1, 1);
        list1 = insert(list1, 2);
        list1 = insert(list1, 3);
        list1 = insert(list1,4);
        display(list1);
        System.out.println();
        list1 = insert_begin(list1, 10);
        display(list1);


    }
    
}
