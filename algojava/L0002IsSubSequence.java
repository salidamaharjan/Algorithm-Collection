public class L0002IsSubSequence{
    public static void main(String[] args){
        String s = "aaaaaa";
        String t = "bbaaaa";
        boolean sequence = isSequence(s, t);
        System.out.println(sequence);
    }
    public static boolean isSequence(String s, String t){
        int sPointer = 0;
        if(s.isEmpty()) {
          return true;
        }

        for (int i = 0; i < t.length() && sPointer < s.length(); i++){
            if(s.charAt(sPointer) == t.charAt(i)) {
                sPointer += 1;
            }
        }
        return s.length() == sPointer;
    }
}