///// printing the elements in the doubly linkedlist
//
////public class DobleLL {
////
////    static class Node{
////        int val;
////        Node next;
////        Node prev;
////        Node(int val)
////        {
////            this.val=val;
////        }
////    }
////
////
////    //    iterate from head to tail
////    static void displayfront(Node head) {
////        Node tem = head;
////        while (tem != null) {
////            System.out.println(tem.val);
////            tem = tem.next;
////        }
////    }
////
////    //    iterate from tail to head
////    static void displayback(Node tail)
////    {
////        Node temp=tail;
////        while(temp!=null)
////        {
////            System.out.println(temp.val);
////            temp=temp.prev;
////        }
////    }
////
////    public static void main(String[] args)
////    {
////
////        Node a = new Node(12);
////        Node b = new Node(22);
////        Node c = new Node(32);
////        Node d = new Node(42);
////        Node e = new Node(52);
////        a.next=b;
////        a.prev=null;
////        b.next=c;
////        b.prev=a;
////        c.next=d;
////        c.prev=b;
////        d.next=e;
////        d.prev=c;
////        e.prev=d;
////        e.next=null;
//////        displayfront(a);
////        displayback(e);
////
////    }
////
////}
//
//// printing elements in random form
//
////public class DobleLL {
////
////    static class Node
////    {
////        int val;
////        Node next;
////        Node prev;
////        Node(int val)
////        {
////            this.val=val;
////        }
////    }
////    static void display(Node head) {
////        Node temp = head;
////        while (temp.prev != null)
////        {
////            temp = temp.prev;
////        }
////        while (temp!= null)
////        {
////            System.out.println(temp.val);
////            temp = temp.next;
////        }
////    }
////
////
////    public static void main(String[] args)
////    {
////        Node a = new Node(13);
////        Node b = new Node(23);
////        Node c = new Node(33);
////        Node d = new Node(43);
////
////        a.next=b;
////        a.prev=null;
////        b.prev=a;
////        b.next=c;
////        c.next=d;
////        c.prev=b;
////        d.prev=c;
////        d.next=null;
////        display(d);
////
////    }
////}
//

//insertAthead of doublylinkedlist

//public class DobleLL {
//
//     static class Node{
//         int val;
//         Node next;
//         Node previous;
//         Node(int val)
//         {
//             this.val=val;
//         }
//     }
//     static class Link{
//         Node head=null;
//         Node previous=null;
//
//         void insertatend(int val)
//         {
//             Node temp = new Node(val);
//             if(head==null)
//             {
//                 head=temp;
//
//             }
//             else
//             {
//               previous.next=temp;
//             }
//             previous=temp;
//         }
//     }
//
//     void insertAt(int index,int val)
//     {
//
//     }
//     static void display(Node head)
//     {
//         Node temp=head;
//         while(temp!=null)
//         {
//             System.out.println(temp.val+"");
//             temp=temp.next;
//         }
//     }
//    static void insertAttail(Node head,int x)
//    {
//        Node temp=head;
//        while(temp!=null)
//        {
//            System.out.println(temp.val+"");
//            temp=temp.next;
//        }
//        Node t= new Node(x);
//        temp.next=t;
//        t.previous=temp;
//    }
//     static Node insertAthead(Node head ,int x)
//     {
//         Node t= new Node(35);
//         t.next=head;
//         head.previous=t;
//         head=t;
//         return head;
//
//     }
//    public static void main(String[] args)
//    {
//        Node a= new Node(12);
//        Node b= new Node(22);
//        Node c= new Node(32);
//       a.next=b;
//       b.previous=a;
//       b.next=c;
//       c.previous=b;
//       c.next=null;
// Node newhead= insertAthead(a,35);
////  display(newhead);
//
// insertAttail(a,52);
//
//    }
//}