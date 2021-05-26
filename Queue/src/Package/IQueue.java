package Package;

interface IQueue {

    void enQueue(int data);
    int deQueue();
    int size();
    Boolean isEmpty();
    Boolean isFull();
    void show();
}
