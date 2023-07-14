public class queue { // Queue implementation using array.
    private static Object[] queuearray;// Array to store the queue.
    private static int size;// Size of the queue.
    private int top;// Top of the queue.
    public queue(int size){ // Constructor to initialize the queue.
        this.size = size;// Assigning the size of the queue.
        this.top = -1;// Assigning the top of the queue.
        queuearray = new Object[size];// Initializing the array.
    }
    public void Enque(Object value){// To add a node at the end of the queue.
        if(top == size -1){// Checking if the queue is full or not.
            System.out.println("Queue is full");
        }
        else{// The queue is not full.
        top++;// Increasing the top of the queue.
        queuearray [top] = value;// Adding the value to the queue.
        size++; // Increasing the size of the queue.
        }
    }
    public Object Deque(){// To delete a node from the starting of the queue.
        if(top == -1){// Checking if the queue is empty or not.
            System.out.println("Queue is empty");
            return null;
        }
        else{// The queue is not empty.
            // int old_top = top;
            // top --;
            // queuearray[old_top] = null;
            // return queuearray[top];
        }
    }
    public Object peek(){ // To return the top of the queue.
        return queuearray[top]; // Returning the top of the queue.
    }
    public static void main(String[]a){ // Main method.
        queue q = new queue(2);// Initializing the queue.
        q.Enque(10);
        q.Enque(20);
        q.Enque(30);
        q.Deque();// Deleting a node from the starting of the queue.
        for (int i =0; i<size;i++){ // Printing the queue.
            System.out.println(queuearray[i]);
        }
    }
}
