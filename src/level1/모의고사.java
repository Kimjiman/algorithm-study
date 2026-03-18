package level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제: 모의고사
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 완전탐색
 * 시간복잡도: O(N)
 * 공간복잡도: O(1)
 * 풀이 날짜: 2026-03-17
 *
 * 첫 루프에, 패턴 매칭해서 배열에 패턴의 개수만큼 매칭되는 개수를 담음
 * 제일 잘찍은 MAX 구함
 * return 객체의 개수를 구하고, index도 만듬
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

        // 테스트케이스 3
        int[] answers3 = {5, 5, 3, 1, 2};
        System.out.println(java.util.Arrays.toString(sol.solution(answers3))); // 기댓값: [3]
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int[] counts = {0, 0, 0};

            int[] aArr = {1, 2, 3, 4, 5};
            int[] bArr = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] cArr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            for(int i = 0; i < answers.length; i++) {
                int a = aArr[i % aArr.length];
                int b = bArr[i % bArr.length];
                int c = cArr[i % cArr.length];

                if(a == answers[i]) {
                    counts[0]++;
                }
                if(b == answers[i]) {
                    counts[1]++;
                }
                if(c == answers[i]) {
                    counts[2]++;
                }
            }

            int max = 0;
            for (int count : counts) {
                if (max < count) max = count;
            }


            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < counts.length; i++) {
                if(counts[i] >= max) {
                    list.add(i + 1);
                }
            }

            int[] result = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;
        }
    }
}
