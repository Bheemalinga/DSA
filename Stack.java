public class Stack {
    private static Object[] stackarray;
    private static int size;
    private int top;
    public Stack(int size){
        this.size = size;
        this.top = -1;
        stackarray = new Object[size];
    }
    public void push(Object value){
        if(top == size -1){
            System.out.println("Stack is full");
        }
        else{
        top++;
        stackarray [top] = value;
        size++;
        }
    }
    public Object pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            int old_top = top;
            top --;
            stackarray[old_top] = null;
            return stackarray[top];
        }
    }
    public Object peek(){
        return stackarray[top];
    }
    public static void main(String[]a){
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        for (int i =0; i<size;i++){
            System.out.println(stackarray[i]);
        }
    }
}
