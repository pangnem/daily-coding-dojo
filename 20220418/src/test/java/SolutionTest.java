import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        this.solution = new Solution();
    }

    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};

        double actual = solution.findMedianSortedArrays(nums1, nums2);

        assertThat(actual).isEqualTo(2.00000);
    }

    @Test
    void findMedianSortedArrays2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        double actual = solution.findMedianSortedArrays(nums1, nums2);

        assertThat(actual).isEqualTo(2.50000);
    }

    @Test
    void findMedianSortedArrays3() {
        int[] nums1 = new int[]{0, 0};
        int[] nums2 = new int[]{0, 0};

        double actual = solution.findMedianSortedArrays(nums1, nums2);

        assertThat(actual).isEqualTo(0.00000);
    }
}
