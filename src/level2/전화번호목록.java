package level2;

import java.util.Arrays;

/**
 * 문제: 전화번호 목록
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42577
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 해시
 * 시간복잡도: O(N log N) -> Arrays.sort O(N log N)
 * 공간복잡도: O(1)
 * 풀이 날짜: 2026-02-23
 *
 * 1. 처음풀이 방식은 HashMap을 이용해서, 전화번호를 map O(N) 에 담는다.
 * -> 전화번호 배열을 루프를 다시 돌려 map의 value를 substring하여 접두어를 찾는다.
 * 시간복잡도로 따지면, O(N * M2) 공간복잡도는 O(N)이다.
 *
 * 2. 두번째 풀이방식은 접두어라는 점을 이용하여, 미리 정렬한다. O(N log N)
 * -> 정렬된 전화번호 배열 루프를 돌려, 사전 순서로 정렬된 변수와 다음 순서의 변수를 체크하는 startsWith 함수를 써서 접두어를 찾는다.
 * 시간복잡도로 따지면, O(N log N) 공간복잡도는 O(1)이다.
 */
public class 전화번호목록 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        String[] phone_book1 = { "119", "97674223", "1195524421" };
        System.out.println(sol.solution(phone_book1)); // 기댓값: false

        // 테스트케이스 2
        String[] phone_book2 = { "123", "456", "789" };
        System.out.println(sol.solution(phone_book2)); // 기댓값: true

        // 테스트케이스 3
        String[] phone_book3 = { "12", "123", "1235", "567", "88" };
        System.out.println(sol.solution(phone_book3)); // 기댓값: false
    }

    static class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            Arrays.sort(phone_book);

            /*  이전 방식: HashMap에 전부 담고 substring으로 접두어 조회 → O(N * M), 공간복잡도 O(N)
            Map<String, String> map = new HashMap<>();
            for (String it : phone_book) {
                map.put(it, it);
            }
            loop1:
            for (String it : phone_book) {
                for (int i = 0; i < it.length(); i++) {
                    if (map.get(it.substring(0, i)) != null) {
                        answer = false;
                        break loop1;
                    }
                }
            }
            */

            for(int i = 0; i < phone_book.length; i++) {
                if(i + 1 < phone_book.length && phone_book[i + 1].startsWith(phone_book[i])) {
                    answer = false;
                    break;
                }
            }

            return answer;
        }
    }

}
