public class Queue {
    private int[] queue;
    private int capacity;
    private int front;
    private int rear;
    private int num;
    public class EmtyQueueException extends RuntimeException {
        public EmtyQueueException() {}
    }
    public class OverflowQueueException extends RuntimeException {
        public OverflowQueueException() {}
    }
    public int enque(int x) throws OverflowQueueException {
        if (num >= capacity) throw new OverflowQueueException();
        queue[rear++] = x;
        num++;
        if (rear == capacity) rear = 0;
        return x;
    }
    public int deque() throws EmtyQueueException {
        if (num <= 0) throw new EmtyQueueException();
        int x = queue[front++];
        num--;
        if (front == capacity) front = 0;
        return x;
    }
    public int peek() throws EmtyQueueException {
        if (num <= 0) throw new EmtyQueueException();
        return queue[front];
    }

    public Queue(int capacity) {
        num = front = rear = 0;
        this.capacity = capacity;
        try {
            queue = new int[capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        for (int i=0; i<10; i++) {
            System.out.print(q.enque(i)+", ");
        }
        System.out.print("\n"+q.peek()+"\n");
        for (int i=0; i<10; i++) {
            System.out.print(q.deque()+", ");
        }
    }
}
