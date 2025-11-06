public class A003RomanToInteger {
    public static int romanToInt(String s) {
        int num = 0;
        int newNum = 0;
        for (int i = 0; i < s.length(); i++) {
            String s1 = (i + 1 < s.length()) ? String.valueOf(s.charAt(i + 1)) : "";
            switch (String.valueOf(s.charAt(i))) {
                case "I":
                    if (s1.equals("V")) {
                        newNum = 4;
                        i++;
                        break;
                    } else if (s1.equals("X")) {
                        newNum = 9;
                        i++;
                        break;
                    } else {
                        newNum = 1;
                        break;
                    }
                case "V":
                    newNum = 5;
                    break;
                case "X":
                    if (s1.equals("L")) {
                        newNum = 40;
                        i++;
                        break;
                    } else if (s1.equals("C")) {
                        newNum = 90;
                        i++;
                        break;
                    } else {
                        newNum = 10;
                        break;
                    }
                case "L":
                    newNum = 50;
                    break;
                case "C":
                    if (s1.equals("D")) {
                        newNum = 400;
                        i++;
                        break;
                    } else if (s1.equals("M")) {
                        newNum = 900;
                        i++;
                        break;
                    } else {
                        newNum = 100;
                        break;
                    }
                case "D":
                    newNum = 500;
                    break;
                case "M":
                    newNum = 1000;
                    break;
            }
            num = num + newNum;
        }
        return num;
    }

    public static void main(String[] args) {
        int inInt1 = romanToInt("III");
        System.out.println("III in integer = " + inInt1);
        int inInt2 = romanToInt("LVIII");
        System.out.println("LVIII in integer = " + inInt2);
        int inInt3 = romanToInt("MCMXCIV");
        System.out.println("MCMXCIV in integer = " + inInt3);
    }
}
