
// BOOTCAMP Day 1

//1)Problem Statement – Chaman planned to choose a four digit lucky number for his car. His
//        lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by 3 or 5 or
//        7. Provide a valid car number, Fails to provide a valid input then display that number is not a
//        valid car number.
//        Note : The input other than 4 digit positive number[includes negative and 0] is considered as
//        invalid.
//        Refer the samples, to read and display the data.
//        Sample Input 1:
//        Enter the car no:1234
//        Sample Output 1:
//        Lucky Number
//        Sample Input 2:
//        Enter the car no:1214
//        Sample Output 2:
//        Sorry its not my lucky number
//        Sample Input 3:
//        Enter the car no:14
//        Sample Output 3:
//        14 is not a valid car number

//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args)
//    {
//       Scanner sc = new Scanner(System.in);
//        System.out.print("enter the car number : ");
//       int a= sc.nextInt();
//       int f=0;
//
//       if(a<1000 || a>9999)
//       {
//           System.out.println(a+" is not a valid car number");
//       }
//       else
//       {
//           while(a>0)
//           {
//               int d=a%10;
//                 f=f+d;
//               a/=10;
//           }
//           if(f%3==0||f%5==0||f%7==0)
//           {
//               System.out.println("Lucky number ");
//           }
//           else
//           {
//               System.out.println("Sorry its not a lucky number");
//           }
//       }
//
//    }
//}


//(2)
//XYZ Technologies is in the process of increment the salary of the employees. This
//        increment is done based on their salary and their performance appraisal rating.
//        If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
//        If the appraisal rating is between 3.1 and 4, the increment is 25% of the salary.
//        If the appraisal rating is between 4.1 and 5, the increment is 30% of the salary.
//        Help them to do this, by writing a program that displays the incremented salary. Write a
//class “IncrementCalculation.java” and write the main method in it.
//        Note : If either the salary is 0 or negative (or) if the appraisal rating is not in the range 1 to
//        5 (inclusive), then the output should be “Invalid Input”.
//        Sample Input 1 :
//        Enter the salary
//        8000
//
//        Enter the Performance appraisal rating
//        3
//        Sample Output 1 :
//        8800
//        Sample Input 2 :
//        Enter the salary
//        7500
//        Enter the Performance appraisal rating
//        4.3
//        Sample Output 2 :
//        9750
//        Sample Input 3 :
//        Enter the salary
//        -5000
//        Enter the Performance appraisal rating
//        6
//        Sample Output 3 :
//        Invalid Input

//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the salary :  ");
//        int a = sc.nextInt();
//        System.out.print("Enter the performance appraising rating : ");
//        float b= sc.nextFloat();
//
//        if(a<0 || b<1||b>5)
//        {
//            System.out.println("Invalid input");
//        }
//        else
//        {
//            if(b>=1.0f&&b<=3.0f)
//            {
//                System.out.println(a+(10*a/100));
//            }
//            if(b>=3.1f&&b<=4.0f)
//            {
//                System.out.println(a+(25*a/100));
//            }
//            if(b>=4.1f&&b<=5.0f)
//            {
//                System.out.println(a+(30*a/100));
//            }
//        }
//    }
//}


//
//3)
//        Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a number
//        to Tanul. Tanul should first reverse the number and check if it is same as the original. If yes,
//        Tanul should say “Palindrome”. If not, he should say “Not a Palindrome”. If the number is
//        negative, print “Invalid Input”. Help Tanul by writing a program.
//        Sample Input 1 :
//        21212
//        Sample Output 1 :
//        Palindrome
//        Sample Input 2 :
//        6186

