public class Main {
    public static void main(String[] args) {
        // stack using array (one thing is clear that we have to define the size of the stack/array)

        myStack test = new myStack(3);
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);      // this guy is not added in stack haan

        System.out.println(test.pop());
        test.push(50);
        System.out.println(test.pop());

        System.out.println(test.peek());
        System.out.println(test.peek());

        test.pop();
        test.pop();
        test.peek();

    }
}

// obj is of class simple right
class myStack {

    int top = -1;          // naveen said its better to make top -1
    int size = 0;
    private int[] snack;

    public myStack(int size) {
        this.size = size;
        snack = new int[this.size];
    }

    public boolean isFull() {
        return (top == size - 1);
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public void push(int val) {
        if (isFull()) System.out.println("Sorry stack is full");
        else {
            top++;
            snack[top] = val;
        }
    }
    public int pop() {
        int poped;
        if (isEmpty()) {
            System.out.println("stack is empty nothing to pop");
            return -1;
        }
        else {
            poped = snack[top];
            snack[top--] = 0;
        }
        return poped;
    }
    public int peek(){
        if(top == -1) {
            System.out.println("stack is empty so noting to show");
            return -1;
        }
        else return snack[top];
    }


}
