

//
//(1)//import java.util.*;
//public class B3
//{
//    static Scanner sc=new Scanner (System.in);
//    public static int MaxExponents (int a , int b){
//        int c=0;
//        int r=0;
//        int max=Integer.MIN_VALUE;
//        for(int i=a; i<=b; i++) {
//            int x=i;
//            while(x%2==0) {
//                x=x/2;
//                c++;
//            }
//            if(max<c) {
//                max=c;
//                r=i;
//                c=0;
//            }
//            else {
//                c=0;
//            }
//        }
//        return r;
//    }
//    public static void main(String[] args) {
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        System.out.print(MaxExponents(a,b));
//    }
//}
//import java.util.*;
//public class B3 {
//
//    static int MaxExponents(int a,int b)
//    {
//        int max = 0;
//
//        for (int i = a; i <= b; i++) {
//            int exp = getExponentof(2);
//            if (exp > getExponentof(max)) {
//                max = i;
//            }
//        }
//        return max;
//    }
//    public static int getExponentof(int num)
//    {
//        int exponent=0;
//        while(num%2==0)
//        {
//            num/=2;
//            ++exponent;
//        }
//        return exponent;
//
//
//    }
//    public static void main(String[] args)
//    {
////        Scanner sc = new Scanner(System.in);
//        int a=7;
//        int b=12;
//        MaxExponents(a,b);
//        System.out.println(getExponentof(num));
//    }
//}

//(2)

//import java.util.*;
//public class B3 {
//
//    static int calculate(int m,int n)
//    {
//        int count=0;
//        int sum=0;
//        for(int i=m; i<=n; i++)
//        {
//
//            if(i%3==0 && i%5==0)
//            {
//                sum+=i;
//            }
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        System.out.println(calculate(m,n));
//    }
//}


//(3)

//import java.util.*;
//
//public class B3 {
//    public static void main(String[] args) {
//
//
//  ArrayList <Integer> a = new ArrayList<>();
//  a.add(3);
//  a.add(4);
//  a.add(1);
//  a.add(7);
//  a.add(9);
//  Collections.sort(a);
//  for()
//


//(4)

//import java.util.*;
//
//public class B3 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//        int sum=0;
//    for(int i=c; i==c; i++ )
//    {
//        for(int j=1;  j<=10; j++)
//        {
//            sum+=i*j;
//            System.out.println(i*j);
//
//        }
//
//    }
//        System.out.println(sum);
//
//    }
//}

//(5)


//public class B3 {
//    static void MaxInArray(int a[],int c)
//    {
//        int max=0;
//        int f=0;
//        int i;
//        for( i=1; i<a.length; i++)
//        {
//            if(a[i]>max)
//            {
//                max=a[i];
//                f=i;
//            }
//        }
//        System.out.println(max+" ");
//        System.out.println(f);
//
//
//    }
//
//    public static void main(String[] args) {
//
//        int a[] = {23, 45, 82, 27, 66, 12, 78, 13, 71, 86};
//        int c = a.length;
//        MaxInArray(a, c);
//    }
//}

//(6)
//
//public class B3 {
//    public static void main(String[] args) {
//
//        int a[] = {10,1, 20,10,20,30,30,1,30};
//        int count = 0;
//        int j = 0;
//        int b = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != 0)
//                for (j = i + 1; j < a.length; j++) {
//                    if (a[i] == a[j])
//                    {
//
//                        count++;
//                        a[j] = 0;
//                        break;
//                    }
//                }
//
//            }
//            System.out.println(count);
//
//        }
//    }
//



//(7)

//public class B3 {
//    public static void main(String[] args) {
//
//        int a=2;
//        int b=15;
//        int count=0;
//
//       while(a<b)
//       {
//           for(int j=a; j<=b; j++)
//           {
//               if(a%j==0)
//               {
//                   count++;
//               }
//           }
//           a++;
//           if(count==2)
//           {
//               System.out.println(a);
//           }
//
//
//            }
//        }
//    }
//
//public class B3 {
//    public static void main(String[] args) {
//
//        int a = 2;
//        int b = 15;
//        int flag = 0;
//
//        while (a <= b) {
//            boolean isPrime = true; // Assume the number is prime initially
//
//            for (int i = 2; i < a; i++)
//            {
//                if (a % i == 0) {
//                    isPrime = false; // If a divisor is found, the number is not prime
//                    break;
//                }
//            }
//
//            if (isPrime && a > 1) {
//                System.out.println(a); // Print the prime number
//            }
//
//            a++;
//        }
//    }
//}

