package com.clob.org;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Client {

    public void getClass1(){
        System.out.println(getClass());
    }
    public static void main(String[] args) {
        
        Integer value[] = {12, 122, 12, 13, 14, 23, 14};
        List<Integer> list = Arrays.asList(value);
        List<Integer> list1 = Arrays.asList(value);
       for(int number : list){
           if(number == 12){
               list1.remove(number);
           }
       }
        System.out.println(list1);
//        Client client = new Client();
//        client.getClass1();
//        System.out.println(client.getClass());
////        List<String> arrlist = new ArrayList<String>();
////        arrlist.add("bob");
////        arrlist.add("pat");
////        arrlist.add("tan");
////        arrlist.add("bob");
////        arrlist.add("mat");
////        arrlist.add("cat");
////        arrlist.add("dog");
////        arrlist.add("cat");
////
////       
////        List<String> newList = new ArrayList<String>();
////
////        for ( String listValues : arrlist ) {
////                if(arrlist.contains(listValues)){
////                }
////                newList.add(listValues);
////                arrlist.remove(listValues);
////                System.out.println(listValues);
////            }
////        }
//    
//        Set<String> testSet = new HashSet<String>();
//        boolean first = testSet.add("hello");
//        System.out.println(first);             // Prints "true"
//        boolean second = testSet.add("hello");
//        System.out.println(second);            // Prints "false"
    }
}
