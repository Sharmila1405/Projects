package DS.Trees;

public class tree {

    static Node root;

    static class Node 
    {
        int key;
        Node left,right;

        Node(int data)
        {
            this.key = data;
            this.left = this.right = null;

        }
    }
    public void add(int x)
    {
        Node new_node = new Node(x);

        if(root == null)
        {
            root = new_node;
            
        }
        else{
            Node focus_node = root;
            Node parent;
            while(true)
            {
                parent = focus_node;
                if(x<focus_node.key)
                {
                    focus_node = focus_node.left;
                    if(focus_node == null)
                    {
                        parent.left = new_node;
                        break;
                    }

                }
                else
                {
                    focus_node = focus_node.right;
                    if(focus_node == null)
                    {
                        parent.right = new_node;
                        break;
                    }
                }
            }
        }

    }
    public static void in_order(Node root)
    {
        if(root != null)
        {
            in_order(root.left);
            System.out.print(root.key + " ");
            in_order(root.right);
        }
    }
    public static void pre_order(Node root)
    {
        if(root != null)
        {
            System.out.print(root.key + " ");
            pre_order(root.left);
            pre_order(root.right);
        }
    }
    public static void post_order(Node root)
    {
        if(root != null)
        {
            post_order(root.left);
            post_order(root.right);
            System.out.print(root.key + " ");
        }
    }
    public static void main(String[] args)
    {
        tree list1 = new tree();
        list1.add( 50);
        list1.add( 25);
        list1.add( 15);
        list1.add( 75);
        list1.add( 30);
        list1.add( 85);
        in_order(root);
        System.out.println();
        pre_order(root);
        System.out.println();
        post_order(root);

    }
    
}
