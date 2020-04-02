
public class Stack {

    private final LinkedRealization linkedList = new LinkedRealization();

    public void push(String value) {
        linkedList.pushTop(value);
    }

    public String pop() {
        return linkedList.pop();
    }

    public String peek() {
        return linkedList.peekHead();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public int size() {
        return linkedList.getsize();
    }

    @Override
    public String toString() {
        StringBuilder returndata = new StringBuilder();
        for (int i=1; i<linkedList.getsize()+1;i++){
            returndata.append(linkedList.ReturnData(i)).append(" ");
        }
        return returndata.toString();
    }
}

