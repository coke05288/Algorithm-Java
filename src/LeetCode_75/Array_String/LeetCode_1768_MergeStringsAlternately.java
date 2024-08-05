package LeetCode_75.Array_String;

public class LeetCode_1768_MergeStringsAlternately {
    public static void main(String[] args) {
        String word1;
        String word2;

        word1 = "abc";
        word2 = "pqr";
        System.out.println(new LeetCode_1768_MergeStringsAlternately().mergeAlternately(word1, word2));

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(new LeetCode_1768_MergeStringsAlternately().mergeAlternately(word1, word2));

        word1 = "abcd";
        word2 = "pq";
        System.out.println(new LeetCode_1768_MergeStringsAlternately().mergeAlternately(word1, word2));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();

        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            answer.append(word1.charAt(i++));
            answer.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            answer.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            answer.append(word2.charAt(j++));
        }

        return answer.toString();
    }
}
