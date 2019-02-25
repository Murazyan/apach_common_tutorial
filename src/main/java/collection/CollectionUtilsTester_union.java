package collection;

import java.util.Arrays;
        import java.util.List;

        import org.apache.commons.collections4.CollectionUtils;

public class CollectionUtilsTester_union {
    public static void main(String[] args) {
        //checking inclusion
        List<String> list1 = Arrays.asList("A","A","A","C","B","B");
        List<String> list2 = Arrays.asList("A","A","B","B");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Union of List 1 and List 2: "
                + CollectionUtils.union(list1, list2));
    }
}