public class LLStructure {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insertFront(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
//        if (head != null) {
//            new_node.next = head;
//        }
//        head = new_node;
        display();
    }

    void insertEnd(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        display();
    }

    void insertPos(int pos, int val) {
        Node new_node = new Node(val);

        if (head == null) {
            System.out.println("No Element are in List");
        } else {
            Node temp = head;
            if (pos == 0) {
                new_node.next = head;
                head = new_node;
            } else {
                for (int i = 0; i < pos - 1; i++) {
                    temp = temp.next;
                }
            }
            new_node.next = temp.next;
            temp.next = new_node;
        }
        display();
    }

    void deleteFront() {
        if (head == null) {
            System.out.println("No Element are in List");
        } else {
            Node temp = head;
            temp = temp.next;
            head = temp;
        }
        display();
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("No Element are in List");
        } else {
            Node temp = head;
            Node ptr = temp.next;
            while (ptr.next != null) {
                temp = ptr;
                ptr = ptr.next;
            }
            temp.next = null; // Delete Element
        }
        display();
    }

    void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("No Element are in List");
        } else {
            Node temp = head;
            Node ptr = temp.next;
            for (int i = 1; i < pos - 1; i++) {
                temp = ptr;
                ptr = ptr.next;
            }
            temp.next = ptr.next;
        }
        display();
    }

    void display() {
        if (head == null) {
            System.out.println("No element in list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
