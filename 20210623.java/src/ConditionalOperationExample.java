// 삼항 연산자
public class ConditionalOperationExample {
   public static void main(String[] args) {
      int score = 85;
      char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
      //삼항연산자인것은 맞는데
      //조건이 그룹별로 중첩 삼항연산자가 된거에요
      //삼항연산자가 표기하기에는 단순해서 
      //연습코드를 이런식으로도 만들수있다는 것을 보여줬다고 판단됨
      System.out.println(score + "점은 " + grade + "등급입니다.");
   }
}