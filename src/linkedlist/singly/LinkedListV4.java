package linkedlist.singly;

// Deleting a Node in Linked List

class NodeV4 {
    int data;
    NodeV4 next;
}

public class LinkedListV4 {

    NodeV4 head;

    public void addLast(int val) {
        // Make a new node to add it at last
        NodeV4 newNode = new NodeV4();
        newNode.data = val;
        newNode.next = null;

        // If LinkedList is empty
        if (head == null) {
            head = newNode;
        } else {
            // Insert a node at last as LinkedList is not empty
            NodeV4 lastNode = head;

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
            NodeV4 temp = head;

            // Check whether next node exists or not
            while (temp.next != null) {

                if (temp.next.data == key) {
                 temp.next = temp.next.next;
                } else
                    temp = temp.next;
            }
        }
    }

    public void print() {
        NodeV4 temp = head;

        // Print the data
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListV4 list = new LinkedListV4();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("The LinkedList Elements Are [Before Deletion]:");
        list.print();

        System.out.println("Deleting Element: " + 10);
        list.delete(40);

        System.out.println("The LinkedList Elements Are [After Deletion]:");
        list.print();
    }
}

