package collection;

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

        import org.apache.commons.collections4.CollectionUtils;
        import org.apache.commons.collections4.Predicate;

public class CollectionUtilsTester3 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<Integer>();
        integerList.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        System.out.println("Original List: " + integerList);
        CollectionUtils.filter(integerList, CollectionUtilsTester3::evaluate);

        System.out.println("Filtered List (Even numbers): " + integerList);
    }

    private static boolean evaluate(Integer input) {
        if (input.intValue() % 2 == 0) {
            return true;
        }
        return false;
    }
}

