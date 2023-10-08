
import Queue.Queue;
import Stack.Stack;
public class Main {
    public static void main(String[] args) {

//        Stack<Integer> sampleStackList = new Stack<Integer>(2);
//        sampleStackList.getSize();
//        sampleStackList.add(8);
//        sampleStackList.add(10);
//        sampleStackList.add(90);
//        sampleStackList.getSize();

//        Queue
        Queue waitingQueue = new Queue(2);
//
        waitingQueue.enQueue(30);
        waitingQueue.enQueue(20);
        waitingQueue.enQueue(50);
        System.out.println(waitingQueue.deQueue() +" dequeue value");
        waitingQueue.enQueue(60);

        System.out.println(waitingQueue.deQueue() +" dequeue value");
        waitingQueue.enQueue(80);

        waitingQueue.printQueue();
        System.out.println(waitingQueue.getsize() + " size");
    }
}