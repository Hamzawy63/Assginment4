package eg.edu.alexu.csd.datastructure.linkedList.cs26.cs59;

import java.awt.*;

public class Polynomial {
    singlyLinkedList A = new singlyLinkedList();
    singlyLinkedList B = new singlyLinkedList();
    singlyLinkedList C = new singlyLinkedList();

    public void  setPolynomial(char poly, int[][] terms)
    {
        singlyLinkedList tmp = new singlyLinkedList();
        Point term = new Point();
        for(int i =terms.length-1 ;i>=0;i++ ) // to order the linkedlist in descending order
        {
            for(int j =0 ;j<terms[0].length ;j++ )
            {
                term.x = terms[i][j] ;
                term.y =  j;
            }
            if(poly == 'A')
                A.add(term);
            else if (poly == 'B')
                B.add(term);
            else if((poly == 'C'))
                C.add(term);

        }

    }

}
