package programmers;

class Solution2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length; i++){
           int len = 0;
           for(int j = 0; j < 4; j++ ) {
        	  if(babbling[i].contains(word[j])) {
        		  len += word[j].length();
        	  } 
           }
           if(len == babbling[i].length()) {
        	   answer++;
           }
        }
        
        return answer;
    }
    

}