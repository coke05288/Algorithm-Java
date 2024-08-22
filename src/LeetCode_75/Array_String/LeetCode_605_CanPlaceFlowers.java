package LeetCode_75.Array_String;

public class LeetCode_605_CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed;
        int n;

        flowerbed = new int[] {1, 0, 0, 0, 1};
        n = 1;
        System.out.println(new LeetCode_605_CanPlaceFlowers().canPlaceFlowers(flowerbed, n));

        flowerbed = new int[] {1, 0, 0, 0, 1};
        n = 2;
        System.out.println(new LeetCode_605_CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n){
        for(int i = 0; i < flowerbed.length; i++){
            int left = i - 1;
            int right = i + 1;

            if(flowerbed[i] == 0 && ((left < 0 || flowerbed[left] == 0)) && (right >= flowerbed.length || flowerbed[right] == 0)){
                flowerbed[i] = 1;
                n--;
            }

            if(n <= 0){
                return true;
            }
        }

        return false;
    }
}
