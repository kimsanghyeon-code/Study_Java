public class IfExample {
   public static void main(String[] args) {
      int score = 93;//score변수선언과 초기화
      
      if(score >= 90) {
//90이상이면         
         System.out.println("점수가 90보다 큽니다.");
         System.out.println("등급은 A 입니다.");
      }
      if(score < 90) {
//90미만이면
         System.out.println("점수가 90보다 작습니다.");
         System.out.println("등급은 B 입니다.");
      }
   }
}