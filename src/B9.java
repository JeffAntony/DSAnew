
//(1)
//import java.util.*;
//public class B9 {
//    public static void main(String[] args) {
//
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the length");
//        int b= sc.nextInt();
//
//        int a[]=new int[b];
//
//        System.out.println("enter the elements : ");
//        for(int i=0; i<a.length; i++)
//        {
//            a[i]= sc.nextInt();
//        }
//
//
//
//        for(int k=0; k<3; k++)
//        {
//            int last=a[a.length-1];
//            for(int i=a.length-1; i>0; i--)
//            {
//                a[i]=a[i-1];
//            }
//            a[0]=last;
//        }
//
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]);
//        }
//    }
//}

// (5)

//import java.util.*;
//public class B9 {
//    public static void main(String[] args) {
//
//
//        int a[] = {1, 2, 3, 1};
//        int b = 0;
//        for (int i = 0; i < a.length - 1; i++) {
//            if (a[i] > a[i + 1]) {
//                b = a[i];
//            }
//        }
//        System.out.println(b);
//    }
//}

//(6)
//public class B9 {
//    public static void main(String[] args) {
//
//
//        int a[][]={{1,2,8,4},
//                    {5,6,7,8},
//                   {9,10,11,12}};
//        int b[][]={  {1,2,8,4,},
//                     {5,6,7,8},
//                     {9,10,11,12}};
//        int f=0;
//        for(int i=0; i<a.length; i++)
//        {
//
//            for(int j=0; j<a[i].length; j++)
//            {
//                if(a[i][j]!=b[i][j])
//                {
//                    f=1;
//                    break;
//
//                }
//            }
//
//
//        }
//        if(f==0)
//        {
//            System.out.println("identical");
//        }
//        else
//        {
//            System.out.println("not identical");
//        }
//
//    }
//}

//(7)
//
//public class B9 {
//    public static void main(String[] args)
//    {
//        int a[][]={{1,2,3,4},
//                   {5,6,7,8},
//                  {9,10,11,12},
//                  {13,14,15,16,},
//                  {17,18,19,20}};
//
//        int maxr=a.length-1;
//        int maxc=a.length-1;
//        int c=0;
//        int r=0;
//        int b=a.length*a.length;
//
//        while(b!=0)
//        {
//            for(int i=r; i<=maxc; i++)
//            {
//                System.out.println(a[r][i]);
//                b--;
//            }
//
//
//            for(int j=r+1; j<=maxr; j++)
//            {
//                System.out.println(a[j][maxc]);
//                b--;
//            }
//            for(int i=maxc-1; i>=c; i--)
//            {
//                System.out.println(a[maxr][i]);
//                b--;
//            }
//            for(int j=maxr-1; j>r; j--)
//            {
//                System.out.println(a[j][c]);
//                b--;
//            }
//
//            c++;
//            r++;
//            maxc--;
//            maxr--;
//
//        }
//
//    }
//}

//(9)

//public class B9 {
//    public static void main(String[] args)
//    {
//           int a[][]={{1,2,3},{4,0,6},{7,8,9}};
//           int c=0;
//           int b=0;
//
//           for(int i=0; i<a.length; i++)
//           {
//               for(int j=0; j<a[i].length; j++)
//
//                   if(a[i][j]==0)
//                   {
//                       c=i;
//                       b=j;
//                       break;
//                   }
//
//           }
//
//
//    }
//}

//import java.util.*;
//public class  B9 {
//
//    public static String binary(int n)
//    {
//        String s="";
//        for(int i=63; i>=0; i--)
//        {
//            s+=n>>i&1;
//        }
//        return s;
//    }
//
//
//    public static void main(String[] args) {
//
//        Scanner sc= new Scanner(System.in);
//        int [] arr= {1 ,2, 3, 4, 5};
//        int n=sc.nextInt();
//        String z="";
//        for(int i=0; i<arr.length; i++)
//        {
//            String x=binary(arr[i]);
//
//            z+=x.charAt((x.length()-1)-n);
//        }
//        System.out.print(z);
//    }
//}

//(11)
//
//import java.util.*;
//public class  B9 {
//    public static void main(String[] args)
//    {
//      Scanner sc = new Scanner(System.in);
//      String s= sc.next();
//      char []b=s.toCharArray();
//      int count=0;
//      int count2=0;
//      for(int i=0; i<s.length(); i++)
//      {
//          if(s.charAt(i)=='#')
//          {
//              count++;
//          }
//          if(s.charAt(i)=='*')
//          {
//              count2++;
//          }
//      }
//      int n=count-count2;
//
//      if(count>count2)
//      {
//          System.out.println(count2-count);
//      }
//      else
//      {
//          System.out.println(count2-count);
//      }
//      if(count==count2)
//      {
//          System.out.println(n);
//      }
//
//    }
//}

//(15)

//class GeometricShape {
//
//    String name;
//    int salary;
//
//
//}
//public class B9 {
//    public static void main(String[] args) {
//
//    }
//}

