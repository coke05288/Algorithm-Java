package LeetCode_75.Two_Pointers;

public class LeetCode_392_IsSubsequence {
    public static void main(String[] args) {
        String s;
        String t;

        s = "abc";
        t = "ahbgdc";
        System.out.println(new LeetCode_392_IsSubsequence().isSubsequence(s, t));

        s = "axc";
        t = "ahbgdc";
        System.out.println(new LeetCode_392_IsSubsequence().isSubsequence(s, t));

        s = "b";
        t = "abc";
        System.out.println(new LeetCode_392_IsSubsequence().isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {

        int s_index = 0;
        int t_index = 0;

        if(s.isEmpty()) return true;

        while (t_index < t.length() && s_index < s.length()){
            if(s.charAt(s_index) == t.charAt(t_index)){
                t_index++;
                s_index++;

            }else{
                t_index++;
            }
        }

        return s_index == s.length();
    }
}
