package level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제: 완주하지 못한 선수
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42576
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 해시
 * 시간복잡도: O(N)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-02-23
 *
 * 1. 참가자의 배열을 루프를 돌려, map에 담되 중복되는 선수이름이 발생할수 있으므로 그때는 value의 참가자를 +1 한다.
 * -> 완료자의 배열을 루프를 돌려, hashMap에 접근하여 1인경우 remove / 1 초과하는 경우 -1 한다.
 * -> 문제에 따르면, 완료못한 사람은 1명이므로 map.keySet을 iterator를 사용하여 정답에 담는다.
 */
public class 완주하지못한선수 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        System.out.println(sol.solution(participant1, completion1)); // 기댓값: "leo"

        // 테스트케이스 2
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(sol.solution(participant2, completion2)); // 기댓값: "vinko"

        // 테스트케이스 3 (동명이인 포함)
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(sol.solution(participant3, completion3)); // 기댓값: "mislav"
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {

            Map<String, Integer> map = new HashMap<>();
            for (String it : participant) {
                map.put(it, map.getOrDefault(it, 0) + 1);
                // 이전 방식: map.getOrDefault를 쓰면,
                // 키가 있으면 기존 값 + 1
                // 키가 없으면 0 + 1
                /*if (map.get(it) != null) {
                    map.put(it, map.get(it) + 1);
                } else {
                    map.put(it, 1);
                }*/
            }

            for (String it : completion) {
                if(map.get(it) != null) {
                    if(map.get(it) > 1) {
                        map.put(it, map.get(it) - 1);
                    } else {
                        map.remove(it);
                    }
                }
            }

            String answer = map.keySet().iterator().next();
            return answer;
        }
    }
}
