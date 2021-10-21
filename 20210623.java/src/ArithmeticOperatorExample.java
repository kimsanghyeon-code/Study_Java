// 산출 연산자
public class ArithmeticOperatorExample {
   public static void main(String[] args) {
      int v1 = 5;
      int v2 = 2;
      
      int result1 = v1 + v2;
      System.out.println("result1=" + result1);
      
      int result2 = v1 - v2;
      System.out.println("result2=" + result2 );
      
      int result3 = v1 * v2;
      System.out.println("result3=" + result3);
      
      int result4 = v1 / v2;
      System.out.println("result4=" + result4);
      
      int result5 = v1 % v2;
      System.out.println("result5=" + result5);
      
      double result6 = (double) v1 / v2;
      //정수형데이터를 실수형데이터로 변환해서 
      //정수데이터로 하여금 자신을 나누게 만듬
      //그래서 결과가 실수형데이터로 나오게 유도했음
      //이런 상황을 일때 데이터강제변환연산을 진행한다
      System.out.println("result6=" + result6);
   }
}