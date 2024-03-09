

//import java.util.*;
//
//  class Node{
//    Node left,right;
//    int data;
//
//    public Node(int data)
//    {
//        this.data=data;
//    }
//}
//
//public class Tree_ {
//
//
//       static  Scanner sc = new Scanner(System.in);
//
//        static Node createtree()
//        {
//            Node root =null;
//            System.out.println("entr the data");
//            int data =sc.nextInt();
//            if(data == -1)
//
//                return null;
//
//            root = new Node(data);
//            System.out.println("enter the left data"+data);
//            root.left =createtree();
//            System.out.println("enter the right data"+data);
//            root.right=createtree();
//            return root;
//    }
//
//    public static void main(String[] args) {
//
//            createtree();
//
//    }
//}



// Tree in , post ,pre
//
//import java.util.*;
//
//class Node{
//    Node left,right;
//    int data;
//    public Node(int data)
//    {
//        this.data=data;
//    }
//}
//public class Tree_ {
//    static Scanner sc =null;
//
//    static Node createtree()
//    {
//        Node root =null;
//        System.out.println("enter the data");
//        int data =sc.nextInt();
//        if(data==-1)
//        {
//            return null;
//        }
//        root = new Node(data);
//        System.out.println("enter the left data");
//        root.left =createtree();
//        System.out.println("enter the right data");
//        root.right =createtree();
//        return root;
//    }
//    static void inorder(Node root)
//    {
//        if(root==null)
//        {
//            return ;
//        }
//        inorder(root.left);
//        System.out.println(root.data+" ");
//        inorder(root.right);
//    }
//    static void preorder(Node root)
//    {
//        if(root==null)
//        {
//            return ;
//        }
//        inorder(root.left);
//        System.out.println(root.data+" ");
//        inorder(root.right);
//    }
//    static void postorder(Node root)
//    {
//        if(root==null)
//        {
//            return ;
//        }
//        inorder(root.left);
//        System.out.println(root.data+" ");
//        inorder(root.right);
//    }
//
//    public static void main(String[] args) {
//        sc = new Scanner(System.in);
//        Node root =createtree();
//        inorder(root);
//        System.out.println();
//        preorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//    }
//}

// height of the Tree

//import java.util.*;
//
//class Node{
//    Node left,right;
//    int data;
//
//    public Node(int data)
//    {
//        this.data=data;
//    }
//}
//
// public class Tree_ {
//    static Scanner sc =new Scanner(System.in);
//
//    static Node createTree()
//    {
//        Node root =null;
//        System.out.println("enter the data");
//        int data = sc.nextInt();
//
//        if(data==-1)
//        {
//            return null;
//        }
//        root = new Node(data);
//        System.out.println("enter the left data "+data);
//        root.left = createTree();
//
//        System.out.println("enter the right data "+data);
//        root.right = createTree();
//
//        System.out.println("enter the right data "+data);
//        root.right = createTree();
//        return root;
//    }
//    static int height(Node root)
//    {
//        if(root==null)
//        {
//            return 0;
//        }
//        int leftHeight = height(root.left);
//        int rightHeight =height(root.right);
//
//        return 1+Math.max(leftHeight,rightHeight);
//    }
//
//     public static void main(String[] args)
//     {
//         Node root = createTree();
//         int result = height(root);
//         System.out.println("result"+result);
//
//     }
//}
// size of binary tree : how manu nodes present in a tree

//import java.util.*;
//
//  class Node{
//      Node left,right;
//      int data;
//
//      public Node(int data)
//      {
//          this.data=data;
//      }
//  }
//  public class Tree_ {
//      static Scanner sc = new Scanner(System.in);
//      static Node createTree()
//      {
//          Node root = null;
//          System.out.println("enter the data");
//          int data = sc.nextInt();
//
//          if(data==-1)
//          {
//              return null;
//          }
//          root = new Node(data);
//          System.out.println("enter the left data"+data);
//          root.left =createTree();
//          System.out.println("enter the right data"+data);
//          root.left =createTree();
//          return root;
//      }
//      static int size(Node root)
//      {
//          if(root==null)
//          {
//              return 0;
//          }
//          return size(root.left)+ size(root.right)+1;
//      }
//
//      public static void main(String[] args) {
//
//          Node root =createTree();
//          int result = size(root);
//          System.out.println("size of the tree"+result);
//      }
//}

// maximum element in tree

