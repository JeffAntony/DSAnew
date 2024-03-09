
//(2)
//public class B2 {
//    public static void main(String[] args) {
//
//        int a[]={1,2,3,4,5,6,7,8,9,10};
//        int count=0;
//
//        for(int i=0; i<a.length-1; i++)
//        {
//            if(a[i]%2==0)
//            {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

//(4)

//import java.util.*;
//public class B2 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//
//        try {
//            {
//                int a=sc.nextInt();
//                float b=sc.nextFloat();
//                if (b == 1) {
//                    System.out.println("hidden one");
//                }
//                if (b != 1) {
//                    System.out.println(b + a);
//                }
//            }
//        }
//        catch(Exception ex)
//        {
//            System.out.println("error message");
//        }
//
//    }
//}

//(5)

import java.util.*;

//public class B2{
//
//
//    static int p(int a[],int h)
//    {
//        int sum=0;
//        int count=0;
//        if(a==null)
//        {
//            return -1;
//        }
//        for(int i=0; i<a.length-1; i++)
//        {
//           sum+=a[i];
//           count++;
//           if(sum>=h)
//           {
//               return count;
//           }
//
//
//
//        }
//        return 0;
//    }
//    public static void main(String... args) {
//
//        Scanner sc = new Scanner(System.in);
//        int r=7;
//        int u=2;
//        int n= 8;
//        int a[]=new int []{2,8,3,5,7,4,2};
//
//        int h=r*u;
//
//        System.out.println(p(a,h));
//
//
//    }
//}


//
//(6)

//import java.util.*;

//public class B2{
//    public static int findCount(int arr[], int num, int diff)
//    {
//        int count = 0;
//        for (int i = 0; i < arr.length-1; i++)
//        {
//            if (Math.abs(num - arr[i]) <= diff)
//                count++;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//
//        int arr[]={12,3,14,56,77,13};
//        int num=13;
//        int diff=2;
//
//        System.out.println(findCount(arr,num,diff));
//    }
//}

//(7)

//public class B2 {
//
//    static int def_differencesum(int n,int m)
//    {
//        int sum = 0;
//        int num = 0;
//        int f = 0;
//        if (n > 0 && m > 0)
//
//            for (int i = 1; i <= m; i++)
//            {
//                if (i % n == 0)
//                {
//                    sum += i;
//
//                }
//                else
//                {
//                    num += i;
//
//                }
//
//            }
//            return num - sum;
//        }
//
//
//
//    public static void main(String[] args) {
//
//        int n=4;
//        int m=20;
//
//        System.out.println(def_differencesum(n,m));
//    }
//}

//(8)

//public class B2 {
//
//    static  int  defproductSmallestPair(int sum,int []arr)
//    {
//        int count=0;
//        for(int i=0; i<arr.length-1; i++)
//        {
//
//            for(int k=i+1; k<arr.length; k++)
//            {
//                if(arr[i]+arr[k]==sum)
//                {
//                    count++;
//                }
//            }
//
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//
//        int arr[]={5,4,6,3,7,2};
//        int sum=9;
//        System.out.println(defproductSmallestPair(sum,arr));
//    }
//}

//(9)

//public class B2 {
//    public static void main(String[] args) {
//
//        String a="234";
//        String b="563";
//        int count=0;
//
//        char c[]=a.toCharArray();
//        char d[]=b.toCharArray();
//
//
//        if(c.length==d.length)
//        {
//
//            for (int i = c.length - 1; i > 0; i--)
//            {
//                if (c[i] + d[i] >= 10)
//                {
//                    c[i - 1] = +1;
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//        else
//        {
//             if(c.length-1>d.length-1)
//             {
//                 int g=a.length()-1-b.length()-1;
//                 int v[]=new int[g];
//                 int cc=0;
//                 for(int i=0; i<g; i++)
//                 {
//                     c[cc++]=0;
//                 }
//                 for(
//
//                 )
//             }
//        }

//        for(int i=a.length()-1; i>0; i--)
//        {
//           for(int j=b.length()-1; j>0; j--)
//           {
//               if(c[i]+d[j]>=10)
//               {
//                   c[i]=+1;
//                   count++;
//               }
//           }
//        }
//        System.out.println(count);




//        while(a>0)
//        {
//            a=a%10;
//            a+=b%10;
//             c=a;
//            b=b/10;
//            a=a/10;
//        }
//        System.out.println(c);
//    }
//}


//