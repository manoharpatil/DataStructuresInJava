package linkedlist.doubly;

// Search a Node in Doubly Linked List

class NodeV4 {
    NodeV5 prev;
    int data;
    NodeV5 next;
}

// DLL
public class DoublyLinkedListV4 {
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

    public boolean search(int key) {
        // We have to search from beginning
        NodeV5 temp = head;

        // Stop when node doesn't exist i.e. null
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
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

        System.out.println("Doubly Linked List: null<-10<->20<->30<->40->null");

        System.out.println("Searching Element: " + 30);
        if (list.search(30))
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");

        System.out.println("Searching Element: " + 100);
        if (list.search(100))
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");
    }
}
