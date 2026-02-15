
public class A0014LongestStringChain {
    public static int longestStrChain(String[] words) {
        int count = 0;
        for(int i = 1; i < words.length; i++) {
            if(words[i].contains(words[0])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words1 = {"a","b","ba","bca","bda","bdca"};
        String[] words2 = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        String[] words3 = {"abcd","dbqca"};
        System.out.println(longestStrChain(words1));
        System.out.println(longestStrChain(words2));
        System.out.println(longestStrChain(words3));
    }
}
