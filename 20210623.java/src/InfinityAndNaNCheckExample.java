// Infinity 와 NaN
public class InfinityAndNaNCheckExample {
   public static void main(String[] args) {
      int x = 5;
      double y = 0.0;
      
      double z = x / y;
      // double z = x % y;
      
System.out.println(Double.isInfinite(z));
//isInfinite메서드는 인수인 변수값이 
//무한대인지 파악하는 정보메서드임
//Double타입의 이즈인피니티메서드를 작동시킴

System.out.println(Double.isNaN(z));
//Not a Number 숫자값이 아니다
//.isNaN메서드로 판단하는 거예요
//숫자값이 아닌지 판단하는 정보메서드임
//무한대숫자일지라도 숫자가 아닌 상황은 아니다.
if (Double.isInfinite(z) || Double.isNaN(z)) {
//무한대이거나
//숫자가 아니거나
//더블파이프는 오알더블은 첫번째조건이 참이면 뒤에 있는거
//사용을 하지않고 조건식을 끝낸다

   System.out.println("값 산출 불가");
      } else {
         System.out.println(z + 2); // 문제가 되는 코드
         // Infinity + 2 -> Infinity,  NaN + 2 -> NaN
      }
   }
}