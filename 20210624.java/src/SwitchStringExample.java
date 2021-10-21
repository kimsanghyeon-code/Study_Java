// String 타입의 Switch문
public class SwitchStringExample {
   public static void main(String[] args) {
      String position = "과장";
      //String클래스데이터타입을 받는 position변수에
      //과장을 저장하는 거예요
      
      switch (position) {
      case "부장":
         System.out.println("700만원");
         break;
      case "과장":
         System.out.println("500만원");
         break;
      default:
         System.out.println("300만원");
         break;
      }
   }
}