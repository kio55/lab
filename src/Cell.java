public class Cell {
    private String element;
    private Cell next;
    //геттеры
    public String getElement(){
        return element;
    }
    public Cell getNext(){
        return next;
    }
    //сеттеры
    public void setElement(String element){
        this.element=element;
    }
    public void setNext(Cell next){
        this.next=next;
    }
    //конструктор для последнего элемента
    public Cell(String element){
        this.next=null;
        this.element=element;
    }
    //конструктор для обычных элементов
    public Cell(String element, Cell next){
        this.next=next;
        this.element=element;
    }

}