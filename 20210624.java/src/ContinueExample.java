// continue를 사용한 for문
public class ContinueExample {
   public static void main(String[] args) {
      for(int i = 1; i <= 10; i++) {
         
         if(i %2 != 0)
            //i를 2로 나눈나머지가 0이랑 같지않다가
            //맞다면 for문을 컨티뉴가 나오기전까지만
            //실행하고 출력은 안하고 
            //for문을 다시 실행한다
            continue;
         System.out.println(i);
      }
      
   }
}