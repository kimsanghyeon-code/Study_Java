// 변수의 사용 범위
public class VariableScopeExample {

   public static void main(String[] args) {
      int v1 = 15;
      if (v1 > 10) {//v1이 10보다 크다면
         int v2 = v1 - 10; 
         //v2는 5가 들어감
         // v2는 블럭 안의 지역 변수
         System.out.println("v2 = " + v2);
      }
      System.out.println("v1 = " + v1);
    //  int v3 = v1 + v2 - 5;  // v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
      //중괄호안에 있는 지역변수는 괄호바깥에서 쓰이지않는다.
   }

}