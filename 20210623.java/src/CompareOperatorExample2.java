// 비교 연산자
public class CompareOperatorExample2 {
   public static void main(String[] args) {
      int v2 = 1;
      double v3 = 1.0;
      System.out.println(v2 == v3); // true
      
      double v4 = 0.1;
      float v5 = 0.1f;
//부동소수점을 표현할때는 뒤에 f를붙임
//부동소수점0.1은 근사치임
//0.12024...
      
      System.out.println(v4 == v5); // false;
      System.out.println((float)v4 == v5); // true;
      //v4가 부동소수점데이터화되어서 값이 같게 됨
      System.out.println((int)(v4*10) == (int)(v5*10)); // true;
      //v4와 v5가 정수화되어서 값이 같게 된다
   }
}