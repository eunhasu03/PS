import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        ArrayList<String> clothesType = new ArrayList<>();
        
        // 모든 옷에 대해 반복
        for(int i = 0; i < clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            } else {
                map.put(clothes[i][1], 1);
                clothesType.add(clothes[i][1]);
            }
            
            // map.put(clothes[i][1], (map.containsKey(clothes[i][1]) ? map.get(clothes[i][1] + 1) : 1));
        }
        
        for(int i = 0; i < clothesType.size(); i++){
            answer *= (map.get(clothesType.get(i)) + 1);
        }
        
        return answer-1;
    }
}