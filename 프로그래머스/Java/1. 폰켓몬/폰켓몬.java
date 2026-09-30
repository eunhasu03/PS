import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
                
        int max = nums.length / 2;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, (map.containsKey(num) ? map.get(num) + 1 : 1));
        }
        
        int n = map.size();
        
        answer = Math.min(n, max);
        
        return answer;
    }
}