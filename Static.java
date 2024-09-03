public class Static<T> extends Stack<T> {

    public Static(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        top = 0;
    }

    @Override
    public void push(T val) {
        stack[top] = val;
        top++;
    }
    @Override
    public T pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return null;
        }
        top--;
        return stack[top];
    }    
}
