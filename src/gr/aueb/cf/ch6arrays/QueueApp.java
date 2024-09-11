package gr.aueb.cf.ch6arrays;

/**
 * Demo of FIFO queques
 */
public class QueueApp {
    static int[] queque = new int[100];
    static int pivot = -1;

    public static void main(String[] args) {
        int num;
        enQueque(1);
        enQueque(2);
        enQueque(3);
        printQueue();
        num = deQueque();
        System.out.println(num);
        printQueue();
    }

    public static void enQueque(int num) {
        if (isFull()) {
            System.out.println("Queque is full");
            return;
        }
        queque[++pivot] = num;
    }

    public static int deQueque() {
        if (isEmpty()) {
            System.out.println("Queque is empty");
            return 0;
        }
        int valueToReturn = queque[0];
        pivot--;
        shiftQuequeLeft();
        return valueToReturn;
    }

    public static void shiftQuequeLeft() {
        for ( int i = 0; i <= pivot; i++) {
            queque[i] = queque[i + 1];
        }
    }

    public static boolean isEmpty() {
        return pivot == -1;
    }

    public static boolean isFull() {
        return pivot == queque.length - 1;
    }

    public static void printQueue() {
        if(isEmpty()) {
            throw new RuntimeException("Empty Queue");
        }

        for (int i = 0; i <= pivot; i++) {
            System.out.print(queque[i] + " ");
        }
        System.out.println();
    }
}
