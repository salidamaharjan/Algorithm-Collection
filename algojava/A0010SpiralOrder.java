import java.util.ArrayList;
import java.util.List;

public class A0010SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralOrder = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int arrIdx = 0;
        int arrLen = matrix[0].length - 1;

        while (top <= bottom && arrIdx <= arrLen) {

            for (int i = arrIdx; i <= arrLen; i++) {
                spiralOrder.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiralOrder.add(matrix[i][arrLen]);
            }
            arrLen--;

            if (top <= bottom) {
                for (int i = arrLen; i >= arrIdx; i--) {
                    spiralOrder.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (arrIdx <= arrLen) {
                for (int i = bottom; i >= top; i--) {
                    spiralOrder.add(matrix[i][arrIdx]);
                }
                arrIdx++;
            }
        }
        return spiralOrder;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println(spiralOrder(matrix1));
        System.out.println(spiralOrder(matrix2));

    }
}
