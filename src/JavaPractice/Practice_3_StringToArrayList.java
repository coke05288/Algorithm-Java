package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Practice 3: 입력받은 문자열을 ArrayList 에 담기 동적으로 크기 조절 가능 (C++ vector 와 유사)
public class Practice_3_StringToArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        while (scanner.hasNextInt()){
            numberList.add(scanner.nextInt());
        }

        for(Integer num : numberList){
            System.out.println(num + " ");
        }

        scanner.close();
    }
}
