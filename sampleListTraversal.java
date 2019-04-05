import java.util.*;
import java.io.*;
import java.lang.*;

class sampleListTraversal
{
    //we create head of the linked list
    static   Node head;
    static class Node{

        int data;
        Node next;

        //constructor
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void print()
    {
        Node n=head;
        while(head!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String args[])
    {
        sampleListTraversal slt=new sampleListTraversal();
        slt.head=new Node(1);
        Node f1=new Node(2);
        Node f2=new Node(3);
        Node f3=new Node(4);
        slt.head.next=f1;
        f1.next=f2;
        f2.next=f3;
        

        try{
            sampleListTraversal.print();
        }catch(Exception e){
            System.out.print("HAHAHAHAHA");
        }
        
    }
}