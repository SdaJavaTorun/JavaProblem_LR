package com.company;

import java.util.*;

public class ArrayExec {

    public static <T> T last(List<T> elements) {
        int numberOfElements = elements.size();

        return elements.get(numberOfElements - 1);

    }

    public static <T> T last(LinkedList<T> elements) {
        return elements.getLast();
    }


//public static <T>LinkedList<T> linkedList(T... elements){


    public static <T> long length(List<T> list) {

        return list.stream().count();


    }

    public static <T> List<T> reverse(List<T> list) {

        Collections.reverse(list);

        return list;
    }


    public static <T> boolean isPalindrome(List<T> list) {
       List<T> copyList = new ArrayList<T>(list);
        Collections.reverse(list);
        boolean flag = false;
        if (copyList.equals(list)) {
            flag = true;
        }
        return flag;
    }

    public static <T> TreeSet<T> compress(List<T> list){

        TreeSet<T> compressedList = new TreeSet<>();
        compressedList.addAll(list);
        return compressedList;

    }
 /*
  //wypełniam drzewo numerami sekcji
//                    TreeSet section = new TreeSet();
                    TreeSet<Integer> section = new TreeSet<>();

                    for (Worker w : workerList) {
                        section.add(w.getSection());
                    }

                    System.out.println(section);
                    System.out.println("W firmie mamy: " + section.size() + " działy.");


  List<Customer> listCustomer = new ArrayList<Customer>();
for (Customer customer: tmpListCustomer)
    {
        if (!listCustomer.contains(customer))
        {
            listCustomer.add(customer);
        }
    }

*/
}
