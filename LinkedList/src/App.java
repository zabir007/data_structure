import Package.*;

public class App {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insertStart(100);
        linkedList.insertAt(2, 55);
        linkedList.insertAt(3, 35);
        linkedList.insertStart(10);
        linkedList.insertAt(0, 1000);

        linkedList.show();
    }
}
