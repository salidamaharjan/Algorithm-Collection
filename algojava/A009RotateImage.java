import java.util.Arrays;

public class A009RotateImage {
    public static void rotate(int[][] matrix) {
        int len = matrix.length;
        int arrayLen = matrix[0].length;
//        System.out.println("arrayLen: " + arrayLen);

        int[][] rotatedMatrix = new int[len][arrayLen];

        for (int arrayIndex = 0; arrayIndex < len; arrayIndex++) {
            int index = len - 1;
            for (int elementIndex = 0; elementIndex < arrayLen; elementIndex++) {
                rotatedMatrix[arrayIndex][elementIndex] = matrix[index][arrayIndex];
                index--;
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arrayLen; j++) {
                matrix[i][j] = rotatedMatrix[i][j];
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix1 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix1);
        rotate(matrix2);
    }
}
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
