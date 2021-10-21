// 변환으로 인한 데이터 손실이 발생되지 않도록 한다.
public class CheckValueBeforeCasting {
   public static void main(String[] args) {
      int i = 12; 
      
      if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) { // if( i<-128 || i>127)과 동일
//Byte.MIN_VALUE 바이트데이터타입에서 가장 작은값을 불러와줌
//Byte.MAX_VALUE 바이트데이터타입에서 가장 큰값을 불러와줌
//더블파이프는 or연산자임
         System.out.println("byte 타입으로 변환할 수 없습니다.");
         System.out.println("값을 다시 확인해 주세요");
         //바이트데이터타입으로 변환할수있는지 확인한것이고
      } else {
byte b = (byte) i;//검증기준을 통과했다면 byte캐스팅연산을
//해서 int였던 데이터가 byte가 되서 b변수에 저장된다
         System.out.println(b);
         //출력을 한다
      }
   }
}