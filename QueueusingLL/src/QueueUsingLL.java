import java.util.Scanner;

public class QueueUsingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QueueLLStructure cq = new QueueLLStructure();
        int val, choice;
        boolean check = true;
        while (check) {
            System.out.println("1 ====> Insert");
            System.out.println("2 ====> Delete");
            System.out.println("3 ====> Display");
            System.out.println("Enter Choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Values : ");
                    val = sc.nextInt();
                    cq.enqueue(val);
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.display();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
