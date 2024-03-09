
//(1)
//
//class Student {
//    int student_id;
//    String firstName;
//    String lastname;
//    int age;
//    String coursenrolled;
//
//    public Student(int student_id,String firstName,String lastname,int age ,String coursenrolled)
//    {
//        this.student_id=student_id;
//        this.firstName=firstName;
//        this.lastname=lastname;
//        this.age=age;
//        this.coursenrolled=coursenrolled;
//    }
//
//    public int getStudent_id()
//    {
//        return student_id;
//    }
//    public String getFirstName()
//    {
//        return firstName;
//    }
//    public String getLastname()
//    {
//        return lastname;
//    }
//    public int getAge()
//    {
//        return age;
//    }
//    public String getCoursenrolled()
//    {
//        return coursenrolled;
//    }
//
//
//}
//
//public class B8 {
//    public static void main(String[] args) {
//
//        Student a= new Student(12,"ram","kumar",21,"B.Sc");
//        System.out.println(a.student_id);
//        System.out.println(a.firstName);
//        System.out.println(a.lastname);
//        System.out.println(a.coursenrolled);
//        System.out.println(a.age);
//
//    }
//}

//(2)


//
//class Student extends StudentManager{
//    int studentId;
//    String firstName;
//    String lastName;
//    int age;
//    String coursesEnrolled;
//
//    public  Student( int studentId,String firstName, String lastName, int age,String coursesEnrolled){
//        this.studentId=studentId;
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.age=age;
//        this.coursesEnrolled=coursesEnrolled;
//    }
//    public int getId() {
//        return studentId;
//    }
//
//    public String getfirstName() {
//        return firstName;
//    }
//
//    public String getlastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getcoursesEnrolled() {
//        return coursesEnrolled;
//    }
//}
//
//public class P implements implement
//{
//    static Scanner sc=new Scanner (System.in);
//    public static void main(String[] args) {
//        StudentManager sm=new StudentManager();
//        Student st= new Student(0,"vikas","jain",25,"java full stack");
//        Student st1= new Student(1,"vk","jain",30,"java full");
//        sm.add(st);
//        sm.add(st1);
//        sm.remove(1);
//        sm.retrieving();
//
//
//    }
//}


//(2)
//import java.util.*;
//
//class  StudentManager{
//    ArrayList<Student> al=new ArrayList<Student>();
//
//    public void add(Student st)
//    {
//        al.add(st);
//    }
//    public Student remove(int id)
//    {
//        Student st= al.remove(id);
//        return st;
//    }
//
//    public void retrieving()
//    {
//        for(Student s :al)
//        {
//            System.out.println(s.getId()+" "+s.getlastName()+" "+s.getlastName()+" "+s.getAge()+" "+s.getcoursesEnrolled());
//        }
//    }
//}
//
//class Student extends StudentManager{
//    int studentId;
//    String firstName;
//    String lastName;
//    int age;
//    String coursesEnrolled;
//
//    public  Student( int studentId,String firstName, String lastName, int age,String coursesEnrolled){
//        this.studentId=studentId;
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.age=age;
//        this.coursesEnrolled=coursesEnrolled;
//    }
//    public int getId() {
//        return studentId;
//    }
//
//    public String getfirstName() {
//        return firstName;
//    }
//
//    public String getlastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getcoursesEnrolled() {
//        return coursesEnrolled;
//    }
//}
//
//public class B8 {
//
//    public static void main(String[] args)
//    {
//        StudentManager sm=new StudentManager();
//        Student st= new Student(0,"vikas","jain",25,"java full stack");
//        Student st1= new Student(1,"vk","jain",30,"java full");
//        sm.add(st);
//        sm.add(st1);
//        sm.remove(1);
//        sm.retrieving();
//
//    }
//}

////(4)
//
//import java.util.*;
//
//
//class   BankAccount {
//
//
//    ArrayList<Transaction> al = new ArrayList<Transaction>();
//
//}
//
//    public class B8 {
//    public static void main(String[] args)
//    {
//
//    }
//}

// (2)
//import java.util.*;
//
//                class  StudentManager{
//                    ArrayList<Student> al=new ArrayList<Student>();
//
//                    public void add(Student st) {
//                        al.add(st);
//                    }
//                    public Student remove(int id) {
//                        Student st= al.remove(id);
//                        return st;
//                    }
//
//                }
//
//                class Student extends StudentManager{
//                    int studentId;
//                    String firstName;
//                    String lastName;
//                    int age;
//                    String coursesEnrolled;
//
//                    public  Student( int studentId,String firstName, String lastName, int age,String coursesEnrolled){
//                        this.studentId=studentId;
//                        this.firstName=firstName;
//                        this.lastName=lastName;
//                        this.age=age;
//                        this.coursesEnrolled=coursesEnrolled;
//                    }
//                    public int getId() {
//                        return studentId;
//                    }
//
//                    public String getfirstName() {
//                        return firstName;
//                    }
//
//                    public String getlastName() {
//                        return lastName;
//                    }
//
//                    public int getAge() {
//                        return age;
//                    }
//
//                    public String getcoursesEnrolled() {
//                        return coursesEnrolled;
//                    }
//                }
//
//                public class B8{
//                    public static void main(String[] args) {
//                        StudentManager sm=new StudentManager();
//                        Student st= new Student(0,"vikas","jain",25,"java full stack");
//                        Student st1= new Student(1,"vk","jain",30,"java full");
//
//                        sm.add(st);
//
//                        sm.add(st1);
//                        sm.remove(1);
//                        for(Student s :sm.al) {
//                            System.out.println(s.getId()+" "+s.getlastName()+" "+s.getlastName()+" "+s.getAge()+" "+s.getcoursesEnrolled());
//                        }
//
//                    }
//                }

//(3)

import java.util.*;

public class B8 {

//    class Bank{
//        ArrayList<>
//    }
    public static void main(String[] args) {
             int a=047;
        System.out.println(a);
    }
}