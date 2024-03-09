import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;
//public class Stackdd {
//    public static void main(String[] args)
//    {
//
//        Stack a = new Stack<>();
//        a.push('e');
//        a.push('c');
//        a.push('b');
//        Collections.sort(a);
//        System.out.println(a);
//
////        Iterator it = a.iterator();
////        while (it.hasNext())
////        {
////            System.out.println(it.next());
////        }
//    }
//}


//public class Stackdd {
//    public static void main(String[] args) {
//
//        Stack <Integer> st= new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        Stack <Integer> gt= new Stack<>();
//        while(st.size()>0)
//        {
//            gt.push(st.pop());
//        }
//        System.out.println(gt);
//
//        Stack <Integer> rt= new Stack<>();
//        while(gt.size()>0)
//        {
//            rt.push(gt.pop());
//        }
//        System.out.println(rt);
//
//
//    }
//}


// display in the array
//public class Stackdd {
//    public static void main(String[] args) {
//
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        int n=st.size();
//        int b[]= new int[n];
//
//        for(int i=n-1; i>=0; i--)
//        {
//            b[i]=st.pop();
//        }
//        for(int i=0; i<n; i++)
//        {
//            System.out.println(b[i]);
//            st.push(b[i]);
//
//        }
//        System.out.println("st"+st);
//
//
//    }
//}

//reverse the stack
//public class Stackdd {
//    public static void main(String[] args)
//    {
//             Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(22);
//        st.push(32);
//        st.push(73);
//        st.push(52);
//        Stack <Integer> rt= new Stack<>();
////        System.out.println("peel element"+st.peek());
//        while(st.size()>0)
//        {
//            int x=st.peek();
//            rt.push(x);
//            st.pop();
//        }
//        System.out.println(st);
//        System.out.println(rt);
//
//    }
//}

//second way to reverse the stack

//public class Stackdd {
//    public static void main(String[] args)
//    {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(22);
//        st.push(32);
//        st.push(73);
//        st.push(52);
//        System.out.println(st);
//        Stack <Integer> rt= new Stack<>();
//
//        while(st.size()>0)
//        {
//            rt.push(st.pop());
//        }
////        System.out.println(st);
//        System.out.println(rt);
//        }
//    }

//
//public class Stackdd {
//    public static void main(String[] args)
//    {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(22);
//        st.push(32);
//        st.push(73);
//        st.push(52);
//        System.out.println(st);
//        Stack <Integer> rt= new Stack<>();
//
//        while(st.size()>0)
//        {
//            rt.push(st.pop());
//        }
////        System.out.println(st);
//        System.out.println(rt);
//        Stack <Integer> gt= new Stack<>();
//
//        while(rt.size()>0)
//        {
//            gt.push(rt.pop());
//        }
//        System.out.println(gt);
//
//    }
//}
//__________________________________________________________________________________________________________________________________________________________________________
// 20-12-23

// add an element through user defined method
import java.util.*;

//public class Stackdd{
//    static void display(Stack <Integer> st)
//    {
//        st.push(23);
//    }
//    public static void main(String[] args) {
//
//        Stack <Integer> st= new Stack();
//        st.push(12);
//        st.push(22);
//        st.push(32);
//        st.push(42);
//        System.out.println("original"+st);
//        display(st);
//        System.out.println(st);
//
//
//    }
///}


// reverse of the stack

import java.util.*;
//
//public class Stackdd{
//
//    public static void main(String[] args) {
//
//        Stack <Integer> st= new Stack();
//        st.push(12);
//        st.push(22);
//        st.push(32);
//        st.push(42);
//        System.out.println("st"+st);
//
//        Stack <Integer> gt= new Stack();
//        while(st.size()>0)
//        {
//            gt.push(st.pop());
//        }
//        System.out.println("gt"+gt);
//
//        Stack <Integer> qt= new Stack();
//        while(gt.size()>0)
//        {
//            qt.push(gt.pop());
//        }
//        System.out.println("qt"+qt);
//
//        while(qt.size()>0)
//        {
//            st.push(qt.pop());
//        }
//        System.out.println("st '"+st);
//
//    }
//}

// reverse through recursion
 import java.util.*;

