import java.util.Arrays;
import java.util.Comparator;

public class A009RotateImage {
    public static void rotate(int[][] matrix) {
        int len = matrix.length;

        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[0] - a[0];
            }
        });
        for (int[] ints : matrix) {
            System.out.println(
                    ints[0] + ", " + ints[1] + ", " + ints[2] + ", " + ints[3]
            );
        }

    }

    public static void main(String[] args) {
        int[][] matrix1 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix1);
    }
}
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
