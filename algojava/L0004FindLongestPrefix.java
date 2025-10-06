public class L0004FindLongestPrefix{
    public static void main(String[] args){
//        String[] arrStr = {"ab","a"};
//        String[] arrStr = {"flower","flow", "flight"};
//        String[] arrStr = {""};
        String[] arrStr = {"", ""};
//        String[] arrStr = {"cir","car"};
//        String[] arrStr = {"flower","flower", "flower"};
        System.out.println("longestPrefix= " + longestPrefix(arrStr));
    }
    public static String longestPrefix(String[] arrStr){
        String prefix = "";
        if(arrStr.length == 0){
            return prefix;
        }
        if(arrStr.length == 1){
            return arrStr[0];
        }
        String shortStr = arrStr[0];
        System.out.println("arrStr.length before for= " + arrStr.length);
        for(int i = 1; i < arrStr.length; i++){
            if(arrStr[0].charAt(i) != arrStr[i].charAt(0)){
                return prefix;
            }
        }
        for(int i = 1; i < arrStr.length; i++){
            System.out.println("arrStr.length inside for= " + arrStr.length);
            if(shortStr.length() >= arrStr[i].length()){
                shortStr = arrStr[i];
                if(shortStr.length() == 1) {
                    prefix = shortStr;
                }
                System.out.println("shortStr inside if= " + shortStr);
            }
        }
        System.out.println("shortStr= " + shortStr);
        System.out.println("shortStr.length= " + shortStr.length());

        int j = 0;
        int i = 1;
        while( j < shortStr.length()){//0<4, 1<4
            System.out.println("j= " + j);
            System.out.println("i= " + i);

            if(arrStr[0].charAt(j) != arrStr[i].charAt(j)) {
                System.out.println("Return from else");
                return prefix;
            } else {
                i++;
                System.out.println("i after i++= " + i);
                if(i >= arrStr.length) {
                prefix = prefix + Character.toString(arrStr[0].charAt(j));
                    return prefix;
                }
                if(arrStr[0].charAt(j) == arrStr[i].charAt(j)){
                    prefix = prefix + Character.toString(arrStr[0].charAt(j));
                    System.out.println("prefix from else= " + prefix);
                }
            }
            System.out.println("arrStr.length= " + arrStr.length);
            j++;
            i=1;
        }
        System.out.println("prefix= " + prefix);

        return prefix;
    }
}