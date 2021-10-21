//1 부터 100까지 출력하기
public class ForSumFrom1To100Example {
   
   public static void main(String[] args) {
      int sum = 0; // 합계 변수
      int endNum = 100;
      //for문에서 종료조건의 기준이 되는 수를 변수로서 처리했다
      for(int i = 1; i <= endNum; i++) {
         sum += i;
         //누적합
      }
      System.out.println("\n1부터 " + endNum + "까지 합: " + sum);
   }
}