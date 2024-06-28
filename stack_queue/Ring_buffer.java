public class Ring_buffer {
    static int[] queue = new int[10];
    static int front = 0;
    static int rear = 0;

    public static void enqueue(int num) {
        if (front > rear) front++;
        queue[rear++ % 10] = num;
        if (front == 10) {
            front = 0;
        }
        if (rear == 10) {
            rear = 0;
            front++;
        }
    }

    public static void main(String[] args) {
        for (int i=0; i<=19; i++) {
            enqueue(i);
        }

        for (int i=front-1; i<10; i++) {
            System.out.print(queue[i] + ", ");
        }
        for (int i=0; i<rear; i++) {
            System.out.print(queue[i] + ", ");
        }
    }
}
