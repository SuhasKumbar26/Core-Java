package IntermediateFunctions;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctArrayElements {
    public static void main(String[] args) {
        List<Integer> numArray = List.of(12,34,1,2,12,45,54,12,23,34,12);

        List<Integer> distinctElements = numArray.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numArray);
        System.out.println(distinctElements);
    }
}
