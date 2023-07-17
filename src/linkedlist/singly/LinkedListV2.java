package linkedlist.singly;

// Inserting a node at the beginning of a Linked List

class NodeV2 {
    int data;
    NodeV2 next;
}

public class LinkedListV2 {

    NodeV2 head;

    public void addFirst(int val) {
        // Create a new Node
        NodeV2 n = new NodeV2();

        // Assign data a value
        n.data = val;
        // Assign "next" always a new node i.e "head" references
        n.next = head;

        // Assign head a new node references
        head = n;
    }

    public void print() {
        NodeV2 temp = head;

        while (temp != null) {
            System.out.println("Data: " + temp.data); // + ", Next: " + temp.next.toString());
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedListV2 list = new LinkedListV2();

        System.out.println("Inserting Element: " + 10);
        list.addFirst(10);
        System.out.println("Inserting Element: " + 20);
        list.addFirst(20);
        System.out.println("Inserting Element: " + 30);
        list.addFirst(30);
        System.out.println("Inserting Element: " + 40);
        list.addFirst(40);

        System.out.println("The LinkedList Elements are: ");
        list.print();
    }
}
