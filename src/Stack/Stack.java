package Stack;

public class Stack<T>{

    final Object[]  stack;

    final  int capacity;
    private int size = 0;
    public Stack(int capacity){
        stack = new Object[capacity];
        this.capacity = capacity;
    }

    public void getSize(){
        System.out.println("stack size  "+ this.size);
    }

    public void add(T item) {

        if(this.size == this.capacity){
            System.out.println("stack is full");
        }else {
            this.stack[this.size] = item;
            ++this.size;
        }

    }

    public void removeItem()  {

        if(this.isEmpty()) {
            System.out.println("There is no Items in stack");
        } else {
            --this.size;
            @SuppressWarnings("unchecked")
            T lastValue = (T) this.stack[this.size];

            this.stack[this.size] = null;

            System.out.println("Item has been removed in stack " + lastValue);
        }
    }

    public void showList() {
        for(Object item :  this.stack) {
            System.out.println(item);
        }
    }

    public T peak() {
        if(isEmpty()) {
            System.out.println("There is no Items in stack");
            return null;
        } else {
            @SuppressWarnings("unchecked")
             T value =  (T) stack[size -1];
            return value;
        }
    }
    public  boolean isEmpty(){
        return  size == 0;
    }
}
