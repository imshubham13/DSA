public class QueueLLStructure {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int data) {
        Node new_node = new Node(data);
        if (front == null) {
            front = new_node;
            rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }
        display();
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            front = front.next;
        }
        display();
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