//
//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args)
//    {
//          Scanner sc= new Scanner(System.in);
//          int a = sc.nextInt();
//          int b=a;
//          int g=0;
//
//          if(a<0)
//          {
//              System.out.println("Invalid Input");
//          }
//          else
//          {
//              while(a>0)
//              {
//                  int f=a%10;
//                  g=g*10+f;
//                  a/=10;
//              }
//              if(b==g)
//              {
//                  System.out.println("its a palindrome number");
//              }
//              else
//              {
//                  System.out.println("Not a plaindrome number");
//              }
//
//          }
//
//    }
//}
//_____________________________________________________________________________
//      (4) Problem Statement – To speed up his composition of generating unpredictable rhythms,
//        Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help
//        him out?
//        Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).
//        Note
//        Input 1 should be lesser than Input 2. Both the inputs should be positive.
//        Range must always be greater than zero.
//        If any of the condition mentioned above fails, then display “Provide valid input”
//        Use a minimum of one for loop and one while loop
//        Sample Input 1:
//        2
//        15
//        Sample Output 1:
//        2 3 5 7 11 13
//        Sample Input 2:
//        8
//        5
//        Sample Output 2:
//        Provide valid input
//
//
//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the first number");
//        int a = sc.nextInt();
//        System.out.println("enter the second number");
//        int b = sc.nextInt();
//
//
//        if (a > b || b < 0 || a < 0) {
//            System.out.println("Provider valid input");
//        } else {
//
//            for (int i = a; i <= b; i++) {
//                int f = 0;
//                int j = 2;
//                while (j < i) {
//                    if (i % j == 0) {
//                        f = 1;
//                        break;
//                    }
//                    j++;
//                }
//
//                if (f == 0) {
//                    System.out.println(i + " ");
//                }
//            }
//        }
//    }
//}
// with two for loops to find the prime number between the range
//
//        for(int i=a; i<=b; i++ )
//        {
//            int d=0;
//            for(int j=2; j<=a; j++)
//            {
//                if(i%j==0)
//                {
//                    d++;
//
//                }
//            }
//            if(d==0)
//            {
//                System.out.println(i);
//            }
//        }
//          }
//
//    }

//    5)
//        Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the
//        lesson on seasons. When her teacher tells a month, she needs to say the season
//        corresponding to that month. Write a program to solve the above task.
//        Spring – March to May,
//        Summer – June to August,
//        Autumn – September to November and,
//        Winter – December to February.
//        Month should be in the range 1 to 12. If not the output should be “Invalid month”.
//
//        Sample Input 1:
//        Enter the month:11
//        Sample Output 1:
//        Season:Autumn
//        Sample Input 2:

//
//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the month  :");
//        int a= sc.nextInt();
//        if(a>=3&&a<=5)
//        {
//            System.out.println("Season : Autumn");
//        }
//        if(a>=6&&a<=8)
//        {
//            System.out.println("Season : Summer");
//        }
//        if(a>=9&&a<=11)
//        {
//            System.out.println("Season : Autumn");
//        }
//        if(a==12||a<=2)
//        {
//            System.out.println("Season : Winter");
//        }
//        if(a<1||a>12)
//        {
//            System.out.println("Invalid month");
//        }
//
//    }
//}
//___________________________________________________________________________________
//   6)
//        In a theater, there is a discount scheme announced where one gets a 10% discount
//        on the total cost of tickets when there is a bulk booking of more than 20 tickets, and
//        a discount of 2% on the total cost of tickets if a special coupon card is submitted.
//        Develop a program to find the total cost as per the scheme. The cost of the k class
//ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an
//        additional of Rs. 50 per member.
//        Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a
//        time. If fails display “Minimum of 5 and Maximum of 40 Tickets”. If circle is given a
//        value other than ‘k’ or ‘q’ the output should be “Invalid Input”.
//        The ticket cost should be printed exactly to two decimal places.
//        Sample Input 1:
//        Enter the no of ticket:35
//        Do you want refreshment:y
//        Do you have coupon code:y
//        Enter the circle:k
//        Sample Output 1:
//        Ticket cost:4065.25
//        Sample Input 2:
//        Enter the no of ticket:1
//        Sample Output 2:
//        Minimum of 5 and Maximum of 40 Tickets

