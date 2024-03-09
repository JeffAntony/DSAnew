// implment a method to return the element at given index of the linked list.
//public class Dsadec {
//
//
//
//    public static class Node{
//
//        int data;
//        Node next;
//        Node(int data)
//        {
//            this.data=data;
//        }
//    }
//    public static class LinkedList {
//
//        Node head = null;
//        Node tail = null;
//
//        void insert_at_end(int val)
//        {
//
//            if (head == null)
//            {
//                head = null;
//            }
//            else
//            {
//                tail.next = tail;
//            }
//            tail = tail  ;
//        }
//
//        void display() {
//            Node temp = head;
//            while (temp != null) {
//                System.out.println(temp.data + " ");
//            }
//            System.out.println();
//        }
//
//        int getA(int index) {
//            Node temp = head;
//            for (int i = 0; i < index; i++) {
//                temp = temp.next;
//            }
//            return temp.data;
//        }
//
//        void insertAt(int index, int val) {
//            Node t = new Node(val);
//            Node temp = head;
//
//
//            for (int i = 0; i < index; i++) {
//                temp = temp.next;
//            }
//            t.next = temp.next;
//            temp.next = t;
//        }
//    }
//
//    public static void main(String[] args)
//    {
//
//        LinkedList ll = new LinkedList();
//        ll.insert_at_end(67);
//        ll.insert_at_end(12);
//        ll.insert_at_end(89);
//        ll.insert_at_end(124);
//        ll.display();
//        System.out.println("___________");
//        System.out.println("the value of any index "+ll.getA(2));
//
//    }
//}

//finding nth node from the end of the LinkedList

//public class Dsadec {
//
//    public static class Node nthNOde(Node head, int n)
//    {
//        int size=0;
//        Node temp=head;
//    }
//}

//public class Dsadec {
//    public static class Node{
//        int data;
////        int interface;
//        Node(int data)
//        {
//            this.data=data;
//        }
//    }
////  int x=0xFACE;
////   System.out.print(x);
//    public static void main(String[] args) {
//        Node a = new Node(56);
//        Node b= new Node(43);
//        Node c = new Node(53);
//        Node d = new Node(73);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        int x=0xFACE;/*
//        int new=23*/
//        double j=0xBee;
////        cha
////        double a=1_3_4_5_6.7_6_8;
//        System.out.print(x);
//        Example:
//       public class Dsadec
//        {
//            public static void sum(int... x)
//            {
//                int total=0;
//                for(int i=0;i<x.length;i++)
//                {
//                    total=total+x[i];
//                }
//                System.out.println("The sum :"+total);
//            }
//            public static void main(String[] args)
//            {
//                sum();
//                sum(10);
//                sum(10,20);
//                sum(10,20,30,40);
//
//
//            }
//public static void methodOne(int i)
//{
//    System.out.println("general method");
//}
//        public static void methodOne(int... i)
//        {
//            System.out.println("var-arg method");
//        }
//        public static void main(String[] args)
//        {
//            methodOne();//var-arg method
//            methodOne(10,20);//var-arg method
//            methodOne(10);//general method
//        }
//        }
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//    }
//}

//public class Dsadec {
//       public void methodOne(int i)
//       {
//              System.out.println("int-arg method");
//       }
//       public void methodOne(float f) //overloaded methods
//       {
//              System.out.println("float-arg method");
//       }
//       public static void main(String[] args)
//       {
//              Dsadec t=new Dsadec();
////t.methodOne('a');//int-arg method
////t.methodOne(10l);//float-arg method
//              t.methodOne(10.5f);//C.E:cannot find symbol
//              t.methodOne(12.456f);
//       }



//    public void methodOne(int i,float f) {
//        System.out.println("int-float method");
//    }
//    public void methodOne(float f,int i) {
//        System.out.println("float-int method");
//    }
//    public static void main(String[] args){
//
//        Dsadec t=new Dsadec();
//        t.methodOne(10,10.5f);//int-float method
//        t.methodOne(10.5f,10);//float-int method
//        t.methodOne(10,10.f); //C.E:
//        //CE:reference to methodOne is ambiguous,
//        //both method methodOne(int,float) in Test
//        //and method methodOne(float,int) in Test match
//        t.methodOne(10.5f,10);//C.E:



