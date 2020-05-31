package com.company;

import java.util.*;

public class algo_level1 {
    //참여자
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String part : participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
            //System.out.println(map.toString());
        }
        for (String comp : completion) {
            map.put(comp, map.getOrDefault(comp, 0) - 1);
            //System.out.println(map.toString());
        }

        System.out.println(map.entrySet());
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer += key + " ";
            }
        }
        return answer;
    }

    public static boolean stringCheck(String s) {
        boolean answer = true;
        System.out.println(s.length() == 4);
        if (s.length() == 5) return false;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                char check = s.charAt(i);
                if (check < 48 || check > 58 || s.equals("")) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return answer;
    }

    public static int[] hateSameNUm(int[] arr) {

        LinkedList answerList = new LinkedList();
        answerList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != (int) answerList.getLast()) {
                answerList.add(arr[i]);
            }
        }
        int[] newArr = new int[answerList.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (int) answerList.get(i);
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    public int mineral(int n) {
        // int answer = 0;
        int sum = 0;
        //약수 뽑아서 배열에 넣고 바로바로 더해
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public int stringToInt(String s) {
        int answer = 0;
        //앞에 부호가 - 면 - 곱해주기
        if (s.charAt(0) == '-') {
            answer = Integer.parseInt(s);
            System.out.println("음수" + answer);
            return answer * -1;
        } else {
            answer = Integer.parseInt(s);
            System.out.println("양수" + answer);
            return answer;
        }
//        StringBuffer strBuf = new StringBuffer();
//        for(int i = 0; i < s.length(); i++) {
//            strBuf.append(s.charAt(i));
//        }
//        answer = Integer.parseInt(strBuf.toString());
//        System.out.println(answer);
    }

    // 20.03.01 평균구하기
    public double average(int[] arr) {
        double answer = 0;
        System.out.println("length" + arr.length);
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("sum" + sum);
        }
        answer = sum / arr.length;
        System.out.println(answer);
        //Arrays.stream(array).average().orElse(0);
        return answer;
    }

    //04.01 문자열 내림차순 배
    public String stringDesc(String s) {
        String answer = "";
        String[] array = s.split("");
        Arrays.sort(array);

        StringBuffer buff = new StringBuffer();
        for (int i = array.length - 1; i >= 0; i--) {
            buff.append(array[i]);
        }
        System.out.println(buff.toString());
        return answer;
    }

    //04.02 시저암호
    public String Caesar(String s, int n) {
        String answer = "";
        String[] charArray = s.split("");
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(Integer.parseInt(charArray[i]));
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) { //소문
                ch = (char) ((ch + n % 26 - 'a') % 26 + 'a');
            } else if (Character.isUpperCase(ch)) { //대문
                ch = (char) ((ch + n % 26 - 'A') % 26 + 'A');
            }
            answer += ch;
        }
        return answer;
    }

    //04.06 가장큰

    public String biggest(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        if (arr[0].equals("0")) return "0";

        //그 외의 경우 순차적으로 연결하여 answer return
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        System.out.println(answer);
        return answer;
    }

    public String biggestNum(int[] numbers) {
        String answer = "";
        //Arrays.sort(numbers, Collections.reverseOrder());
        Integer[] arr = new Integer[numbers.length];
        System.out.println(Arrays.toString(numbers));

//        String[] arr = new String[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            arr[i] = String.valueOf(numbers[i]);
//        }
//
//        if (arr[0].equals("0")) return "0";
//
//        //그 외의 경우 순차적으로 연결하여 answer return
//        for (int i = 0; i < arr.length; i++) {
//            answer += arr[i];
//        }
//        System.out.println(answer);
        return answer;
    }

    public String kim(String[] seoul) {
        String answer = "";
        System.out.println(seoul.length);
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                System.out.println(answer);
            }
        }
        return answer;
    }


    public String phoneNum(String phone_number) {
        String answer = "";
        String star = "*";
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer = answer + star;
            } else {
                answer = answer + phone_number.charAt(i);
            }
        }
        System.out.println(answer);

        return answer;
    }

    public String oddEven(int num) {
        String answer = "";
        if (num % 2 == 0 || num == 0) {
            answer = "Even";
        } else answer = "Odd";
        return answer;
    }

    //04.13 소수찾기
    //소수는 나눠지는 수가 나 자신만 있는 수
    public int findInt(int n) {
        int answer = 0;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isSosu = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSosu = true;
                }
            }
            if (isSosu == false) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
        return count;
    }

    //직사각형 별찍
    public static void sqaredstar(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //System.out.println(a + b);
    }

    //자릿수 더하기
    public int jarisu(int n) {
        int answer = 0;

//        for(int i = 0;i < n;i++){
//            System.out.println(n[i]);
//        }
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        System.out.println(answer);

        return answer;
    }

    public String[] stringsort(String[] strings, int n) {
        String[] answer = {};
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(n) > strings[i + 1].charAt(n)) {
                String temp = strings[i];
                strings[i] = strings[i + 1];
                strings[i + 1] = temp;
            }

        }


        System.out.println();
        return answer;
    }
    /*
    자바 스트링 비교하는 방법
    .equals()
    ===
    compareTo()
     */

    public void swap(String[] arr, int num1, int num2) {
        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public int trainning(int n, int[] lost, int[] reserve) {
        int answer = 0;


        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                // if()
            }

        }
        return answer;
    }

    public long longlong(long n) {
        long answer = 0;
        String num = String.valueOf(n);
        String str;
        // System.out.println(length);
        String[] arr = num.split(""); //하나하나 잘라
        Arrays.sort(arr); //정렬해줘
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]) * Math.pow(10, i);
            // System.out.println(answer);
        }
        System.out.println(answer);
        return answer;
    }

    public int[] smallNum(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int j = 1; j < arr.length; j++) {
            min = Math.min(min, arr[j]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                continue;
            }
            result[index++] = arr[i];
        }
        System.out.println((Arrays.toString(result)));
        return result;
    }

    public int[][] lowline(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("i" + i);
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("j" + j);
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(answer[i][j]);
            }
        }
        return answer;
    }


    public int budget(int[] d, int budget) { //d는 신청한 금액 , budget은 예산액
        // 적은 금액을 지원해 줄 수는 없습니다.
        int answer = 0;
        int max = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {

            System.out.println("d[i]" + d[i]);
            if (budget >= d[i]) {
                budget = budget - d[i];
                System.out.println("budget " + budget);
                answer++;
            }
        }
        System.out.println(answer);

        return answer;
    }


    public long sqrt(long n) {
        long answer = 0;
        Double sqrt = Math.sqrt(n);
        if (sqrt == sqrt.intValue()) {
            return (long) Math.pow(sqrt + 1, 2);
        } else return -1;
        //System.out.println(sqrt);
        //System.out.println(sqrt.intValue());
        //return answer;
    }

    public long[] nnxx(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (x * (i + 1));
        }
        return answer;
    }


    public int Collatz(int num) {
        int answer = 0;
        int cnt = 0;
        while (num != 1) {
            if (num % 2 == 0) {//짝수라면
                num = num / 2;
                cnt++;
                System.out.println("짝수 : " + num + " " + cnt);
            } else {
                num = num * 3 + 1;
                cnt++;
                System.out.println("홀수 : " + num + " " + cnt);
            }
            if (cnt > 500) {
                return -1;
            }
        }
        System.out.println(cnt);
        return cnt;
    }

    public boolean hashard(int x) {
        boolean answer = true;
        String num = Integer.toString(x);
        String[] arr = num.split("");
        int number = 0;

        for (int i = 0; i < num.length(); i++) {
            System.out.println(arr[i]);
            number += Integer.parseInt(arr[i]);
            //System.out.println(arr[i].getClass().getName());  - 타입 확인하
            //  number += arr[i];
        }
        System.out.println(x + " " + number + "  = " + x % number);
        if (x % number == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public boolean phoneNum(String[] phone_book) {
        boolean answer = true;
        //일단 공백 제거
        for (int i = 0; i < phone_book.length; i++) {

        }


        return answer;
    }

    public int[] converseNum(long n) {

        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        //char [] arr = num.toCharArray();
        int cnt = num.length() - 1;
        for (int i = 0; i < num.length(); i++) {
            answer[cnt--] = num.charAt(i) - '0';

            // System.out.println(num.charAt(i));
        }
        //Arrays.sort(answer, Collections.reverseOrder());
        System.out.println(Arrays.toString(answer));


        return answer;
    }

    public String strangeString(String s) {
        String answer = "";
        int index = 1;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                System.out.println("공백");
                continue;
            }
            String temp = new String(charArr[i] + "");
            if (index % 2 == 0) { //대문자로 바꾸
                temp = temp.toLowerCase();
                charArr[i] = temp.charAt(0);
                System.out.println(charArr[i] + "대");
            } else {
                //소문자로 바꾸
                //String temp = Character.toString(charArr[i]);
                temp = temp.toUpperCase();
                charArr[i] = temp.charAt(0);
                System.out.println(charArr[i] + "소");
            }
            index++;
        }
        System.out.println(charArr);
        return answer;
    }

    public int[] commondivisor(int n, int m) {
        int[] answer = new int[2];
        int max = n;
        int min = m;
        int remainder = 0;
        if (n < m) {
            max = m;
            min = n;
        }
        System.out.println(max + " " + min);
        System.out.println(max % min);
        while (min != 0) {
            remainder = min;
            min = max % min;
            max = remainder;
            System.out.println(max + " " + min);
            answer[0] = max;
        }
        System.out.println("m" + m + ", n" + n + "max" + max);
        answer[1] = (m * n) / max;
//       if(max%min != 0){
//           remainder = min;
//           min = max%min;
//           max = remainde®r;
//           System.out.println(max +" "+ min);
//       }
        //두수의 곱을 최대공약수로 나누면 최소공배
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public int dartGame(String dartResult) {
        //S-1 D-2 T-3
        // *-2배 #-해당점수마이너스
        int answer = 0;
        int[] ans = new int[3];
//        String[] array ;
//        array = dartResult.split("");
        char[] a = dartResult.toCharArray();

        for (int j = 0; j < ans.length; j++) {
            System.out.println("j = " + j);
            for (int i = 0; i < a.length; i++) {
                System.out.println("i = " + i);
                if (Character.isDigit(a[i])) { //숫자인지 판단하는 메소드
                    System.out.println(a[i] + "is num");
                    ans[j] += Integer.parseInt(a[i] + "");
                    if (j != 0) j++;
                } else {
                    if (a[i] == 'S') {
                        System.out.println(a[i] + "is S");
                    } else if (a[i] == 'D') {
                        ans[j] += (Integer.parseInt(a[i - 1] + "") * 2);
                        System.out.println(a[i] + "is D");
                    } else if (a[i] == 'T') {
                        ans[j] += (Integer.parseInt(a[i - 1] + "") * 3);
                        System.out.println(a[i] + "is T");
                    } else if (a[i] == '*') {
                        ans[j] += Integer.parseInt(a[i - 2] + "") * 2;
                        System.out.println(a[i] + "is *");
                    } else {
                        ans[j] += -Integer.parseInt(a[i - 2] + "");
                        System.out.println(a[i] + "is #");
                    }
                }
                ans[j] += ans[j];
            }
        }
        System.out.println(Arrays.toString(ans));
        return answer;


    }

    public int dartGame2(String dartResult) {
        int[] score = new int[3];
        int answer = 0;
        int scoreIdx = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            System.out.println(ch);
            if (ch == 'S' || ch == 'D' || ch == 'T') {
                if (ch == 'D')
                    score[scoreIdx - 1] *= score[scoreIdx - 1];
                else if (ch == 'T')
                    score[scoreIdx - 1] = score[scoreIdx - 1] * score[scoreIdx - 1] * score[scoreIdx - 1];
            } else if (ch == '*' || ch == '#') {
                if (ch == '*') {
                    score[scoreIdx - 1] *= 2;
                    if (scoreIdx > 1)
                        score[scoreIdx - 2] *= 2;
                } else {
                    score[scoreIdx - 1] *= -1;
                }
            } else if (ch - '0' >= 0 && ch - '0' < 10) {
                if (ch - '0' == 1) {
                    if (dartResult.charAt(i + 1) - '0' == 0) {
                        score[scoreIdx] = 10;
                        i++;
                        scoreIdx++;
                        continue;
                    } else {
                        score[scoreIdx] = 1;
                    }
                } else {
                    score[scoreIdx] = dartResult.charAt(i) - '0';
                }
                scoreIdx++;
            }
        }
        answer = score[0] + score[1] + score[2];
        return answer;
    }

    public String[] stringArrange(String[] strings, int n) {
        String[] answer = {};

        for (int j = 0; j < strings.length - 1; j++) {
            for (int i = j + 1; i < strings.length; i++) {
                System.out.println("j :" + j + "/ i :" + i);
                if (strings[j].charAt(n) > strings[i].charAt(n)) {
                    System.out.println(strings[j].charAt(n) + " > " + strings[j + 1].charAt(n));
                    String temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                    System.out.println(Arrays.toString(strings));
                } else if (strings[j].charAt(n) == strings[i].charAt(n)) {
                    if (strings[j].compareTo(strings[i]) > 0) {
                        String temp = strings[j];
                        strings[j] = strings[i];
                        strings[i] = temp;
                        System.out.println(Arrays.toString(strings));
                    }

                }
            }
        }

        return answer;
    }

    public String onetwofourcountry(int n) {
        String answer = "";
        //한자리수는


        return answer;
    }

    public int printer(int[] priorities, int location) {
//        int answer = 1;
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
//        for(int j : priorities) priorityQueue.add(j);
//        System.out.println(priorityQueue); // 높은 우선순위대로 정렬한거
//
////        poll() : 큐에서 우선순위가 가장 높은 요소를 빼냅니다. 즉 반환 후에 큐에서 삭제됩니다.
////        peek() : poll과 달리 큐에서 삭제하지 않고 가장 우선순위가 높은 요소를 얻습니다.
//
//        while(!priorityQueue.isEmpty()){
//            for(int i = 0; i < priorities.length; i++){
//                if(priorities[i] == priorityQueue.peek()){
//                    if(i == location){
//                        return answer;
//                    }
//                    priorityQueue.poll();
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }
        List<Integer> list = new ArrayList<>();
        for (int priority : priorities) {
            list.add(priority);
        }
        System.out.println(list);

        int turn = 1;
        while (!list.isEmpty()) {
            final Integer j = list.get(0);
            if (list.stream().anyMatch(v -> j < v)) {
                list.add(list.remove(0));
            } else {
                if (location == 0) {
                    return turn;
                }
                list.remove(0);
                turn++;
            }

            if (location > 0) {
                location--;
            } else {
                location = list.size() - 1;
            }
        }

        throw new IllegalArgumentException();
    }

    public int baseballGame(int[][] baseball) {
        int answer = 0;
        ArrayList list = new ArrayList();
        Stack<String> stack = new Stack<>();
//      숫자는 맞지만, 위치가 틀렸을 때는 볼
//      숫자와 위치가 모두 맞을 때는 스트라이크
//      숫자와 위치가 모두 틀렸을 때는 아웃
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int z = 1; z < 10; z++) {
                    if (i != j && j != z && i != z) {
                        stack.add(String.valueOf(i * 100 + j * 10 + z));
                    }
                }
            }
        }
        System.out.println(stack);
        for (int a = 0; a < stack.size(); a++) {

        }

        return answer;
    }

    public int findsosu(String numbers) {
        int answer = 0;
        char[] str = numbers.toCharArray();

//        System.out.println(str.length); // char로 바뀌었어
//        int[] arr = new int[str.length];
//
//        for(int i = 0; i < arr.length; i++){
//            arr
//
//        }

        return answer;
    }

    public int hIndex(int[] citations) {
        int answer = 0;
        int esang = 0;
        int eha = 0;
//
        for (int i = 0; i <= citations.length; i++) {
            for (int h = 0; h < citations.length; h++) {
                System.out.println("h " + h);
                System.out.println("citations[h] " + citations[h]);
                if (citations[h] > i) {
                    esang++;
                } else if (citations[h] < i) {
                    eha++;
                } else {
                    esang++;
                    eha++;
                }
            }
            System.out.println("esnag " + esang + " eha " + eha);
            if (esang == eha) {
                answer = esang;
                System.out.println("esnag " + esang + " eha " + eha + "Hindex 찾았다 ");
            } else {
                esang = 0;
                eha = 0;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public int hhIndex(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);


        System.out.println(answer);
        return answer;
    }

    public int makeSosu(int[] nums) {
        int answer = -1;
        int sum = 0; // 소수인지 검사하려는 3수의 합
        int cnt = 0; // 소수의 개수
        boolean sosu = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int z = j + 1; z < nums.length; z++) {
                    sum = nums[i] + nums[j] + nums[z];
                    if (sum >= 2) {
                        sosu = isSosu(sum);
                    }
                    if (sosu == true) {
                        cnt++;
                    }

                }
            }
        }
        System.out.println(cnt);
        return answer;
    }

    public boolean isSosu(int num) {
        boolean sosu = true;

        if (num == 2) {
            return sosu;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sosu = false;
                break;
            }
        }
        System.out.println("num : " + num + ", sosu : " + sosu);
        return sosu;

    }

    public int[] top(int[] heights) {
        int num = heights.length;
        int[] answer = new int[num];

        for(int i = heights.length-1; i >= 0; i--) {
            for(int j = 0; j < i; j++){
                if(heights[j] > heights[i]){
                    answer[i] = j+1;
                }
            }
        }
            System.out.println(Arrays.toString(answer));



        return answer;
    }
    public int[] toptwo(int[] heights) {
        Stack<Integer> st = new Stack<Integer>();
        int t_len = heights.length;//number of tower;
        int[] answer = new int[t_len];
        //array to stack
        for(int i=0; i<t_len; i++){
            st.push(heights[i]);
        }

        System.out.println(st);
        for(int i=0 ;i<t_len; i++){
            int target = st.pop();
            for(int j = t_len-2-i ;j>=0; j--){
                if(heights[j]>target){
                    answer[t_len-i-1] = j+1;
                    break;
                }
            }
        }
        return answer;
    }

    public int numExpression(int n) {

        //주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있습니다. -> 미친 방법이네
        int answer = 0;
        int cnt = 0;
        for(int i = 1; i < n ; i++){ // 처음 기준 수
            int sum = 0;
            sum+=i;
            for(int j = i+1 ; j < n; j++) { //늘려서 더헤줄
                sum += j;
                System.out.println("i-"+i+" j-"+j+" sum-"+sum);
                if(sum == n){
                    cnt++;
                    System.out.println("cnt++"+cnt);
                    sum = 0;
                    break;
                } else if(sum>n){
                    break;
                }

            }
        }
        System.out.println(cnt+1);
        return answer;
    }

    boolean rightBracket(String s) {
        boolean answer = false;

        int sum = 0;
        String[] str = s.split("");
       // System.out.println(s.length());
        for(int i = 0; i < s.length(); i++) {
            if (str[i].equals("(")) {
                sum++;
            }
            if (str[i].equals(")")) {
                sum--;
            }
        }
            //System.out.println(str[i]+"------"+str[i].equals("(")+"---"+sum);
            if( sum == 0){
                answer = true;
            }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);
        return answer;
    }




}