package linkedlist.circular;

// Inserting a Node in the End of Circular Linked List

class NodeV3 {
    int data;
    NodeV5 next;
}

// CSLL
public class CircularSinglyLinkedListV3 {
    NodeV5 head;

    public void addLast(int val) {
        // Create a new node and assign a data
        NodeV5 newNode = new NodeV5();
        newNode.data = val;

        // If CSLL is empty - This block will execute only once
        if (head == null) {
            // Assign next reference to newly created node
            newNode.next = newNode; // Assign reference to self because it is a circular linked list
            // Update the head reference from null to new node
            head = newNode;
        } else {
            // We need head node reference
            NodeV5 last = head;

            // It should reach to the end of the list
            while (last.next != head) {
                last = last.next;
            }

            // Assigned newly created node reference to the last node as next.
            last.next = newNode; // We need to add the fresh node in front of head node each time.
            newNode.next = head; // Copy head reference to the new node next
        }
    }

    public void print() {
        // If CSLL is empty
        if (head == null)
            return;

        NodeV5 temp = head;

        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head); // Stop when it reached to head
    }

    public static void main(String[] args) {
        CircularSinglyLinkedListV5 list = new CircularSinglyLinkedListV5();

        System.out.println("Inserting Element: " + 10);
        list.addLast(10);
        System.out.println("Inserting Element: " + 20);
        list.addLast(20);
        System.out.println("Inserting Element: " + 30);
        list.addLast(30);

        System.out.println("Circular Singly Linked List Elements Are:");
        list.print();
    }
}
