
import LinkList.LinkList;
import LinkList.DoubleLinkList;
import Queue.Queue;
import Stack.Stack;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        Stack<Integer> sampleStackList = new Stack<Integer>(2);
//        sampleStackList.getSize();
//        sampleStackList.add(8);
//        sampleStackList.add(10);
//        sampleStackList.add(90);
//        sampleStackList.getSize();

//        Queue
//        Queue<Integer> waitingQueue = new Queue(Integer.class,2);
//
//        waitingQueue.enQueue(30);
//        waitingQueue.enQueue(20);
//        waitingQueue.enQueue(50);
//        System.out.println(waitingQueue.deQueue() +" dequeue value");
//        waitingQueue.enQueue(60);
//
//        System.out.println(waitingQueue.deQueue() +" dequeue value");
//        waitingQueue.enQueue(80);
//
//        waitingQueue.printQueue();
//        System.out.println(waitingQueue.getSize() + " size");
//
//
//        Queue<String> messageQueue = new Queue(String.class,4);
//
//        messageQueue.enQueue("first");
//        messageQueue.enQueue("Second");
//        messageQueue.enQueue("Third");
//        messageQueue.enQueue("Fourth");
//
//        messageQueue.deQueue();
//        messageQueue.printQueue();
//
//        messageQueue.enQueue("Fifth");
//        messageQueue.printQueue();


//     LinkList playlist = new LinkList();
//     playlist.prepend(9);
//     playlist.append(3);
//     playlist.append(4);
//     playlist.append(6);
//
//     playlist.prepend(90);
//     playlist.print();
//     System.out.println(playlist.size);
//
//     playlist.add(0, 10);
//     playlist.add(1, 20);
//     playlist.add(3, 30);
//     playlist.add(4, 10);
//
//     System.out.println(playlist.size);
//     playlist.add(4, 100);
//     playlist.print();
//     System.out.println(playlist.size);
//     playlist.delete(4);
//     playlist.print();
//     System.out.println(playlist.size);


        DoubleLinkList doubleList = new DoubleLinkList();

        doubleList.prepend(3);
        doubleList.prepend(5);
        doubleList.prepend(8);
        doubleList.prepend(30);
        doubleList.print();

        doubleList.printReverse();
        doubleList.append(100);
        doubleList.append(150);
        doubleList.print();

        System.out.println(doubleList.at(6));

        doubleList.add(6, 999);
        doubleList.add(1, 222);

        doubleList.print();

        doubleList.getSize();


        System.out.println( doubleList.delete(7).value);
        doubleList.print();

    }
}