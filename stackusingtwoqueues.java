import java.util.*;

public class stackusingtwoqueues {

    // Define the data members
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;

    /**
     * 
     */
    public stackusingtwoqueues() {
        // Implement the Constructor
        q1 = new java.util.LinkedList<Integer>();
        q2 = new java.util.LinkedList<Integer>();
        size = 0;
    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() { // Length of stack
        // Implement the getSize() function
        // its a getter function
        return size;
    }

    public boolean isEmpty() { // Check if stack is empty or not
        // Implement the isEmpty() function
        return size == 0;
    }

    public void push(int element) { // Push element on the stack
        // Implement the push(element) function
        q1.add(element); // add element to q1
        size = size + 1;
    }

    public int pop() { // Remove the top element from the stack
        // Implement the pop() function
        if (q1.isEmpty()) {
            return -1; // -1 is used to show false or non-achievability
        }
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove(); // remove last element

        while (!q2.isEmpty()) { // restore q1
            q1.add(q2.remove());
        }
        size = size - 1;
        return top;
    }

    public int top() { // Return the top element
        // Implement the top() function
        if (q1.isEmpty()) { 
            return -1;
        }
        while (q1.size() != 1) { // remove last element
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());

        Queue<Integer> q = q1; // swap q1 and q2
        q1 = q2;
        q2 = q;
        return top;
    }

    public static void main(String[] args) {
        stackusingtwoqueues s1 = new stackusingtwoqueues();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.top());
        s1.pop();
        System.out.println(s1.top());

    }
}