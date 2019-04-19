package eg.edu.alexu.csd.datastructure.linkedList.cs26.cs59;

import java.awt.*;

public class Polynomial {
    singlyLinkedList A = new singlyLinkedList();
    singlyLinkedList B = new singlyLinkedList();
    singlyLinkedList C = new singlyLinkedList();

    public void  setPolynomial(char poly, int[][] terms) /// not tested yet
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

    public String print(char poly)
    {
        switch (poly)
        {
            case 'A':
                return print(A);
            case 'B':
                return print(B);
            case 'C':
                return print(C);
        }
        return "an Error occured this character is unavailable ";
    }
    public String print(singlyLinkedList poly)
    {
        String representation = "";
        singlyLinkedList.singlyLinkedListNode tmp = poly.head;
        int redundantVariable = 0;
        while(tmp!=null)
        {
            Point termPoint  =(Point) (tmp.value);
            representation.concat(Integer.toString(termPoint.x));
            representation.concat("X^");
            representation.concat(Integer.toString(termPoint.y));
            if(redundantVariable !=poly.size()-1 )
                representation.concat("X^");
            redundantVariable++;
        }
        return representation;
    }

    public float evaluatePolynomial(char poly, float value) /// not tested yet
    {
        if(poly == 'A')
            return evaluatePolynomial(A,value);
        else if (poly == 'B')
            return evaluatePolynomial(A,value);


        return evaluatePolynomial(A,value);


    }
    public float evaluatePolynomial(singlyLinkedList poly, float value) /// method overloading
    {


        float result=0;
        singlyLinkedList.singlyLinkedListNode tmp = poly.head; // a pointer at head node
        while(tmp!=null)
        {
            Point term = (Point) tmp.value;
            int x = term.x; /// coeffecient
            int y = term.y; /// exponential
            result += value*y+x;
        }

        return result;
    }

}
