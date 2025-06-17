class Solution {
    public int solution(int hp) {
        int big = hp / 5;
        int mid = (hp % 5) / 3;
        int small =  (hp % 5) % 3 ;
        int answer = big + mid + small;
        return answer;
    }
}