package linkedlist.doubly;

// Insert a Node at the Beginning of a Doubly Linked List

class NodeV2 {
    NodeV2 prev;
    int data;
    NodeV2 next;
}

// DLL
public class DoublyLinkedListV2 {
    NodeV2 head;

    public void addFirst(int val) {
        NodeV2 newNode = new NodeV2();
        newNode.data = val;

        // If DLL is Empty - This block will execute only onces
        if (head == null) {
            // There is only one node at this point
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
        } else {
            newNode.prev = null;
            newNode.next = head;

            head.prev = newNode;
            head = newNode;
        }
    }

    public void print() {

        // Forward Traversal
        // We need to traverse from the first or head node to last node
        NodeV2 temp = head;
        NodeV2 last = null;

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
        DoublyLinkedListV2 list = new DoublyLinkedListV2();

        System.out.println("Inserting Element: " + 10);
        list.addFirst(10);
        System.out.println("Inserting Element: " + 20);
        list.addFirst(20);
        System.out.println("Inserting Element: " + 30);
        list.addFirst(30);
        System.out.println("Inserting Element: " + 40);
        list.addFirst(40);

        list.print();
    }
}