//        if (a > b || a == 0 || a == 1) {
//            System.out.println("invalid number");
//        }
//
//        while (a <= b)
//        {
//
//            for (int i = 2; i < b; i++)
//            {
//                if (a % i == 0)
//                {
//                    flag ++;
//                    break;
//                }
//                if (flag == 0)
//                {
//                    System.out.println(a + " ");
//                }
//            }
//            if (flag == 0)
//            {
//                System.out.println(a + " ");
//            }
//            a++;
//        }
//    }
//}

//(7)
//        public class B3 {
//            public static void main(String[] args) {
//
//                int a = 6;
//                int b = 15;
//                if (a > b || a == 0 || a == 1)
//                {
//                    System.out.println("invalid number");
//                }
//                else
//                {
//                    while (a <= b)
//                    {
//                        int flag = 0; // Initialize flag for each number 'a'
//
//
//                            for (int i = 2; i < a; i++)
//                            {
//                                if (a % i == 0)
//                                {
//                                    flag++;
//                                    break;
//                                }
//                            }
//
//                            if (flag == 0)
//                            {
//                                System.out.println(a); // Print only if the number is prime
//                            }
//                        a++;
//                        }
//
//
//                    }
//                }
//            }

//(8)

//import java.util.*;
//public class B3 {
//
//    public static void markscore(int no,int n1,int n2,int n3,int m1[],int m2[],int m3[])
//    {
//        Scanner sc = new Scanner(System.in);
//        int max1=0;
//        int max2=0;
//        int max3=0;
//        System.out.println("marks obtained in semester 1");
//        for(int i=0; i<n1; i++) {
//
//
//                m1[i] = sc.nextInt();
//            if(m1[i]<0)
//            {
//                System.out.println("you hav entered an invalid mark");
//                return;
//            }
//
//        }
//        for(int i=0; i<n1; i++)
//        {
//            if(m1[i]>max1)
//            {
//                max1=m1[i];
//            }
////            System.out.println("Maximum mark in 1st semester"+max1);
//
//        }
//        System.out.println("marks obtained in 2nd semester ");
//        for(int i=0; i<n2; i++) {
//
//            m2[i] = sc.nextInt();
//
//
//             if(m2[i]<0||m2[i]>100)
//            {
//                System.out.println("you have entered an invalid mark");
//                return;
//            }
//
//        }
//        for(int i=0; i<n2; i++)
//        {
//            if(m2[i]>max2)
//            {
//                max2=m2[i];
//            }
////            System.out.println(max2);
//
//        }
//        System.out.println("marks obtained in 3rd semester ");
//        for(int i=0; i<n3; i++)
//        {
//
//                m3[i] = sc.nextInt();
//
//                if(m3[i]<0||m3[i]>100)
//            {
//                System.out.println("you have entered an invalid mark");
//                return;
//            }
//        }
//        for(int i=0; i<n3; i++)
//        {
//            if(m3[i]>max3)
//            {
//                max3=m3[i];
//            }
//
//
//        }
//        System.out.println("Maximum mark in 1st semester"+max1);
//        System.out.println("Maximum mark in 2nd semester "+max2);
//        System.out.println("Maximum mark in 3rd semester "+max3);
//
//
//    }
//
//
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                System.out.print("enter the number of semester");
//                int no = sc.nextInt();
////                int a[]=new int[no];
//                System.out.print("enter the number of subjects in 1st semester");
//                int n1 = sc.nextInt();
//                System.out.print("enter the number of subjects in 2nd semester");
//                int n2 = sc.nextInt();
//                System.out.print("enter the number of subjects in 3rd semester");
//                int n3 = sc.nextInt();
//                int m1[] = new int[n1];
//                int m2[] = new int[n2];
//                int m3[]= new int[n3];
//
//
//
//               markscore(no, n1, n2, n3,m1,m2,m3);
//
//
//            }
//
//            }


//(9)

//import java.util.Scanner;
//
//public class B3 {
//
//    static void p(int a)
//    {
//        for(int i=1; i<=a; i++)
//        {
//            if(a%i==0)
//            {
//                System.out.println(i);
//            }
//        }
//
//    }
//    public static void main(String[] args)
//    {
//
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//
//        if(a==0)
//        {
//            System.out.println("No Factors");
//        }
//        p(a);
//    }
//}


// (10)

//public class B3 {
//    public static void main(String[] args) {
//        int a[]={2,1,2,2,3,2};
//        int sum=0;
//
//        for(int i=0; i<a.length; i++)
//        {
//            sum+=a[i];
//            System.out.println(sum);
//        }
//
//    }
//}

