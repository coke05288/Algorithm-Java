package JavaPractice;

import java.util.Scanner;

// Practice 1: 입력받은 문자열을 한가지 타입을 담을 수 있는 고정된 크기의 숫자 배열에 담기
public class Practice_1_StringToIntArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("나이와 키를 입력해주세요(예시: 28 180): ");

        String input = scanner.nextLine();
        String[] tokens = input.split(" ");

        int[] nums = new int[tokens.length];

        for(int i = 0; i < tokens.length; i++){
            nums[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("이름을 입력해주세요: ");

        String name = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + nums[0]);
        System.out.println("키: " + nums[1]);

        scanner.close();
    }
}
