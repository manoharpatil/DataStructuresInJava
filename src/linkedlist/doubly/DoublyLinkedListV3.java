package linkedlist.doubly;

// Insert a Node at the End of a Doubly Linked List

class NodeV3 {
    NodeV5 prev;
    int data;
    NodeV5 next;
}

// DLL
public class DoublyLinkedListV3 {
    NodeV5 head;

    public void addLast(int val) {
        // Create a new node
        NodeV5 newNode = new NodeV5();
        newNode.data = val;

        // Check if DLL is empty
        if (head == null) {
            newNode.prev = null;
            newNode.next = null;

            head = newNode;
        } else {
            // We have to start from beginning i.e. First Node
            NodeV5 last = head;

            // Stop when next node is null
            while (last.next != null) {
                // Move to next node
                last = last.next;
            }

            last.next = newNode;
            newNode.prev = last;
            newNode.next = null;
        }
    }

    public void print() {
        // Forward Traversal
        // We need to traverse from the first or head node to last node
        NodeV5 temp = head;
        NodeV5 last = null;

        System.out.println("Forward Traversal: ");
        // Stop when next node is null
        while (temp != null) {
            System.out.println("Data: " + temp.data + ", Address: " + temp.toString());
            if (temp.next == null)
                last = temp;
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

    public static void main(String args[]) {
        DoublyLinkedListV5 list = new DoublyLinkedListV5();

        System.out.println("Inserting Element: " + 10);
        list.addLast(10);
        System.out.println("Inserting Element: " + 20);
        list.addLast(20);
        System.out.println("Inserting Element: " + 30);
        list.addLast(30);
        System.out.println("Inserting Element: " + 40);
        list.addLast(40);

        list.print();
    }
}
