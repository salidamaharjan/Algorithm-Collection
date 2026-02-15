import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A0013CanConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> ransomeNoteMap = new HashMap<>();
        Map<String, Integer> magazineMap = new HashMap<>();
        Set<String> ransomeNoteSet = new HashSet<>();
        Set<String> magazineSet = new HashSet<>();
        int count1 = 1;
        int count2 = 1;

        for (int i = 0; i < ransomNote.length(); i++) {
            if (ransomeNoteSet.contains(String.valueOf(ransomNote.charAt(i)))) {
                count1++;
                ransomeNoteMap.put(String.valueOf(ransomNote.charAt(i)), count1);
            }
            ransomeNoteSet.add(String.valueOf(ransomNote.charAt(i)));
        }
        int j = 0;
        while (j < magazine.length()) {
            if (magazineSet.contains(String.valueOf(magazine.charAt(j)))) {
                count2++;
                magazineMap.put(String.valueOf(magazine.charAt(j)), count2);
            }
            magazineSet.add(String.valueOf(magazine.charAt(j)));
            j++;
        }

        System.out.println("0: " + ransomeNoteMap.get(String.valueOf(ransomNote.charAt(0))));
        System.out.println("1: " + magazineMap.get(String.valueOf(magazine.charAt(0))));
        System.out.println("1: " + magazineMap.get(String.valueOf(magazine.charAt(1))));

        return true;
    }

    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";
        String ransomNote = "aa";
        String magazine = "ab";
        String ransomNote2 = "aa";
        String magazine2 = "aab";
//        System.out.println(canConstruct(ransomNote1, magazine1));
//        System.out.println(canConstruct(ransomNote, magazine));
        System.out.println(canConstruct(ransomNote2, magazine2));
    }
}
