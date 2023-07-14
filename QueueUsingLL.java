 // Queue using Linked List

class Node{ // Node class
    int item;
    Node next;
    public Node(int item)   // Constructor
        this.item = item;
    }
}
public class QueueUsingLL { // Queue class
    int size = 0;
    Node head = null;
    Node tail = null;
    public void enqueue(int item){  // Enqueue function
        Node n1 = new Node(item);
        if(size == 0){
            head = n1;
            tail = n1;
        }
        else{
            tail.next = n1;
            n1.next = null;
        }
        size++;
    }
    public void dequeue(){  // Dequeue function
        if(this.head == null){
            System.out.println("The Linked List is Empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node current = this.head;
        head = head.next;
    }
    public void display(){  // Display function
        Node current = this.head;
        for(int j = 0; j<size; j++){
            System.out.println(current.item);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        QueueUsingLL q1 = new QueueUsingLL();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.display();
        q1.dequeue();
        q1.display();
    }
}

