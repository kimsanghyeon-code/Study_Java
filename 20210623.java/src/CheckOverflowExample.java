// 산술 연산 전에 오버플로우를 탐지
public class CheckOverflowExample {
   public static void main(String[] args) {
try { //try 무조건 실행해야하는 블럭
int result = safeAdd(2000000000, 2000000000);
//내부에서 safeAdd메서드를 호출함
//아래의 메서드를 작동시킨다음에 결과값을 result변수에 저장한다
         System.out.println(result);
//result변수값을 출력한다
} catch(ArithmeticException e) { // 예외 처리 코드
//예외객체변수 e는 산술예외처리를 자료형을 받아서
   //아래의 코드를 실행한다
System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
      }
   }
   
public static int safeAdd(int left, int right) {
//int left, int right외부에서 들어오는 데이터는 int정수형으로 받음
if(right > 0) {//두번째인수가 0보다 큰가 그게 맞으면 아래의 중괄호를 실행
if(left > (Integer.MAX_VALUE - right)) { // 예외 발생 코드
   //int데이터타입의 최대값불러와서 right변수두번째인수값을 뺀다음에
   //첫번째입력된 인수와 비교해서 첫번째입력된 값이 크면
throw new ArithmeticException("오버플로우 발생");
//어리스매틱익샙션 산술 예외가 발생했다고 하는 new키워드
//예외에 대한 객체를 발생시킨다
         }
      } else { // right <= 0 일 경우
if(left < (Integer.MIN_VALUE - right))
//만약에 int의 최소값에서 right변수두번째인수를 뺏는데
//그값보다 첫번째인수인 left변수가 작을경우는 
   //정수의 최소값보다 작은 상황
{
throw new ArithmeticException("오버플로우 발생"); // 예외 발생 코드
//최소값보다 작은 경우, 최대값보다 큰 경우 모두 산술예외발생시킴
         }
      }
      return left + right;
//위의 어느경우 에도 해당되지않으면 
//최대값보다 작고 최소값보다 큰 경우에는 두개의 인수를 서로 더해서 돌려줘라
   }
}