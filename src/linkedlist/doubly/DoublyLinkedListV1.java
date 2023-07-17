package linkedlist.doubly;

// Introduction to Doubly Linked List

class NodeV1 {
    NodeV1 prev;
    int data;
    NodeV1 next;
}

public class DoublyLinkedListV1 {
    public static void main(String[] args) {

        NodeV1 head, middle, last;

        // Create a Node
        head = new NodeV1();
        middle = new NodeV1();
        last = new NodeV1();

        // Assign the data
        head.data = 10;
        middle.data = 20;
        last.data = 30;

        // Linked Prev and Next node
        head.prev = null;
        head.next = middle;

        middle.prev = head;
        middle.next = last;

        last.prev = middle;
        last.next = null;

        // Forward Traversal
        // We need to traverse from the first or head node to last node
        NodeV1 temp = head;

        System.out.println("Forward Traversal: ");
        // Stop when next node is null
        while (temp != null) {
            System.out.println("Data: " + temp.data + ", Address: " + temp.toString());
            temp = temp.next;
        }

        // Backward Traversal
        // We need to traverse from the last node to head node
        temp = last;

        System.out.println("Backward Traversal: ");
        // Stop when previous node is null
        while (temp != null) {
            System.out.println("Data: " + temp.data + ", Address: " + temp.toString());
            temp = temp.prev;
        }
    }
}
