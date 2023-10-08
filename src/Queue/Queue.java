package Queue;

public class Queue {
    final int capacity;

    int[] queue;

    int size = 0;

    int front =  0;

    int rear = 0;

    public  Queue(int size){
        capacity = size;
        queue = new int[capacity];
    }


    public void enQueue(int value){
        if(!isFull()) {
            queue[rear] = value;
            rear = (rear + 1) % capacity;
            size++;
        }else {
            System.out.println("queue is full");
        }
    }


    public Integer deQueue(){

        if(!isEmpty()) {
            int item = queue[front];
            queue[front] = 0;
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

   public int getsize () {
        return size;
    }

    public void printQueue(){
        for(int i=0; i < queue.length; i++ ) {
            System.out.printf("queue value: %s \n", queue[(front+i)%capacity] );
        }
    }


}
