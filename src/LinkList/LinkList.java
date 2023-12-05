package LinkList;

public class LinkList {

    // node class starts
    public class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node nextNode) {
            this.value = value;
            next = nextNode;
        }
    }

    // node class end


    public Node Head;
    public Node Tail;
    public int size;


    public void append(int value) {

        Node newNode = new Node(value);

        if (Head == null) {
            Tail = newNode;
        } else {
            newNode.next = Head;
        }

        Head = newNode;
        size += 1;
    }


    public void prepend(int value) {
        if (Head == null) {
            append(value);
        } else {
            Node newNode = new Node(value);
            Tail.next = newNode;
            Tail = newNode;
            size += 1;
        }
    }


    public void print() {
        Node temp = Head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + ">");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public Node at(int index) {

        if (index < 0 || index >= size ) {
            System.out.println("out of Range");
            return null;
        }

        if (index  == size -1) {
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


  public  void   add(int index, int value) {

      if (index < 0 || index >= size) {
          System.out.println("out of Range");
          return;
      }
      if( index == 0 ){
          append(value);
      }else {
        Node prevsNode = at(index -1 );
        prevsNode.next = new Node(value, prevsNode.next);
          size +=1;
      }
    }

    public  void delete (int index) {

        if (index < 0 || index >= size) {
            System.out.println("out of Range");
            return;
        }
        if( index == 0 ){
            Head  = Head.next;
            size -= 1;
        }else{
            Node prevsNode = at(index -1 );
            prevsNode.next =  prevsNode.next.next;
            size -=1;
        }
    }
}

