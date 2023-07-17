package linkedlist.circular;

// Circular Singly Linked List Basics

class NodeV1 {
    int data;
    NodeV1 next;
}

public class CircularSinglyLinkedListV1 {

    public static void main(String[] args) {
        NodeV1 head, middle, last;

        // Initialized the nodes
        head = new NodeV1();
        middle = new NodeV1();
        last = new NodeV1();

        // Add the data
        head.data = 10;
        middle.data = 20;
        last.data = 30;

        // Assign next references
        head.next = middle;
        middle.next = last;
        last.next = head;

        System.out.print("Circular Singly Linked List Elements are: ");
        NodeV1 temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}
