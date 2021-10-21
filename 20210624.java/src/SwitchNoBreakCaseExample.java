// break 문이 없는 case
public class SwitchNoBreakCaseExample {
   public static void main(String[] args) {
int time = (int)(Math.random() * 4) + 8; // 8~11 사이의 정수 뽑기
//int num = (int) (Math.random()*n)+start   
//출력하고 싶은 번호가 n
//시작하는 숫자를 뒤에 더하져
//8부터 니까 뒤에 8을 더하고
//4개의 숫자를 구하려니까. 
//랜덤메서드에 4를 곱한것이다
System.out.println("[현재시간: " + time + "시]");
      
      switch(time) {
      case 8:
         System.out.println("출근합니다.");
      case 9:
         System.out.println("회의합니다.");
      case 10:
         System.out.println("업무를 봅니다.");
      default:
         System.out.println("외근을 나갑니다.");
      }
   }
}