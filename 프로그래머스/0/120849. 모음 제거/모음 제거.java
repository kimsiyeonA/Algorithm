class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u'){
                continue;
            }
            answer += chars[i];
        }
        return answer;
    }
}