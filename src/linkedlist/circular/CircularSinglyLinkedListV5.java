package linkedlist.circular;

// Deleting a Node in Circular Linked List

class NodeV5 {
    int data;
    NodeV5 next;
}

// CSLL
public class CircularSinglyLinkedListV5 {
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

    public boolean search(int key) {
        // Check for empty head i.e. CSLL should exist
        if (head == null)
            return false;

        // Search from first node
        NodeV5 temp = head;

        do {
            if (temp.data == key)
                return true;
            // Move to the next node
            temp = temp.next;
        } while (temp != head); // Check till head

        return false;
    }

    public void delete(int key) {

        // If CSLL is empty
        if (head == null) {
            return;
        }

        // If the CSLL has only one node i.e. head node
        if (head.data == key && head.next == head) {
            head = null; // Make head node null as there is only one node
        } else if (head.data == key) { // If key is present in head node, but list it has more than one node
            // Start from beginning
            NodeV5 last = head;

            // Find out the last node
            while (last.next != head) {
                last = last.next;
            }

            // Update the last.next reference
            last.next = head.next;
            // Move head node to next node
            head = head.next;
        } else { // If key is present in non-head nodes
            // Start from beginning
            NodeV5 current = head;

            while (current.next != head) { // Search till last node
                if (current.next.data == key) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next; // Move current node to next node
            }
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
        System.out.println("Inserting Element: " + 40);
        list.addLast(40);
        System.out.println("Inserting Element: " + 50);
        list.addLast(50);

        System.out.println("Circular Singly Linked List Elements Are:");
        list.print();

        System.out.println("Circular Linked List: 10->20->30->40->50->10");

        System.out.println("Searching Element: " + 20);
        if (list.search(20))
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");

        System.out.println("Searching Element: " + 100);
        if (list.search(100))
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");

        System.out.println("Circular Linked List: 10->20->30->40->50->10");

        int key = 40;
        System.out.println("Deleting Element: " + key);
        list.delete(key);

        System.out.println("After Deletion");
        list.print();
    }
}
