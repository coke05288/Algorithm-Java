package LeetCode_75.Array_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class LeetCode_1431_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(new LeetCode_1431_KidsWithTheGreatestNumberOfCandies().kidsWithCandies(candies, extraCandies));

        candies = new int[]{4, 2, 1, 1, 2};
        extraCandies = 1;
        System.out.println(new LeetCode_1431_KidsWithTheGreatestNumberOfCandies().kidsWithCandies(candies, extraCandies));

        candies = new int[]{12, 1, 12};
        extraCandies = 10;
        System.out.println(new LeetCode_1431_KidsWithTheGreatestNumberOfCandies().kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> answer = new ArrayList<>();

        int tempMax = 0;

        for(int candy : candies){
            tempMax = Math.max(tempMax, candy);
        }

        for(int candy : candies){
            if(candy + extraCandies >= tempMax){
                answer.add(true);
            }else{
                answer.add(false);
            }
        }

        return answer;
    }
}