package collection;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;
public class CollectionUtilsTester1 {

    public static void main(String[] args) {
        List<String> sortedList1 = Arrays.asList("A","C","E");
        List<String> sortedList2 = Arrays.asList("B","D","F");

        List<String> mergedList = CollectionUtils.collate(sortedList1, sortedList2); //վերադարձնում է սորտավորված լիստ, որը պարունակում է նշվաժ սորտավորված լիստերը
        System.out.println(mergedList);
    }
}
