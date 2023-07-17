package stack.linkedlist;

class NodeV1 {
    int data;
    NodeV1 next;
}

public class StackUsingLinkedListV1 {
    // head: We need to start from beginning
    NodeV1 head = null;

    public static void main(String[] args) {
        StackUsingLinkedListV1 stack = new StackUsingLinkedListV1();

        stack.pop();

        System.out.println("Pushing Element: " + 10);
        stack.push(10);
        System.out.println("Pushing Element: " + 20);
        stack.push(20);
        System.out.println("Pushing Element: " + 30);
        stack.push(30);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

    // Insert data to stack
    public void push(int val) {
        NodeV1 newNode = new NodeV1();
        newNode.data = val;
        newNode.next = head;

        // Update head node address each time after creating new node
        head = newNode;
    }

    // Remove data from stack
    public void pop() {

        if (head == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Popped Element: " + head.data);
            // Moved head to next node
            head = head.next;
        }
    }
}