//
//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args)
//    {
//
//        Scanner sc= new Scanner(System.in);
//        System.out.print("enter the no of ticket  :");
//        int a= sc.nextInt();
//        if(a>40||a<5)
//        {
//            System.out.println("Minimum of 5 and Maximum of 40 tickets");
//        }
//        System.out.print("Do you want refreshment");
//        char b=sc.next().charAt(0);
//        System.out.print("Do you have coupon code : ");
//        char c =sc.next().charAt(0);
//        System.out.println("Enter the circle : ");
//        char d=sc.next().charAt(0);
//        float f=0;
//
//        if(d=='k')
//        {
//          f=75*a;
//
//        }
//        if(b=='y')
//        {
//            f=f+50.0f*a;
//        }
//        if(c=='y'&&a>20)
//        {
//            f=f-(f*0.10f);
//        }
//        System.out.println(f);
//    }
//
//    }
//
//Problem  (7) Statement – FOE college wants to recognize the department which has
//        succeeded in getting the maximum number of placements for this academic year.
//        The departments that have participated in the recruitment drive are CSE,ECE,
//        MECH. Help the college find the department getting maximum placements. Check
//        for all the possible output given in the sample snapshot
//        Note : If any input is negative, the output should be “Input is Invalid”. If all
//        department has equal number of placements, the output should be “None of the
//        department has got the highest placement”.
//        Sample Input 1:
//        Enter the no of students placed in CSE:90
//        Enter the no of students placed in ECE:45
//        Enter the no of students placed in MECH:70
//        Sample Output 1:
//        Highest placement
//        CSE
//        Sample Input 2:
//        Enter the no of students placed in CSE:55
//        Enter the no of students placed in ECE:85
//        Enter the no of students placed in MECH:85
//        Sample Output 2:
//        Highest placement
//        ECE
//        MECH
//        Sample Input 3:
//        Enter the no of students placed in CSE:0
//        Enter the no of students placed in ECE:0
//        Enter the no of students placed in MECH:0
//        Sample Output 3:
//
//        None of the department has got the highest placement
//        Sample Input 4:
//        Enter the no of students placed in CSE:10
//        Enter the no of students placed in ECE:-50
//        Enter the no of students placed in MECH:40
//        Sample Output 4:

//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the no of students placed in CSE");
//        int a = sc.nextInt();
//        System.out.println("Enter the no of students placed in ECE");
//        int b = sc.nextInt();
//        System.out.println("Enter the no of students placed in MECH");
//        int c = sc.nextInt();
//
//        if(a<0||b<0||c<0)
//        {
//            System.out.println("Input is Invalid");
//            return;
//        }
//        else {
//
//
//            if (c > a && c > b) {
//                System.out.println("Highest placement MECH");
//            }
//            if (b > a && b > c) {
//                System.out.println("Highest placement ECE");
//            }
//            if (a > b && a > c) {
//                System.out.println("Highest placement CSE");
//            }
//            if (a == b && c != a) {
//                System.out.println("Highest placement CSE and ECE");
//            }
//            if (b == c && a != b) {
//                System.out.println("Highest placement MECH and ECE");
//            }
//            if (a == b && c == a && b == c) {
//
//               System.out.println("None of the department has the highest placement");


// (8)
//Problem Statement – Ritik wants a magic board, which displays a character for a
//        corresponding number for his science project. Help him to develop such an
//        application.
//        For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be
//        displayed.
//        [Assume the number of inputs should be always 4 ]
//        Sample Input 1:
//        Enter the digits:
//        65
//        66
//        67
//        68
//        Sample Output 1:
//        65-A
//        66-B
//        67-C
//        68-D//            }
//        }
//    }
//}
//
//
//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the digits");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        char p = (char) a;
//        char q = (char) b;
//        char r = (char) c;
//        char s = (char) d;
//        System.out.println(a + " " + p);
//        System.out.println(b + " " + q);
//        System.out.println(c + " " + r);
//        System.out.println(d + " " + s);
//
//    }
//}



//
//9)
//        Vohra went to a movie with his friends in a Wave theatre and during break time he
//        bought pizzas, puffs and cool drinks. Consider the following prices :
//        Rs.100/pizza
//        Rs.20/puffs
//        Rs.10/cooldrink
//        Generate a bill for What Vohra has bought.
//        Sample Input 1:
//        Enter the no of pizzas bought:10
//        Enter the no of puffs bought:12
//        Enter the no of cool drinks bought:5
//        Sample Output 1:
//        Bill Details
//        No of pizzas:10
//        No of puffs:12
//        No of cooldrinks:5
//        Total price=1290
//        ENJOY THE SHOW!!!

//
//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the no of pizzas bought :  ");
//        int a = sc.nextInt();
//        System.out.print("Enter the no of puffs bought : ");
//        int b= sc.nextInt();
//        System.out.print("Enter the no of cool drinks bought : ");
//         int c= sc.nextInt();
//
//        System.out.println("No. of pizzas : "+a);
//        System.out.println("No. of puffs : "+b);
//        System.out.println("No. of coldrinks : "+c);
//        int d=100*a+20*b+10*c;
//        System.out.println("Total price =  "+d);
//        System.out.println("ENJOY THE SHOW!!!");
//    }
//}
//
//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no. of liters in the tank :  ");
//        int a = sc.nextInt();
//        if(a<0)
//        {
//            System.out.println("Invalid input ");
//            return;
//        }
//
//        System.out.println("Enter the distnce covered  :  ");
//        int b= sc.nextInt();
//        if(b<0)
//        {
//            System.out.println(b+"  Invalid Input");
//            return;
//        }
//
//        float f=((float)a/(float)b)*100;
//        float g=a*0.2642f;
//        float h=b*0.6214f;
//        float i=a*0.2642f;
//        float j=h/i;
//
//        System.out.println("Liters/ 100km"+f);
//        System.out.println("Miles/gallons "+j);
//    }
//}


