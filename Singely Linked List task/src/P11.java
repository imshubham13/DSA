import java.util.Scanner;

public class P11 {
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

    public void insertSortedNameAsc(int roll_no, String name, int mark) {
        Student newStudent = new Student(roll_no, name, mark);

        if (head == null) {
            head = newStudent;
            return;
        }

        if (name.compareTo(head.name) < 0) {
            newStudent.next = head;
            head = newStudent;
            return;
        }

        Student temp, prev;
        temp = head.next;
        prev = head;

        while (temp != null && name.compareTo(temp.name) > 0) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = newStudent;
        newStudent.next = temp;
    }

    public void deleteWithGivenRollNo(int roll_no) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (roll_no == head.roll_no) {
            head = head.next;
            System.out.println("Deleted");
            return;
        }

        Student temp, prev;
        temp = head.next;
        prev = head;

        while (temp != null && temp.roll_no != roll_no) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Roll No is not found");
            return;
        }

        prev.next = temp.next;
        System.out.println("Deleted");
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
        P11 p10 = new P11();

        int ch;
        int roll_no, mark;
        String name;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1 for insert sorted name ascending order");
            System.out.println("2 for delete with given roll no");
            System.out.println("3 for display");
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
                    p10.insertSortedNameAsc(roll_no, name, mark);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    roll_no = sc.nextInt();
                    p10.deleteWithGivenRollNo(roll_no);
                    break;
                case 3:
                    p10.display();
                    break;

                case 0:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 0);
    }
}
