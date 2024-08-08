package LeetCode_75.Array_String;

public class LeetCode_1071_GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String str1;
        String str2;

        str1 = "ABCABC";
        str2 = "ABC";
        System.out.println(new LeetCode_1071_GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));

        str1 = "ABABAB";
        str2 = "ABAB";
        System.out.println(new LeetCode_1071_GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));

        str1 = "LEET";
        str2 = "CODE";
        System.out.println(new LeetCode_1071_GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));
    }

    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int gcdIndex = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdIndex);
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
