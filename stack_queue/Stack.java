public class Stack {
    private int[] stack;
    private int capacity;
    private int ptr;
    public class EmptyIntStackException extends RuntimeException { public EmptyIntStackException() {} }
    public class OverflowIntStackException extends RuntimeException { public OverflowIntStackException() {} }
    public Stack(int capacity) {
        ptr = 0;
        this.capacity = capacity;
        try {
            stack = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }
    public int push(int num) throws OverflowIntStackException {
        if (ptr >= capacity) {
            throw new OverflowIntStackException();
        }
        return this.stack[this.ptr++] = num;
    }
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return this.stack[--this.ptr];
    }
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return this.stack[this.ptr-1];
    }

    public static void main(String[] args) {
        Stack st = new Stack(10);
        for (int i=0; i<10; i++) {
            System.out.print(st.push(i)+", ");
        }
        System.out.print("\n"+st.peek()+"\n");
        for (int i=0; i<10; i++) {
            System.out.print(st.pop()+", ");
        }
    }
}