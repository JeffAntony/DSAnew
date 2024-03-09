

//(1)

//import java.util.*;
//public class B5 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b[]= new int[a];
//        int k=3;
//
//        for(int i=0; i<a; i++)
//        {
//            b[i]= sc.nextInt();
//        }
//
//        for(int j=0; j<k; j++)
//        {
//             int last=b[b.length-1];
//
//            for(int d=b.length-1; d>0; d--)
//            {
//                b[d]=b[d-1];
//
//            }
//
//            b[0]=last;
//
//        }
//        for(int v=0; v<b.length; v++)
//        {
//            System.out.println(b[v]);
//        }
//    }
//}



//(2)

//import java.util.*;
//public class B5 {
//
//    public int [] productExceptSelf(int[] nums)
//    {
//        int n=nums.length;
//        int [] result=new int[n];
//        int leftProduct=1;
//        for(int i=0; i<n; i++)
//        {
//            result[i]=leftProduct;
//            leftProduct*=nums[i];
//        }
//        int rightproduct=1;
//        for(int j=0; j>=0; j--)
//        {
//            result[j]=rightproduct;
//            rightproduct*=nums[j];
//        }
//        return result;
//    }
//
//
//    public static void main(String[] args)
//    {
//
//        B5 solution= new B5();
//        int [] nums={1,2,3,4};
//        int []result=solution.productExceptSelf(nums);
//        System.out.println(Arrays.toString(result));
//    }
//
//}

//(3)
//public class B5 {
//    public static void main(String[] args) {
//
//        int a[]={1,2,3,1};
//        int r=1;
//        int sum=0;

//        for(int i=0; i<a.length-1; i++)
//        {
//             if(a[i]>a[i+1])
//             {
//                 sum=a[i];
//                  r=i;
//             }
//
//        }
//        System.out.println(sum);
//        System.out.println(r);


//    }
//}

//(4)
//
//import java.util.*;
//public class B5 {
//    public static void main(String[] args) {

//      Scanner sc = new Scanner(System.in);
//      int row= sc.nextInt();
//      int col=sc.nextInt();
//      int a[][]=new int[row][col]; n

//      int a[][]={{95,92,95},
//                {92,90,92},
//                {90,92,90}};
//      int y=0;
//      int r=0;
//       float f=0;
//      int max=0;
//      int index=0;
//      int i=0;
//      int j=0;
//
//      for( i=0; i<3; i++)
//      {
//          float sum=0;
//          for( j=0; j<3; j++)
//          {
//
//              {
//                  sum+=a[i][j];
//
//              }
//
//          }
//          sum=sum/3;
//          if(sum>f)
//          {
//              f=sum;
//              index=j+1;
//
//
//          }
//
//      }
//   System.out.println(index);
//
//    }
//}

//(5)

//import java.util.*;
//public class B5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Number of interior walls");
//        int a = sc.nextInt();
//        System.out.println("Number of exterior walls ");
//        int b = sc.nextInt();
//
//        float a1[] = new float[a];
//        float b1[] = new float[b];
//        float total=0;
//        System.out.println("enter the interior wall surface area");
//        for(int i=0; i<a1.length; i++)
//        {
//            a1[i]= sc.nextFloat();
//        }
//        System.out.println("enter the exterior wall surface area");
//        for(int j=0; j<b1.length; j++)
//        {
//            b1[j]= sc.nextFloat();
//        }
//
//        for(int i=0; i<a1.length; i++)
//        {
//            total+=a1[i]*18;
//        }
//        for(int j=0; j<b1.length; j++)
//        {
//            total+=b1[j]*12;
//        }
//        System.out.println(total);
//    }
//}

//(6)
//public class B5 {
//    public static void main(String[] args) {
//        int [][] arr= {{1,1,1},
//                       {2,2,2},
//                       {3,3,3}};
//        int [][] arr1=  {{1,1,1},
//                         {2,2,2},
//                         {3,3,3}};
//        int f=0;
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j=0; j<arr.length; j++)
//            {
//                if(arr[i][j]!=arr1[i][j])
//                {
//                    f=1;
//                    System.out.print("not identical");
//                    break;
//
//                }
//            }
//        }
//        if(f==0) {
//            System.out.print("identical");
//        }
//
//
//    }
//}



//(7)
// public class B5 {
//public static void main(String[] args) {
//        int [][] arr= {{1,2,3,4,5},
//                   {16,17,18,19,6},
//                    {15,24,25,20,7},
//                    {14,23,22,21,8},
//                     {13,12,11,10,9}};
//        int n=arr.length*arr.length;
//        int c=0;
//        int r=0;
//        int maxc=arr.length-1;
//        int maxr=arr.length-1;
//        while(n!=0) {
//        for(int i=c; i<=maxc; i++)
//        {
//        System.out.print(arr[r][i]+" ");
//        n--;
//        }
//
//        for(int i=r+1; i<=maxr; i++)
//        {
//        System.out.print(arr[i][maxc]+" ");
//        n--;
//        }
//        for(int i=maxc-1; i>=c; i--)
//        {
//        System.out.print(arr[maxr][i]+" ");
//        n--;
//        }
//        for(int i=maxr-1; i>r; i--)
//        {
//        System.out.print(arr[i][c]+" ");
//        n--;
//        }
//        c++;
//        r++;
//        maxr--;
//        maxc--;
//        }
//
//        }
//        }

//(8)
//
// public class B5 {
//
//    public static void main(String[] args) {
//        int [][] arr= {{1,2,3},{4, 0, 6},{7, 8, 9}};
//        int r=0;
//        int c=0;
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j=0; j<arr[i].length; j++)
//            {
//                if(arr[i][j]==0)
//                {
//                    r=i;
//                    c=j;
//                    break;
//                }
//            }
//          }
//        int k=0;
//        while(k!=arr.length)
//        {
//            arr[r][k]=0;
//            arr[k][c]=0;
//            k++;
//        }
//
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j=0; j<arr[i].length; j++)
//            {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//
//
//    }
//}




        // for(int i=m; i<=n; i++)
        // {
        //     if(i%4==0)
        //     {
        //         c+=i;
        //     }
        //     if(i%4!=0)
        //     {
        //         d+=i;
        //     }
        // }
        // System.out.println(d-c);
//
//    }
//}