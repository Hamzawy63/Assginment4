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
        int [][]  a  = {{5},{4},{3}};

        Polynomial poly = new Polynomial();
        poly.setPolynomial('A',a);
        System.out.println(poly.print('A'));
        System.out.println(poly.evaluatePolynomial('A',1));

         }


}
