import Package.Queue;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(2);
        queue.enQueue(7);
        queue.enQueue(13);
        queue.enQueue(23);
        queue.enQueue(33);


        queue.deQueue();
        queue.deQueue();
        queue.show();

       
    }
}
