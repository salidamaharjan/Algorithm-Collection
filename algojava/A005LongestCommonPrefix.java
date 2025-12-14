public class A005LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String longCommonPrefix = "";
        String smallWord = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (smallWord.length() > strs[i].length()) {
                smallWord = strs[i];
            }
        }
        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < smallWord.length(); i++) {
            for (int j = 1; j < strs.length; j++) {

                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return longCommonPrefix;
                }
                if (j == strs.length - 1) {
                    longCommonPrefix = longCommonPrefix + strs[0].charAt(i);
                }
            }
        }
        return longCommonPrefix;
    }

    public static void main(String[] args) {
        String[] stringArray = {"flower", "flow", "flour"};
        String[] stringArray1 = {"dry", "drew", "drool"};
        String[] stringArray2 = {"dry", "fry", "cry"};
        String[] stringArray3 = {"d"};
        String[] stringArray4 = {"cir", "car"};

        System.out.println(longestCommonPrefix(stringArray));
        System.out.println(longestCommonPrefix(stringArray1));
        System.out.println(longestCommonPrefix(stringArray2));
        System.out.println(longestCommonPrefix(stringArray3));
        System.out.println(longestCommonPrefix(stringArray4));

    }
}
