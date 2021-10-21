import java.util.Scanner;

// do-while 문
public class DoWhileExample {
   public static void main(String[] args) {
       System.out.println("메세지를 입력하세요");
       System.out.println("프로그램을 종료하려면 q를 입력하세요.");
       
 Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
 //스캐너객체를 생성하고 스캐너클래스데이터타입을 받은 scanner객체변수를 정의함
   String inputString;//입력되어지는 데이터를 저장할 변수선언
       
       do {
          System.out.print(">");
          inputString = scanner.nextLine(); // 키보드로 입력한 문자열 받음.
          //키보드를 입력받음 한줄의 데이터를 받는다
          //inputString변수에 저장을 함
          System.out.println(inputString);
          //저장된 내용을 출력한다
       } while( !inputString.equals("q")); // 문자열을 비교할 때는 equals() 메소드를 사용
       //inputString변수에 있는 값과 q라는 문자를 비교해주는 것이 equls메서드의 작업이다
       //입력한값이 q이면 equals메서드는 참을 출력하겠죠
       //!부정이 있어서 같은 값이 들어와서 true가되면 
       //상태가 뒤집어져서 while조건자체는 false가 되어버린다
       
       System.out.println("");
       System.out.println("프로그램 종료");
   }
}