//
//
////1)
////        Create a Java program that simulates a game of Rock, Paper, Scissors between two
////        players. Take the choices as input and determine the winner using "if-else if"
////        statements. If it's a tie, print "Tie.
//
//
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////        System.out.println("attempt of first player");
////        String a = sc.nextLine();
////        System.out.println("attempt of second player");
////        String b = sc.nextLine();
////        System.out.print("Final outcome of the attempts = ");
////
////        if (a.equalsIgnoreCase("Scissor") && b.equalsIgnoreCase("Paper") ||
////                a.equalsIgnoreCase("Rock") && b.equalsIgnoreCase("Scissor") ||
////                a.equalsIgnoreCase("paper") && b.equalsIgnoreCase("rock"))
////            {
////                System.out.println("winner is the first player");
////            }
////            if (b.equalsIgnoreCase("Scissor") && a.equalsIgnoreCase("Paper") || b.equalsIgnoreCase("Rock") && a.equalsIgnoreCase("Scissor") ||  b.equalsIgnoreCase("paper") && a.equalsIgnoreCase("rock"))
////            {
////                System.out.println("Winner is the second player");
////            }
////
////            if(a.equalsIgnoreCase("Scissor") && b.equalsIgnoreCase("Scissor") || a.equalsIgnoreCase("Rock") && b.equalsIgnoreCase("Rock") || a.equalsIgnoreCase("Paper") && b.equalsIgnoreCase("Paper"))
////            {
////                System.out.println("Tie");
////            }
////                    }
////                }
//
//
////2)
////        Create a Java program to determine whether a year is a leap year, but with additional
////        conditions: if it's divisible by 4, it's a leap year, unless it's divisible by 100, except
////        when it's also divisible by 400.
//
//
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter the year");
////        int a = sc.nextInt();
////        if((a%4==0&&a%100!=0 )|| a%400==0)
////        {
////            System.out.println("its a leap year");
////        }
//////        if((a%4!=0) || (a%100==0))
////        else
////        {
////            System.out.println("not a leap year");
////        }
////    }
////}
//
//
//// 3.Write a Java program that accepts a number as input and determines if it's positive,
////         negative, or zero.
//
//
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        if(a>0)
////        {
////            System.out.println("positive number");
////        }
////        if(a<0)
////        {
////            System.out.println("negative number");
////        }
////        if(a==0)
////        {
////            System.out.println("number is zero");
////        }
////    }
////}
//
////4.Implement a program that takes a string as input and checks if it's a valid email
////        address according to a specific format.
//
////import java.util.regex.Pattern;
////import java.util.regex.Matcher;
//
//
//
////public class AssDi {
////    public static void main(String[] args) {
////
////        String i = "jeffantony724@gmail.com";
////        String r = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
////        Pattern p = Pattern.compile(r);
////        Matcher m = p.matcher(i);
////        if (m.matches()) {
////            System.out.println("Valid");
////        } else {
////            System.out.println("Not valid");
////        }
////    }
////}
////
//
//
////5.Write a Java program to simulate a basic calculator that can perform addition,
////        subtraction, multiplication, and division operations.
//
//
//// import java.util.*;
////
////public class AssDi {
////    public static void main(String[] args) {
////
////      Scanner sc = new Scanner(System.in);
////        System.out.println("enter the number");
////      int a= sc.nextInt();
////        System.out.println("enter the symbol");
////      char b=sc.next().charAt(0);
////        System.out.println("enter the number");
////      int c =sc.nextInt();
////      if(b=='+')
////      {
////          System.out.println(a+c);
////      }
////      if(b=='-')
////      {
////          System.out.println(a-c);
////      }
////      if(b=='%')
////      {
////          System.out.println(a%c);
////      }
////      if(b=='*')
////      {
////          System.out.println(a*c);
////
////      }
////      if(b=='/')
////      {
////          System.out.println(a/c);
////      }
////
////    }
////}
//
//
////(6)  Create a program that reads a year and a month as input and prints the number of days
////     in last month , considering leap years for february.
//
//
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args)
////    {
////        Scanner sc = new Scanner(System.in);
////
////        int arr[]= new int[2];
////        for(int i=0; i<arr.length; i++)
////        {
////            arr[i]=sc.nextInt();
////        }
////      for(int i=0; i<arr.length; i++)
////        {
////            if(arr[i]==1)
////            {
////                System.out.println("number of days in the month = "+31);
////                break;
////            }
////            if(arr[i]==2&&(arr[1]%4==0&&arr[1]%100!=0)||arr[1]%400==0)
////            {
////                System.out.println("number of days in the month = "+28);
////
////                   break;
////            }
////            if(arr[i]==2&&(arr[1]%4!=0&&arr[1]%100==0)||arr[1]%400!=0)
////            {
////                System.out.println("given year is not a leap year");
////                break;
////
////            }
////
////            if(arr[i]==3)
////            {
////                System.out.println("number of days in the month = "+31);
////                break;
////            }
////            if(arr[i]==4)
////            {
////                System.out.println("number of days in the month = "+30);
////                break;
////            }
////
////                if(arr[i]==5)
////                {
////                    System.out.println("number of days in the month = "+31);
////                    break;
////                }
////            if(arr[i]==6)
////            {
////                System.out.println("number of days in the month = "+30);
////                break;
////            }
////            if(arr[i]==7)
////            {
////                System.out.println("number of days in the month = "+31);
////                break;
////            }
////            if(arr[i]==8)
////            {
////                System.out.println("number of days in the month = "+31);
////                break;
////            }
////            if(arr[i]==9)
////            {
////                System.out.println("number of days in the month = "+30);
////                break;
////            }
////            if(arr[i]==10)
////            {
////                System.out.println("number of days in the month = "+31);
////                break;
////            }
////            if(arr[i]==11)
////            {
////                System.out.println("number of days in the month = "+30);
////                break;
////            }
////            if(arr[i]==12)
////            {
////                System.out.println("number of days in the month = "+31);
////                break;
////            }
////
////        }
////
////        }
////    }
//
////(7)
////Write a java program to check if a given number is a perfect square and if it is finds its square root.
//
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////
////        for (int i = 1; i <= a; i++)
////        {
////
////                if (i*i==a)
////                {
////                    System.out.println("its a perfect square"  + "square root of the number "+i );
////                      break;
////                }
////                else if (i*i>a)
////                {
////
////                    System.out.println("not a perfect square"+i);
////                    break;
////
////                }
////
////            }
////
////        }
////    }
//
//
////
//
////(8)
////
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////        String a= sc.nextLine();
////        char b[]=a.toCharArray();
////        for(int i=0; i<=b.length; i++)
////        {
////
////        }
////
//////        for(int i=0; i<=b.length; i++)
//////        {
//////            a[i]=sc.nextInt();
//////        }
//////        for(int i=0; i<=b.length; i++)
//////        {
//////            System.out.println(a[2]-b[2]);
//////        }
////
////    }
////}
//
//
////(9) write a java program to check if a given number is a strong number or not  , where a strong number is the sum
////    of  its individual digit's factorial.
//
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////        int s= sc.nextInt();
////        while(s>0)
////        {
////            s=s/10;
////
////
////        }
////
////    }
////}
//
//
////10.Design a Java program to calculate the income tax for an individual based on their
////        annual income. The program should apply different tax rates to different income
////        ranges as defined by the tax laws. The tax rates should be applied progressively,
////        with higher income levels incurring a higher tax rate. The program should prompt the
////        user to input their income, and then it should determine the tax owed based on the
////        following income ranges and associated tax rates:
////        Income up to $50,000: 10% tax
////        Income from $50,001 to $100,000: 20% tax
////        Income over $100,000: 30% tax
//
////
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////        System.out.print("enter an amount greater than or equal to Fifty thousand =  ");
////        int a = sc.nextInt();
////        int f=0;
////        if (a == 50000) {
////             f = (50000 * 10) / 100;
////        }
////        else if (a > 50000 && a < 100000) {
////            f = (a * 20) / 100;
////        }
////        if (a > 100000) {
////            f = (a * 30) / 100;
////
////        }
////        System.out.println(" your annual income = "+a);
////        System.out.println("your income tax = "+f);
////    }
////}
//
////(11) Create a program that uses a for loop to find and print all the prime numbers
////between 1 and 100.
//
////import java.util.*;
////public class AssDi {
////    public static void main(String[] args)
////    {
////        Scanner sc = new Scanner(System.in);
//////        int c= sc.nextInt();
////        int j;
////        for(int i=0; i<=100; i++)
////        {
////            int d=0;
////            for(j=1; j<=i; j++)
////            {
////                if(i%j==0)
////                {
////                    d++;
////                }
////            }
////            if(d==2)
////            {
////                System.out.println(i);
////            }
////
////        }
////
////    }
////
////    }
//
////14.Implement a Java program to print the Pascal's triangle for a given number of rows using
////        for loops.
//
////class G{
////public static void printPascal(int n)
////        {
////        for (int line = 1; line <= n; line++)
////        {
////        for (int j = 0; j <= n - line; j++)
////        {
////
////        // for left spacing
////        System.out.print(" ");
////        }
////
////        // used to represent C(line, i)
////        int C = 1;
////        for (int i = 1; i <= line; i++)
////        {
////        System.out.print(C + " ");
////        C = C * (line - i) / i;
////        }
////        System.out.println();
////        }
////        }
////
////
////public static void main(String[] args)
////        {
////        int n = 6;
////        printPascal(n);
////        }
////        }
//
////15Write a Java program to find the second smallest element in an array without sorting
//// it.
//
////import java.util.*;
//// public class AssDi {
////    static int p(int arr[], int n)
////    {
////        int sm=arr[0];
////        for(int i=0; i<n; i++)
////        {
////            if(arr[i]<sm)
////            {
////                sm=arr[i];
////            }
////        }
////
////        int big=Integer.MAX_VALUE;
////        for(int i=0; i<n; i++)
////        {
////            if(arr[i]!=sm&&arr[i]<big)
////            {
////                big=arr[i];
////            }
////
////        }
////        return big;
////    }
////    public static void main(String[] args) {
////       int arr[]={4,5,1,2, 6,7};
////       int n=arr.length;
////        p(arr,n);
////        System.out.println(p(arr,n));
////    }
////}
//
//
////(16) Implement a method to rotate an array to the right by K steps.
//
////import java.util.*;
//// public class AssDi {
////     static void p(int ar[] , int n,int k)
////     {
////
////         for(int i=0; i<k; i++)
////         {
////             int last=ar[ar.length-1];
////             for(int j=n-1; j>0; j--)
////             {
////                 ar[j]=ar[j-1];
////
////             }
////              ar[0]=last;
////
////         }
////         for(int i=0; i<ar.length; i++)
////         {
////             System.out.println(ar[i]+" ");
////         }
////     }
////
////
////     public static void main(String[] args)
////     {
////         int ar[]={1,2,3,4,5};
////         int n=ar.length;
////         int k=3;
////         p(ar,n,k);
//////         System.out.println(p);
////     }
//// }
//
//
////18Create a method to remove duplicates from an unsorted array without using extra space.
//
//// public class AssDi {
////
////     static void p(int ar[],int b)
////     {
////         int g=0;
////         for(int i=0; i<b-1; i++) {
////             for (int j = i + 1; j < b-1; j++)
////             {
////                 if (ar[i] == ar[j]) {
////                     ar[i] = -1;
////                 }
////
////
////             }
////         }
////         for(int i=0; i<b; i++)
////         {
////             if(ar[i]!=-1)
////             {
////                 System.out.println(ar[i]);
////             }
////         }
////     }
////public static void main(String[] args)
////        {
////            int ar[]={3,2,4,5,2,1};
////            int b=ar.length;
////            p(ar,b);
////        }
////        }
//
////(17) Given two sorted arrays, merge them into a single sorted array without using extra space.
//
//// public class AssDi {
////         public static void main(String[] args) {
////                 int a[] = {2, 4, 6, 7};
////                 int b[] = {3, 5, 6, 2};
////                 int c[] = new int[a.length + b.length];
////                 int count = 0;
////
////                 for (int i = 0; i < a.length; i++)
////                 {
////                         c[count++] = a[i];
////
////                 }
////
////                 for (int i = 0; i < b.length; i++)
////                 {
////                         c[count++] = b[i];
////                 }
////                 for (int j = 0; j < count; j++)
////                 {
////                         System.out.println(c[j] + " ");
////                 }
////         }
//// }
//
////19 Write a Java program to find the "intersection" of two arrays (elements present in both
////        arrays).
//
////public class AssDi {
////        public static void main(String[] args) {
////
////                int a[] = {2, 4, 5, 2, 7};
////                int b[] = {1, 4, 5, 2, 6};
////                int c[] = new int[5];
////
////                for (int i = 0; i < a.length; i++)
////                {
////                        if (b[i] == a[i])
////                        {
////
////                                c[i] = b[i];
////                        }
////                        else
////                        {
////                                c[i]=-2;
////                        }
////
////
////
////                }
////                for (int i = 0; i < c.length; i++) {
////                        if (c[i] >= 0)
////                        {
////                                System.out.println(c[i]);
////                        }
////                }
////        }
////}
//
////20 Given an array of integers, rearrange the array so that the even-indexed elements are
////        greater than the odd-indexed elements.
//
////public class AssDi {
////
////        static void r(int a[])
////        {
////                for(int i=a.length-1; i>=0; i--)
////                {
////                        System.out.println(a[i]+" ");
////                }
////        }
////
////
////        static void sap(int a[], int i,int j)
////        {
////                int temp=0;
////             temp=a[j];
////             a[j]=a[i];
////             a[i]=temp;
////        }
////
////        static void p(int a[] )
////        {
////                int l=0;
////                int r=a.length-1;
////                while(l<r)
////                {
////                        if(a[l]%2!=0&& a[r]%2==0)
////                        {
////                                sap(a,l,r);
////                        }
////                        l++;
////                        r--;
////
////                }
////        }
////        public static void main(String[] args)
////        {
////                int a[] = {2, 3, 4, 5, 6, 7};
////               int b=a.length;
////                p(a);
////                r(a);
////
////
////             }
////
////        }
//
////        (21)
////       Write a Java program to find the saddle point of a matrix. A saddle point is an element
////                that is the minimum in its row and the maximum in its column.
//
////import java.util.*;
////public class AssDi{
////        public static void main(String[] args) {
////                Scanner sc = new Scanner(System.in);
////                System.out.println("enter the size of 2d matrix");
////                int n = sc.nextInt();
////                int arr[][] = new int[n][n];
////                System.out.println("enter the array:-");
////                for (int i = 0; i < n; i++)
////                        for (int j = 0; j < n; j++)
////                        {
////                                arr[i][j] = sc.nextInt();
////                        }
////                int col_max = 0;
////                for (int i = 0; i < n; i++)
////                {
////                        int row_min = arr[i][0];
////
////                        int col = 0;
////                        for (int j = 1; j < n; j++)
////                        {
////                                if (arr[i][j] < row_min)
////                                {
////                                        row_min = arr[i][j];
////                                        col = j;
////                                }
////                        }
////                        for (int k = 0; k < n; k++)
////                        {
////                                if (row_min < arr[k][col])
////                                {
////                                        col_max = 0;
////                                        break;
////                                }
////                                else
////                                        col_max = row_min;
////                        }
////                        if (col_max != 0)
////                                System.out.println("saddle point " + col_max);
////                }
////
////        }
////}
////
//
////(22) Create a Java program to rotate a given matrix 90 degrees clockwise in place, /*without
////  using an extra matrix.
//
//
//
////class GFG {
////
////    static void rotate(int[][] arr) {
////
////        int n=arr.length;
////
////        for(int i=0;i<n;++i)
////        {
////            for(int j=0;j<i;++j)
////            {
////                int temp = arr[i][j];
////                arr[i][j]=arr[j][i];
////                arr[j][i]=temp;
////            }
////        }
////
////        for(int i=0;i<n;++i)
////        {
////            for(int j=0;j<n/2;++j)
////            {
////                int temp =arr[i][j];
////                arr[i][j] = arr[i][n-j-1];
////                arr[i][n-j-1]=temp;
////            }
////        }
////
////    }
////
////
////    static void printMatrix(int arr[][])
////    {
////        int n=arr.length;
////        for (int i = 0; i < n; i++)
////        {
////            for (int j = 0; j < n; j++)
////                System.out.print( arr[i][j] + " ");
////            System.out.println();
////        }
////    }
////
////    public static void main (String[] args) {
////        int arr[][] = { { 1, 2, 3, 4 },
////                { 5, 6, 7, 8 },
////                { 9, 10, 11, 12 },
////                { 13, 14, 15, 16 } };
////        rotate(arr);
////        printMatrix(arr);
////    }
////}
//
//
////(23)  Write a Java program to perform matrix multiplication for two given matrices.
//
//// public class AssDi {
////     public static void main(String[] args) {
////
////         int arr[][] = {{1, 2, 3},
////                 {5, 6, 7},
////                 {9, 10, 11},};
////
////         int br[][] = {{2, 3, 5}, {4, 7, 9}, {5, 8, 9}};
////         int c[][] = new int[3][3];
////
////         for (int i = 0; i < 3; i++)
////         {
////             int sum = 0;
////             for (int j = 0; j < 3; j++)
////             {
////                 c[i][j] = 0;
////
////                 for (int k = 0; k < 3; k++)
////                 {
////                     c[i][j] += arr[i][k] * br[k][j];
////                 }
////                 System.out.print(c[i][j]+" ");
////             }
////             System.out.println();
////         }
////     }
//// }
//
////(24) Create a Java program to calculate the sum of all the elements in a given 2D array in a
////spiral order.
//
//// public class AssDi {
////     public static void main(String[] args) {
////
////         int a[][]={{1,2,3},{4,5,6},{7,8,9}};
////         int sum=0;
////         for(int i=0; i<a.length; i++)
////         {
////
////             for(int j=0; j<a.length; j++)
////             {
////                 sum+=a[i][j];
////             }
////         }
////         System.out.println(sum);
////     }
////}
//
////(25)
////Create a class called Employee with properties like id, name, and a method
////        displayDetails(). Derive two classes, Manager and Clerk, from the Employee class.
////        Implement the displayDetails() method differently in each derived class.
//
////class Employee {
////    int id;
////    String name;
////
////    void displayDetails() {
////        System.out.println("Employee Id" + id);
////        System.out.println("Employeee name " + name);
////    }
////}
////
////    class Manager extends Employee {
////
////
////        void displayDetails() {
////            System.out.println("Manager Id" + id);
////            System.out.println("Manager name " + name);
////
////        }
////    }
////    class Clerk extends Employee {
////
////        void displayDetails() {
////            System.out.println("clerkj Id" + id);
////            System.out.println("CLerk name " + name);
////
////        }
////    }
////
//// public class AssDi {
////     public static void main(String[] args) {
////
////         Employee e = new Employee();
////         e.id=12;
////         e.name="Joshua";
////         e.displayDetails();
////         Manager m = new Manager();
////         m.id=14;
////         e.name="Rmaesh";
////         m.displayDetails();
////         Clerk c = new Clerk();
////         c.id=15;
////         c.name="Suresh";
////         c.displayDetails();
////
////
////     }
////}
//
//
////  (26)  Implement a class hierarchy that models geometric shapes, with a base class Shape and
////        derived classes like Circle, Rectangle, and Triangle. Include methods to calculate the area
////        and perimeter for each shape.
//
//class Shape {
//
//    void area()
//    {
//        System.out.println("area of of the shape");
//    }
//    void perimeter()
//    {
//        System.out.println("perimeter of the shpae");
//    }
//}
//class Circle extends Shape{
//
//    int r=5;
//    void area()
//    {
//        System.out.println("area of the circle  "+3.14*r*r);
//    }
//    void perimeter()
//    {
//        System.out.println("perimeter of the circle "+3.14*2*r);
//    }
//}
//class Rectangle extends Shape{
//
//    int l=4,b=6;
//    void area()
//    {
//        System.out.println("Shape of the rectangle = "+l*b);
//    }
//    void perimeter()
//    {
//        System.out.println("perimeter of the rectangle "+2*(l+b));
//    }
//}
//class Triangle extends Shape {
//int s=6;
////    void area() {
//        System.out.println("area of the triangle = "+(s*s*s)/2);
//    }
//    void perimeter()
//    {
//        System.out.println("permeter of the triangle "+s+s+s);
//    }
//
//}
//public class AssDi{
//    public static void main(String[] args) {
//
//        Circle c = new Circle();
//        c.area();
//        c.perimeter();
//        Rectangle r = new Rectangle();
//        r.area();
//        r.perimeter();
//        Triangle t = new Triangle();
//        t.area();
//        t.perimeter();
//
//
//    }
//}
//
//
////(27)//Design a class hierarchy for a library system with classes like Item (base class), Book,
////        and DVD (derived classes). Include methods for checking out and returning items.
//
////import java.time.LocalDate;
////
////// Item class - base class
////class Item {
////    private int itemId;
////    private String title;
////    private boolean checkedOut;
////    private LocalDate dueDate;
////
////    public Item(int itemId, String title) {
////        this.itemId = itemId;
////        this.title = title;
////        this.checkedOut = false;
////        this.dueDate = null;
////    }
////
////    public int getItemId() {
////        return itemId;
////    }
////
////    public String getTitle() {
////        return title;
////    }
////
////    public boolean isCheckedOut() {
////        return checkedOut;
////    }
////
////    public LocalDate getDueDate() {
////        return dueDate;
////    }
////
////    public void checkOut() {
////        if (!checkedOut) {
////            checkedOut = true;
////            // Set due date to, for example, 2 weeks from current date
////            dueDate = LocalDate.now().plusWeeks(2);
////            System.out.println("Checked out: " + title);
////        } else {
////            System.out.println("Item already checked out");
////        }
////    }
////
////    public void returnItem() {
////        if (checkedOut) {
////            checkedOut = false;
////            dueDate = null;
////            System.out.println("Returned: " + title);
////        } else {
////            System.out.println("Item is not checked out");
////        }
////    }
////}
////
////// Book class - derived from Item
////class Book extends Item {
////    private String author;
////    private int pageCount;
////
////    public Book(int itemId, String title, String author, int pageCount) {
////        super(itemId, title);
////        this.author = author;
////        this.pageCount = pageCount;
////    }
////
////    public String getAuthor() {
////        return author;
////    }
////
////    public int getPageCount() {
////        return pageCount;
////    }
////}
////
////// DVD class - derived from Item
////class DVD extends Item {
////    private String director;
////    private int duration;
////
////    public DVD(int itemId, String title, String director, int duration) {
////        super(itemId, title);
////        this.director = director;
////        this.duration = duration;
////    }
////
////    public String getDirector() {
////        return director;
////    }
////
////    public int getDuration() {
////        return duration;
////    }
////}
//
////(28) Create an abstract class Shape with an abstract method calculateArea(). Create two
////subclasses, Circle and Rectangle, that extend the Shape class and provide implementations
////for the calculateArea() method.
//
////public class AssDi {
////    public static void main(String[] args) {
////
////        abstract class Shape{
////            abstract void calculatearea();
////        }
////        class Circle extends Shape{
////
////            void calculatearea()
////            {
////                System.out.println("calculate area of circle");
////            }
////        }
////        class Rectangle extends Shape{
////            void calculatearea()
////            {
////                System.out.println("area of rectangle");
////            }
////        }
////        new Circle().calculatearea();
////        new Rectangle().calculatearea();
////
////    }
////}
//
////(29) Create an abstract class Animal with an abstract method makeSound(). Create three
////        subclasses, Dog, Cat, and Horse, that extend the Animal class and implement the
////        makeSound() method.
//
//
////
////        abstract class Animal{
////            abstract void makeSound();
////        }
////
////        class Dog extends Animal{
////            void makeSound()
////            {
////                System.out.println("Barking sound");
////            }
////        }
////        class Cat extends Animal{
////            void makeSound()
////            {
////                System.out.println("Mewow sound");
////            }
////        }
////        class Horse extends Animal{
////
////            void makeSound()
////            {
////                System.out.println("HorseSound");
////            }
////        }
////
////        public class AssDi {
////            public static void main(String[] args) {
////
////                new Dog().makeSound();
////                new Horse().makeSound();
////                new Cat().makeSound();
////            }
////        }
//
////(30)
//
////public class AssDi{
////    public static void main(String[] args) {
////
////        class Shape{
////            void calculatearea()
////            {
////                System.out.println("Calculated area");
////            }
////        }
////        class Circle extends Shape{
////
////            void calculatearea()
////            {
////                System.out.println("Calculate area of circle"+2*3.14*4);
////            }
////        }
////        class Rectangle extends Shape{
////
////            void calculatearea()
////            {
////                System.out.println("calculated area of rectanglr = "+4*6);
////            }
////        }
////        new Circle().calculatearea();
////        new Rectangle().calculatearea();
////        new Shape().calculatearea();
////    }
////}
//
//////(31)
//
////import java.util.*;
////
////public class AssDi {
////    static int fibo(int n)
////    {
////        if(n==0||n==1)
////        {
////            return n;
////        }
////        int previous= fibo(n-1);
////        int p=fibo(n-2);
////        return previous +p;
////    }
////    public static void main(String[] args)
////    {
////
////        int n=4;
////        System.out.println(fibo(n));
////    }
////}
//
////(31)  Create an ArrayList of integers and add elements to it. Then, iterate through the list and print
////the elements.
////Write a program to remove all even numbers from an ArrayList.
////Combine two ArrayLists into one.
////Find the maximum and minimum values in an ArrayList of integers.
//
//// import java.util.*;
////public class AssDi {
////    public static void main(String[] args) {
////
////        ArrayList a = new ArrayList();
////        a.add(13);
////        a.add(24);
////        a.add(26);
////        a.add(67);
////        Iterator <Integer>it = a.iterator();
////        while(it.hasNext()) {
////            System.out.println(it.next());
////        }
////
////        while(it.hasNext())
////        {
////            int num=it.next();
////            if(num%2==0)
////            {
////                it.remove();
////            }
////            System.out.println(num);
////        }
////        ArrayList <Integer> b = new ArrayList(a);
////        b.add(12);
////        b.add(13);
////        b.add(14);
////        b.add(15);
////        b.add(16);
////        b.addAll(a);
////        int max=b.get(0);
////        System.out.println("after adding two arrayList"+b);
////        for(int i=0; i<b.size(); i++)
////        {
////            if(b.get(i)>max)
////            {
////                max=b.get(i);
////            }
////        }
////        System.out.println("Maximum element = "+max);
////        int min=b.get(0);
////        for(int i=0; i<b.size(); i++)
////        {
////            if(b.get(i)<min)
////            {
////                min=b.get(i);
////            }
////        }
////        System.out.println("Minimum element = "+min);
////
////    }
////
////}
//
//
////(32) Create a HashMap to store the names and ages of people. Retrieve and print the age of a
////specific person.
////Remove an entry from a HashMap based on a given key.
////Check if a key exists in a HashMap.
////Iterate through the keys and values of a HashMap and print them.
//
////public class AssDi {
////    public static void main(String[] args) {
////
////        HashMap k = new HashMap();
////        k.put(12,"ram");
////        k.put(13,"Suresh");
////        k.put(14,"ramesh");
////        k.put(15,"Govind");
////        k.remove(12);
////        Set s = k.keySet();
//////        System.out.println(s);
////        Collection c= k.values();
//////        System.out.println(c);
////        Set s2 = k.entrySet();
//////        System.out.println(s2);
////        Iterator it =s2.iterator();
////        while(it.hasNext())
////        {
////            Map.Entry m1= (Map.Entry)it.next();
//////            System.out.println(m1.getKey()+" "+m1.getValue());
////
////            if(m1.getKey().equals(13))
////            {
////                m1.setValue("Sumesh");
////            }
////            System.out.println(m1);
////        }
////
////
////
////    }
////}
////(33)
//// class HashSetOperation {
////    public static void main(String[] args) {
////        // Create a HashSet of strings with some duplicates
////        HashSet<String> set1 = new HashSet<>();
////        set1.add("apple");
////        set1.add("banana");
////        set1.add("apple"); // Duplicate
////        set1.add("orange");
////        set1.add("banana"); // Duplicate
////
////        // Print the unique elements
//////        System.out.println("Unique elements in set1:");
////        for (String element : set1) {
//////            System.out.println(element);
////        }
////
////        HashSet<String> set2 = new HashSet<>();
////        set2.add("banana");
////        set2.add("grape");
////        set2.add("orange");
////
////        // Intersection of two sets
////        HashSet<String> intersection = new HashSet<>(set1);
////        intersection.retainAll(set2);
////        System.out.println("\nIntersection of set1 and set2:");
////        for (String element : intersection) {
////            System.out.println(element);
////        }
////
////    }
////}
//
////(34)
////import java.util.regex.Pattern;
//// class PatternExample {
////    public static void main(String[] args) {
////        // Regular expression to match any string containing 'apple' or 'orange'
////        String regex = ".*(apple|orange).*";
////
////        // Create a Pattern object representing the regular expression
////        Pattern pattern = Pattern.compile(regex);
////
////        // You can use this pattern for matching or searching in strings
////        String text = "I like apples and oranges.";
////        boolean isMatch = pattern.matcher(text).matches();
////
////        if (isMatch) {
////            System.out.println("The text matches the pattern.");
////        } else {
////            System.out.println("The text does not match the pattern.");
////        }
////    }
////}
//
////(35)
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class AssDi {
//    public static void main(String[] args) {
//        // Regular expression to match a sequence of letters
//        String regex = "[a-zA-Z]+"; // This matches one or more letters
//
//        // Input string to be matched against the pattern
//        String input = "The quick brown fox jumps over the lazy dog.";
//
//        // Creating a Pattern object using Pattern.compile()
//        Pattern pattern = Pattern.compile(regex);
//
//        // Creating a Matcher object by calling pattern.matcher() on the input string
//        Matcher matcher = pattern.matcher(input);
//
//        // Finding matches in the input string
//        while (matcher.find()) {
//            // Printing the matched substring
//            System.out.println("Match found: " + matcher.group());
//        }
//    }
//}
