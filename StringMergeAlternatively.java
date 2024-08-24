/* 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
*/

public class StringMergeAlternatively {

    public static void main(String[] args) {

        String word1 = "leet";
        String word2 = "p";
        System.out.println(solution(word1,word2));

        
    }

    public static String solution(String s1, String s2)
    {
        int len=Math.max(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++)
        {
            if(i<s1.length())
            sb.append(s1.charAt(i));
            if(i<s2.length())
            sb.append(s2.charAt(i));
        }
        return sb.toString();
        
    }

 
    
}
