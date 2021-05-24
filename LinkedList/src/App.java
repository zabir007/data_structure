import Package.*;

public class App {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insertStart(5);
        linkedList.insertAt(2, 55);
        linkedList.insertAt(3, 35);
        linkedList.insertAt(0, 1000);
        linkedList.removeAt(0);
        linkedList.removeAt(1);
        linkedList.removeAt(2);

        linkedList.show();
    }
}
