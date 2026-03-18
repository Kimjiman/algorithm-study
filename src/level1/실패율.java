package level1;

/**
 * 문제: 실패율
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42889
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 정렬 + 구현
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-18
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 *
 * ===================== 문제 지문 =====================
 * 슈퍼 게임 개발자 오렐리는 프리렌이라는 게임을 개발했습니다.
 * 이 게임에는 1번부터 N번까지 N개의 스테이지가 있습니다.
 *
 * 실패율은 다음과 같이 정의합니다:
 *   실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
 *
 * stages 배열은 각 플레이어가 현재 머물러 있는 스테이지 번호를 담고 있습니다.
 * (N+1은 모든 스테이지를 클리어한 플레이어를 의미합니다.)
 *
 * 실패율이 높은 스테이지부터 내림차순으로 정렬한 스테이지 번호 배열을 return 하세요.
 * 실패율이 같으면 스테이지 번호가 작은 것을 먼저 return 합니다.
 *
 * [제한 조건]
 * - 스테이지의 수 N은 1 이상 500 이하의 자연수입니다.
 * - stages의 길이는 1 이상 200,000 이하입니다.
 * - stages의 각 원소는 1 이상 N+1 이하의 자연수입니다.
 *
 * [입출력 예]
 * N=5, stages=[2,1,2,6,2,4,3,3]  → return [3,4,2,1,5]
 *   스테이지 1: 도달 8명, 실패 1명 → 실패율 1/8
 *   스테이지 2: 도달 7명, 실패 3명 → 실패율 3/7
 *   스테이지 3: 도달 4명, 실패 2명 → 실패율 2/4
 *   스테이지 4: 도달 2명, 실패 1명 → 실패율 1/2
 *   스테이지 5: 도달 1명, 실패 0명 → 실패율 0/1
 *   실패율 내림차순: [3, 4, 2, 1, 5]
 *
 * N=4, stages=[4,4,4,4,4]        → return [4,1,2,3]
 * =====================================================
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
            int[] answer = {};
            return answer;
        }
    }
}
