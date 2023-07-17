package linkedlist.singly;

// Inserting a Node at the End of Linked List

class NodeV3 {
    int data;
    NodeV3 next;
}

public class LinkedListV3 {
    NodeV3 head;

    public void addLast(int val) {
        // Make a new node to add it at last
        NodeV3 newNode = new NodeV3();
        newNode.data = val;
        newNode.next = null;

        // If LinkedList is empty
        if (head == null)
            head = newNode; // head is also a node i.e. its type is Node
        else {
            // Insert a node at last as LinkedList is not empty
            NodeV3 lastNode = head;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void print() {
        NodeV3 temp = head;

        while(temp != null) {
            System.out.println("Data: " + temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedListV3 list = new LinkedListV3();
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
    }
}