//
//import java.util.*;
//
//  class Node{
//      Node left,right;
//      int data;
//
//      public Node(int data)
//      {
//          this.data=data;
//      }
//  }
//  public class Tree_ {
//      static Scanner sc = new Scanner(System.in);
//      static Node createTree()
//      {
//          Node root = null;
//          System.out.println("enter the data");
//          int data = sc.nextInt();
//
//          if(data==-1)
//          {
//              return null;
//          }
//          root = new Node(data);
//          System.out.println("enter the left data"+data);
//          root.left =createTree();
//          System.out.println("enter the right data"+data);
//          root.left =createTree();
//          return root;
//      }
//      static int size(Node root)
//      {
//          if(root==null)
//          {
//              return 0;
//          }
//          return size(root.left)+ size(root.right)+1;
//      }
//      static int maximum(Node root)
//      {
//          if(root==null)
//          {
//              return Integer.MIN_VALUE;
//
//          }
//          return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
//      }
//
//      public static void main(String[] args) {
//
//          Node root =createTree();
//          int result = maximum(root);
//          System.out.println("Maximum of the tree"+result);
//      }
//}
//__________________________________________________________________________________________________________________________
// 18-01-24
// BFS in tree : Breadth first search
// level
//  level 1: which element
// level 2 : which element
//____________________________________
// koi bhi element vo konse level pr hey
//import java.util.*;
//
//class Node{
//    Node left ,right;
//    int data;
//
//
// public  Node(int data)
// {
//     this.data =data;
// }
//}
//
//  public class Tree_ {
//    static Scanner sc = new Scanner(System.in);
//
//    static Node createTree()
//    {
//        Node root = null;
//        System.out.println("enter data");
//        int data = sc.nextInt();
//
//        if(data==-1)
//        {
//            return null;
//        }
//        root = new Node(data);
//        System.out.println("enter left data "+data);
//        root = createTree();
//
//        System.out.println("enter the right data "+data);
//        root.right =createTree();
//        return root;
//    }
//    int maximum(Node root)
//    {
//        if(root==null)
//        {
//            return Integer.MIN_VALUE;
//        }
//        int leftMax = maximum(root.left);
//        int rightmax = maximum(root.right);
//
//        return Math.max(root.data ,Math.max(leftMax,rightmax));
//    }
//
//    void printcurrentlevel(Node root,int level)
//    {
//        if(root==null)
//        {
//            return;
//        }
//        if(level==1)
//        {
//            System.out.println(root.data+" ");
//        }
//        else if(level>1)
//        {
//            printcurrentlevel(root.left,level-1);
//            printcurrentlevel(root.left,level-1);
//        }
//    }
//
//      public static void main(String[] args) {
//
//         Tree_ = new Tree_();
//        Node root = createTree();
//          System.out.println("enter level");
//          int level = sc.nextInt();
//          System.out.println("node at level "+level);
//          tree.printcurrentlevel(root,level);
//          int result = tree.maximum(root);
//          System.out.println("maximum in the tree "+result);
//      }
//}


//_________________________________________________________***********************************************************

//print all the element of a tree at all level

//
//import java.util.*;
//
//class Node{
//
//    Node left ,right;
//    int data;
//
//    public Node(int data)
//    {
//        this.data =data;
//    }
//}
//
// public class Tree_ {
//    static Scanner sc = new Scanner(System.in);
//
//    static Node createTree()
//    {
//        Node root =null;
//        System.out.println("enter data");
//        int data = sc.nextInt();
//
//        if(data==-1)
//        {
//            return null;
//        }
//        root = new Node(data);
//        System.out.println("enter the left data "+data);
//        root.left = createTree();
//
//        System.out.println("enter the right data "+data);
//        root.right = createTree();
//        return root;
//    }
//    void printAllevels(Node root)
//    {
//        int height = getHeight(root);
//        for(int i=0; i<=height; i++)
//        {
//            System.out.println("node at level "+i+" ");
//            printcurrentlevel(root,i);
//            System.out.println();
//        }
//    }
//    int getHeight(Node root)
//    {
//        if(root==null)
//        {
//            return 0;
//        }
//        else
//        {
//            int leftHeight = getHeight(root.left);
//            int rightHeight = getHeight(root.left);
//            return Math.max(leftHeight,rightHeight)+1;
//        }
//    }
//    void printcurrentlevel(Node root ,int level)
//    {
//        if(root==null)
//        {
//            return;
//        }
//        if(level==1)
//        {
//            System.out.println(root.data+" ");
//        } else if (level>1)
//        {
//            printcurrentlevel(root.left ,level-1);
//            printcurrentlevel(root.right,level-1);
//        }
//    }
//
//     public static void main(String[] args) {
//
//        Tree_ tree= new Tree_();
//        Node root = createTree();
//        tree.printAllevels(root);
//     }
//}


// number system :
//  decimal and binary system
// converting binary to decimal
//import java.util.*;
// public class Tree_ {
//     public static void main(String[] args) {
//
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the value");
//         int num =sc.nextInt();
//         int ans =0;
//         int p =1;
//         while(num>0)
//         {
//             int digit= num%10;
//             ans =ans+(digit*p);
//             num=num/10;
//             p*=2;
//
//         }
//         System.out.println(ans);
//     }
//}


// decimal to conversion
// import java.util.*;
// public class Tree_ {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the value");
//         int num = sc.nextInt();
//         int ans=0;
//         int p=1;
//         while(num>0)
//         {
//             int rem =num%2;
//             ans+=(rem*p);
//             p*=10;
//             num=num/2;
//         }
//         System.out.println(ans);
//     }
//
//     }