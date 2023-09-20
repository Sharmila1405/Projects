package DS.queue;


public class circular_Array {

    int size,front,rear;
    int items[];

    circular_Array(int size)
    {
        this.size = size;
        this.front = this.rear = -1;
        this.items = new int[size];
    }

    boolean isFull()
    {
        if(front==0 && rear == size-1)
        {
            return true;
        }
        if(front == rear+1)
        {
            return true;
        }
        return false;
    }
    
    boolean isEmpty()
    {
        if(front == -1)
        {
            return true;
        }
        return false;
    }
    void enqueue(int data)
    {
        if (isFull())
        {
            System.out.println(" full");
        }
        else{
            if(isEmpty())
            {
                front = 0;
            }
            rear = (rear+1)%size;
            items[rear]= data;
            System.out.println(" inserted");
            
        }
    }
    
    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % size)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    int dequeue()
    {
        int element;
        if(isEmpty())
        {
            System.out.println("Empty");
            return -1;
        }
        else
        {
            element = items[front];
            if(front== rear)
            {
                front = rear = -1;
            }
            else
            {
                front = (front+1) % size;
            }
        }
        return element;
    }

    public static void main(String[] args) {

        circular_Array q = new circular_Array(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enqueue(6);

        q.display();

    }
    
}
