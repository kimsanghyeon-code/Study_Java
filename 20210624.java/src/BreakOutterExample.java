//바깥쪽 반복문 종료
public class BreakOutterExample {
   public static void main(String[] args) {
      Outter: for(char upper='A'; upper <= 'Z'; upper++) {
//문장앞에 레이블을 정해주고 
//upper는 대문자에이로 세팅 대문자제트전까지 반복한다
         for (char lower='a'; lower < 'z'; lower++) {
//lower는 소문자에이로 세팅하고 소문자제트전까지 반복한다
System.out.println(upper + "-" + lower);
//어퍼와 로어를 출력한다
            if(lower == 'g') {
//만약에 로어lower의 값이  g랑 같다면               
//break한다 어디에서? Outter레이블이 끝나는 위치에서 
//가장 상위의for문이 Outter인데 그수준에서 종료가 된다               
               break Outter;
            }
         }
      }
   //프로그램을 완전 종료하게 된다
      System.out.println("프로그램 실행 종료");
   }
}