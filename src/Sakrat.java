//public class Sakrat {
//    synchronized
//
//    public void run()
//    {
//        p();
//           }
//
//         synchronized   void p() {
//
//               for (int i = 0; i <= 10; i++)
//                   System.out.println(i);
//           }
//
//        try{
//           Thread.sleep(1000);
//        }
//        catch (Exception a)
//        {
//            System.out.println(a);
//        }
//
//
//
//
//
//
//    public static void main(String[] args) {
//
//        Sakrat s = new Sakrat();
//        s.run();
//        Sakrat d = new Sakrat();
//        d.run();
//    }
//}
//1)
//        Write a Java program to create two threads. One thread should print odd numbers from 1 to 10, and the other thread should print even numbers from 2 to 10. Ensure proper synchronization to alternate between the two threads.
//        2)
//        Write a Java program that demonstrates the use of the synchronized keyword to achieve thread safety. Create a class with a shared resource and two threads trying to access and modify that resource. Use synchronization to avoid conflicts.
//
//        3)
//        Write a Java program that creates a simple countdown timer using Thread.sleep(). The program should start from 10 and print the remaining time after each second until reaching 0.
//
//        4)
//        Create a Java program to simulate a traffic light. Use three threads to represent three different colors (red, yellow, and green). Each color should be displayed for a specific duration using Thread.sleep().
//
//
//        5)
//        Design a Java program that simulates a race between three runners. Use three threads to represent the runners, and introduce delays with Thread.sleep(). Use Thread.join() to ensure that the race finishes only when all runners have completed.
//
//        6)
//        Write a Java program that creates two threads. The first thread prints numbers from 1 to 5, and the second thread prints letters from 'A' to 'E'. Ensure proper synchronization using Thread.sleep() and Thread.join() to achieve an ordered output.
//class Sakra implements Runnable {
//    private final int start;
//    private final int end;
//
//    public Sakra(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }
//
//     synchronized public void printNumbers()
//    {
//        for (int i = start; i <= end; i += 2) {
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//            try
//            {
//                Thread.sleep(100);
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
//    }
//
//
//    public void run()
//    {
//        printNumbers();
//    }
//
//}
//
//public class Sakrat {
//    public static void main(String[] args) {
//        Sakra oddThread = new Sakra(1, 10);
//        Sakra evenThread = new Sakra(2, 10);
//
//        Thread t1 = new Thread(oddThread, "OddThread");
//        Thread t2 = new Thread(evenThread, "EvenThread");
//
//        t1.start();
//        t2.start();
//    }
//}
//OddThread: 1
//        EvenThread: 2
//        OddThread: 3
//        EvenThread: 4
//        OddThread: 5
//        EvenThread: 6
//        OddThread: 7
//        EvenThread: 8
//        EvenThread: 10
//        OddThread: 9


//class Synch{
//
//}
//class Sakra implements Runnable {
//    private Synch syn;
//    private static int counter = 1; // Shared counter starting from 1
//    private final int end;
//
//    public Sakra(Synch syn,int end) {
//        this.end = end;
//        this.syn = syn;
//    }
//
//    public void printNumbers()
//    {
//        while (counter <= end)
//        {
//            synchronized (syn)
//            {
//                if ((counter % 2 == 1 && Thread.currentThread().getName().contains("Odd")) ||
//                        (counter % 2 == 0 && Thread.currentThread().getName().contains("Even")))
//                {
//                    System.out.println(Thread.currentThread().getName() + ": " + counter++);
//                }
//            }
//        }
//    }
//
//    public void run() {
//        printNumbers();
//    }
//}
//
//public class Sakrat {
//    public static void main(String[] args) {
//        Synch syn = new Synch();
//        Sakra oddThread = new Sakra(syn,10);
//        Sakra evenThread = new Sakra(syn,10);
//
//        Thread t1 = new Thread(oddThread, "OddThread");
//        Thread t2 = new Thread(evenThread, "EvenThread");
//
//        t1.start();
//        t2.start();
//    }
//}
