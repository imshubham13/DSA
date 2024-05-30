public class QueueStructure {

    int[] a;
    int front, end;

    QueueStructure(int size) {
        if (size < 0) {
            System.out.println("Invalid Size");
        } else {
            a = new int[size];
            front = 0;
            end = 0;
        }
    }

    void enQueue(int val) {
        if (front == a.length) {
            System.out.println("Queue is Full");
        } else {
            a[front] = val;
            front++;
            System.out.println("Insert Successfully");
            display();
        }
    }

    void deQueue() {
        if (end == front) {
            System.out.println("Queue is Empty");
            end = 0;
            front = 0;
        } else {
            end++;
            System.out.println("Delete Successfully");
            display();
        }
    }

    void display() {
        if (end == front) {
            System.out.println("Queue is Empty");
            front = 0;
            end = 0;
        }else{
            for(int i=end; i<front; i++)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
       }
    }
}
