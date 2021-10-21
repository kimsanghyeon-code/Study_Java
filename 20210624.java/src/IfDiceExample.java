// 주사위의 번호를 뽑는 예제
public class IfDiceExample {
   public static void main(String[] args) {
int num = (int)(Math.random()*6) + 1; 
//Math클래스는 수학수리논리를 다루는 클래스임
//random메서드가 나오는데 0과 1사이의 숫자를 랜덤하게 생성함
//0.0과 1.0 사이에 있기때문에 
//주사위는 정수세계 
//랜덤메서드결과는 실수세계
//각항을 통일을 해줘야함
// 0.0 <= Math.random() < 1.0
// 첫째 영역 0.0
// 두번째영역Math.random()
//세번째영역1.0
// 1에서 10사이의 정수를 얻으려는 코드예요
//0.0*10 <= Math.random()*10 < 1.0*10
//0.0 <= Math.random()*10 < 10.0
//(int)0.0 <=(int) Math.random()*10 <(int) 10.0
//0 <= (int) Math.random()*10 < (int) 10
// (int) Math.random()*10=> 0~9
//0+1 <= (int) (Math.random()*10)+1 < (int) 10+1
//1 <= (int) (Math.random()*10)+1 < (int) 11
//리터럴은 연산에서 사용되는 문자나 숫자들을 의미함
//랜덤메서드가 1과 11사이에서 랜덤한 숫자가 나오도록 
//하기위해서 각항에 추가된 리터럴들을 움직임을보시면
//랜덤메서드에 붙여진 이유를 알게 됨

//(int) (Math.random()*10)+1
//랜덤메서드를 공식화한다면
//n개의 랜덤숫자를 구하려면, 시작숫자는 start라고 한다면
//수식으로 표현하면
//int num = (int) (Math.random()*n)+start
//주사위는 1부터 6까지의 수니까
//int num = (int) (Math.random()*6)+1

// 주사위 번호 하나 뽑기
      
      if(num == 1) {
         System.out.println("1번이 나왔습니다.");
      } else if(num == 2) {
         System.out.println("2번이 나왔습니다.");
      } else if(num == 3) {
         System.out.println("3번이 나왔습니다.");      
      } else if(num == 4) {
         System.out.println("4번이 나왔습니다.");
      } else if(num == 5) {
         System.out.println("5번이 나왔습니다.");
      } else {
         System.out.println("6번이 나왔습니다.");
      }
   }
}