//    class Animal{
//
//    }
//    class Monkey extends Animal{}
//    class Test {
//        public void methodOne(Animal a) {
//            System.out.println("Animal version");
//        }
//
//        public void methodOne(Monkey m) {
//            System.err.println("Monkey version");
//        }
//    }
//        public class Dsadec {
//            public static void main(String[] args) {
//                Test t = new Test();
//                Animal a = new Animal();
//                t.methodOne(a);//Animal version
//                Monkey m = new Monkey();
//                t.methodOne(m);//Monkey version
//                Animal a1 = new Monkey();
//                t.methodOne(a1);//Animal version
////        }
////    }
//
//
//                class Parent {
//                    public final void methodOne() {
//                    }
//                }
//                class Child extends Parent {
////                    public final void methodOne()
//                    {
//                        Test t1 = new Test();
//                        Test t2 = (Test)t1.Clone();
//
//                    }
//                }
//            }
//        }
//
//public class Dsadec {
//    public static class Node{
//        int data;
//        Node next;
//        Node(int data)
//        {
//            this.data=data;
//        }
//
//    }
//    public static void main(String[] args)
//    {
//       Node a = new Node(23);
//       Node b= new Node(34);
//       Node c= new Node(45);
//       Node d= new Node(65);
//
//       a.next=b;
//       b.next=c;
//       c.next=d;
//       Node temp=a;
//       for(int i=1; i<5; i++)
//       {
//           System.out.println(temp.data+"");
//           temp=temp.next;
//       }
//        System.out.println(next);
//        System.out.println(a);
//    }
//
//}
//class ListNode{
//    int val;
//    ListNode next;
//    ListNode(int val)
//    {
//        this.val=val;
//    }
//
//}
//class A{
//    public ListNode deletemiddle(ListNode head)
//    {
//        if(head==null||head.next==null)
//        {
//            return null;
//        }
//        ListNode slow=head;
//        ListNode fast=head;
//        ListNode prev=null;
//
//        while(fast!=null&&fast.next!=null)
//        {
//            prev=slow;
//            slow=slow.next;
//            fast=fast.next.next;
//
//        }
//        if(prev!=null)
//        {
//            prev.next=slow.next;
//        }
//        else {
//            head=head.next;
//        }
//        return head;
//    }
//}
//
//public  class Dsadec {
//    public static void printlist(ListNode head)
//    {
//        ListNode current=head;
//        while(current!=null)
//        {
//            System.out.println(current.val+"");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args)
//    {
//        ListNode head= new ListNode(1);
//        head.next=new ListNode(67);
//        head.next.next= new ListNode(12);
//        head.next.next.next= new ListNode(78);
//        head.next.next.next.next= new ListNode(8);
//
//        System.out.println("original");
//        printlist(head);
//
//        A k= new A();
//        k.deletemiddle(head);
//        System.out.println("delete");
//        printlist(head);
//
//    }
//
//}

//circular linkedlist :
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
//
//public class Dsadec {
//    public boolean hasCycle(ListNode head) {
//        // check if the linkedlist is empty or has only one node
//        if (head == null || head.next == null) {
//            return false;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//
//            // if there is a cycle ,the slow and fast pointer will meet
//            if (slow == fast)
//            {
//                return true;
//            }
//        }
//        // if the loop complete,there is no cycle
//        return false;
//    }
//
//    public static void main(String[] args) {
//        // ListNode | linked list
//        ListNode head = new ListNode(5);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(78);
//        head.next.next.next = new ListNode(89);
//        head.next.next.next.next = head.next;
//
//        Dsadec solution = new Dsadec();
//        boolean hasCycle = solution.hasCycle(head);
//
//        if (hasCycle) {
//            System.out.print("cycle is present in thids code ");
//        } else {
//            System.out.println("cycle is not present ");
//        }
//    }
//}

//public class Dsadec {
//    static class Node {
//        int val;
//        Node next;
//
//        Node(int val)
//        {
//            this.val=val;
//        }
//    }
//    static void display(Node head)
//    {
//        Node first=head;
//        Node last=head.next.next;
//
//        while(first!=null&&last&&!= )
//        {
//            first=head.next;
//            last
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        Node a= new Node(12);
//        Node b= new Node(22);
//        Node c= new Node(32);
//        Node d=new Node(42);
//
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=null;
//        display(a);
//
//    }
//}

//public class Dsadec {
//
//    Node
//    int val;
//    Node next
//}

// reverse a Linkedlist ans return it's new head

//public class Dsadec {
//    static class Node{
//
//        int val;
//        Node next;
//        Node(int val)
//        {
//            this.val=val;
//        }
//    }
//    static void display(Node head)
//    {
//        if(head==null)
//        {
//            return;
//        }
//        display(head.next);
//        System.out.println(head.val+"");
//    }
//
//    public static void main(String[] args)
//    {
//        Node a = new Node(56);
//        Node b= new Node(45);
//        Node c= new Node(12);
//        Node d = new Node(78);
//        Node e = new Node(72);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=null;
//        display(a);
//
//    }
//}

// printing the elements in the doubly linkedlist

//public class Dsadec {
//
//    static class Node{
//        int val;
//        Node next;
//        Node prev;
//        Node(int val)
//        {
//            this.val=val;
//        }
//    }
//
//
////    iterate from head to tail
//    static void displayfront(Node head) {
//        Node tem = head;
//        while (tem != null) {
//            System.out.println(tem.val);
//            tem = tem.next;
//        }
//    }
//
////    iterate from tail to head
//     static void displayback(Node tail)
//     {
//         Node temp=tail;
//         while(temp!=null)
//         {
//             System.out.println(temp.val);
//             temp=temp.prev;
//         }
//     }
//
//    public static void main(String[] args)
//    {
//
//        Node a = new Node(12);
//        Node b = new Node(22);
//        Node c = new Node(32);
//        Node d = new Node(42);
//        Node e = new Node(52);
//        a.next=b;
//        a.prev=null;
//        b.next=c;
//        b.prev=a;
//        c.next=d;
//        c.prev=b;
//        d.next=e;
//        d.prev=c;
//        e.prev=d;
//        e.next=null;
////        displayfront(a);
//        displayback(e);
//
//    }
//
//}

//import java.util.*;
//public class Dsadec {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data)
//        {
//            this.data=data;
//        }
//
//    }
//    static class LinkedList {
//        Node head = null;
//        Node tail = null;
//
//        void insertAtend(int val) {
//            Node temp = new Node(val);
//            if (head == null)
//            {
//                head = temp;
//            }
//            else
//            {
//                tail.next = temp;
//
//            }
//            tail = temp;
//        }
//
//        void display() {
//            Node temp = head;
//            while (temp != null) {
//                System.out.println(temp.data + "");
//                temp = temp.next;
//            }
//
//        }
//    }
//
//    public static void main(String[] args)
//    {
//       LinkedList ll= new LinkedList();
//       ll.insertAtend(66);
//        ll.insertAtend(12);
//        ll.insertAtend(98);
//        ll.insertAtend(22);
//        ll.display();
//
//    }
//}
