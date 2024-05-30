public class StackStructure {

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;

    void push(int data){
        Node new_node = new Node(data);
        if(top == null){
            top = new_node;
        }else{
            new_node.next = top;
            top = new_node;
        }
        peek();
    }
    void pop(){
        if(top == null){
            System.out.println("Stack is Empty");
        }else{
            top = top.next;
        }
        peek();
    }
    void peek(){
        Node temp = top;
        if(top == null){
            System.out.println("Stack is Empty");
        }
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
