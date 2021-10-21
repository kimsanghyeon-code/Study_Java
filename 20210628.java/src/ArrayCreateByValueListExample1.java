// 값 목록으로 배열 생성
public class ArrayCreateByValueListExample1 {

   public static void main(String[] args) {
      int[] scores = { 83, 90, 87 };
// 대괄호가 배열을 의미함
//정수형배열의 데이터타입을 scores변수에 적용하겠다는 뜻임
//int[]
      
      System.out.println("scores[0] : " + scores[0]);
//scores[0]은 scores배열변수의 0번인덱스를 의미함
      System.out.println("scores[1] : " + scores[1]);
//1번인덱스
      System.out.println("scores[2] : " + scores[2]);
//2번인덱스
      
      int sum = 0; //합계
      for (int i=0; i<3; i++) {
//i가 0부터 3보다 작을때까지 곧 2가 될때까지 총3회반복
         sum += scores[i];
//인덱스는 현재의 i,    0번 인덱스가 sum변수에 누적합이 된다

      }
      System.out.println("총합 : " + sum);//sum변수출력
      double avg = (double) sum / 3; 
//sum변수를 double데이터타입으로 강제변환하고 3으로 나누어준다
//그 값을 avg저장
      System.out.println("평균 : " + avg); //출력

   }
/*
 * 타입[] = { 값0, 값1, 값2, 값3, ... };
 * 
 * 타입[] = 변수
 * 변수 = new 타입[] { 값0, 값1, 값2, 값3, ... };
 */
}