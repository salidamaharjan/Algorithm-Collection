import java.util.ArrayList;
import java.util.List;

public class A001FindTheClosestNumberToZero {
    public static void main(String[] args) {
        List<Integer> listOfNum = new ArrayList<>();
        listOfNum.add(5);
        listOfNum.add(-2);
        listOfNum.add(3);
        listOfNum.add(1);
        listOfNum.add(-1);

        Integer closestNumToZero = listOfNum.get(0);

        System.out.println("listOfNum " + listOfNum);

        for (int i = 0; i < listOfNum.size(); i++) {
            if (Math.abs(closestNumToZero - 0) == Math.abs(listOfNum.get(i) - 0)) {
                closestNumToZero = Math.abs(closestNumToZero - 0);
            }
            if (Math.abs(closestNumToZero - 0) > Math.abs(listOfNum.get(i) - 0)) {
                closestNumToZero = listOfNum.get(i);
            }
        }
        System.out.println("Closest Number To Zero is: " + closestNumToZero);
    }
}
