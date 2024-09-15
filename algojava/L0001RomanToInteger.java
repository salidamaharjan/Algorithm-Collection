import java.util.Map;

public class L0001RomanToInteger {
    public static void main(String[] args) {
      String roman = "MCMXCIV";
      System.out.println(toString(roman));
    }
    public static int toString(String roman) {
    Map<Character, Integer> romanVal = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C',  100,
                'D', 500,
                'M', 1000 );
    int num = 0;
    int prevVal = 0;
    for(int i = roman.length()-1; i >= 0; i--){
        char curChar = roman.charAt(i);
        int curVal = romanVal.get(curChar);
        if(curVal < prevVal){
            num -= curVal;
        } else {
            num += curVal;
        }
        prevVal = curVal;
    }
        return num;
    }
}