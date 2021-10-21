// if-else 문
public class IfElseExample {
   public static void main(String[] args) {
      int score = 85;
      
      if (score >= 90) {
         System.out.println("점수가 90보다 큽니다.");
         System.out.println("등급은 A 입니다.");
      }
      else { //이런경우는 else추가 되서 if를 필요없게 만듬
         System.out.println("점수가 90보다 작습니다.");
         System.out.println("등급은 B 입니다.");
      }
   }
}