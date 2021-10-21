// 비교 연산자
public class CompareOperatorExample1 {
   public static void main(String[] args) {
      int num1 = 10;
      int num2 = 10;
      
      boolean result1 = (num1 == num2);
//==은 두개의 값이 같은지를 판단한다
//객체의 경우는 주소값을 비교하고
//일반데이터면 해당 데이터를 서로 비교함
//객체는 주소값으로 컨트롤하고 실제 변수에도 주소값이 저장됨
// 결과 가 true 숫자 1이 저장된다   
//boolean 불린 데이터타입은 true,false
//1비트의 데이터가 들어가는데
//거짓, 참이냐를 판단하는 변수에서 주로 쓴다
//상태기록을 함 플래그라고도 함
//알고리즘을 적용하려고 할때 많이 나타남
      boolean result2 = (num1 != num2);
//!=은 서로 값이 다른지를 판단한다
      boolean result3 = (num1 <= num2);
//<= 값이 num1이 작거나 같은지를 판단하는거예요
      
      System.out.println("result1 = " + result1);
      System.out.println("result2 = " + result2);
      System.out.println("result3 = " + result3);
      
      char char1 = 'A';
      char char2 = 'B';
      boolean result4 = (char1 < char2);
//A는 65, B는 66
//char1 = 'A'65
//char2 = 'B'66
//B가 더크니까 true가된다
      System.out.println("result4 = " + result4);
   }
}