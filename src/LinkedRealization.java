public class LinkedRealization {
    private Cell top;
    private Cell end;
    private int size;

    public LinkedRealization() {
        this.top = null;
        this.end = null;
        this.size = 0;
    }

    public int getsize() {
        return size;
    }

    public Cell getTop() {
        return top;
    }

    public boolean isEmpty() {
        if (top == null)
            return true;
        return false;
    }

    public void push(String elm) {
        size++;
        if (end == null) {
            end = new Cell(elm);
            top = end;
            return;
        }

        end.setNext(new Cell(elm));
        end = end.getNext();
    }

    public void pushTop(String elm) {
        size++;
        if (top == null) {
            top = new Cell(elm);
            end = top;
            return;
        }
        top = new Cell(elm,top);
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String element = this.top.getElement();
        this.top = top.getNext();
        size--;
        return element;
    }

    public String ReturnData(int index) {
        if (index > size || index < 0) {
            return null;
        }
        Cell current = top;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getElement();
    }

    public String peekHead() {
        return top == null ? null : top.getElement();
    }



}
