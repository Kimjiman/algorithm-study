package level2;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제: 의상
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42578
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 해시
 * 시간복잡도: O(N)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-02-23
 *
 * 1. 옷의 종류에 따라 Key=옷의 종류, Value=옷의 개수로 담는다.
 * -> 옷을 입지 않았을때만 생각하면 되므로, 옷의 종류 (n1 + 1) × (n2 + 1) ... x (nN + 1) - 1를 수식으로 표현한다.
 * -> for (Map.Entry<String, Integer> entry : map.entrySet()) {
 *        answer *= (entry.getValue() + 1);
 *    }
 */
public class 의상 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(sol.solution(clothes1)); // 기댓값: 3 + (2*1)

        // 테스트케이스 2
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(sol.solution(clothes2)); // 기댓값: 3

        // 테스트케이스 3
        String[][] clothes3 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"blue_sunglasses", "eyewear"}, {"yellow_hat", "headgear"}};
        System.out.println(sol.solution(clothes3)); // 기댓값: 4 + 1 + (2*1) + (2*1) + (2*1*1)
    }

    static class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            Map<String, Integer> map = new HashMap<>();
            for (String[] clothe : clothes) {
                map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                answer *= (entry.getValue() + 1);
            }

            answer -= 1;
            return answer;
        }
    }
}
