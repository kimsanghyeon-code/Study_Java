// �����÷ο� ����
public class OverflowExample {
   public static void main(String[] args) {
      int x = 1000000;//10^6
      int y = 1000000;//10^6
      int z = x * y;
//1,000,000,000,000
//int ����δ� 2,147,483,647
//�����Ҽ��ִ� ������ �Ѿ�� �����Ⱚ�� �����
      System.out.println(z);
   }
}