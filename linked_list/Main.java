package linked_list;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        System.out.println(head);
        System.out.println("-------------------------------------------------------");
        System.out.println(display(head));

    }

    public static String display(Node head) {
        String output = "O-->";
        Node temp = head;
        while (temp != null) {
            output += temp.data + "--->";
            temp = temp.next;
        }
        output += "null";
        return output;
    }
}