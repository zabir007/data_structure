package Package;

public class DynamicStack implements IStack  {
    
    int cap = 2;
    int stack[] = new int[cap];
    int top = 0;

    public void push(int data) {

        if(size() == cap)
        expand();
      
        stack[top] = data;
        top++;
    }

        public void expand() {
        int len = size();
        int newStack [] = new int[cap*2];
        System.arraycopy(stack, 0, newStack, 0, len);
        stack = newStack;
        cap *= 2;
    }

    public int pop() {
        int data =0;
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shirink();
        }
        return data;
    }

    public void shirink() {
        int length = size();
        if(length<= (cap/2)/2)
            cap = cap/2;

            int newStack [] = new int[cap*2];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
    }

    public int peek() {
        int data;
        data = stack[top-1];
        return data;
    }

    public int size() {
        return top;
    }

    public Boolean isEmpty() {
        return top<= 0;
    }

    public void show() {
        for(int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}

