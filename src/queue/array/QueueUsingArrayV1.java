package queue.array;

// Queue Using Array and Application

public class QueueUsingArrayV1 {

    static final int SIZE = 3;
    int[] arr = new int[SIZE];

    // Removal happens at front
    int front = 0;
    // Insertion happens at rear
    int rear = 0;

    public static void main(String[] args) {
        QueueUsingArrayV1 queue = new QueueUsingArrayV1();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }

    // Insert element in Queue
    public void enqueue(int val) {
        if (rear == SIZE)
            System.out.println("Queue is full.");
        else {
            System.out.println("Enqueuing element: " + val + " in Queue.");
            arr[rear] = val;
            rear++;
        }
    }

    // Removed element from Queue
    public void dequeue() {
        if (front == rear)
            System.out.println("Queue is empty.");
        else {
            System.out.println("Dequeued element: " + arr[front] + " in Queue.");
            front++;
        }
    }
}
