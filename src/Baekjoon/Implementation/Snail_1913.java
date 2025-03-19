package Baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail_1913 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        solution(n, target);
    }

    public static void solution(int n, int target){

        // 1. n * n 2차원 배열 생성
        int[][] arr = new int[n][n];

        // 3. 달팽이 채우기
        int x = n/2, y = n/2;
        int value = 1;
        int limit = 1;

        while(true){

            for(int i = 0; i < limit; i++) arr[y--][x] = value++;
            if(value - 1 == n * n) break;
            for(int i = 0; i < limit; i++) arr[y][x++] = value++;
            limit++;

            for(int i = 0; i < limit; i++) arr[y++][x] = value++;
            for(int i = 0; i < limit; i++) arr[y][x--] = value++;
            limit++;
        }

        // 4. 정답 출력하기
        StringBuilder sb = new StringBuilder();
        int aX = 0, aY = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(target == arr[i][j]){
                    aX = i + 1;
                    aY = j + 1;
                }
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        sb.append(aX + " " + aY);

        System.out.println(sb);
    }
}
