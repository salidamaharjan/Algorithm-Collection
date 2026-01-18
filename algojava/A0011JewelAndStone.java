public class A0011JewelAndStone {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int jewelTotalCount = jewels.length();
        int stoneTotalCount = stones.length();
        int jewelCount = 0;
        if (jewels.isEmpty()) {
            return count;
        }
        while (jewelCount < jewelTotalCount) {
            for (int stoneCount = 0; stoneCount < stoneTotalCount; stoneCount++) {
                if (jewels.charAt(jewelCount) == stones.charAt(stoneCount)) {
                    count++;
                }
            }
            jewelCount++;
        }
        return count;
    }

    public static void main(String[] args) {
        String jewel1 = "aA";
        String stones1 = "aAAbbbb";
        String jewel2 = "z";
        String stones2 = "ZZ";
        System.out.println(numJewelsInStones(jewel1, stones1));
        System.out.println(numJewelsInStones(jewel2, stones2));
    }
}
