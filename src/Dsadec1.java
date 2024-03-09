
// to find the length ofd the linkedList
//public class Dsadec1 {
//    public static void display(Node head)
//    {
//        Node temp=head;
//        while(temp!=null)
//        {
//            System.out.println(temp.data+"");
//            temp=temp.next;
//        }
//    }
//    public static int length(Node head)
//    {
//        int c=0;
//        while(head!=null)
//        {
//            c++;
//            head=head.next;
//        }
//        return c;
//    }
//    public static class Node{
//        int d;
//        int n;
//        Node(int d)
//        {
//            this.d=d;
//        }
//    }
//    public static void main(String[] args) {
//
//        Node a= new Node(34);
//        Node b= new Node(12);
//        Node c= new Node(34);
//        Node d= new Node(54);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        display(Node head);
//        System.out.println("print the length ");
//        System.out.println(length(a));
//    }
//
//}

//public class Dsadec1 {
//    public static void display(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.data + "");
//            temp = temp.next;
//        }
//    }
//
//    public static int length(Node head)
//    {
//        int c = 0;
//        while (head != null)
//        {
//            c++;
//            head = head.next;
//        }
//        return c;
//    }
//
//    public static class Node
//    {
//        int data;
//        Node next;
//
//        Node(int d)
//        {
//            this.data = d;
//            this.next = null; // Initialize next to null
//        }
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(34);
//        Node b = new Node(12);
//        Node c = new Node(34);
//        Node d = new Node(54);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//
//        display(a); // Pass 'a' instead of 'Node head'
//        System.out.println("Print the length ");
//        System.out.println(length(a));
//    }
//}

//public class Dsadec1 {
//
//    static void display(Node head)
//    {
//        Node temp=head;
//        while(temp!=null)
//        {
//            System.out.println(temp.data+"");
//             temp=temp.next;
//        }
//    }
//
//
//   public static int length(Node head)
//    {
//        Node temp;
//        int c=0;
//        while(head!=null)
//        {
//            c++;
//            head=head.next;
//        }
//        return c;
//    }
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//        public static void main(String[] args) {
//
//            Node a = new Node(12);
//            Node b = new Node(32);
//            Node c = new Node(42);
//            Node d = new Node(32);
//
//            a.next = b;
//            b.next = c;
//            c.next = d;
//            System.out.println("iterating the element");
//            display(a);
//            System.out.println("________________");
//            System.out.println("length of the elements in the Node");
//            System.out.println(length(a));
//
//
//        }
//    }

// implement a method to insert a node at the end of the linkedlist

import java.util.*;
import java.util.regex.Pattern;

//public class Dsadec1{
//
//    static class Node{
//        int data;
//        Node next;
//        Node (int data)
//        {
//            this.data=data;
//        }
//
//    }
//    static class LinkedList{
//        Node head;
//        Node tail=null;
////        insert at end
//
//        void insertAtend(int val)
//        {
//            Node temp= new Node(val);
//            if(head==null)
//            {
//                head=temp;
//            }
//            else
//            {
//                tail.next=temp;
//             }
//            tail=temp;
//    }
//      void display()
//      {
//          Node temp=head;
//          while(temp!=null)
//          {
//              System.out.println(temp.data+" ");
//              temp =temp.next;
//          }
//      }
//    }
//public static void main(String[]args)
//{
//
//    LinkedList ll = new LinkedList();
//     ll.insertAtend(23);
//    ll.insertAtend(43);
//    ll.insertAtend(33);
//    ll.insertAtend(53);
//    ll.insertAtend(63);
//    ll.display();
//
//        }
//        }

//
//public class Dsadec1 {
//    public static class Node
//    {
//        int val;
//        Node next;
//
//        Node(int val) {
//            this.val = val;
//        }
//    }
//
//    public static Node reverse(Node head)
//    {
//        if (head.next == null) {
//            return head;
//        }
//        Node newHead = reverse(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
//
//    public static void display(Node head)
//    {
//        if (head == null) {
//            return;
//        }
//        System.out.print(head.val + " ");
//        display(head.next);
//    }
//
//    public static void main(String[] args)
//    {
//        Node a = new Node(56);
//        Node b = new Node(45);
//        Node c = new Node(12);
//        Node d = new Node(78);
//        Node e = new Node(72);
//        a.next =b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = null;
//        System.out.println("display");
//        display(a);
//        System.out.println();
//        a = reverse(a);
//        display(a);
//    }
//}

//public class Main {
//    public static class Node {
//        int val;
//        Node next;
//
//        Node(int val) {
//            this.val = val;
//        }
//    }
//
//    public static Node reverse(Node head) {
//        if (head.next == null) {
//            return head;
//        }
//        Node newHead = reverse(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
//
//    public static void display(Node head) {
//        if (head == null) {
//            return;
//        }
//        System.out.print(head.val + " ");
//        display(head.next);
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(56);
//        Node b = new Node(45);
//        Node c = new Node(12);
//        Node d = new Node(78);
//        Node e = new Node(72);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = null;
//        System.out.println("display");
//        display(a);
//        System.out.println();
//        a = reverse(a);
//        display(a);
//    }
//}
//----------------------------------------------------------
//        third way :without recurssion :
//public class Dsadec1 {
//    public static class Node
//    {
//        int val;
//        Node next;
//
//        Node(int val)
//        {
//            this.val = val;
//        }
//    }
//
//    public static Node reverse(Node head)
//    {
//        Node current = head;
//        Node previous = null;
//        Node after = null;
//        while (current != null)
//        {
//            // number swap
//            after = current.next;
//            current.next = previous;
//            previous = current;
//            current = after;
//        }
//        return previous;
//    }
//
//    public static void display(Node head)
//    {
//        if (head == null)
//        {
//            return;
//        }
//        System.out.print(head.val + " ");
//        display(head.next);
//    }
//
//    public static void main(String[] args)
//    {
//        Node a = new Node(56);
//        Node b = new Node(45);
//        Node c = new Node(12);
//        Node d = new Node(78);
//        Node e = new Node(72);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = null;
//        System.out.println("display");
////        display(a);
//        System.out.println();
//        Node r = reverse(a);
//        display(r);
//    }
//}
