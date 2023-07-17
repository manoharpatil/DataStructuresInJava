package linkedlist.doubly;

// Delete a Node in a Doubly Linked List

class NodeV5 {
    NodeV5 prev;
    int data;
    NodeV5 next;
}

// DLL
public class DoublyLinkedListV5 {
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

    public void delete(int key) {
        // If DLL is empty
        if (head == null)
            return;

        // We have to search from beginning
        NodeV5 temp = head;

        // Find out the node which contains key i.e. data
        while (temp != null && temp.data != key) {
            // Move temp to next node
            temp = temp.next;
        }

        // Key not exists
        if (temp == null) {
            System.out.println(key + "not found");
        } else if (temp == head) { // If key is in Head Node
            // Make next node as head
            head = head.next;
            head.prev = null;
        } else if (temp.next == null) { // If key is in last node
            temp.prev.next = null;
        } else { // If key is in middle nodes
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
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

        int key = 20;
        System.out.println("Deleting Element: " + key);
        list.delete(key);

        System.out.println("After Deletion");
        list.print();
    }
}
