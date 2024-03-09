
//(1)
//public class Ll {
//    public static class N{
//        int data;
//        N n;
//        N(int data)
//        {
//            this.data=data;
//        }
//    }
//    public static void main(String[] args)
//    {
//
//        N a = new N(11);
//        N b = new N(12);
//        N c = new N(13);
//        N d = new N(14);
//        a.n=a;
//        b.n=b;
//        c.n=c;
//        d.n=d;
////        connectivity inside memory
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
////        connectivity in our output
//        System.out.println(a.n);
//        System.out.println(b.n);
//        System.out.println(c.n);
//        System.out.println(d.n);
////        want to print data
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//    }
//}

//(2)
//public class Ll{
//public static class B{
//
//    int d;
//    B v;
//    B(int d)
//    {
//       this.d=d;
//    }
//}
//public static class C{
//
//    int a1;
//     C b2;
//    C(int a1)
//    {
//        this.a1=a1;
//    }
//}
//    public static void main(String[] args) {
//
//    B b =new B(13);
//    B c =new B(15);
//    B d =new B(16);
//    B e =new B(19);
//        System.out.println(b.v);
//        System.out.println(c.v);
//        System.out.println(d.v);
//        System.out.println(e.v);
//
//        C c1 =new C(13);
//        C c2 =new C(15);
//        C c3 =new C(16);
//        C c4 =new C(19);
//        System.out.println(c1.b2);
//        System.out.println(c2.b2);
//        System.out.println(c3.b2);
//        System.out.println(c4.b2);
//
//    }
//}


//(3)

//public class Ll{
//public static class B{
//
//    int d;
//    B v;
//    B(int d)
//    {
//       this.d=d;
//    }
//}
//public static class C{
//
//    int a1;
//    C b2;
//    C(int a1)
//    {
//        this.a1=a1;
//    }
//}
//    public static void main(String[] args) {
//
//    B b =new B(23);
//    B c =new B(78);
//    B d =new B(34);
//    B e =new B(12);
//        System.out.println(b.v);
//        System.out.println(c.v);
//        System.out.println(d.v);
//        System.out.println(e.v);
//
//        C c1 =new C(12);
//        C c2 =new C(56);
//        C c3 =new C(78);
//        C c4 =new C(23);
//        System.out.println(c1.b2);
//        System.out.println(c2.b2);
//        System.out.println(c3.b2);
//        System.out.println(c4.b2);
//
//    }
//}

//(4)

//public class Ll{
//    public static class B{
//
//        int d;
//        B v;
//        B(int d)
//        {
//            this.d=d;
//        }
//    }
//    public static class C{
//
//        int a1;
//         C b2;
//        C(int a1)
//        {
//            this.a1=a1;
//        }
//    }
//    public static void main(String[] args) {
//
//        B b =new B(23);
//        B c =new B(78);
//        B d =new B(34);
//        B e =new B(12);
//        System.out.println(b.d);
//        System.out.println(c.d);
//        System.out.println(d.d);
//        System.out.println(e.d);
//        System.out.println();
//
//        C c1 =new C(12);
//        C c2 =new C(56);
//        C c3 =new C(78);
//        C c4 =new C(23);
//        System.out.println(c1.a1);
//        System.out.println(c2.a1);
//        System.out.println(c3.a1);
//        System.out.println(c4.a1);
//
//    }
//}


//(5)

//public class Ll{
//    public static class B{
//
//        int d;
//        B v;
//        B(int d)
//        {
//            this.d=d;
//        }
//    }
//    public static class C{
//
//        int a1;
//         C b2;
//        C(int a1)
//        {
//            this.a1=a1;
//        }
//    }
//    public static void main(String[] args) {
//
//        B b =new B(23);
//        B c =new B(78);
//        B d =new B(34);
//        B e =new B(12);
//
//        System.out.println(b.d);
//        System.out.println(b.v.d);
//        System.out.println(b.v.v.d);
//        System.out.println(b.v.v.d);
//        System.out.println();
//
//        C c1 =new C(12);
//        C c2 =new C(56);
//        C c3 =new C(78);
//        C c4 =new C(23);
//        System.out.println(c1.a1);
//        System.out.println(c1.b2.a1);
//        System.out.println(c1.b2.b2.a1);
//        System.out.println(c1.b2.b2.b2.a1);
//
//    }
//}

