// ���ڿ� ���� ������
public class StringConcatExample {
   public static void main(String[] args) {
      String str1 = "JDK" + 6.0;
//+��ȣ�� ���ڿ��� ���� ��Ÿ���� ���Ῥ���ڰ� �Ǵ°ſ���
      String str2 = str1 + "Ư¡";
      System.out.println(str2);
      
      String str3 = "JDK" + 3 + 3.0;
//�����ڿ켱����
      String str4 = 3 + 3.0 + "JDK";
//���� ���ڿ����ϰ� �ڿ��� ���ڿ��̴ϱ�. ������ ����
      System.out.println(str3);
      System.out.println(str4);
   }
}