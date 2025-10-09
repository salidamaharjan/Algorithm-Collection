public class A002MergeStringAlternatively {

    public static String mergeAlternately(String word1, String word2) {
        String mergedWord = "";
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            mergedWord += word1.charAt(i);
            mergedWord += word2.charAt(j);
            i++;
            j++;
        }

        while (i < word1.length()) {
            mergedWord += word1.charAt(i);
            i++;
        }

        while (j < word2.length()) {
            mergedWord += word2.charAt(j);
            j++;
        }

        return mergedWord;
    }


    public static void main(String args[]) {
        String mergeString = mergeAlternately("acef", "bdghi");
        System.out.println("Merged String: " + mergeString);
    }
}
