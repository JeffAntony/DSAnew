
import java.util.*;
//bootcamp day 6
//public class B6 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String str =sc.next();
//        int n= sc.nextInt();
//        String arr[]={"mon","tue","wed","thu","fri","sat","sun"};
//        int i=0;
//        for( i=0; i<arr.length; i++) {
//            if (arr[i].equals(str))
//                break;
//        }
//            int res=0;
//            int rem=6-1;
//            n=n-rem;
//            if(n>0)
//                res+=n/7;
//            System.out.println(res);
//        }
//    }
//}


//(2)

//public class B6 {
//    public static void main(String[] args) {
//
//        String str = "bbbaaababa";
////        char[] b = a.toCharArray();
//        int c = 3;
//        int count = 0;
//        int max = 0;
//
//
//        for (int i = 0; i < str.length(); i++) {
//            if (i % c == 0) {
//                max = Math.max(count, max);
//                count = 0;
//            }
//
//            if (str.charAt(i) == 'a') {
//                count++;
//            }
//            max = Math.max(count, max);
//
//
////        for(int i=0; i<b.length/c; i++)
////        {
////            if('a'==b[i])
////            {
////                count++;
////            }
////        }
////        System.out.println(count);
////
////        for(int j=b.length/3; j<a.le)
//        }
//        System.out.println(max);
//    }
//}

//(3)

//public class B6 {
//    public static void main(String[] args) {
//
//        String a = "###***";
//
////        char b[] = a.toCharArray();
//        int count1 = 0;
//        int count2=0;
//
//        for (int i = 0; i < a.length(); i++)
//        {
//            if(a.charAt(i)=='#')
//            {
//                count1++;
//            }
//            if(a.charAt(i)=='*')
//            {
//                count2++;
//            }
//
//        }
//        int min=count1-count2;
//        int min1=count2-count1;
//
//      if(min==0)
//      {
//          System.out.println(min);
//      }
//      if(min1>0)
//      {
//          System.out.println(min);
//      }
//      if(min1<0)
//      {
//          System.out.println(min1);
//      }
//    }
//}

//(4)

//public class B6 {
//    public static void main(String[] args) {
//
//
//        String a = "how";
//        String b = "are";
//        String c = "you";
//        String v;
//        char d[] = a.toCharArray();
//        char b1[] = b.toCharArray();
//        char b2[] = c.toCharArray();

///

//        for (int i = 0; i < d.length; i++) {
//            if (d[i] == 'a' || d[i] == 'e' || d[i] == 'i' || d[i] == 'o' || d[i] == 'u') {
//                System.out.println(a.replace(d[i], '%'));
//            }
//        }
//
//
//        for (int j = 0; j < b1.length; j++) {
//            if (b1[j] != 'a' || b1[j] != 'e' || b1[j] != 'i' || b1[j] != 'o' || b1[j] != 'u') {
//                System.out.println(b.replace(b1[j], '#'));
//            }
//        }
//        v = c.toUpperCase();
//        System.out.println(v);

//    }
//}




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
//public class B6 {
//    public static void main(String[] args) {
//
//     String a="abede";
//     char []b=a.toCharArray();
//
//     for(int i=a.length()-1; i>0; i--)
//     {
//         System.out.println(b[i]);
//     }
//    }
//}