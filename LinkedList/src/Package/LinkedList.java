package Package;

public class LinkedList {
    
    Node head;

    // Insert At End
    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if(head==null) {
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // Insert At Start
    public void insertStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    // Insert Anywhere
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;

        if(index==0) {
            insertStart(data);
        }

        Node temp = head;
        for(int i=0; i<index-1; i++) {
           temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
    }

    // Display method
    public void show() {
        Node node = head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
