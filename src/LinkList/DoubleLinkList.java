package LinkList;

public class DoubleLinkList {
    // node class starts
    public class Node {

        public int value;
        public Node next;
        public Node prev;


        Node(int value) {
            this.value = value;
        }

        Node(int value, Node nextValue, Node prevValue) {
            this.value = value;
            next = nextValue;
            prev = prevValue;
        }
    }
    // node class ends

    private int size;

    private Node Head;

    private Node Tail;


    public  int getSize() {
        System.out.println(size);
        return size;
    }


    public void prepend(int value) {

        Node newNode = new Node(value);

        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.next = Head;
            Head.prev = newNode;
            Head = newNode;
        }
        size += 1;
    }

    public void append(int value) {

        Node newNode = new Node(value);

        if (Tail == null) {
            prepend(value);
        } else {
            Tail.next = newNode;
            newNode.prev = Tail;
            Tail = newNode;
        }
        size += 1;
    }

    public void print() {
        Node temp = Head;

        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END\n");

    }

    public void printReverse() {
        Node temp = Tail;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.print("Start\n");
    }

    public Node at(int index) {
        System.out.printf("index %s size %s\n", index, size);

        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return null;
        }

        if (index == size - 1) {
            return Tail;
        }

        Node temp = Head;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return temp;
            } else {
                temp = temp.next;
            }
        }

        return null;
    }


    public void add(int index, int value) {


        if (index == 0) {
            prepend(value);
        } else {

            Node prevNode = at(index - 1);
//           System.out.println(prevNode.value + "prevNode");
            if (prevNode != null) {

                Node newNode = new Node(value, prevNode.next, prevNode);

                prevNode.next = newNode;

                prevNode.next.prev = newNode;

                size += 1;

            }

        }
    }

    public Node delete(int index) {
if(!isValidIndex(index)) {


    if (index == 0) {

        Node deltedNode = Head;

        Head = Head.next;
        Head.prev = null;
        size -= 1;

        return deltedNode;
    } else {
        Node prevNode = at(index - 1);

        Node deletedNode = prevNode != null ? prevNode.next : null;


        if (prevNode != null) {
            System.out.printf("index %s size %s\n, delete", index, size - 1);


            if (index == size - 1) {
                System.out.println("coming");
                Tail = prevNode;
                Tail.next = null;
            } else {
                prevNode.next = prevNode.next.next;
                prevNode.next.prev = prevNode;
            }

            size =  size -1;
            System.out.printf("value%s,size%s\n", prevNode.value, size);
        }
        return deletedNode;
    }
}else {
    return null;
}
    }

    public boolean isValidIndex(int index){
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return true;
        }else {
            return  false;
        }
    }
}