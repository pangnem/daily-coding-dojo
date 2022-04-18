import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> collect = Stream.of(nums1, nums2)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        if (collect.size() % 2 == 0) {
            int idx1 = collect.get(collect.size() / 2 - 1);
            int idx2 = collect.get(collect.size() / 2);
            return (double) (idx1 + idx2) / 2;
        }

        return collect.get(collect.size() / 2);
    }
}
