package eg.edu.alexu.csd.datastructure.linkedList.cs26.cs59;

public class myMain {

    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.add(120);
        list.add(1);
        list.add(11);
        list.add(1);
        list.add(100);
        list.print();
        System.out.println(list.size());
        System.out.println(list.contains(120));
        System.out.println(list.get(2));
    }

}
