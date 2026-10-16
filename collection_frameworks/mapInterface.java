import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class mapInterface {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap();
        Map<String, String> mappLink = new LinkedHashMap<>();
        Map<String, String> mappTree = new TreeMap<>();
        
        
        
        //insertion methods
        mapping.put("in","India3");
        mapping.put("en","england");
        mapping.put("us","united states");
        mapping.put("in","india2");
        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br","brazil");
        System.out.println("Table map, before putting all mapping elements: "+table);
        table.putAll(mapping);
        System.out.println("Aafter putting the mapping map elements to table map: "+table);

        //DELETION mathod
        table.remove("in");
        System.out.println("Removing england:"+table);

        table.putIfAbsent("in","India3");
        System.out.println(table);  //India3 is present, so don't add, if not then onlt it will add that specified element

        System.out.println("Getting br: "+table.get("br"));
        System.out.println("Get USA, if not print none: "+table.getOrDefault("USA","None"));



        System.out.println("Is table has 'in' key: "+table.containsKey("in"));

        System.out.println("Is table has value of 'united states': "+table.containsValue("united states"));


        System.out.println("table: "+table);
        table.replace("in","indonesia");
        System.out.println("replacing 'in' with indonesia: "+table);



        Set<String> keySet= table.keySet();
        System.out.println("Printing only keys using keySet: "+keySet);

        Collection<String> valueSet = table.values();
        System.out.println("Printing only table values: "+valueSet);



        //get all the entries from map
        Set<Map.Entry<String,String>> entrySet = table.entrySet();
        System.out.println("Printing entries: "+entrySet);


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"Two");
        map.put(3,"Three");

        System.out.println("Iterating map: ");
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key: "+ entry.getKey()+", value: "+entry.getValue());
        }








        // System.out.println("Size of table: "+table.size());
        // table.clear();
        // System.out.println("After clearing size of table= "+table.size());






    }
}
