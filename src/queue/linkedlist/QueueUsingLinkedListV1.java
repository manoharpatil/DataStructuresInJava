package queue.linkedlist;

// Queue Using Linked List

class NodeV1 {
    int data;
    NodeV1 next;
}

public class QueueUsingLinkedListV1 {
    NodeV1 front = null, rear = null;

    public static void main(String[] args) {

        QueueUsingLinkedListV1 queue = new QueueUsingLinkedListV1();

        queue.dequeue();

        System.out.println("Enqueuing element: " + 10);
        queue.enqueue(10);
        System.out.println("Enqueuing element: " + 20);
        queue.enqueue(20);
        System.out.println("Enqueuing element: " + 30);
        queue.enqueue(30);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }

    public void enqueue(int val) {

        NodeV1 newNode = new NodeV1();
        newNode.data = val;
        newNode.next = null;

        // When queue is empty, assign newNode address to both front and rear nodes
        if (front == null && rear == null)
            front = rear = newNode;
        else {
            rear.next = newNode;  // linked the next of previous node with the new node created
            rear = newNode;       // Move rear node to next node
        }
    }

    public void dequeue() {
        if (front == null)
            System.out.println("Queue is empty.");
        else {
            front = front.next;

            if (front == null)
                rear = null;
        }
    }
}
