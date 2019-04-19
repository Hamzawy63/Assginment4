package eg.edu.alexu.csd.datastructure.linkedList.cs26.cs59;

import java.awt.*;

import static java.lang.Math.pow;

public class Polynomial {
    private singlyLinkedList  A = new singlyLinkedList();
    private singlyLinkedList  B = new singlyLinkedList();
    private  singlyLinkedList C = new singlyLinkedList();

    public void  setPolynomial(char poly, int[][] terms) /// not tested yet
    {
        singlyLinkedList tmp = new singlyLinkedList();
        Point term = new Point();
        for(int i =(terms.length-1) ;i>=0;i-- ) // to order the linkedlist in descending order
        {
            for(int j =0 ;j<terms[0].length ;j++ )
            {
                term.x = terms[i][j] ;
                term.y =  i;

                if(poly == 'A')
                    A.add(new Point(term));
                else if (poly == 'B')
                    B.add(new Point(term));
                else if((poly == 'C'))
                    C.add(new Point(term));

            }

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
    public String print(singlyLinkedList poly)  ///tested
    {
        String representation = " ";
        singlyLinkedList.singlyLinkedListNode tmp = poly.head;
        int redundantVariable = 0;
        while(tmp!=null)
        {
            Point termPoint  =(Point) (tmp.value);
            representation = representation.concat(Integer.toString(termPoint.x));
            representation = representation.concat("X^");
            representation = representation.concat(Integer.toString(termPoint.y));


            if(redundantVariable !=poly.size()-1 )
                representation=representation.concat("+");
            redundantVariable++;
            tmp = tmp.next;
        }
        return representation;
    }
    public float evaluatePolynomial(char poly, float value) /// not tested yet
    {
        if(poly == 'A')
            return evaluatePolynomial(A,value);

        else if (poly == 'B')
            return evaluatePolynomial(B,value);


        return evaluatePolynomial(C,value);


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
            result += pow(value,y)*x;
            tmp = tmp.next;
        }

        return result;
    }
    int[][] add(char poly1, char poly2)
    {

        return new int[2][2];
    }
    int[][] add(singlyLinkedList poly1, singlyLinkedList poly2)
    {
        return new int[2][2];
    }
    public int[][]  fillOnto2D(singlyLinkedList src)
    {
        int[][] dest =new int[1][sizeOfArr(src)];
        singlyLinkedList.singlyLinkedListNode ptr  = src.head;
        Point term;
        while (ptr !=null)
        {
            term = (Point) ptr.value;
            dest[0][term.y] = term.x;
            ptr = ptr.next;
        }
        return dest;
    }
    public int sizeOfArr(singlyLinkedList list)
    {
        singlyLinkedList.singlyLinkedListNode tmp = list.head;
        Point term = (Point) list.get(0);
        int size =term.y;
        while(tmp != null)
        {
            term = (Point) tmp.value;
            if(term.y>size)
                size = term.y;

            tmp = tmp.next; //out of if
        }
        return size+1;
    }

}