//Day 2

//1)
//        Problem Statement –A chocolate factory is packing chocolates into the packets. The
//        chocolate packets here represent an array of N number of integer values. The task is to find
//        the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
//        Example 1 :
//        N=8 and arr = [4,5,0,1,9,0,5,0] There are 3 empty packets in the given set. These 3 empty
//        packets represented as O should be pushed towards the end of the array
//        Input :
//        8 – Value of N
//        [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by
//        newline
//        Output:
//        4 5 1 9 5 0 0 0

//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the length of the array");
//        int a = sc.nextInt();
//        int a1[] = new int[a];
//        int b1[]=new int[a];
//        int c = 0;
//        for (int i = 0; i < a1.length; i++)
//        {
//            a1[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i < a1.length; i++)
//        {
//            if (a1[i]%2!= 0)
//            {
//                 b1[c++]=a1[i] ;
//            }
//        }
//        for (int i = 0; i < a1.length; i++)
//        {
//            if (a1[i]%2==0)
//            {
//                b1[c++]=a1[i];
//            }
//        }
//        for (int i = 0; i < b1.length; i++)
//        {
//            System.out.println(b1[i]);
//        }
//    }
//}

//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the length of the array");
//        int a = sc.nextInt();
//        int a1[] = new int[a];
//        int b1[] = new int[a];
//        int c = 0;
//        for (int i = 0; i < a1.length; i++) {
//            a1[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i < a1.length; i++) {
//            if (a1[i] != 0) {
//                a1[c++] = a1[i];
//            }
//        }
//        for (int j = c; j < a1.length; j++) {
//            if (a1[j] == 0) {
//                a1[j] = 0
//            }
//        }
//        for (int i = 0; i < a1.length; i++) {
//            System.out.println(a1[i]);
//        }
//    }
//}


//(2)
//Given an integer array Arr of size N the task is to find the count of elements whose value is
//        greater than all of its prior elements.
//        Note : 1st element of the array should be considered in the count of the result.
//        For example,
//        Arr[]={7,4,8,2,9}
//        As 7 is the first element, it will consider in the result.
//        8 and 9 are also the elements that are greater than all of its previous elements.
//        Since total of 3 elements is present in the array that meets the condition.
//        Hence the output = 3.
//        Example 1:
//        Input
//        5 -> Value of N, represents size of Arr
//        7-> Value of Arr[0]
//        4 -> Value of Arr[1]
//        8-> Value of Arr[2]
//        2-> Value of Arr[3]
//
//        9-> Value of Arr[4]
//        Output :

//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the length of the array");
//        int a = sc.nextInt();
//        int a1[] = new int[a];
//        int c = 0;
//        int j=0;
//        for (int i = 0; i < a1.length; i++) {
//            a1[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<a1.length; i++)
//        {
//            if(a1[i]>c)
//            {
//                c=a1[i];
//                j++;
//            }
//        }
//        System.out.println(j);
//    }
//}

//(3)
//
//An international round table conference will be held in india. Presidents from all over the
//        world representing their respective countries will be attending the conference. The task is to
//        find the possible number of ways(P) to make the N members sit around the circular table
//        such that.
//        The president and prime minister of India will always sit next to each other.
//        Example 1:
//        Input :
//        4 -> Value of N(No. of members)
//        Output :
//        12 -> Possible ways of seating the members
//        Explanation:
//        2 members should always be next to each other.
//        So, 2 members can be in 2!ways
//
//        Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously
//        selected two members will be considered as single members now).
//        So total possible ways 4 members can be seated around the circular table 2*6= 12.
//        Hence, output is 12.



//import java.util.*;
//public class Bootrev
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        int x=sc.nextInt();
//        long n=1;
//        if(2<=x&&x<=50)
//        {
//            for(int i=1; i<=x-1; i++)
//            {
//                n*=i;
//            }
//            long t=n*2;
//            System.out.print(t);
//        }
//        else
//        {
//            System.out.print("Invalid Input");
//        }
//    }
//}


