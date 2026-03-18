package level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 문제: 실패율
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42889
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 정렬 + 구현
 * 시간복잡도: O(N*M)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-03-18
 *
 * 클리어 시나리오를 이중루프로 도출
 * 정렬 로직
 */
public class 실패율 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(java.util.Arrays.toString(sol.solution(5, stages1))); // 기댓값: [3, 4, 2, 1, 5]

        // 테스트케이스 2
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(java.util.Arrays.toString(sol.solution(4, stages2))); // 기댓값: [4, 1, 2, 3]
    }

    static class Solution {
        public int[] solution(int N, int[] stages) {
            Map<Integer, Double> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int up = 0;
                int down = 0;
                for (int j = 0; j < stages.length; j++) {
                    // 클리어한 사람수
                    if (stages[j] > i + 1) {
                        up++;
                    }

                    // 도전한 사람
                    if (i >= stages[j]) {
                        down++;
                    }
                }

                if (stages.length == down) {
                    map.put(i + 1, 0.0D);
                } else {
                    map.put(i + 1, (double) (stages.length - down - up) / (stages.length - down));
                }
            }

            List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());

            list.sort((x, y) -> {
                int tmp = Double.compare(y.getValue(), x.getValue());
                if (tmp != 0) return tmp;
                return Integer.compare(x.getKey(), y.getKey());
            });

            return list.stream().mapToInt(Map.Entry::getKey).toArray();
        }
    }
}
