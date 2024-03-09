//
//// print fibonacci series
//
////public class Recur {
////    static void p(int a, int b,int n)
////    {
////        if(n==0)
////        {
////
////            return;
////        }
////        int c=a+b;
////        System.out.println(c);
////        p(b,c,n-1);
////    }
////    public static void main(String[] args) {
////
////        int a=0;
////        int b=1;
////        System.out.println(a);
////        System.out.println(b);
////        int n=7;
////        p(a,b,n-2);
////
////    }
////}
//
////public class Recur {
////
////
////    public static void main(String[] args) {
//
//
////        int arr=1234;
////        int r=2;
////        int c=0;
////        int g=0;
////
////        while(arr>0)
////        {
////            int f=arr%10;
////            c=c+f;
////            arr=arr/10;
////        }
////        c=c*r;
////        while(c>0)
////        {
////
////            int u=c%10;
////            g=g+u;
////            c=c/10;
////        }
////        System.out.print(g);
//
//
////        (5)
////        int arr[] = {2,5,1,6,8};
////
////        int d = 3;
////        int f = 300;
////        int c = 0;
////
////        if (d % 2 == 0) {
////            for (int i = 0; i < arr.length; i++) {
////                if (arr[i] % 2 != 0) {
////                    c++;
////                }
////            }
////            System.out.println(c * f);
////
////
////        }
////
////        if (d % 2 != 0) {
////            for (int i = 0; i < arr.length; i++) {
////                if (arr[i] % 2 == 0) {
////                    c++;
////                }
////            }
////            System.out.println(c * f);
////
////        }
////    }
////}
//
////    (6)
////        int v = 1200;
////        int w = 540;
////        int f = w / 2;
////        int m = 0;
////        int n = 0;
////
////        if (w>3&&w%2==0&&w>v)
////        {
////            m = f - v;
////            n = v - m;
////            System.out.println(n);
////            System.out.println(m);
////        }
////
////
////        else
////        {
////            System.out.println("inavlid input");
////        }
////    }
////}
//
//
////(7)
//
////int a[]={7,0,5,1,3};
////int b[]={1,2,1,3,4};
////int m=0;
////
////
////{
////
////   for(int j=1; j<b.length; j++)
////   {
////
////       int f=a[0]-b[0];
////       if(a[j]-b[j]>0)
////       {
////           f=f+(a[j]-b[j]);
//////            m=f+a[j]-b[j];
////       }
////       System.out.println(f);
//////       System.out.println(m);
////
////   }
//////    System.out.println(f);
////}
////}
////    }
////
////        (8)
////        int k = 3;
////           int n=10;
////        if (k <= 5&&k>0&&k<=n) {
////            System.out.println("number of candies sold : " + k);
////            System.out.println("number of candies available : " + (10 - k));
////        }
////        else {
////            System.out.println("Inavlid input  number of candies left 10");
////        }
////    }
////}
//
////(9)
//
////        int n = 6;
////        float a[] =
////            {12.3f, 15.2f, 15.2f, 12.3f, 15.2f, 12.3f, 15.2f} ;
////            int m = 3;
////            double c = 0, d = 0;
////            float b[] =  {
////                10.10f, 10.10f, 10.00f
////            } ;
////
////            for (int i = 0; i < a.length; i++) {
////                c = c + a[i] * 18;
////            }
////            for (int i = 0; i < b.length; i++) {
////                d = d + b[i] * 12;
////
////            }
////            double j = c + d;
////        System.out.println("Total estimated cost : "+j);
////
////        }
////    }
//
//
////(10)
//
//
//import java.util.*;
//public class Recur {
//
//    static void check(int a) {
//        if(a>0)
//        {
//
//            prime(a);
//        }
//        else {
//            System.out.println("please enter the positive number");
//        }
//    }
//    static void prime(int a)
//
//    {
//
//        int c=0;
//
//        for(int i=1; i<=a; i++)
//        {
//            if(a%i==0)
//            {
//                c++;
//            }
//        }
//        if(c==2)
//        {
//            System.out.println("given number is a prime number");
//        }
//        else
//        {
//            System.out.println("given number is not a prime number");
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the  number");
//        int a=sc.nextInt();
//
//        check(a);
//
//    }
//}

//public class Recur {
//    public static void main(String[] args) {
//        int a[] = {65, 66, 67, 68};
//        char b;
//
////        for (int i = 0; i < a.length; i++) {
////
////            for ( b = 'A'; b <= 'z';)
////            {
////
////                System.out.println(a[i]+" "+b);
////                continue;
////
////
////            }
////
////            ++b;
//
//        }
//    }
//}
//
//