//public class Stackdd {
//
//    static void pushat(Stack<Integer>st,int x)
//    {
//        if (st.size()==0)
//        {
//            st.push(x);
//            return;
//        }
//
//
//        int top = st.pop();
//        pushat(st, x);
//        st.push(top);
//    }
//    static void reverse(Stack<Integer>st)
//    {
//        if(st.size()==1)
//        {
//            return;
//        }
//        int top=st.pop();
//        reverse(st);
////        System.out.println("reverse"+top);
//        pushat(st,top);
//    }
//
//    public static void main(String[] args)
//    {
//
//       Stack <Integer> st = new Stack<>();
//       st.push(1);
//       st.push(2);
//       st.push(3);
//       st.push(4);
//        System.out.println("st"+st);
//        System.out.println("*****************");
//        reverse(st);
//        System.out.println("_________________________");
//        System.out.println(st);
//
//    }
//}

//underflow of the stack

//public class Stackdd {
// public static void main(String[] args)
// {
//  Stack <Integer>s = new Stack<>();
//   s.push(12);
//  s.push(22);
//  s.push(32);
//  s.push(42);
//  System.out.println("first time"+s);
//  s.pop();
//  System.out.println("second time"+s);
//  s.pop();
//  System.out.println("third time"+s);
//  s.pop();
//  System.out.println("fourth time"+s);
//  s.pop();
//  System.out.println("fifth time"+s);
//  s.pop();
//
// }
//}

//useer defined stack and methods , array implementation in stack

import java.util.*;

//public class Stackdd {
// public static class Stack
// {
//  int[] arr = new int[5];
//  private int index = 0;
//  int v;
//
//  void push(int x)
//  {
//   arr[index] = x;
//   index++;
//
//  }
//
//  int peek()
//  {
//   if (index == 0)
//   {
//    System.out.println("stack is empty");
//    return -1;
//   }
//   return arr[index - 1];
//  }
//
//  int pop()
//  {
//   if (index == 0)
//   {
//    System.out.println("stack is empty");
//    return -1;
//   }
//   int top = arr[index - 1];
//   arr[index - 1] = 0;
//   index--;
//   return top;
//  }
//
//  void display()
//  {
//   for (int i = 0; i<index; i++)
//   {
//    System.out.print(arr[i] + " ");
//   }
//   System.out.println();
//  }

//  int size()
//  {
//   return index;
//  }
// }

// public static void main(String[] args) {
//  Stack st = new Stack();
//  st.push(1);
//  st.display();
//  st.push(5);
//  1
//  1 5
//  1 5 1
//  1 5 1
//  st.display();
//  st.push(1);
//  st.display();
//  st.display();
//  System.out.println(st.peek()+" peek element");
//  st.pop();
//  System.out.println(st.pop()+"pop");
//  System.out.println(st.peek()+" peek element");
//  System.out.println(st.peek()+" peek element");
// }
//}
import java.util.*;
//public class Stackdd {
// public static boolean bracket(String str) {
//  Stack<Character> st = new Stack<>();
//  int n = str.length();
//  for (int i = 0; i < n; i++)
//  {//(())
//   char ch = str.charAt(i);// ( ( ) )
//   if (ch == '(')
//   {//)
//    st.push(ch);
//   }
//   else
//   {
//    if (st.size() == 0)
//    {
//     return false;
//    }
//    if (st.peek() == '(')
//    {
//     st.pop();
//    }
//   }
//  }
//  if (st.size() > 0)
//  {
//   return false;
//  }
//  else
//   return true;
// }
//
// public static void main(String[] args)
// {
//  Scanner sc = new Scanner(System.in);
//  String str = sc.next();
//  System.out.println(str);
//  System.out.println(bracket(str));
//
// }
//}

//searching algorithms

//bubble sort algorithms

// Java program for implementation
// of Bubble Sort
//class BubbleSort {
// static void bubbleSort(int arr[])
// {
//  int n = arr.length;
//  for (int i = 0; i < n - 1; i++)
//   for (int j = 0; j < n - i -1; j++)
//    if (arr[j] > arr[j + 1])
//    {// swap temp and arr[i]
//     int temp = arr[j];
//     arr[j] = arr[j + 1];
//     arr[j + 1] = temp;
//    }
// }
//
// // Prints the array
// void printArray(int arr[])
// {
//  int n = arr.length;
//  for (int i = 0; i < n; ++i)
//   System.out.print(arr[i] + " ");
//  System.out.println();
// }
//
// // Driver method to test above
// public static void main(String args[])
// {
//  BubbleSort ob = new BubbleSort();
//  int arr[] = { 64, 34, 25, 12, 22, 11, 90};
//  bubbleSort(arr);
//  System.out.println("Sorted array");
//  ob.printArray(arr);
// }
//}

