class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for(int i = 0; i < strlist.length; i++){
            char[] chars = strlist[i].toCharArray();
            answer[i] = chars.length;
        }
        return answer;
    }
}