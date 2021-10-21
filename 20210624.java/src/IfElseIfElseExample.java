//import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
       int score = 0;
       
//       Scanner scan = new Scanner(System.in);
//데이터타입이되어주는클래스명 객체를담을객체변수명
// 이퀄뒤에 new키워드로 Scanner클래스의 객체를 만든다
//System.in은 데이터를 입력받게 해주는 것
//scan객체변수는 외부에서 데이터를 입력받는 작업을 해주는 객체       
 System.out.print("점수를 입력하시오: ");
// score = scan.nextInt();
 //scan객체변수의 nextInt메서드를 작동시킨다
//정수를 입력받음 그후에 score변수에 입력받은 정수를 저장한다
       
       if(score >= 90) {
          System.out.println("점수가 100~90입니다");
          System.out.println("등급은 A 입니다.");
       } else if(score >= 80) {
//80점이상이냐라고 물어보는거죠. score변수의 값이          
          System.out.println("점수가 80~89 입니다.");
          System.out.println("등급은 B 입니다.");
       } else if(score >= 70) {
          System.out.println("점수가 70~79 입니다.");
          System.out.println("등급은 C 입니다.");
       } else if(score >= 60) {
          System.out.println("점수가 60~69 입니다.");
          System.out.println("등급은 D 입니다.");
       } else {
//else 어디에도 속하지않게 될때는 여기로 결과를 모아준다          
          System.out.println("점수가 60 미만 입니다.");
          System.out.println("등급은 F 입니다.");
       }
   }
}