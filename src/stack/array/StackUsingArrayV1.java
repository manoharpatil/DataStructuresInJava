package stack.array;

// Stack Using Array and Application

public class StackUsingArrayV1 {

    static final int SIZE = 3;
    int[] arr = new int[SIZE];
    int top = -1;

    public static void main(String[] args) {
        StackUsingArrayV1 stack = new StackUsingArrayV1();

        System.out.println("Pushing Element: " + 10);
        stack.push(10);
        System.out.println("Pushing Element: " + 20);
        stack.push(20);
        System.out.println("Pushing Element: " + 30);
        stack.push(30);
        System.out.println("Pushing Element: " + 40);
        stack.push(40);

        stack.pop();

        System.out.println("Pushing Element: " + 40);
        stack.push(40);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

    // Insert data to stack
    public void push(int val) {

        // Check for Stack is full
        if (top == SIZE - 1) {
            System.out.println("Stack is full.");
        } else {
            ++top;
            arr[top] = val;
        }
    }

    // Remove data from stack
    public void pop() {

        // Check if stack is empty
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Popped Element: " + arr[top]);
            top--;
        }
    }
}
