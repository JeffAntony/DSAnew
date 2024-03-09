//
//
//
// import java.util.*;
//public class Map1 {
//    public static void main(String[] args)
//    {
//        HashMap a = new HashMap();
//        a.put(1,"a");
//        a.put(2,"b");
//        a.put(3,"c");
//        a.put(4,"d");
//
//        for(HashMap.Entry k : a.entrySet())
//        {
//            System.out.println(k.getKey());
//        }
//    }
//}


//public class Map1 {
//
//    static void mergesort(int a[],int l,int m,int k)
//    {
//        int n1=m-l+1;
//        int n2=k-m;
//        int a1[]= new int[n1];
//        int a2[] = new int[n2];
//
//        for (int i = 0; i < n1; i++)
//        {
//            a1[i] = a[l + i];
//        }
//        for (int j = 0; j < n2; j++)
//        {
//            a2[j] = a[m + 1 + j];
//        }
//        int i=0,j=0;
//        int k1=l;
//        while(i<n1&&j<n2)
//        {
//            if(a1[i]<=a2[j])
//            {
//                a[k1]=a1[i];
//                i++;
//            }
//            else
//            {
//                a[k1]=a2[j];
//                j++;
//            }
//            k1++;
//        }
//        while(i<n1)
//        {
//            a[k1]=a1[i];
//            i++;
//            k1++;
//        }
//        while(j<n2)
//        {
//            a[k1]=a2[j];
//            j++;
//            k1++;
//        }
//
//
//    }
//    static void print(int a[])
//    {
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]+" ");
//        }
//    }
//
//    static void sort(int a[],int l,int k) {
//
//        if (l < k)
//        {
//            int m = (k+l) / 2;
//
//        sort(a, l, m);
//        sort(a, m + 1, k);
//        mergesort(a, l, m, k);
//    }
//    }
//    public static void main(String[] args) {
//        int a[]={3,5,2,7,1};
//        int c=a.length-1;
//        sort(a,0,c);
//        print(a);
//    }
//}

//class QuickSort
//{
//    /* This function takes last element as pivot,
//       places the pivot element at its correct
//       position in sorted array, and places all
//       smaller (smaller than pivot) to left of
//       pivot and all greater elements to right
//       of pivot */
//    int partition(int arr[], int low, int high)
//    {
//        int pivot = arr[high];
//        int i = (low-1); // index of smaller element
//        for (int j=low; j<high; j++)
//        {
//            // If current element is smaller than or
//            // equal to pivot
//            if (arr[j] <= pivot)
//            {
//                i++;
//
//                // swap arr[i] and arr[j]
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        // swap arr[i+1] and arr[high] (or pivot)
//        int temp = arr[i+1];
//        arr[i+1] = arr[high];
//        arr[high] = temp;
//
//        return i+1;
//    }
//
//
//    /* The main function that implements QuickSort()
//      arr[] --> Array to be sorted,
//      low  --> Starting index,
//      high  --> Ending index */
//    void sort(int arr[], int low, int high)
//    {
//        if (low < high)
//        {
//            /* pi is partitioning index, arr[pi] is
//              now at right place */
//            int pi = partition(arr, low, high);
//
//            // Recursively sort elements before
//            // partition and after partition
//            sort(arr, low, pi-1);
//            sort(arr, pi+1, high);
//        }
//    }
//
//    /* A utility function to print array of size n */
//    static void printArray(int arr[])
//    {
//        int n = arr.length;
//        for (int i=0; i<n; ++i)
//            System.out.print(arr[i]+" ");
//        System.out.println();
//    }
//
//    // Driver program
//    public static void main(String args[])
//    {
//        int arr[] = {10, 7, 8, 9, 1, 5};
//        int n = arr.length;
//
//        QuickSort ob = new QuickSort();
//        ob.sort(arr, 0, n-1);
//
//        System.out.println("sorted array");
//        printArray(arr);
//    }
//}

//public class Map1{
//
//    static int par(int a[],int low,int high)
//    {
//        int pi=a[high];
//        int i=(low-1);
//
//        for(int j=low; j<high; j++)
//        {
//            if(a[j]<pi)
//            {
//                i++;
//                int temp= a[i];
//                 a[i]=a[j];
//                 a[j]=temp;
//
//            }
//        }
//        int temp =a[i+1];
//        a[i+1]=a[high];
//        a[high]=temp;
//
//        return i+1;
//
//    }
//    static void sort(int a[],int low,int high)
//    {
//        if(low<high)
//        {
//            int pi=par(a, low, high);
//
//            sort(a,low,pi-1);
//            sort(a,pi+1,high);
//
//        }
//
//    }
//    static  void print(int a[])
//    {
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//
//        int a[]={6,7,34,2,1};
//        sort(a,0,a.length-1);
//        print(a);
//    }
//}


