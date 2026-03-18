package level1;

/**
 * 문제: 체육복
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42862
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 그리디
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-18
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 *
 * ===================== 문제 지문 =====================
 * 점심시간에 도둑이 들어 체육복이 도난당했습니다.
 * 다행히 여벌 체육복이 있는 학생이 도난당한 학생에게 체육복을 빌려주려 합니다.
 *
 * 단, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 빌려줄 수 있습니다.
 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하세요.
 *
 * [제한 조건]
 * - 전체 학생의 수는 2명 이상 30명 이하입니다.
 * - 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이며, 최소 1명은 체육수업을 들을 수 있습니다.
 * - 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수도 있습니다.
 *   이때는 이 학생은 체육복을 한 벌 가지고 있다고 가정하며, 다른 학생에게 빌려줄 수 없습니다.
 *
 * [입출력 예]
 * n=5, lost=[2,4], reserve=[1,3,5]  → return 5
 *   → 1번이 2번에게, 3번이 4번에게 빌려줘서 모두 수업 가능
 *
 * n=5, lost=[2,4], reserve=[3]      → return 4
 *   → 3번이 2번 또는 4번 중 하나에게만 빌려줄 수 있음
 *
 * n=3, lost=[3], reserve=[1]        → return 2
 *   → 1번은 2번에게만 빌려줄 수 있으므로 3번은 수업 못 들음
 * =====================================================
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
    }

    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            return answer;
        }
    }
}
