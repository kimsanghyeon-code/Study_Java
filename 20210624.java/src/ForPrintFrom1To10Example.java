//1 부터 10까지 출력하기
public class ForPrintFrom1To10Example {
   public static void main(String[] args) {
      int sum = 0;
      //sum은 누적합을 구하기위한 변수임
      for(int i = 1; i <= 10; i++) {
//i는 1부터 시작함
//i는 10보다 작거나 같을때까지
//중괄호블럭을 실행한다
         System.out.println(i);
         //한줄씩 찍어주고 개행을 함
         sum += i;
         //i의 값은 sum에 누적합계가 계산이 된다
         //System.out.println(sum);
      }
      System.out.println(sum);//반복문이 끝나면 sum
      //누적합을 출력한다
   }
}