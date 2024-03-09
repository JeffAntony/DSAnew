//
//// Bubble- sort Algorithms
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        int a[] ={ 4,2,1,6,4,7};
//                int n=a.length;
//        for(int i=0; i<n; i++)
//        {
//            for (int j = 0; j < n - i-1; j++)
//            {
//                if (a[j] > a[j + 1])
//                {
//                    int t = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = t;
//                }
//            }
//        }
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]+" ");
//        }
//    }
//
//    }
//

//// selection-sort ALgorithm
//
//
//public class Main {
//
//    static void f(int a[]) {
//        int n = a.length;
//        for (int i = 0; i < n - 1; i++) {
//            int m = i;
//            for (int j = i + 1; j < n; j++) {
//                if (a[j] < a[m]) {
//                    m = j;
//                }
//            }
//            int t = a[i];
//            a[i] = a[m];
//            a[m] = t;
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        int a[] = {7, 4, 3, 2, 1};
//        f(a);
//        for(int j=0; j<a.length; j++)
//        {
//            System.out.println(a[j]+" ");
//        }
//
//    }
//}
//
//
//// Insertion-sort Algorithm
//
////public class Main {
////
////    static void f(int a[]) {
////        int n = a.length;
////        for (int i = 0; i < n ; i++) {
////            int m = i;
////            while ( m>0&& a[m]<a[m-1])
////            {
////
////                int t=a[m];
////                a[m]=a[m-1];
////                a[m-1]=t;
////                m--;
////            }
////
////        }
////    }
////
////
////    public static void main(String[] args) {
////
////        int a[] = {7, 4, 3, 2, 1};
////        f(a);
////        for(int j=0; j<a.length; j++)
////        {
////            System.out.println(a[j]+" ");
////        }
////
////    }
////}
//
//
//
//
//// swaping through two pointer variable
//
//public class Main {
//
//  static void f(int a[])
//{
//    for(int i=0; i<a.length; i++)
//    {
//        System.out.println(a[i]+" ");
//    }
//    System.out.println();
//}
//
//    //
//    static void swap(int a[],int i,int j)
//    {
//        int temp=a[i];
//        a[i]=a[j];
//        a[j]=temp;
//
//    }
//
//    static void sorted(int a[])
//    {
//        int l=0;
//        int r=a.length-1;
//        while(l<r)
//        {
//            if(a[l]>a[r])
//            {
//                swap( a,l,r);
//
//            }
//            l++;
//            r--;
//        }
//    }
////
//
//    public static void main(String[] args)
//    {
//        int a[]={0,10,4,0,7,0};
//        int b[]= new int[a.length];
//        sorted(a);
//        f(a);
//
//
//
//
//    }
//
//}
//
//

//public class Main {
//
//    static void f(int a[]) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + " ");
//        }
//        System.out.println();
//    }
//
//    static void swap(int a[], int i, int j) {
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }
//
//    static void sorted(int a[]) {
//        int l = 0;
//        int r = a.length - 1;
//        while (l < r) {
//            if (a[l] > a[r]) {
//                swap(a, l, r);
//            }
//            l++;
//            r--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int a[] = {0, 7,4,0,8};
//        sorted(a);
//        f(a);
//    }
//}

//public class Main {
//    public static void f (int a[])
//    {
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]+" ");
//       }
//        System.out.println();
//    }
//    static void merge(int arr[] ,int l ,int mid ,int r)
//    {
//        int n1= mid-l+1;
//        int n2= r-mid;
//        int []left= new int [n1];
//        int []right= new int [n2];
//        int i,j,k;
//        for( i=0; i<n1; i++)
//        {
//            left[i] =arr[1+l];
//        }
//        for(j=0; j<n2; j++)
//        {
//            right[j]=arr[mid+1+j];
//        }
//        i=0;
//        j=0;
//        k=l;
//
//        while(i<n1 && j<n2)
//        {
//            if(left[i]<right[j])
//            {
//                arr[k++]=left[i++];
//            }
//            else
//            {
//                arr[k++]=right[j++];
//            }
//        }
//        while(i<n1)
//        {
//            arr[k++]=left[i++];
//        }
//        while(j<n2)
//        {
//            arr[k++]= right[j++];
//        }
//    }
//    static void mergeSort(int arr[] ,int l ,int r)
//    {
//        if(l>=r)
//            return;
//        int mid= (l+r)/2;
//        mergeSort(arr,mid+1 ,r);
//        merge(arr,l,mid,r);
//    }
//
//    public static void main(String[] args) {
//        int a[]= {4,2,3,5,2};
//        int n=a.length;
//        f(a);
//        mergeSort(a,0,n-1);
//        f(a);
//    }
//}
//

// Quick Sort