//minimum element in the Stack;

//public class Stackdd {
// public static void main(String[] args) {
//
//  Stack <Integer> st= new Stack<>();
//  st
// }
////}
//
//
//
//
// public class Stackdd {
//   static int[] remove(int[] arr)
//   {
//    int n = arr.length;
//    Stack <Integer> st = new Stack();
//    for (int i = 0; i < n; i++)
//    {
//     if (st.size() == 0 || st.peek() != arr[i])
//     {
//      st.push(arr[i]);
//     }
//     else if (arr[i] == st.peek())
//     {
//      if (arr[i ]!= arr[i+1]||i==n-1 )
//      {
//       st.pop();
//      }
//     }
//    }
//    int[] res = new int[st.size()];
//    int m = res.length;
//    for (int i = m - 1; i >= 0; i--)
//    {
//     res[i] = st.pop();
//    }
//    return res;
//   }
//
//   public static void main(String[] args)
//                                      {
//    int arr[] = {1, 2, 2, 3, 10, 10, 10, 4, 4, 5, 7, 7, 2};
//    int[] re = remove(arr);
//    for (int i = 0; i < re.length; i++)
//    {
//     System.out.print(re[i] + " ");
//    }
//   }
//  }

// 26-12-23

//infinix - operator precedence
//
//import java.util.Stack;
//
//public class Stackdd {
//
// public static void main(String[] args)
// {
//  String c="8-5+3*4/6";
//  Stack<Integer> val= new Stack<>();
//  Stack<Character> op= new Stack<>();
//
//  for(int i=0; i<c.length(); i++)
//  {
//   char b=c.charAt(i);
//   int num=(int)b;
//
//   if(num>=48&&num<=57)
//   {
//    val.push(num-48);
//   }
//   else if(op.size()==0)
//   {
//    op.push(c);
//   }
//   else if(b=='+'|| b=='-')
//   {
//    int v2=val.pop();
//    int v1=val.pop();
//    if(op.peek()=='-')
//    {
//     val.push(v1-v2);
//    }
//    if(op.peek()=='+')
//    {
//     val.push(v1+v2);
//    }
//    if(op.peek()=='*')
//    {
//     val.push(v1*v2);
//    }
//    if(op.peek()=='/')
//    {
//     val.push(v1/v2);
//    }
//    op.pop();
//    op.push(b);
//   }
//   if(b=='*'||b=='/')
//   {
//    if(op.peek()=='*'||op.peek()=='/')
//    {
//     int v2=val.pop();
//     int v1=val.pop();
//     if(op.peek()=='*')
//     {
//      val.push(v1*v2);
//     }
//     if(op.peek()=='/')
//     {
//      val.push(v1/v2);
//     }
//     op.pop();
//     op.push(b);
//
//    }
//    else
//    {
//     op.push(b);
//    }
//   }
//   while(val.size()>1)
//   {
//    int v2=val.pop();
//    int v1=val.pop();
//
//    if(op.peek()=='-')
//    {
//     val.push(v1-v2);
//    }
//    if(op.peek()=='+')
//    {
//     val.push(v1+v2);
//    }
//    if(op.peek()=='*')
//    {
//     val.push(v1*v2);
//    }
//    if(op.peek()=='/')
//    {
//     val.push(v1/v2);
//    }
//    op.pop();
//
//
//   }
//   System.out.println(val.peek());
//
//  }
//
//
//
// }
//}
import java.util.*;