//(11)

//import java.util.*;
//public class B3 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the no of students placed in  CSE");
//        int a= sc.nextInt();
//        System.out.println("enter the number of students placed in ECE");
//        int b= sc.nextInt();
//        System.out.println("enter the number of students placed in MECH");
//        int c= sc.nextInt();
//
//        if(a<0||b<0 ||c<0)
//        {
//            System.out.println("inavlid input");
//        }
//        else
//        {
//            if(a>b&&a>c)
//            {
//                System.out.println("Highest placement  CSE");
//            }
//            if(b>a&&b>c)
//            {
//                System.out.println("highest placement ece");
//            }
//            if(c>a&&c>b)
//            {
//                System.out.println("Highest placement mech");
//            }
//            if(a==b&&a==c&&b==a&&c==a&&b==c)
//            {
//                System.out.println("none of the placement");
//            }
//            else if(a==b&&b==a&&b!=a)
//            {
//                System.out.println("Highest placement CSE ECE");
//            }
//            if(b==c&&c==b&&(b!=a||a!=c))
//            {
//                System.out.println("Highest placment ECE Mech");
//            }
//            if(c==a&&a==c&&(b!=a||b!=c))
//            {
//                System.out.println("highest placement CSE Mech");
//            }
//        }
//
//
//    }
//
//    }






//
//public class B3 {
//    public static void main(String[] args) {
//
//        int a=2;
//        int b=13;
//        int c=0;
//
//        for(int i=a; i<=b; i++)
//        {
//            int f=2;
//
//            while(a<b)
//            {
//                if(i%f==0)
//                {
//                    a=-1;
//
//                }
//                else {
//                    System.out.println(i);
//                }
//                a++;
//            }
////            if(c==0)
////            {
////                System.out.println(i+"");
////            }
//        }
//    }
//}

//        import java.util.*;
//public class B3 {
//
//    static Scanner sc=new Scanner (System.in);
//
//    public static void main(String[] args) {
//        System.out.print("Enter no of semester: ");
//        int ns=sc.nextInt();
//        int [] arr=new int [ns];
//        int c=0;
//        for(int i=0; i<ns; i++) {
//            System.out.print("Enter no of subjects in "+(i+1)+" semester: ");
//            int sn=sc.nextInt();
//            arr[i]=sn;
//            c+=sn;
//        }
//        int [] arr2=new int [c];
//        int x=0;
//        int n=0;
//        for(int i=0; i<ns; i++) {
//            for(int j=0; j<arr[i]; j++) {
//                System.out.print("Marks obtained in semester "+i+1);
//                int m=sc.nextInt();
//                if(m>0&&m<=100) {
//                    arr2[x++]=m;
//                }
//                else {
//                    System.out.print("“You\r\n"
//                            + "have entered invalid mark.”");
//                    n=1;
//                    break;
//                }
//            }
//            if(n==1) {
//                break;
//            }
//        }
//        x=0;
//        int max=0;
//        if(n!=1) {
//            for(int i=0; i<ns; i++) {
//                for(int j=0; j<arr[i]; j++) {
//                    if(max<arr2[x++]) {
//                        max=arr2[x-1];
//                    }
//                }
//                System.out.println("Maximum mark in "+(i+1)+" semester: "+max);
//                max=0;
//            }
//        }
//
//    }
//}

//(12)
//
//import java.util.*;
//public class B3{
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int a= sc.nextInt();
//        int b=sc.nextInt();
//        int g=0;
//        int j=0;
//
//        while(a>0)
//        {
//            int f=a%10;
//             g=g+f;
//             a=a/10;
//        }
//        int d=b*g;
//        while(d>0)
//        {
//            int h=d%10;
//            j=j+h;
//            d=d/10;
//        }
//        System.out.println(j);
//
//
//    }
//}



//
//(13)

//import java.util.*;
//public class B3 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
////        int a=sc.nextInt();
////        int b[]=new int [a];
//        int c[]={7,0,5,1,3};
//        int d[]={1,2,1,3,4};
//        int f=0;
//        int count=0;
//       int t=5;
//
////        for(int i=0; i<b.length; i++)
////        {
////            b[i]= sc.nextInt();
////        }
//        for(int i=0; i<t; i++)
//        {
//
//
//                 f+=c[i]-d[i];
//                count++;
//                if(count>=5)
//                  break;
//
//
//
//        }
//        System.out.println(f);
//
//    }
//}
//


























































































































































































































