//4) An intelligence agency has received reports about some threats. The reports consist of
//        numbers in a mysterious method. There is a number “N” and another number “R”. Those
//        numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are
//        summed up and this action is performed ‘R’ number of times. The resultant is also a single
//        digit that is yet to be deciphered. The task here is to find the single-digit sum of the given
//        number ‘N’ by repeating the action ‘R’ number of times.
//        If the value of ‘R’ is 0, print the output as ‘0’.
//        Example 1:
//        Input :
//        99 -> Value of N
//        3 -> Value of R
//        Output :
//        9 -> Possible ways to fill the cistern.
//        Explanation:
//        Here, the number N=99
//        1)Sum of the digits N: 9+9 = 18
//        2)Repeat step 2 ‘R’ times i.e. 3 tims (9+9)+(9+9)+(9+9) = 18+18+18 =54
//        3)Add digits of 54 as we need a single digit 5+4
//        Hence , the output is 9

//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner (System.in);
//        int x=sc.nextInt();
//        int a=0;
//        int c=0;
//        int b= sc.nextInt();
//
//        while(x!=0)
//        {
//            int f=x%10;
//            a+=f;
//            x/=10;
//
//        }
//        int g=a*b;
//        while(g!=0)
//        {
//            int h=g%10;
//            c+=h;
//            g/=10;
//        }
//        System.out.println(c);
//    }
//}

//(5)
//Problem Statement
//        Particulate matters are the biggest contributors to Delhi pollution. The main reason behind
//        the increase in the concentration of PMs include vehicle emission by applying Odd Even
//        concept for all types of vehicles. The vehicles with the odd last digit in the registration
//        number will be allowed on roads on odd dates and those with even last digit will on even
//        dates.
//        Given an integer array a[], contains the last digit of the registration number of N vehicles
//        traveling on date D(a positive integer). The task is to calculate the total fine collected by the
//        traffic police department from the vehicles violating the rules.
//        Note : For violating the rule, vehicles would be fined as X Rs.
//        Example 1:
//        Input :
//        4 -> Value of N
//        {5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line
//        12 -> Value of D, i.e. date
//
//        200 -> Value of x i.e. fine
//        Output :
//        600 -> total fine collected
//
//import java.util.*;
//public class Bootrev {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//        int b = sc.nextInt();
//        int a[] = new int[b];
//        int count=0;
//
//        for (int i = 0; i < a.length; i++)
//        {
//            a[i] = sc.nextInt();
//        }
//        if (c % 2 == 0)
//        {
//            for (int i = 0; i < a.length; i++)
//            {
//                if(a[i]%2!=0)
//                {
//                    count++;
//                }
//            }
//            System.out.println(count*200);
//
//        }
//        else
//        {
//            for(int i=0; i<a.length; i++)
//            {
//                if(a[i]%2==0)
//                {
//                    count++;
//                }
//            }
//            System.out.println(count*300);
//        }
//
//    }
//}

//(6)
//
//Problem Statement – An automobile company manufactures both a two wheeler (TW) and a
//        four wheeler (FW). A company manager wants to make the production of both types of
//        vehicle according to the given data below:
//        a)1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
//        b)2nd data, Total number of wheels = W
//        The task is to find how many two-wheelers as well as four-wheelers need to manufacture as
//        per the given data.
//        Example :
//        Input :
//        200 -> Value of V
//        540 -> Value of W
//        Output :
//        TW =130 FW=70
//        Explanation:
//        130+70 = 200 vehicles
//        (70*4)+(130*2)= 540 wheels
//        Constraints :
//        a)2<=W
//        b)W%2=0
//        c)V<W
//Print “INVALID INPUT” , if inputs did not meet the constraints.
//        The input format for testing
//        The candidate has to write the code to accept two positive numbers separated by a new line.
//        a)First Input line – Accept value of V.

import java.util.*;
public class Bootrev {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//
//        int c=b/2;

        int a[]={5,4,3,2,1};

        int b=0;
        int c=a[0];
        int d=0;

        for(int i=0; i<a.length; i++)
        {
            if(a[i]<c)

            {
                c=a[i];
                                   
            }
        }

        for(int j=0; j<a.length; j++)
        {
            if(a[j]<c)
            {
                c=a[j];
                b=a[j];
            }


        }
        System.out.println(c);


        


    }
}