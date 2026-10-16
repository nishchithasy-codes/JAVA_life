import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
//import java.util.*;
public class linkedList {
    public static void main(String[] args){
        //List or collection->interface

        
        //ArrayList -> concrete class
        LinkedList<Integer> arr1 = new LinkedList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        System.out.println(arr1);
        arr1.add(40);
        System.out.println(arr1);

        arr1.remove(3);
        System.out.println(arr1);

        LinkedList<Integer> arr2 = new LinkedList<>();
        arr2.add(101);
        arr2.add(102);
        System.out.println(arr2);

        arr1.addAll(arr2);//Adding arr2 elements to the arr list
        System.out.println(",,,"+arr1);
        //arr2.addAll(arr);
        //System.out.println(arr2);

        arr1.removeAll(arr2);
        System.out.println(arr1);

        System.out.println("Size of list1: "+arr1.size());
        System.out.println("Printing list2: "+arr2);
        arr2.clear();//After clearing the arr2
        System.out.println("list2 size = "+arr2.size());

        System.out.println("Printing List1: "+arr1);
        //I want to traverse arr using iterarator
        Iterator<Integer> iterator = arr1.iterator();
        while (iterator.hasNext()) {//hasNext will say next element is present or not
            System.out.println("Element: "+ iterator.next());
        }

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        list3.get(0);//Ramdomly access elements from the list
        System.out.println("Fetching element by using get method: "+ list3.get(0));

        System.out.println("Before set method: "+list3);
        list3.set(0,100);
        System.out.println("After set method: "+list3);

        //toArray  ->converting to array type
        System.out.println("COnverting list into array:");
        Object[] arr = list3.toArray();
        for(Object obj:arr){        //Like foreach loop
            System.out.println(obj);
        }
        //contains() method
        System.out.println("Checking whether this(100) element is present or not: "+list3.contains(100));
        LinkedList<Integer> list = new LinkedList<>();
        list.add(30);
        list.add(40);
        list.add(12);
        list.add(6);
        System.out.println("Printing entire list: "+list);

        //sort an arrayList
        Collections.sort(list); //for collection there is npo sort method, for collections only the sort methos is there
        System.out.println("After sorting the list elements are: "+list);
       
       //.clone means creating a new list by copying from another list
       LinkedList<Integer> newList = (LinkedList<Integer>)list.clone();
       System.out.println("Printing entire new list by cloning: "+newList);

       ArrayList<Integer> marks = new ArrayList<>();
       marks.ensureCapacity(100);//Specifies the total elements the ArrayList can contain

       System.out.println("Checking whether this new list is empty or not: "+newList.isEmpty());

       System.out.println("Printing the original list: "+list);
       System.out.println("The element 40 is at the index: "+newList.indexOf(40));
        //List<Integer> list = new ArrayList<>();
        //Collection<Integer> collection = new ArrayList<>();
    }
}