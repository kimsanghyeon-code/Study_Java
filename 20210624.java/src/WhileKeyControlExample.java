// 키보드로 while 문 제어
public class WhileKeyControlExample {
   public static void main(String[] args) throws Exception {
      boolean run = true;
      //run은 트루
      int speed = 0;//speed는 0
      int keyCode = 0;//keyCode도 0
while(run) {//while문이 시작
if(keyCode != 12 && keyCode != 10) { // Enter 키가 입력되면 캐리지리턴(13), 라인피드(10)가 입력되므로 이 값을 제외
//만약에 keyCode가 12가 아니고 10아닙니까. 이두개의 조건을 만족하면 아래의 내용이 진행됨   
      System.out.println("\n-------------------------------");
            System.out.println(" 1.증속 | 2.감속 | 3.중지"); // 메뉴 생성
            System.out.println("-------------------------------");
            System.out.print("선택: ");
         }
         keyCode = System.in.read(); // 키보드의 키 코드를 읽음
         //시스템의 리드메서드를 통해서 키보드의 키값을 입력받음
         //그것을 keyCode변수에 저장을 함
         
         if(keyCode == 49) { // 1을 읽었을 경우
            speed++;//숫자1을 누르면 키코드가 49랑 같다
      //키보드에서 숫자1이 49
      //speed변수값을 1을 올려라
            System.out.println("현재 속도=" + speed);
         }  else if(keyCode == 50) { // 2을 읽었을 경우
            speed--;//숫자2를 눌렀다면 키코드는 50과 같아짐
            //speed변수값을 1을 줄인다
            System.out.println("현재 속도=" + speed);
         } else if(keyCode == 51) { // 3을 읽었을 경우
   // 키보드3을 누르면 키코드가 51을 입력받은것과 같아짐
            run = false; //  while 문을 종료하기 위해 run 변수에 false를 저장
            //run에 false를 넣어줌
            //while문이 종료하게됨
         }
      }
      System.out.println("프로그램 종료");
   }
}