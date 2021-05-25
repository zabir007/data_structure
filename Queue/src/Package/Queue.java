package Package;

public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        if(!isFull()) {
        queue[rear] = data;
        rear = (rear+1)%5;
        size = size + 1;
        }
        else
            System.out.println("Queue is full");
    }

    public int deQueue() {
        int data = queue[front];
        if(!isEmpty()) {
        front = (front+1)%5;
        size = size - 1;
        }
        else
            System.out.println("queue is empty");
        return data;
    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        return size()==0;
    }

    public Boolean isFull() {
        return size()==5;
    }

    public void show() {
        System.out.println("Elements: ");
        for(int i=0; i<size; i++) {
            System.out.print(queue[(front+i)%5]+ " ");
        }
        System.out.println();
    }
}
