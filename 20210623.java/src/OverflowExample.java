// 오버플로우 예제
public class OverflowExample {
   public static void main(String[] args) {
      int x = 1000000;//10^6
      int y = 1000000;//10^6
      int z = x * y;
//1,000,000,000,000
//int 양수로는 2,147,483,647
//저장할수있는 공간을 넘어가서 쓰레기값이 저장됨
      System.out.println(z);
   }
}