// infinix operator precedence
//
// public class Stackdd {
// public static void main(String[] args) {
//  String str = "8-5+3*4/6";
//  Stack<Integer> val = new Stack<>();
//  Stack<Character> op = new Stack<>();
//  for (int i = 0; i < str.length(); i++) {
//   char ch = str.charAt(i);
//   int ascii = (int) ch;
//   if (ascii >= 48 && ascii <= 57) {
//    val.push(ascii - 48);
//   } else if (op.size() == 0)
//    op.push(ch);
//   else {
//    if (ch == '+' || ch == '-') {
//     int v2 = val.pop();
//     int v1 = val.pop();
//     if (op.peek() == '-')
//      val.push(v1 - v2);
//     if (op.peek() == '+')
//      val.push(v1 + v2);
//     if (op.peek() == '*')
//      val.push(v1 * v2);
//     if (op.peek() == '/')
//      val.push(v1 / v2);
//     op.pop();
//     // push
//     op.push(ch);
//
//    }
//    if (ch == '*' || ch == '/') {
//     if (op.peek() == '*' || op.peek() == '/') {
//      int v2 = val.pop();
//      int v1 = val.pop();
//      if (op.peek() == '*')
//       val.push(v1 * v2);
//      if (op.peek() == '/')
//       val.push(v1 / v2);
//      op.pop();
//      // push
//      op.push(ch);
//     } else
//      op.push(ch);
//    }
//   }
//  }
//  // want value of stack size become one
//  while (val.size() > 1) {
//   int v2 = val.pop();
//   int v1 = val.pop();
//   if (op.peek() == '-')
//    val.push(v1 - v2);
//   if (op.peek() == '+')
//    val.push(v1 + v2);
//   if (op.peek() == '*')
//    val.push(v1 * v2);
//   if (op.peek() == '/')
//    val.push(v1 / v2);
//   op.pop();
//  }
//  System.out.println(val.peek());
// }
//}

// bubble sort alogorithm

//public class Stackdd {
// static void p(int a[]) {
//  int n = a.length;
//  for (int i = 0; i < n - 1; i++) {
//   for (int j = 0; j < n - i - 1; j++) {
//    if (a[j] > a[j + 1])
//    {
//     int temp = a[j];
//     a[j] = a[j + 1];
//     a[j+1] = temp;
//    }
//   }
//  }
// }
//  static void f(int a[])
//  {
//   for(int i=0; i<a.length; i++)
//   {
//    System.out.println(a[i]+"");
//   }
//
//  }
//
//
//
// public static void main(String[] args) {
//
//  int a[]={2,3,1,5,4};
//  p(a);
//  f(a);
// }
//}

//class Table{
// synchronized void printTable(int n){//synchronized method
//  for(int i=1;i<=5;i++){
//   System.out.println(n*i);
//   try{
//    Thread.sleep(400);
//   }catch(Exception e){System.out.println(e);}
//  }
//
// }
//}
//
//class MyThread1 extends Thread{
// Table t;
// MyThread1(Table t){
//  this.t=t;
// }
// public void run(){
//  t.printTable(5);
// }
//
//}
//class MyThread2 extends Thread{
// Table t;
// MyThread2(Table t){
//  this.t=t;
// }
// public void run(){
//  t.printTable(100);
// }
//}
//
//public class Stackdd{
// public static void main(String args[]){
//  Table obj = new Table();//only one object
//  MyThread1 t1=new MyThread1(obj);
//  MyThread2 t2=new MyThread2(obj);
//  t1.start();
//  t2.start();
// }
//}

//selection sort
//public class Stackdd {
//
// static void f(int a[])
// {
//  int n=a.length;
//  for(int i=0;  i<n-1; i++)
//  {
//   int min=i;
//   for(int j=i+1; j<n; j++)
//   {
//    if(a[j]<a[min])
//    {
//     min=j;
//    }
//    int temp=a[i];
//    a[i]=a[j];
//    a[j]=temp;
//   }
//  }
// }
// static void p(int a[])
// {
//  for(int i=0; i<a.length; i++)
//  {
//   System.out.println(a[i]+" ");
//  }
// }
//
// public static void main(String[] args) {
//  int a[]={7,4,2,1};
//  f(a);
//  p(a);
// }
//}

// insert a node at the head /start of the linkedlist
import java.util.*;
//public class Stackdd {
//
// public static class Node{
//
//     Scanner sc = new Scanner(System.in);
//    int data;
//    Node next;
//    Node(int data)
//    {
//     this.data=data;
//    }
// }
//
// static class Linkedlist
// {
//  Node head=null;
//  Node tail=null;
//
//  void insertathead(int val)
//  {
//      Node temp= new Node(val);
//      long x=sc.next.Long();
//      if(x>=-9223372036854775808 &&x<=9223372036854775807)
//      {
//          System.out.println("*  long");
//      }
//      if(head==null)
//      {
//          head=temp;
////          tail=temp;
//      }
//      else
//      {
//          temp.next=head;
//          head=temp;
//
//      }
//
//     }
//     void dislay()
//     {
//         Node temp=head;
//         while(temp!=null)
//         {
//             System.out.println(temp.data+"");
//             temp=temp.next;
//         }
//
//     }
// }
//
//
// public static void main(String[] args)
// {
//
//     Linkedlist ll= new Linkedlist();
//     ll.insertathead(12);
//     ll.insertathead(22);
//     ll.insertathead(32);
//     ll.insertathead(42);
//     ll.dislay();
// }
//}


