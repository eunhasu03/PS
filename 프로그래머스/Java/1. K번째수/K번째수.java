import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        // 정답은 commands의 개수이므로 가변 배열 길이 할당에 이용
        int[] answer = new int[commands.length];
        
        // 각 commands에 대해 반복 시작
        for(int i = 0; i < commands.length; i++){
            // i, j, k를 a, b, c로 사용
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            
            // 자르고 정렬할 배열 선언 => a~b까지 자르므로 길이는 b-a+1
            int[] temp = new int[b-a+1];
            
            // temp 배열에 사용할 인덱스
            int idx = 0;
            
            // a~b까지의 배열을 만들기
            for(int k = a-1; k <= b-1; k++){
                temp[idx++] = array[k];
            }
            
            // 버블 정렬 알고리즘
            // for(int l = 0; l < temp.length; l++){
            //     for(int m = l+1; m < temp.length; m++){
            //         if(temp[l] > temp[m]){
            //             int forSwap = temp[m];
            //             temp[m] = temp[l];
            //             temp[l] = forSwap;
            //         }
            //     }
            // }
            
            // util 패키지의 Arrays 클래스 내의 sort 메소드 사용해 정렬
            Arrays.sort(temp);
            
            // 정답 추출
            answer[i] = temp[c-1];
            
        }
        // 정답 반환
        return answer;
    }
}