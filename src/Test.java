//
////(2)
////class Calculator{
////    static int add(int a,int b)
////    {
////        return a+b;
////    }
////    static  void multiply(int a,int b,int c)
////    {
////        System.out.println("multiplication"+a*b*c);
////    }
////    static  void substract(float a,float b)
////    {
////        System.out.println("substraction"+(a-b));
////    }
////    static  void division(int a,int b)
////    {
////        System.out.println(a/b);
////    }
////}
////public class Test {
////    public static void main(String[] args)
////    {
////    Calculator a =new Calculator();
////        System.out.println("addition"+a.add(4,6));
////        a.multiply(5,6,7);
////        a.substract(8.1f,4.1f);
////        a.division(4,6);
////
////
////
////    }
////}
//
////(5)
////
////interface Playable{
////    default void playmusic()
////    {
////        System.out.println("music is playable");
////    }
////}
////class Mp3player implements Playable{
////
////    public void playmusic()
////    {
////        System.out.println("music is playable in Mp3 Player");
////    }
////
////}
////public class Test {
////    public static void main(String[] args) {
////
////        Mp3player m =new Mp3player();
////        m.playmusic();
////        Playable p = new Mp3player();
////        p.playmusic();
////
////    }
////}
//
//
////
////(3)
//
////selection sort algorithm
////public class Test {
////
////    static void p(int a[])
////    {
////        for(int i=0; i<a.length-1; i++)
////        {
////            int min_index=i;
////            for(int j=i+1; j<a.length; j++)
////            {
////                if(a[j]<a[min_index])
////                {
////                  min_index=j;
////                }
////
////
////            }
////            int temp=a[min_index];
////            a[min_index]=a[i];
////            a[i]=temp;
////        }
////    }
////    static void print(int a[])
////    {
////        for(int i=0; i<a.length; i++)
////        {
////            System.out.println(a[i]+" ");
////        }
////    }
////    public static void main(String[] args) {
////        int a[]={7,4,24,1,3};
////        p(a);
////        print(a);
////    }
////}
//
////(2)
////insertion sort algorithms
////
////public class Test {
////    static void p(int a[])
////    {
////        for(int i=1; i<a.length; i++)
////        {
////            int j=i;
////            while(j>0&&a[j-1]>a[j])
////            {
////             int temp=a[j-1];
////             a[j-1]=a[j];
////             a[j]=temp;
////             j--;
////            }
////
////        }
////    }
////    static void print(int a[])
////    {
////        for(int i=0; i<a.length; i++)
////        {
////            System.out.println(a[i]+" ");
////        }
////    }
////    public static void main(String[] args) {
////        int a[]={68,4,37,3,5};
////        p(a);
////        print(a);
////    }
////}
//
//// Merge sort algorithms
//
//
//public class Test {
//
//    static void mergesort(int a[],int l,int m,int k)
//    {
//        int n1=m-l+1;
//        int n2=k-m;
//        int a1[]= new int[n1];
//        int a2[] = new int[n2];
//
//        for (int i = 0; i < n1; i++)
//        {
//            a1[i] = a[l + i];
//        }
//        for (int j = 0; j < n2; j++)
//        {
//            a2[j] = a[m + 1 + j];
//        }
//        int i=0,j=0;
//        int k1=l;
//        while(i<n1&&j<n2)
//        {
//            if(a1[i]<=a2[j])
//            {
//                a[k1]=a1[i];
//                i++;
//            }
//            else
//            {
//                a[k1]=a2[j];
//                j++;
//            }
//            k1++;
//        }
//        while(i<n1)
//        {
//            a[k1]=a1[i];
//            i++;
//            k1++;
//        }
//        while(j<n2)
//        {
//            a[k1]=a2[j];
//            j++;
//            k1++;
//        }
//
//
//    }
//    static void print(int a[])
//    {
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]+" ");
//        }
//    }
//
//    static void sort(int a[],int l,int k) {
//
//        if (l < k)
//        {
//            int m = (k+l) / 2;
//
//        sort(a, l, m);
//        sort(a, m + 1, k);
//        mergesort(a, l, m, k);
//    }
//    }
//    public static void main(String[] args) {
//        int a[]={3,5,2,7,1};
//        int c=a.length-1;
//        sort(a,0,c);
//        print(a);
//    }
//}
//
