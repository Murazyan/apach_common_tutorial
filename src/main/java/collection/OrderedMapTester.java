package collection;

import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.map.LinkedMap;

import java.util.List;

public class OrderedMapTester {
   public static void main(String[] args) {
      OrderedMap<String, String> map = new LinkedMap<String, String>();
      map.put("One", "1");
      map.put("Two", "2");
      map.put("Three", "3");
      List<String> strings = ((LinkedMap<String, String>) map).asList();
      int one = ((LinkedMap<String, String>) map).indexOf("One");
      System.out.println(one);
      System.out.println(strings);

      System.out.println(map.firstKey());
      System.out.println(map.nextKey("One"));
      System.out.println(map.nextKey("Two"));  
   }
}