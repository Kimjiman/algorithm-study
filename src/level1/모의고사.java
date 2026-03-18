package level1;

/**
 * 문제: 모의고사
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 완전탐색
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-17
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 *
 * ===================== 문제 지문 =====================
 * 수포자는 수학을 포기한 사람의 준말입니다.
 * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 *
 * 1번 수포자: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ... (반복)
 * 2번 수포자: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ... (반복)
 * 3번 수포자: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ... (반복)
 *
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
 * 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * [제한 조건]
 * - 시험은 최대 10,000 문제로 구성되어있습니다.
 * - 문제의 정답은 1, 2, 3, 4, 5 중 하나입니다.
 * - 가장 높은 점수를 받은 사람이 여럿일 경우, 오름차순 정렬하여 모두 return 합니다.
 *
 * [입출력 예]
 * answers = [1, 2, 3, 4, 5]  → return [1]
 * answers = [1, 3, 2, 4, 2]  → return [1, 2, 3]
 * =====================================================
 */
public class 모의고사 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] answers1 = {1, 2, 3, 4, 5};
        System.out.println(java.util.Arrays.toString(sol.solution(answers1))); // 기댓값: [1]

        // 테스트케이스 2
        int[] answers2 = {1, 3, 2, 4, 2};
        System.out.println(java.util.Arrays.toString(sol.solution(answers2))); // 기댓값: [1, 2, 3]
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int[] result = {};
            return result;
        }
    }
}
