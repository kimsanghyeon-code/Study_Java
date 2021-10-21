// char 타입의 Switch문
public class SwitchCharExample {
   public static void main(String[] args) {
      char grade = 'B'; //grade변수에 B라는 글자를 넣고
      
      switch (grade) {//switch문을 실행함
      case 'A'://대문자A
      case 'a'://소문자a 둘중하나라도 걸리면 출력을 한다
         System.out.println("우수 회원입니다.");
         break;//break문이 나타남
      case 'B':
      case 'b':
         System.out.println("일반 회원 입니다.");
         break;
      default://a,b외의 글자들이 해당되는 영역이다.
         System.out.println("손님입니다.");
         break;
      }      
   }
}