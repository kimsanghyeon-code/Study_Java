// 정확하게 계산할 때에는 부동소수점 타입을 사용하지 않는다.
public class AccuracyExample2 {
   public static void main(String[] args) {
      int apple = 1;
      
      int totalPieces= apple * 10;
      int number = 7;
      int temp = totalPieces - number;
      
      double result = temp / 10.0;
      //최종결과가 담기는 변수에만 double형을 적용한것임
      //수학적인것이 필요한 영역은 실무에서 금융쪽
      
      System.out.println("사과 한개에서 ");
      System.out.println("0.7 조각을 빼면,");
      System.out.println(result + " 조각이 남는다.");
   }
}