// implement the node at any index;

//public class Stackdd
//{
//static class Node{
//    int data;
//    Node next;
//    Node(int data)
//    {
//        this.data=data;
//    }
//}
//
//    static class Linkedlist{
//
//        Node head=null;
//        Node tail=null;
//
//
// void insertAtend(int vsl)
// {
//     Node temp =new Node(vsl);
//
//     if(head==null)
//     {
//         head=temp;
//     }
//     else
//     {
//         tail.next=temp;
//
//     }
//     tail=temp;
// }
//
// void insertAt(int in,int val)
// {
//     Node t =new Node(val);
//     Node temp= head;
//     for(int i=0; i<in-1; i++)
//     {
//         temp=temp.next;
//     }
//     t.next=temp.next;
//     temp.next=t;
//
// }
// void d()
// {
//     Node temp=head;
//     while(temp!=null)
//     {
//         System.out.println(temp.data);
//         temp=temp.next;
//     }
// }
//    }
//
//public static void main(String[]args){
//
//    Linkedlist ll = new Linkedlist();
//     ll.insertAtend(23);
//    ll.insertAtend(33);
//    ll.insertAtend(43);
//    ll.insertAtend(53);
//    ll.insertAt(3,12);
//    ll.d();
//
//
//        }
//}


// Java program for Merge Sort
import java.io.*;

//public class Stackdd {
//
//    // Merges two subarrays of arr[].
//    // First subarray is arr[l..m]
//    // Second subarray is arr[m+1..r]
//  static   void merge(int arr[], int l, int m, int r)
//    {
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        // Create temp arrays
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        // Copy data to temp arrays
//        for (int i = 0; i < n1; ++i)
//            L[i] = arr[l + i];
//        for (int j = 0; j < n2; ++j)
//            R[j] = arr[m + 1 + j];
//
//        // Merge the temp arrays
//
//        // Initial indices of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            }
//            else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy remaining elements of L[] if any
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        // Copy remaining elements of R[] if any
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    // Main function that sorts arr[l..r] using
//    // merge()
//    static void sort(int arr[], int l, int r)
//    {
//        if (l < r) {
//
//            // Find the middle point
//            int m = l + (r - l) / 2;
//
//            // Sort first and second halves
//            sort(arr, l, m);
//            sort(arr, m + 1, r);
//
//            // Merge the sorted halves
//            merge(arr, l, m, r);
//        }
//    }
//
//    // A utility function to print array of size n
//    static void printArray(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    // Driver code
////    public static void main(String args[])
//    {
//        int arr[] = { 12, 11, 13, 5, 6, 7 };
//
//        System.out.println("Given array is");
//        printArray(arr);
//
//        Stack ob = new Stack();
//        sort(arr, 0, arr.length - 1);
//
//        System.out.println("\nSorted array is");
//        printArray(arr);
//    }
//}
///* This code is contributed by Rajat Mishra */
//

//
//    static void  p(int a[],int l,int m)
//    {
//        if(l<m)
//        {
//            int j=l+(m-l)/2;
//
//            p(a,l,j);
//            p(a,j+1,m);
//        }
//        int j=l+(m-l)/2;
//
//        p(a,l,j);
//
//    }
//
//
//public static void main(String[]args)
//{
//
//    int a[]={8,2,1,5,4};
//    int n=a.length;
//    p(a ,0,n);
//
//        }
//}

//(1)
//palindrome

//import java.util.*;
//public class Stackdd {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number = ");
//        int a= sc.nextInt();
//        int d=a;
//        int c=0;
//        if(a<0)
//        {
//            System.out.println("invalid Input");
//        }
//        else
//        {
//            while(a>0)
//            {
//                int b=a%10;
//                c=c*10+b;
//                a=a/10;
//            }
//            if(d==c)
//            {
//                System.out.println("Palindrome");
//            }
//            else
//            {
//                System.out.println("Not Palindrome");
//            }
//        }
//    }
//}


//(2)

