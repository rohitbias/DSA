
/*
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

*/
import java.util.*;

class KidsWithCandies {
    public static void main(String args[]) {
        int[] kidsCandies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(solution(kidsCandies, extraCandies));
    }

    public static List<Boolean> solution(int[] kidsCandies, int extraCandies) {

        int maxCandies = 0;
        for (int i = 0; i < kidsCandies.length; i++) {
            maxCandies = Math.max(maxCandies, kidsCandies[i]);
        }

        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < kidsCandies.length; i++) {
            if (kidsCandies[i] + extraCandies >= maxCandies)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;

    }
}