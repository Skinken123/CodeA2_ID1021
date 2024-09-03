public class DynamicStack {
    int[] stack;
    int top = 0;
    int size = 1;

    public DynamicStack() {
        stack = new int[size];
    }

    public void push(int val) {
        if (top == stack.length) {
            int[] newStack = new int[stack.length * 2]; //Doubleing the size of the stack when it is full is a the best all around option when the stack is full. Adding a constant value to the size of the stack is not a good idea because it will increase the time complexity of the push operation if the stack grows very large.
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        stack[top] = val;
        top++;
    }
    public int pop() {
        if(stack.length >= 16 && top <= stack.length / 4) {
            int[] newStack = new int[stack.length / 2];
            for (int i = 0; i < newStack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        top--;
        return stack[top];
    }
    public static void main(String[] args) {
        DynamicStack s = new DynamicStack();
        s.push(32);
        s.push(33);
        s.push(34);
        System.out.println("pop : " + s.pop());
        System.out.println("pop : " + s.pop());
        System.out.println("pop : " + s.pop());
    }
}
