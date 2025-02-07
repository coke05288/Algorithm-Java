package JavaPractice;

import java.util.*;

public class Practice_5_AdjacencyList {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // 1. 노드 개수 입력
        int n = scanner.nextInt();

        // 2. 인접 리스트 초기화
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        // 3. 그래프 인접 행렬 입력받기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int value = scanner.nextInt();
                if (value != 0) graph.get(i).add(j);
            }
        }

        scanner.close();

        // 4. 인접리스트 출력
        printGraph(graph);
    }

    private static void printGraph(List<List<Integer>> graph){
        for(int i = 0; i < graph.size(); i++){
            System.out.print(i + ": ");
            System.out.println(graph.get(i));
        }
    }
}
