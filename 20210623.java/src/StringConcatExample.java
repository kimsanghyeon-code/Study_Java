// 문자열 연결 연산자
public class StringConcatExample {
   public static void main(String[] args) {
      String str1 = "JDK" + 6.0;
//+기호가 문자열과 같이 나타나면 연결연산자가 되는거예요
      String str2 = str1 + "특징";
      System.out.println(str2);
      
      String str3 = "JDK" + 3 + 3.0;
//연산자우선순위
      String str4 = 3 + 3.0 + "JDK";
//먼저 숫자연산하고 뒤에는 문자열이니까. 연결이 됐음
      System.out.println(str3);
      System.out.println(str4);
   }
}