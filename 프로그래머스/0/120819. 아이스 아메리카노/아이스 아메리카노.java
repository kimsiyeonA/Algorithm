class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        int coffeeCount = money / 5500 ;
        int change = money - (coffeeCount*5500);
        answer[0] = coffeeCount;
        answer[1] = change;
        return answer;
    }
}