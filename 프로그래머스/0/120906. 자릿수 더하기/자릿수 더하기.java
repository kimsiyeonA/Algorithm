class Solution {
    public int solution(int n) {
        int answer = 0;
        String nString = String.valueOf(n);
        for(int i = 0; i < nString.length(); i++){
            int nParse = Character.getNumericValue(nString.charAt(i));
            answer += nParse;
        }
        return answer;
    }
}