package level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제: 체육복
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42862
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 그리디
 * 시간복잡도: O(N)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-03-18
 *
 * 체육복 여벌이있는 사람, 도난당한사람, 1벌밖에없는 사람을 모두 map 에 담는다.
 * n번만큼 순차적으로 앞뒤를 비교해서, 체육복 여벌전달이 가능한 경우에 전달한다.
 */
public class 체육복 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        System.out.println(sol.solution(5, new int[]{2, 4}, new int[]{1, 3, 5})); // 기댓값: 5

        // 테스트케이스 2
        System.out.println(sol.solution(5, new int[]{2, 4}, new int[]{3}));       // 기댓값: 4

        // 테스트케이스 3
        System.out.println(sol.solution(3, new int[]{3}, new int[]{1}));           // 기댓값: 2

        // 테스트케이스 4
        System.out.println(sol.solution(5, new int[]{1, 3}, new int[]{1, 5}));     // 기댓값: 4
    }

    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int j : lost) {
                map.put(j, 0);
            }

            for (int j : reserve) {
                map.put(j, map.containsKey(j) ? 1 : 2);
            }

            for(int i = 1; i <= n; i++) {
                if(!map.containsKey(i)) {
                    map.put(i, 1);
                }
            }


            for (int i = 1; i <= n; i++) {
                if(map.get(i) == 0 && i - 1 > 0) {
                    int reservePre = map.get(i - 1);
                    if(reservePre > 1) {
                        map.put(i, 1);
                        map.put(i - 1, reservePre - 1);
                        continue;
                    }
                }

                if(map.get(i) == 0 && i + 1 <= n) {
                    int reserveSuf = map.get(i + 1);
                    if(reserveSuf > 1) {
                        map.put(i, 1);
                        map.put(i + 1, reserveSuf - 1);
                    }
                }
            }

            int answer = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() > 0) answer++;
            }

            return answer;
        }
    }
}
