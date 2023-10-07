
import Stack.Stack;
public class Main {
    public static void main(String[] args) {

        Stack<Integer> sampleStackList = new Stack<Integer>(2);
        sampleStackList.getSize();
        sampleStackList.add(8);
        sampleStackList.add(10);
        sampleStackList.add(90);
        sampleStackList.getSize();

        int latestvalue =   sampleStackList.peak();
        System.out.println("latestValue " + latestvalue);
        sampleStackList.showList();
        sampleStackList.removeItem();
        sampleStackList.getSize();

        sampleStackList.showList();
        sampleStackList.getSize();

        Stack<String> sampleStringStackList = new Stack<String>(2);

        sampleStringStackList.add("driving");
        sampleStringStackList.add("swimming");
        sampleStringStackList.add("games");
        sampleStringStackList.showList();
    }
}