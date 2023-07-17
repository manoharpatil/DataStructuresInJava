package linkedlist.singly;

// Searching a Node in Singly Linked List

class NodeV5 {
    int data;
    NodeV5 next;
}

public class LinkedListV5 {

    NodeV5 head;

    public void addLast(int val) {
        // Make a new node to add it at last
        NodeV5 newNode = new NodeV5();
        newNode.data = val;
        newNode.next = null;

        // If LinkedList is empty
        if (head == null) {
            head = newNode;
        } else {
            // Insert a node at last as LinkedList is not empty
            NodeV5 lastNode = head;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }
    }

    public void delete(int key) {

        // Delete the head node
        if (head.data == key) {
            // Point head to the immediate next node in sequence
            head = head.next;
        } else {
            NodeV5 temp = head;

            // Check whether next node exists or not
            while (temp.next != null) {

                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                } else
                    temp = temp.next;
            }
        }
    }

    public boolean search(int key) {
        // We need to search from beginning i.e. first node
        NodeV5 temp = head;

        // Repeat until Or Next node is null
        while (temp.next != null) {
            // Check for Key
            if (temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
    }

    public void print() {
        NodeV5 temp = head;

        // Print the data
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListV5 list = new LinkedListV5();

        System.out.println("Inserting Element: " + 10);
        list.addLast(10);
        System.out.println("Inserting Element: " + 20);
        list.addLast(20);
        System.out.println("Inserting Element: " + 30);
        list.addLast(30);
        System.out.println("Inserting Element: " + 40);
        list.addLast(40);

        System.out.println("The LinkedList Elements are: ");
        list.print();

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

        System.out.println("The LinkedList Elements Are [Before Deletion]:");
        list.print();

        System.out.println("Deleting Element: " + 10);
        list.delete(40);

        System.out.println("The LinkedList Elements Are [After Deletion]:");
        list.print();
    }
}
