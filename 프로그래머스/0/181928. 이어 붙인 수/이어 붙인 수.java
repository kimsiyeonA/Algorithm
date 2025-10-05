class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++){
            int ch = num_list[i];
            if(ch % 2 == 0){
                even += ch;
                even *= 10;
            } else {
                odd += ch;
                odd *= 10;
            }
        }
        
        odd /= 10;
        even /= 10;

        
        answer = even + odd ;
        return answer;
    }
}