//public class Main {
//    public static void d(int a[]) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
//
//    static void swap(int a[], int x, int y) {
//        int t = a[x];
//        a[x] = a[y];
//        a[y] = t;
//    }
//
//    static int partition(int arr[], int st, int end) {
//        int pivot = arr[st];
//        int cnt = 0;
//        for (int i = st; i <= end; i++) {
//            if (arr[i] < pivot) {
//                cnt++;
//            }
//        }
//
//        int pivotidx = st + cnt;
//        swap(arr, st, pivotidx);
//        int i = st, j = end;
//
//        while (i < pivotidx && j > pivotidx) {
//            while (arr[i] <= pivot)
//                i++;
//            while (arr[j] > pivot)
//                j--;
//
//            if (i < j) {
//                swap(arr, i, j);
//            }
//        }
//        return pivotidx;
//    }
//
//    static void quicksort(int arr[], int st, int end) {
//        if (st >= end) {
//            return;
//        }
//
//        int pi = partition(arr, st, end);
//        quicksort(arr, st, pi - 1);
//        quicksort(arr, pi + 1, end);
//    }
//
//    public static void main(String[] args) {
//        int a[] = {6, 3, 1, 5, 4};
//        System.out.println("Original array:");
//        d(a);
//        quicksort(a, 0, a.length - 1);
//        System.out.println("Sorted array:");
//        d(a);
//    }
//}

// counting sort algorithm
//public class Main {
//
//        public static void d(int a[]) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " "); // Use print instead of println
//        }
//        System.out.println(); // Add a newline character after printing the array
//    }
//
//    public static int f(int arr[]) { // Change void to int for the return type
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    public static void b(int arr[]) {
//        int max = f(arr);
//        int[] count = new int[max + 1]; // Fix the array initialization
//        for (int i = 0; i < arr.length; i++) {
//            count[arr[i]]++; // Change arr(i) to arr[i]
//        }
//        int k = 0;
//        for (int i = 0; i < count.length; i++) {
//            for (int j = 0; j < count[i]; j++) {
//                arr[k++] = i;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int a[] = {1, 4, 5, 2, 2, 5};
//        b(a);
//        d(a);
//    }
//}

//radix algorithms

//public class Main{
//    public static void display(int a[])
//    {
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]+" ");
//        }
//        System.out.println();
//}
//
//static int findmax(int arr)
//{
//    int max= Integer.MIN_VALUE;
//    for(int i=0; i<arr.length; i++)
//    {
//        if(arr[i]>max)
//        {
//            max=arr[i];
//        }
//    }
//    return max;
//}
//
//public static void countsort(int arr[] ,int place)
//{
//    int n=arr.length;
//    int output [] = new int[n];
//    int max=findmax(arr);
//    int count[] = new int [10];
//
//    for(int i=0; i<arr.length; i++)
//    {
//        count[arr[i]/place%10]++;
//    }
//
//    for(int i=0; i<count.length; i++)
//    {
//        count[i]+=count[i-1];
//    }
////    for indexing
//    for(int i=n-1; i>=0; i--)
//    {
//        int indx= count[[arr[i]/place %10]-1;
//        output[idx]=arr[i];
//        count[arr[i]/place%10]--;
//    }
//    for(int i=0; i<n; i++)
//    {
//        arr[i]=output[i];
//    }
//
//}
//
//    public static void radixsort(int arr[])
//    {
//        int max=findmax(arr);
//        for(int place=1; max/place>0; place*=10)
//        {
//            countsort(arr,place);
//        }
//    }
//
//
//
//    public static void main(String[] args)
//    {
//        int arr[]= {43,453,626,894,0,3};
//        radixsort(arr);
//        display(arr);
//    }
//}

import java.util.*;
// public class Main {
//     public static void main(String[] args)
//     {
//                HashMap m = new HashMap();
//         m.put("H" ,12);
//         m.put("k",11);
//         m.put("l",10);
//         m.put("n",9);
////         System.out.println(m);
//         Set s =m.keySet();
//         Collection c = m.values();
////         System.out.println(c);
//         Set s1= m.entrySet();
//         System.out.println(s1);
//
//         Iterator<Integer> itr = m.values().iterator();
//         while(itr.hasNext())
//         {
//             System.out.println(itr.next());
//
//         }

//         int arr[] ={5,10,20,15};
//         int m=0;
//         for(int i=0; i<arr.length; i++)
//         {
//             if(arr[i]>m)
//             {
//                 m=arr[i];
//             }
//         }
//         System.out.println("peakest element is "+m);
//
//
//     }
//}

public class Main {

    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void sorted(int a[]) {
        int l = 0;
        int r = a.length - 1;
        while (l < r)
                                                                                                                                             {
            if  (a[l] > a[r])
            {
                swap(a, l, r);
            }
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int a[] = {4, 0, 1, 2, 0};
        sorted(a);
        printArray(a);
    }
}
