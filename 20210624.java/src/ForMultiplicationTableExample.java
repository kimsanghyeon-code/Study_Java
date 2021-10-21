import java.util.Scanner;
/**
 * 구구단 출력하기
 * 
 */
public class ForMultiplicationTableExample {
   public static void main(String[] args) {
      int m = 0;
      boolean flag = false;//플러그가 거짓으로 세팅
      Scanner sc = new Scanner(System.in);
      //Scanner클래스데이터타입을 적용한 sc객체변수생성
      //new Scanner(System.in);
      //new키워드로 스캐너클래스객체생성하는 데
      //생성되는 객체에는 system을 통해서 들어오는 데이터를
      //객체가 받아서 
      //sc객체변수에 넣어준다
      
      while(!flag) 
      //flag는 false로 초기화되었으니
      //flag앞에 !부정이 붙어서 true가 됨
      //
      {
System.out.print("출력하기 원하는 단을 입력하시오(0.exit): ");
m = sc.nextInt();
//sc객체변수의 nextInt메서드가 동작을 함
//외부에서 입력값이 들어옴 
//그것이 m으로 들어가서 저장됨
         if( m == 0) {//m에 0과 같다면
            //0이 입력됐다면
            flag = true;//flag에 true를 넣어줄것
            continue;
//이번회차종료하는데 while문을 빠져나가지는 않는다
//while문을 다시 실행하는데, 그때는 flat가 true를 가지고 들어간다
//!부정때문에 false가 되서 while을 종료하게 되는거예요
            //0을넣었으니까. 
         }
System.out.println("**** 구구단 " + m + "단 ****");
//입력값이 구구단의 앞부분이 되고 i는 구구단에서 뒤에 배치는 요소가 된다
         for(int i = 2; i <= 9; i++ ) {
            System.out.printf( "%2d x %2d  = %2d\n",  m,  i,  (m * i));
         }
         System.out.println("-----------------------------");
      }
      sc.close();//sc객체변수는 사용후에 닫는다 종료시킨다
      System.out.println("프로그램 종료");
   }
}