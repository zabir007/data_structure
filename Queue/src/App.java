import Package.Queue;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.show();
        queue.enQueue(2);
        queue.show();
        queue.enQueue(7);
        queue.show();
        queue.size();
       
    }
}
