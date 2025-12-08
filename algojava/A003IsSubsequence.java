public class A003IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        int sPointer = 0;
        if(s.isEmpty()) {
            return true;
        }
        for (int i = 0; i < t.length() && sPointer < s.length(); i++) {
            if(s.charAt(sPointer) == t.charAt(i)){
                sPointer++;
            }
        }
        return sPointer == s.length();
    }

    public static void main(String[] args) {
        System.out.println("lyra is subsequence of salyra-> " + isSubsequence("Lyra", "salyra"));
        System.out.println("abc is subsequence of ahbgdc-> " + isSubsequence("abc", "ahbgdc"));
        System.out.println("axc is subsequence of ahbgdc-> " + isSubsequence("axc", "ahbgdc"));
        System.out.println("aec is subsequence of abcde-> " + isSubsequence("aec", "abcde"));
    }
}
