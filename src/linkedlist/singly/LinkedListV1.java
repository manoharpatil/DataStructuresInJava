package linkedlist.singly;

// Create the linked list and Print the linked list elements

class NodeV1 {
    int data;
    NodeV1 next;
}

public class LinkedListV1 {

    public static void main(String[] args) {

        NodeV1 n1, n2, n3;

        // Create nodes
        n1 = new NodeV1();
        n2 = new NodeV1();
        n3 = new NodeV1();

        // Store data in nodes
        n1.data = 52;
        n2.data = 60;
        n3.data = 45;

        // Linked the nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        System.out.print("The linked list elements are: ");

        NodeV1 temp = n1;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
