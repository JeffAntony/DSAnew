//
//// (1)
//
////public class l1 {
////    public static class Node{
////
////        int data;
////        Node next;
////        Node(int data)
////        {
////            this.data=data;
////        }
////    }
////
////    public static void main(String[] args) {
////        Node a =new Node(12);
////        Node b = new Node(78);
////        Node c= new Node(54);
////        Node d = new Node(23);
////        Node e = new Node(87);
////        Node f = new Node(15);
////        a.next= b;
////        b.next=c;
////        c.next=d;
////        d.next=e;
////        e.next=f;
////        Node temp=a;
////        for(int i=0; i<7; i++)
////        {
////            System.out.println(temp.data+" ");
////            temp=temp.next;
////        }
////    }
////}
//
////public class l1 {
////    public static void display(Node head)
////    {
////        Node temp=head;
////        while(temp!=null)
////        {
////
////            System.out.println(temp.data+"");
////            temp=temp.next;
////
////        }
////    }
////    public static class Node{
////        int data;
////        Node next;
////        Node(int data)
////        {
////            this.data=data;
////        }
////    }
////
////    public static void main(String[] args) {
////        Node a =new Node(12);
////        Node b = new Node(78);
////        Node c= new Node(54);
////        Node d = new Node(23);
////        Node e = new Node(87);
////        Node f = new Node(15);
////        a.next= b;
////        b.next=c;
////        c.next=d;
////        d.next=e;
////        e.next=f;
////        display(a);
////    }
////}
//
//
//
////(2)
//
////public class l1 {
////    public static class Node{
////
////        int data;
////        Node next;
////        Node(int data)
////        {
////            this.data=data;
////        }
////    }
////
////    public static void main(String[] args) {
////        Node a =new Node(34);
////        Node b = new Node(12);
////        Node c= new Node(98);
////        Node d = new Node(65;
////        Node e = new Node(43);
////        Node f = new Node(23);
////        a.next= b;
////        b.next=c;
////        c.next=d;
////        d.next=e;
////        e.next=f;
////        Node temp=a;
////        for(int i=0; i<7; i++)
////        {
////            System.out.println(temp.data+" ");
////            temp=temp.next;
////        }
////    }
////}
//
////public class l1 {
////    public static void display(Node head)
////    {
////        Node temp=head;
////        while(temp!=null)
////        {
////
////            System.out.println(temp.data+"");
////            temp=temp.next;
////
////        }
////    }
////    public static class Node{
////        int data;
////        Node next;
////        Node(int data)
////        {
////            this.data=data;
////        }
////    }
////
////    public static void main(String[] args) {
////        Node a =new Node(34);
////        Node b = new Node(12);
////        Node c= new Node(98);
////        Node d = new Node(65);
////        Node e = new Node(43);
////        Node f = new Node(23);
////        a.next= b;
////        b.next=c;
////        c.next=d;
////        d.next=e;
////        e.next=f;
////        display(a);
////    }
////}
//
////(3)
//
//import java.util.*;
//public class l1 {
//    public static class Node{
//
//        Scanner sc = new Scanner(System.in);
//        int data = sc.nextInt();
//        Node next;
//        Node(int data)
//        {
//            this.data=data;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node a =new Node(34);
//        Node b = new Node(12);
//        Node c= new Node(98);
//        Node d = new Node(65);
//        Node e = new Node(43);
//        Node f = new Node(23);
//        a.next= b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=f;
//        Node temp=a;
//        for(int i=1; i<7; i++)
//        {
//            System.out.println(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//}

//interface Sy{
//    void gets();
//}
//absract class p implemnts P{
//    public void gets();
//}


//public class l1 {
//    public static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }
//
//    public static class LinkedList {
//        Node head = null;
//        Node tail = null;
//
//        // inset at end
//        void insertAtEnd(int val) {
//            Node temp = new Node(val);
//            if (head == null) {
//                head = temp;
//            } else {
//                tail.next = temp;
//            }
//            tail = temp;
//        }
//
//        void display() {
//            Node temp = head;
//            while (temp != null) {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//        }
//
//        void insertAtHead(int val) {
//            Node temp = new Node(val);
//
//            if (head == null) {//head=null and tail =null
//                head = temp;//head=34 reassign null
//                tail = temp;
//            } else {
//                temp.next = head;//34 67
//                head = temp;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.insertAtEnd(67);
//        ll.insertAtEnd(89);
//        ll.insertAtEnd(12);
//        ll.insertAtEnd(97);
//        ll.display();
//
//        System.out.println();
//        System.out.println("-------------------------");
//        ll.insertAtHead(34);
//        ll.display();
//    }
//}

import java.util.*;
public class l1 {
    static void p(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    static void swap(int a[] ,int r, int b)
    {
        int t=a[r];
        a[r]=a[b];
        a[b]=t;

    }

    static void sort(int a[])
    {
        int l=0;
        int b=a.length-1;
        while(l<b)
        {
          if(a[l]>a[b])
            {
                swap(a,l,b);

            }
            l++;
            b--;

        }
    }
    public static void main(String[] args) {

        int a[]={0,2,0,4,0,8,0};
        sort(a);
        p(a);

//

    }
}