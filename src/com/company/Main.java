package com.company;
public class Main {
    public static void main(String[] args) {

        long beforeTime = System.currentTimeMillis();
        String[] participant = {"11", "22", "33"};
        String[] completion = {"11", "33"};
        //완주 하지 못한 선
        algo_level1 algoLevel1 = new algo_level1();
        algo_level2 algoLevel2 = new algo_level2();
//        algoLevel1.solution(participant,completion);
        // 약수의
           // algoLevel1.mineral(5);
        //문자열 정수로 바꾸기
        //    algoLevel1.stringToInt("-345");
            // 평균구하기
//            int [] arr = {1,2,3,4};
//            algoLevel1.average(arr);
           // String s = "Zbcdefg";
           // algoLevel1.stringDesc(s);
            String text = "ABd";
            int count = 2;
            // algoLevel1.Caesar(text, count);
        int[] arr = {6,12,1};
             //algoLevel1.biggest(arr);
       // algoLevel1.biggestNum(arr);
        String[] names = {"222", "Kim", "222"};
       // algoLevel1.kim(names);
       // algoLevel1.phoneNum("01033334444") ;
        int n = 1268;
        //algoLevel1.findInt(n);
       // algoLevel2.findSosu(numbers);
       // algoLevel1.sqaredstar(names);
      //  algoLevel1.jarisu(n);
        String[] strings = {"sun", "bed", "car"};
        int[] num = {4,3,2,1};
        int[][] arr1 = {{1},{3}};
        int[][] arr2 = {{1},{1}};
        int[] d = {1,3,2,5,4};

       // algoLevel1.stringsort(strings,2);
        //algoLevel1.longlong(186354);
       // algoLevel1.smallNum(num);
        //algoLevel1.lowline(arr1, arr2);
       // algoLevel1.budget(d, 9);
        //algoLevel1.sqrt(121);
       // algoLevel1.Collatz(626331);
       // algoLevel1.hashard(13);
        //String[] phone_book = {"119", "123456", "11923456"};
        //algoLevel1.phoneNum(phone_book);
        //algoLevel1.converseNum(12345);
       // algoLevel1.strangeString("HEllo everyone");
       // algoLevel1.commondivisor(1071,1029);
       // algoLevel1.dartGame("1S2D*3T");
        String[] strings2 = {"abce", "abcd", "cdx"};
        int [] string3 = {3,0,6,1,5};
        //algoLevel1.dartGame2("1S2D*3T");
        //algoLevel1.stringArrange(strings2, 1);
        //algoLevel1.printer(string3, 2);
        int [][] game = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
       // algoLevel1.baseballGame(game);
       // algoLevel1.findsosu("17");
       // algoLevel1.hIndex(string3);
        //algoLevel1.hhIndex(string3);
        int [] arr7 = {1,2,7,6,4};
        int [] height = {6,9,5,7,4};
       // algoLevel1.makeSosu(arr7);
        //algoLevel1.top(height);
       // algoLevel1.t®optwo(height);
       // algoLevel1.numExpression(15);
     //   algoLevel1.rightBracket("()()(()())");

       // algoLevel2.transeBracket("()))((()");
        int[][] land = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};
        //algoLevel2.landFishing(land);
        //algoLevel2.landFishing2(land);
       // algoLevel2.makeMin(a,b);
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        //algoLevel2.functionDevelop(progresses, speeds);
       // algoLevel2.heap();
       // algoLevel2.cupleDelete("baabaa");
        int [][] a = {{1,4},{3,2},{4,1}};
        int [][] b = {{3,3},{3,3}};
        //algoLevel2.matrix(a,b);
        algoLevel2.povonachi(5);

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
