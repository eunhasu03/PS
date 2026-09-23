import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = -1;
        int length = citations.length;
        
        // Arrays.sort(citations);
        
        // 버블정렬로 내림차순 정렬
        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                if(citations[i] < citations[j]){
                    int temp = citations[i];
                    citations[i] = citations[j];
                    citations[j] = temp;
                }
            }
        }
        
        for(int i = 0; i <= length; i++){
            
            int tempH = length - i;
            int count = 0;
            
            for(int j = 0; j < length; j++){
                
                // h번 이상 인용 되었을 경우 -> count 추가
                if(citations[j] >= tempH) count++;
            }
            
            if(count >= tempH){
                answer = tempH;
                break;
            }
        }
        
        return answer;
    }
}