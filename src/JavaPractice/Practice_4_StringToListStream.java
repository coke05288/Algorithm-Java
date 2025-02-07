package JavaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practice_4_StringToListStream {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                                         .map(Integer::parseInt)
                                                 .collect(Collectors.toList());

        numberList.add(3);

        System.out.println(numberList);
    }
}
