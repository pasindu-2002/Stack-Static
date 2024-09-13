import com.sun.source.tree.BreakTree;

public class Stack {

    int arr[];
    int capacity;
    int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int data){
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
        System.out.println("Insert Successfully");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public int top(){
        return top;
    }

    private boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == capacity-1;
    }

}
