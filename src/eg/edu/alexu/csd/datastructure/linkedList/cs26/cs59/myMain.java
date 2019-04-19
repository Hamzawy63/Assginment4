package eg.edu.alexu.csd.datastructure.linkedList.cs26.cs59;

import java.awt.*;

public class myMain {

    public static void main(String[] args) {
        /**
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
        **/
        Polynomial poly = new Polynomial();
        singlyLinkedList list = new singlyLinkedList();
        list.add(new Point(3,2));
        list.add(new Point(4,1));
        list.add(new Point(5,-1));
        poly.A = list;

        System.out.println(poly.print('A'));

         }

}