//import java.util.*;
//public class Stackdd {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the month = ");
//        int a= sc.nextInt();
//        if(a>=4&&a<=5)
//        {
//            System.out.println("spring");
//        }
//        else if(a>=6&&a<=8)
//        {
//            System.out.println("Summer");
//        }
//        else if(a>=9&&a<=11)
//        {
//            System.out.println("Autumn");
//        }
//        else if(a==12||a>=1&&a<=2)
//        {
//            System.out.println("Winter");
//        }
//        if(a>12)
//        {
//            System.out.println("Invalid month");
//        }
//        }
//    }

//(3)
//import java.util.*;
//public class Stackdd {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the no of students placed in CSE : ");
//        int a= sc.nextInt();
//        System.out.print("Enter the no of students placed in ECE : ");
//        int b= sc.nextInt();
//        System.out.print("Enter the no of students placed in MECH : ");
//        int c= sc.nextInt();
//
//        if(a>b&&a>c)
//        {
//            System.out.println("Highest placemtn CSE");
//        }
//        if(b>c&&b>a)
//        {
//            System.out.println("Highest placemtn ECE");
//        }
//        if(c>a&&c==b)
//        {
//            System.out.println("Highest placement ECE MECH");
//        }
//        if(c>a&&c>b)
//        {
//            System.out.println("Highest placemtn MECH");
//        }
//        else if(a==b&&b==c&&c==b)
//        {
//            System.out.println("None of the placement has the highest placemnt");
//        }
//
//    }
//
//    }

//(4)

//import java.util.*;
//public class Stackdd {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the date = ");
//        int a = sc.nextInt();
//        int c=0;
//        int d=0;
//        int b[] = new int[a];
//
//        for(int i=0; i<b.length; i++)
//        {
//            b[i]= sc.nextInt();
//        }
//
//   if(a%2==0)
//   {
//        for(int i=0; i<b.length; i++)
//        {
//            if(b[i]%2!=0)
//            {
//                c++;
//            }
//
//        }
//        System.out.println(c*200);
//
//
//    }
//   else {
//       for(int i=0; i<b.length; i++)
//       {
//           if(b[i]%2==0)
//           {
//               d++;
//           }
//
//       }
//               System.out.println(d*200);
//   }
//
//   }
//}

//(5)

//import java.util.*;
//public class Stackdd {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
////        System.out.println("enter the date = ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int d=b/2;
//        int f=d-a;
//        int g=a-f;
//        System.out.println("four wheeler "+f);
//        System.out.println("Two wheeler "+a);
//    }
//}


//(7)

//import java.util.*;
//public class Stackdd {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        System.out.println("enter the date = ");
//        int a = sc.nextInt();
//        if(a<0)
//        {
//            System.out.println(" please enter the positive number");
//        }
//        else
//        {
//            for(int i=0; i<a; i++)
//            {
//                int count=0;
//                for(int j=0; j<i; j++)
//                {
//
//                    if(j%i==0)
//                    {
//                        count++;
//                        System.out.println("not a prime number");
//                        break;
//
//                    }
//
//                }
//                if(count==0)
//                {
//                    System.out.println("prime number");
//                    break;
//                }
//
//                }
//
//
//            }
//        }
//    }

//public class Stackdd {
//
// static class QueA {
//  int f = -1;
//  int r = -1;
//  int size = 0;
//  int a[] = new int[5];
//
//  void add(int value) {
//   if (r == a.length - 1)
//   {
//    System.out.println("Queue is full");
//    return;
//   }
//   if (f == -1)
//   {
//    f = 0; // Update front when adding the first element
//   }
//   a[++r] = value; // Increment rear and then assign the value
//   size++;
//  }
//
//  public int remove() {
//   if (size == 0) {
//    System.out.println("Queue is Empty");
//    return -1;
//   }
//   int removedItem = a[f];
//   f++;
//   size--;
//   return removedItem;
//  }
//
//  public int peek() {
//   if (size == 0) {
//    System.out.println("Queue is empty");
//    return -1;
//   }
//   return a[f];
//  }
//
//  public boolean isEmpty() {
//   return size == 0;
//  }
//
//  public void display() {
//   if (size == 0) {
//    System.out.println("queue is empty");
//   } else {
//    for (int i = f; i <= r; i++) {
//     System.out.print(a[i] + " ");
//    }
//    System.out.println();
//   }
//  }
// }
//
// public static void main(String[] args) {
//  QueA q = new QueA();
//  q.add(1);
//  q.add(2);
//  q.add(3);
//  q.add(4);
//  q.add(5);
//  q.remove();
//  q.display(); // Output: 1 2 3 4 5
// }
//}
//public class Stackdd {
// public static void main(String[] args) {
//
//  int a=12 ,b=4;
//  int f=1;
//  int gcd=0;
//
//
//
//   for(int i=1; i<=a&&i<=b; ++i)
//   {
//    if(a%i==0&&b%i==0)
//
//       gcd=i;
//    }
//    int lcm=(a*b)/gcd;
//
//    System.out.println(lcm);
//
//   }
// }
//
//_________________________________________________________________________________________________________
//implementing LinkedList in Stack   (05-01-24)

