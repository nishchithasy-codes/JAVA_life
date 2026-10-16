import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {

        // Set<Integer> set1 = new HashSet<>();
        // Set<Integer> set2 = new HashSet<>();
        // set1.add(1);
        // set1.add(2);
        // set1.add(3);
        // set1.add(4);

        // set2.add(3);
        // set2.add(4);
        // set2.add(5);
        // set2.add(6);

        // System.out.println("Set1: "+set1);
        // System.out.println("Set2: "+set2);
        // set1.retainAll(set2);
        // System.out.println("Intersection of set1 with set2 Set1: "+set1);
        // System.out.println(set1.containsAll(set2));
        // System.out.println("BECAUSE: set1= "+set1+"and set2= "+set2);
        // System.out.println(set2.containsAll(set1));




        // Set<Integer> st = new HashSet<>();
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(20);
        // st.add(20);
        // st.add(30);
        // st.add(40);
        // st.add(20);
        // System.out.println("HASH SET(arndom of order elements): "+st);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(4);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(1);
        set1.add(3);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        set1.add(10);
        System.out.println("In linkedHashSet the order is preserved and no duplicat elements:"+set1);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(4);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(1);
        set3.add(3);
        set3.add(3);
        set3.add(4);
        set3.add(100);
        System.out.println("In tree set elements are in sorted order and also no duplicates: "+set3);



        //UNION METHODS
        set3.addAll(set1);
        System.out.println("Set1: "+set1);
        System.out.println("Set3: "+set3);
        System.out.println("Union of set1 and set3: "+set3);

        set1.retainAll(set3);
        System.out.println("retaining set3 to set1(keeps only the elements between these two): "+set1);


        set3.removeAll(set1);
        System.out.println("After removing set1 elements in set3: "+set3);

        System.out.println("Set1: "+set1);
        System.out.println("Set3: "+set3);
        System.out.println("contains all of set3 in set1: "+set1.containsAll(set3));

        Set<Integer> set4 = (Set<Integer>) ((LinkedHashSet<Integer>) set1).clone();
        System.out.println("Creating a copy of hashSet(now set4 is): "+set4);
        System.out.println("Set1: "+set1);
        System.out.println("Size of set1: "+set1.size());
        set4.clear();
        System.out.println("Clearing set4: "+set4);
        System.out.println("Size of set4: "+set4.size());



        //This is a custom type of data in set chapter
        HashSet<studentHashSet> set = new HashSet<>();
        studentHashSet s1 = new studentHashSet(1, "vamshi");
        studentHashSet s2 = new studentHashSet(1, "vamshi");
        studentHashSet s3 = new studentHashSet(1, "vamshi");
        //studentHashSet s2 = new studentHashSet(2, "Raksha");
        //studentHashSet s3 = new studentHashSet(3, "Akshay");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

    }
}
