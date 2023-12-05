package Queue;

import java.lang.reflect.Array;

public class Queue<T> {
    final int capacity;

    T[] queue;

    int size = 0;

    int front =  0;

    int rear = 0;

    public  Queue(Class<T> dataType,  int size){
        capacity = size;
        queue = (T[]) Array.newInstance( dataType, size);
    }


    public void enQueue(T value){
        if(!isFull()) {
            queue[rear] = value;
            rear = (rear + 1) % capacity;
            size++;
        }else {
            System.out.println("queue is full");
        }

    }


    public T deQueue(){

        if(!isEmpty()) {
            T item = queue[front];
            queue[front] = null;
            front = (front + 1) % capacity;
            size--;

            return item;
        }else {
            System.out.println("queue is empty");
            return null;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public boolean isFull(){
        return size == capacity;
    }

   public int getSize () {
        return size;
    }

    public void printQueue(){
        for(int i=0; i < queue.length; i++ ) {
            System.out.printf("queue value: %s \n", queue[(front+i)%capacity] );
        }
    }


}
