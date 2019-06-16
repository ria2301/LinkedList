import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    public Node(int data , Node next)
    {
        this.data = data;
        this.next = next;
    }
}
public class LinkedList
{
    Node head;
    void insert_at_end(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    void insert_at_beginning(Node newnode)
    {
        newnode.next = head;
        head = newnode;
    }
    void insert_before_node(Node newnode , Node beforenode)
    {
        Node current = head;
        Node previous = null;
        while(current.data != beforenode.data)
        {
            previous = current;
            current = current.next;
        }
        newnode.next = previous.next ;
        previous.next = newnode;
    }
    void insert_after_node(Node afternode, Node newnode)
    {
        Node current = head;
        Node previous = null;
        while(current.data != afternode.data)
        {
            previous = current;
            current = current.next;
        }
        newnode.next = current.next;
        current.next = newnode;
    }
    void display()
    {
        Node temp  = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void delete_From_beginning()
    {
        if(head!=null)
        {
            head = head.next;
        }
    }
    void delete_from_end()
    {
        if(head == null)
        {
            System.out.println("empty list");
        }
        else
        {
            Node current = head;
            Node previous = null;
            while (current.next != null)
            {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }
    void delete_before_node(Node beforenode)
    {
        Node current = head;
        Node previous = null;
        while(current.data != beforenode.data)
        {
            previous = current;
            current = current.next;
        }
        previous.data = current.data;
        previous.next = current.next;
    }
    void delete_after_node(Node afternode)
    {
        Node current = head;
        Node previous = null;
        while(current.data != afternode.data)
        {
            previous = current;
            current = current.next;
        }
        current.next = current.next.next;
    }
    public static void main(String args[])
    {
        LinkedList obj = new LinkedList();
        Node n1 = new Node(10,null);
        Node n2 = new Node(20,null);
        Node n3 = new Node(30,null);
        Node n4 = new Node(40,null);
        Node n5 = new Node(50,null);
        obj.insert_at_end(n1);
        obj.display();
        obj.insert_at_end(n2);
        obj.display();
        obj.insert_at_beginning(n3);
        obj.display();
        obj.insert_after_node(n1,n4);
        obj.display();
        obj.insert_before_node(n5,n1);
        obj.display();
        obj.delete_From_beginning();
        obj.display();
        obj.delete_from_end();
        obj.display();
        obj.delete_before_node(n1);
        obj.display();

    }
}
