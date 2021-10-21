// 정확하게 계산할 때에는 부동소숫점 타입을 사용하지 않는다.
public class AccuracyExample1 {
   public static void main(String[] args) {
      int apple = 1;//정수형변수에 1저장
      double pieceUnit = 0.1;//더블형실수형변수중에
      //사이즈큰것임 0.1저장
      int number = 7;
      //정수형변수에 7을 저장
      
      double result = apple - number * pieceUnit;
      //연산우선순위
      // ( ) 가 제일먼저 계산이 됨
      //*와 /가 계산에서 먼저 계산됨
      // + 하고 -가 그다음에 계산이 됨
      //실무에서 많이 보는 데이터타입은
      //int하고 double형이예요
      //string문자열을 작업
      System.out.println("사과 한개에서 ");
      System.out.println("0.7 조각을 빼면.");
      System.out.println(result + "조각이 남는다.");
   }
}