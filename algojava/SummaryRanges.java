import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> listString = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return listString;
        }

        int prevVal = nums[0];
        int beginAt = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prevVal == nums[i] - 1) {
                prevVal = nums[i];
            } else {
                addRange(listString, beginAt, prevVal);
                beginAt = nums[i];
                prevVal = nums[i];
            }
        }

        addRange(listString, beginAt, prevVal);
        return listString;
    }

    private static void addRange(List<String> listString, int beginAt, int prevVal) {
        if (beginAt == prevVal) {
            listString.add(String.valueOf(beginAt));
        } else {
            listString.add(beginAt + "->" + prevVal);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 5, 7};
        int[] nums1 = {0, 2, 3, 4, 6, 8, 9};

        System.out.println(summaryRanges(nums));
        System.out.println(summaryRanges(nums1));
    }
}