//public class Stackdd {
// public static class Node{
//
//      int val;
//      Node next;
//
//      Node(int val)
//      {
//       this.val=val;
//      }
// }
// public static class QueuA{
//     Node head=null;
//     Node tail=null;
//     int size=0;
//     public void add(int x)
//     {
//       Node temp = new Node(x);
//       if(size==0)
//       {
//        head=tail=temp;
//       }
//       else {
//        tail.next=temp;
//        tail=temp;
//       }
//      size++;
// }
// public void display()
// {
//  if(size==0)
//  {
//   System.out.println("queue is empty");
//    return ;
//  }
//  Node temp=head;
//  while(temp!=null)
//  {
//   System.out.println(temp.val+"");
//   temp=temp.next;
//  }
//  System.out.println();
//
// }
// public int peek()
// {
//  if(size==0)
//  {
//   System.out.println("Queue is empty");
//   return -1;
//  }
//  return head.val;
// }
// public int remove()
// {
//  if(size==0)
//  {
//   System.out.println("queue is empty");
//   return -1;
//  }
//  int x= head.val;
//  head= head.next;
//  size--;
//  return x;
// }
//
// }
//
// public static void main(String[] args)
// {
//
//  QueuA p = new QueuA();
//  p.add(2);
//  p.add(4);
//  p.add(6);
//  p.add(8);
////  p.peek();
////  p.display();
//  p.peek();
//  System.out.println("remove");
//  p.remove();
//  p.remove();
//  p.display();
////  System.out.println(p.peek());
// }
//
//}

//import java.time.LocalTime;
//import java.time.LocalDate;
//
//public class Stackdd {
// public static void main(String[] args) {
//    LocalTime time= LocalTime.now();
//  System.out.println(time);
//  LocalDate now = LocalDate.now();
//  System.out.println(now);
// }
//}



//
//import java.util.*;
//public class Stackdd {
//    public static void main(String[] args) {
//
//    }
//}

//infix :
//        import java.util.*;

//public class Stackdd {
//    public static void main(String[] args) {
//        String str = "8-5+3*4/6";
//        Stack<Integer> val = new Stack<>();
//        Stack<Character> op = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int ascii = (int) ch;
//            if (ascii >= 48 && ascii <= 57) {
//                val.push(ascii - 48);
//            } else if (op.size() == 0)
//                op.push(ch);
//            else {
//                if (ch == '+' || ch == '-') {
//                    int v2 = val.pop();
//                    int v1 = val.pop();
//                    if (op.peek() == '-')
//                        val.push(v1 - v2);
//                    if (op.peek() == '+')
//                        val.push(v1 + v2);
//                    if (op.peek() == '*')
//                        val.push(v1 * v2);
//                    if (op.peek() == '/')
//                        val.push(v1 / v2);
//                    op.pop();
//                    // push
//                    op.push(ch);
//
//                }
//                if (ch == '*' || ch == '/') {
//                    if (op.peek() == '*' || op.peek() == '/') {
//                        int v2 = val.pop();
//                        int v1 = val.pop();
//                        if (op.peek() == '*')
//                            val.push(v1 * v2);
//                        if (op.peek() == '/')
//                            val.push(v1 / v2);
//                        op.pop();
//                        // push
//                        op.push(ch);
//                    } else
//                        op.push(ch);
//                }
//            }
//        }
//        // want value of stack size become one
//        while (val.size() > 1) {
//            int v2 = val.pop();
//            int v1 = val.pop();
//            if (op.peek() == '-')
//                val.push(v1 - v2);
//            if (op.peek() == '+')
//                val.push(v1 + v2);
//            if (op.peek() == '*')
//                val.push(v1 * v2);
//            if (op.peek() == '/')
//                val.push(v1 / v2);
//            op.pop();
//        }
//        System.out.println(val.peek());
//    }
//}



