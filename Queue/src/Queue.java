import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_element;
        System.out.println("Enter Element : ");
        total_element = sc.nextInt();

        QueueStructure queue = new QueueStructure(total_element);

        int choice, val;
        boolean check = true;

        while (check) {
            System.out.println("1 ====> EnQueue");
            System.out.println("2 ====> DeQueue");
            System.out.println("3 ====> Display");
            System.out.println("4 ====> Exit");
            System.out.println("Enter Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value : ");
                    val = sc.nextInt();
                    queue.enQueue(val);
                    break;
                case 2:
                    queue.deQueue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }
}
