import Package.Stack;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        
        stack.pop();
        System.out.println("Stack size "+stack.size());

        stack.show();

    }
}
