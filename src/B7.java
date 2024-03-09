
//public class B7 {

//    static void max(int i )
//    {
//         int d=0;
//         int h=i;
//        while(i>0)
//        {
//            int f=i%10;
//             d=f*10+d;
//             i=i/10;
//        }
//        if(h==i)
//        {
//            System.out.println(h);
//        }
//    }
//    public static void main(String[] args) {
//
//        int a=10;
//        int b=80;
//        int d=0;
//
//        for( a=10; a<=80; a++)
//        {
//            int c=a;
//            int g=c;
//            while(c!=0)
//            {
//                int f=c%10;
//                 d=d*10+f;
//                 c=c/10;
//            }
////            System.out.println(d);
//            if(d==c)
//            {
//                System.out.println(d);
//            }
//
////            max(i);
//        }
//
//    }
//}

//(5)
//public class B7{
//    public static void main(String[] args) {
//
//
//        int a[]={7,1,9,2,11,1,9,2};

//        int b=a[0]-a[1];
//        int c=0;
//        int b=0;
//        int d=0;
//        int f=0;
//        b=a[0];
//
//        for(int i=0; i<a.length; i++)
//        {
//            if(a[i]>c)
//            {
//                c=a[i];
//            }
//        }
//        System.out.println(c);
//        for(int j=0; j<a.length; j++)
//        {
////             b=a[0];
//            if(a[j]<b)
//            {
//                 b=a[j];
//            }
//        }
//        System.out.println(b);

//       int j=c-b;
//        System.out.println(j);

//    }
//}

//(6)

//import java.util.*;
//public class B7 {
//    public static void main(String[] args) {
//
//      Scanner sc = new Scanner(System.in);
//        System.out.println("enter the first number");
//      int a= sc.nextInt();
//        System.out.println("enter the second number");
//        int b= sc.nextInt();
//        int h=0;
//
//        int max=0;
//        for(int i=a; i<=b; i++)
//        {
//
//            int c=i;
//            int x=i;
//            int j=i;
//            int count=0;
//
//            while(j%2==0)
//            {
//
//                j=j/2;
//                count++;
//            }
//            if(max>count)
//            {
//                max=count;
//                h=a;
//            }
//
//
//        }
//        System.out.println(h);
//
//
//
//
//
//    }
//}


//(2)

//public class B7 {
//    public static void main(String[] args) {
//
//
//        int a=2;
//        int b=15;
//
//        for(int i=a; i<=b; i++)
//        {
//            int x=i;
//            int count=0;
//            int j=2;
//            while(j<x)
//            {
//                if(x%2==0)
//                {
//                    count++;
//                    break;
//                }
//               j++;
//
//            }
//            if(count==0)
//            {
//                System.out.println(i);
//            }
//        }
//    }
//}



//(3)

//public class B7 {
//    public static void main(String[] args)
//    {
//        int a[]={1,0,2,0,4,0,9,0};
//        int count=0;
//
//        for(int i=0; i<a.length; i++)
//        {
//            if(a[i]!=0)
//            {
//                a[count++]=a[i];
//            }
//        }
//        for(int i=count; i<a.length; i++)
//        {
//            a[count++]=0;
//        }
//
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]);
//        }
//    }
//
//    }


//(6)


import java.util.*;
//public class B6 {
//    public static void main(String[] args) {
//
//       String a[]= new String[]{"home","download","first","first","download"};
//
//
//
//
//     for(int i=0; i<a.length-1; i++)
//     {
//         for(int j=i+1; j<a.length; j++)
//         {
//             if(a[i]==a[j])
//             {
//                 a[j]=a[j]+"1";
//             }
//         }
//     }
//     for(int i=0; i<a.length; i++)
//     {
//         System.out.println(a[i]);
//     }

//    }
//
//    }

//(7)
//public class B7 {
//    public static void main(String[] args) {
//
//        String a="abede";
//        char []b=a.toCharArray();
//
//        char c[]=new char[b.length];
//
//      int x=-0;
//        for(int i=a.length()-1; i>=0; i--)
//        {
//            c[x++]=b[i];
//
//        }
//        int f=0;
//        int t=0;
//        int j=0;
//        String n="";
//        String z="";
//        for(int i=0; i<b.length; i++) {
//                if(b[i]==c[i]){
//                     n+=b[i];
//                     z+=c[i];
//                     if(!n.equals(z)) {
//                         f = 1;
//                         t = i;
//                         System.out.print(t);
//                     }
//                }
//            if(f==1){
//               break;
//            }
//        }
//
//        for(int i=t; i<c.length; i++) {
//            System.out.print(c[i]);
//        }
//    }
//}

public class B7
{



     static public void main(String...args) {
        String s="kbcde";
        String n="";
        String a="";
        int x=0;
        for(int i=s.length()-1; i>=s.length()-1; i--)
        {
            for(int j=s.length()-2; j>=0; j--)
            {
                for(int k=i; k>=j; k--)
                {
                    n+=s.charAt(k);
                }
                for(int k=n.length()-1;k>=0; k--)
                {
                    a+=n.charAt(k);
                }

                if(n.equals(a)) {
                    x=j;
                    n="";
                    a="";
                }else {
                    n="";
                    a="";
                }
            }

        }

        if(x!=0) {
            for(int i=(s.length()-1)-x-1 ; i>=0; i--) {
                System.out.print(s.charAt(i));
            }
        }else {
            for(int i=s.length()-2 ; i>=0; i--) {
                System.out.print(s.charAt(i));
            }
        }

    }
}