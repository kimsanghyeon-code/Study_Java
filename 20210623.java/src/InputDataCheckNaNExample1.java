// "NaN" 문자열의 문제점
public class InputDataCheckNaNExample1 {
   public static void main(String[] args) {
      String userInput = "NaN";  // 사용자로부터 입력받은 값
double val = Double.valueOf(userInput); // 입력값을 double 타입으로 변환
//NaN가 키워드가 되서 문자열변수에 들어가서
//double타입에서값을뽑았는데 
//인수가 NaN글자가 들어있어서 이런형태로 하면 
//진짜 NaN이 나타남
//val에는 NaN이 들어가게 됨
      
double currentBalance = 10000.0;
//값의 균형을 맞춰주는 변수인데
      
currentBalance += val; // currentBalance에 NaN이 저장됨
//컨트런트밸런스변수에 NaN이 들어있는 val변수를 더했더니
      System.out.println(currentBalance);
//출력했더니 이전의 값이 날아가고 NaN만 남았음
   }
}