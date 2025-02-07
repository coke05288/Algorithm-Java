package JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

// Practice 2: 입력받은 문자열을 Arrays 의 stream API 를 통해서 int 배열로 변환, 고정 크기
public class Practice_2_StringToIntArrayStream {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
