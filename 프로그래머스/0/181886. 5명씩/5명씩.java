class Solution {
    public String[] solution(String[] names) {
        int length = names.length / 5;
        if(names.length % 5 != 0)
            length++;
        int count =0;
        
        String[] answer = new String[length];
        for (int i = 0; i < names.length; i+=5){
            answer[count] = names[i];
            count++;
        }
        
        return answer;
    }
}