
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
        Queue<Integer> waitingQueue = new Queue(Integer.class,2);

        waitingQueue.enQueue(30);
        waitingQueue.enQueue(20);
        waitingQueue.enQueue(50);
        System.out.println(waitingQueue.deQueue() +" dequeue value");
        waitingQueue.enQueue(60);

        System.out.println(waitingQueue.deQueue() +" dequeue value");
        waitingQueue.enQueue(80);

        waitingQueue.printQueue();
        System.out.println(waitingQueue.getSize() + " size");


        Queue<String> messageQueue = new Queue(String.class,4);

        messageQueue.enQueue("first");
        messageQueue.enQueue("Second");
        messageQueue.enQueue("Third");
        messageQueue.enQueue("Fourth");

        messageQueue.deQueue();
        messageQueue.printQueue();

        messageQueue.enQueue("Fifth");
        messageQueue.printQueue();





    }
}