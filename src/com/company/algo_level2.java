package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class algo_level2 {
    public int findSosu(String numbers) {
        int answer = 0;
        // numbList에는 들어온 string 값을 배열로 만들어
        int[] numbList = new int[numbers.length()];
        for(int i = 0; i < numbers.length();i++) {
                char a = numbers.charAt(i);
                numbList[i] = Integer.parseInt(String.valueOf(a));
        }
        System.out.println(Arrays.toString(numbList));

        return answer;
    }

    public void Permutation(int[] arr, int depth, int n, int k){
        /*
        int[] arr 에는 돌릴 배열
        int depth 어떤 뎁스에서 돌리고 있는지 확
        n 배열안에 들어가있는 고정값
        k 몇개를 뽑아서 수를 만들것인
         */

    }
    // 소수인지 확인하는 함수
    // 에라토스테네스의 체(소수 구하는 알고리즘) 으로 풀 수 있
    public void isNum(int num){
        int count = 0;
        for(int i = 2; i <= num ; i++){
            boolean isSosu = true;
            for(int j = 2; i*j < num; i++ ){
                if(i%j == 0 ){
                    isSosu = false;
                    break;
                } else {
                    count += 1;
                }
            }
        }

    }

    public void swap(char[] arr, int num1, int num2) {
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    //순열 구하는 함수

    //괄호 변환
    public String transeBracket(String p) {
        String answer = "";
        int length = p.length();
       // StringBuilder str = new StringBuilder();
        // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        if(p.isEmpty()){
            return answer;
        } else {
        // 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
            int idx = division(p);
            String u = p.substring(0, idx);
            String v = p.substring(idx, length);
        // 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
            if(isCorrect(p)){
                return u + transeBracket(v) ;
                // 3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
            } else { // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
                // 4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
                // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
                // 4-3. ')'를 다시 붙입니다.
                String temp = '(' + transeBracket(v) + ')';
                // 4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
                u = u.substring(1, u.length()-1);
                u = reverse(u);
               System.out.println(temp+u);
                return temp + u;
            }
        }
       // return answer;
    }
    // w를 가장 작은 크기의 균형 문자열로 자를 수 있는 (와 ) 의 길이가 같을떄 짜르기
    static int division(String w) {
        int close = 0, open = 0;
        int i;
        for( i = 0 ; i < w.length(); i++) {
            if(w.charAt(i) == '(') {
                open++;
            }else
                close++;
            if(open == close)
                return i+1;
        }
        return i;
    }
    // 올바른(괄호짝이 맞는) 문자열인지 판별
    static boolean isCorrect(String w) {
        int count = 0;
        for(int i = 0 ; i < w.length(); i++) {
            if(w.charAt(i) == '(') {
                count++;
            }else
                count--;
            if(count < 0)
                return false;
        }
        return count == 0;
    }
    static String reverse(String w) {
        StringBuffer str = new StringBuffer();
        for(int i = 0 ; i < w.length() ; i++) {
            if(w.charAt(i) == ')') {
                str.append('(');
            }else
                str.append(')');
        }
        return str.toString();
    }

    int landFishing(int[][] land) {
        int answer = 0;
        //n * 4

        for(int i = 0; i < land.length; i++){ // n행
            System.out.println(land.length);
            for(int j = 0; j < 4; j++){
                System.out.println(land[i].length);
                int max = land[i][j];
                if(max < land[i][j]){
                    max = land[i][j];
                }

            }
        }
        return answer;
    }
    int landFishing2(int[][] land) {
        for(int i = 1 ; i < land.length ; i++) {
            for(int j = 0 ; j < land[0].length ; j++) {
                int max = 0;
                for(int k = 0; k < land[0].length ; k++) {
                    if(k==j)
                        continue;
                    else
                        max = Math.max(max, land[i-1][k]);
                }
                land[i][j] += max;
            }
        }

        Arrays.sort(land[land.length-1]);
        System.out.println(land[land.length-1][land[0].length-1]);
        return land[land.length-1][land[0].length-1];
    }

    public int makeMin(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++){
            answer += A[i]*B[A.length-i-1];
        }


        System.out.println(answer);

        return answer;
    }

    public int[] functionDevelop(int[] progresses, int[] speeds) {

        ArrayList<Integer> answerList = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++){ // 배열길이만큼 돌아
            int sum = progresses[i];
            int cnt = 0;
            while (sum <= 100){
                sum += speeds[i];
                cnt++;
            }
            arrList.add(cnt);
            System.out.println(sum +"  "+ (cnt-1));
        }

        int cnt = 1;
        int j=0;
        while(true){
            if(arrList.get(j) >= arrList.get(j+1)){
                arrList.remove(j+1);
                cnt++;
            }
            else{
                j++;
                answerList.add(cnt);
                cnt = 1;
            }

            if(arrList.size() -1 == answerList.size()){
                answerList.add(cnt);
                break;
            }
        }


        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }

    public void heap(){
        int num = 9;
        int[] heap = {7,6,5,8,3,5,9,1,6};
        // 최대 힙구조 만들기 : 전체개수에서 1/2 만큼만 보면됨
        for(int i = 1; i < num; i++) {
            int c = i;
            do{
                int root = (c -1)/2;
                if(heap[root] < heap[c]){
                    int temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            } while (c != 0);
        }

        //크기 줄여가며 힙 구성하기
        for(int i = num - 1; i >= 0; i--){
            // 가장 큰값 보내고
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            int root = 0;
            int c = 1;
            do {
                c = 2 * root +1;
                if(c < i -1 && heap[c] < heap[c+1] ){
                    c++;
                }
                if(heap[root] < heap[c] && c < i){
                    int tmp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                root = c;
            } while (c < i);
        }
        System.out.println(Arrays.toString(heap));
    }

    public int cupleDelete(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty()&&stack.peek() == c) {
                stack.pop();
                System.out.println(stack);
            }
            else stack.push(c);
        }


        return stack.isEmpty() ? 1 : 0;
    }
    public int[][] matrix(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0 ; i < arr1.length ; ++i){
            for(int j = 0 ; j < arr2[0].length ; ++j){
                for(int k = 0 ; k < arr1[0].length ; ++k) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public int povonachi(int n) {
       // int answer = 0;
       // answer += fibo(n);

        int answer =0;
        int k = fibo(n);
        answer = k%1234567;
        System.out.println(answer);
        return answer;


    }
    public int fibo(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else return fibo(n-1)% 1234567+fibo(n-2)% 1234567;
    }
}

