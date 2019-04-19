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
        //poly.setPolynomial('A',a);
       // System.out.println(poly.print('A'));
        //System.out.println(poly.evaluatePolynomial('A',1));

        singlyLinkedList list = new singlyLinkedList();
        list.add(new Point(1,2));
        list.add(new Point(1,5));
        list.add(new Point(1,0));
        System.out.println(poly.print(list));
        int arr[][] = poly.fillOnto2D(list);
        for( int  i = 0;i< arr.length;i++)
        {
            for(int j = 0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] +  " ");
            }
            System.out.println("");
        }



         }


}
