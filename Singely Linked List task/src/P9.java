import java.util.Scanner;

public class P9 {
    Student head;

    class Student {
        int roll_no, mark;
        String name;
        Student next;

        public Student(int roll_no, String name, int mark) {
            this.roll_no = roll_no;
            this.name = name;
            this.mark = mark;
        }
    }

    public void insertSortedMarkDes(int roll_no, String name, int mark) {
        Student newStudent = new Student(roll_no, name, mark);

        if (head == null) {
            head = newStudent;
            return;
        }

        if (head.mark < newStudent.mark) {
            newStudent.next = head;
            head = newStudent;
            return;
        }

        Student temp, prev;
        temp = prev = head;

        while (temp != null && temp.mark > newStudent.mark) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = newStudent;
        newStudent.next = temp;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Student temp;
        temp = head;
        while (temp != null) {
            System.out.println("-----------------------------------------");
            System.out.println("Roll No: " + temp.roll_no);
            System.out.println("Name: " + temp.name);
            System.out.println("Mark: " + temp.mark);
            temp = temp.next;
        }
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        P9 p6 = new P9();

        int ch;
        int roll_no, mark;
        String name;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1 for insert sorted mark descending order");
            System.out.println("2 for display");
            System.out.println("0 for exit");

            System.out.print("Enter Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    roll_no = sc.nextInt();
                    System.out.print("Enter Name: ");
                    name = sc.next();
                    System.out.print("Enter Mark: ");
                    mark = sc.nextInt();
                    p6.insertSortedMarkDes(roll_no, name, mark);

                case 2:
                    p6.display();

                case 0:
                    System.out.println("Exited");

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 0);
    }
}