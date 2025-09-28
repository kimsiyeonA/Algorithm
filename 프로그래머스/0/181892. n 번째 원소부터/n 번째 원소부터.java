class Solution {
    public int[] solution(int[] num_list, int n) {
        int leng = num_list.length;
        int num = 0;
        int[] answer = new int [leng-n+1];
        
        for(int i = n-1; i < leng; i++){
            answer[num++] = num_list[i];
        }
        return answer;
    }
}