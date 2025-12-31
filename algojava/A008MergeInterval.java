import java.util.Arrays;
import java.util.Comparator;

public class A008MergeInterval {
    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        int[][] mergeArray = new int[len][2];
        int index = 0;

        if (intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        mergeArray[index] = intervals[0];

        for(int i =1; i < len; i++) {
            if(intervals[i][0] <= mergeArray[index][1]){
                mergeArray[index][1] = Math.max(intervals[i][1], mergeArray[index][1]);
            } else {
                index++;
                mergeArray[index] = intervals[i];
            }
        }
        return Arrays.copyOf(mergeArray, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals1);

        for (int[] ints : result) {
            System.out.println(ints[0] + ", " + ints[1]);
        }
    }
}
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]