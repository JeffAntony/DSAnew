

import java.util.*;
//import java.util.Entry;
//public class Map_{
//    public static void main(String args[]){
//
//        LinkedHashMap hm=new LinkedHashMap();
//
//        hm.put(100,"Amit");
//        hm.put(101,"Vijay");
//        hm.put(102,"Rahul");
//
//        for(Map.Entry m:hm.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//    }
//}
//// changing value of a key from the hashmap;
// changing the value of KEY IN THE hashmap
//removing a pair from hashmap
// checking if a key in the hashmap
// adding a new entry only if the new key does not exist
// get all keys in the hashmap
// getting values in the hashmap



// problem related to frequency

// public class Map_ {
//     public static void main(String[] args) {
//
//         int a[]={7,10,1,4,2,5,1,4,4,6,4,4,4,3,7,8};
//         Map <Integer ,Integer> hs =new HashMap<>();
//
//         for(int el: a)
//         {
//             if(!hs.containsKey(el))
//             {
//                 hs.put(el,1);
//             }
//             else {
//                 hs.put(el,hs.get(el) +1);
//             }
//         }
//         System.out.println(hs.entrySet());
//     }
//}

//

//public  class Map_ {
//    public static void main(String[] args)
//    {
//        int a[]={1,4,2,5,1,4,4,6,4,4,4,};
//         Map <Integer ,Integer> hs =new HashMap<>();
//
//         for(int el: a)
//         {
//             if(!hs.containsKey(el))
//             {
//                 hs.put(el,1);
//             }
//             else {
//                 hs.put(el,hs.get(el) +1);
//             }
//         }
//         System.out.println(hs.entrySet());
//
//         int maxFre =0;
//         int anskey = -1;
//
//         for(var e : hs.entrySet())
//         {
//             maxFre= e.getKey();
//             anskey= e.getKey();
//         }
//        System.out.printf("%d has a max frequency ",anskey);
//    }
//}


import java.util.*;
//public class Map_ {
//    public static void main(String args[]) {
//        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
//        map.put(21,"regex");
//        map.put(45,"hello");
//        map.put(67,"hiii");
//        map.put(23,"hello");
////        getting value of a key from the hashmap
////        System.out.println(map.get(21));
//        map.remove(21);
////        System.out.println(map.entrySet());
//
//        if(map.containsKey(41))
//        {
//            System.out.println(map.entrySet());
//        }
//        if(!map.containsKey(25))
//        {
//            map.put(28,"bye");
//        }
//        System.out.println(map.entrySet());
//
//        for(Map.Entry k: map.entrySet())
//        {
//            System.out.println(k.getKey());
//            System.out.println(k.getValue());
//        }
//        String a="abcd";
//        String b="bcad";
//        char c[]=a.toCharArray();
//        char d[]=b.toCharArray();
//
//           Arrays.sort(d);
//
//        for(int i=0; i<a.length(); i++)
//        {
//           if(c[i]==d[i])
//           {
//               System.out.println("its an anagram string");
//           }
//           else
//           {
//               System.out.println("not an anagram string");
//           }
//        }
//    }
//}