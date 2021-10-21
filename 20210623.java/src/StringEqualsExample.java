// 문자열 비교
public class StringEqualsExample {
   public static void main(String[] args) {
      String strVar1 = "신민철";
      //String데이터타입
      //C언어에서 int,double...
      //java String데이터타입등장!
//
      String strVar2 = "신민철";
      //신민철 문자열 객체의 주소를 strVar1과 strVar2
      //모두 같은 메모리주소값을 갖게 되어있다
      
      
      String strVar3 = new String("신민철");
//new키워드는 객체를 생성한다      
//new String 문자열객체를 새로 생성한다      
      System.out.println(strVar1 == strVar2);
      System.out.println(strVar2 == strVar3);
      System.out.println();
      System.out.println(strVar1.equals(strVar2));
//객체주소값들어간객체변수는 메서드와 클래스의 속성을 저장하고 있는것이고,
//저장할수있는것임.
//strVar1.equals 
//쩜이퀄즈메서드는 쩜이 붙어있는 좌측의 객체변수가 가르키는 
//주소값의 객체하고 괄호안에 있는 객체변수의 주소값의 객체하고 내용이 같다라는 연산이예요
      
      System.out.println(strVar1.equals(strVar3));
   }
}