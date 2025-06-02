class Solution {
    public int solution(int price) {
        int answer = 0;
        if (100000 > price && price >= 0){
            answer = price ;
        }else if(300000 > price && price >= 100000){
            answer = (int)((double)price * (1-0.05));
        }else if(500000 > price && price >= 300000){
            answer = (int)((double)price * (1-0.1));
        }else if(price >= 500000){
            answer = (int)((double)price * (1-0.2));
        }
        return answer;
    }
}