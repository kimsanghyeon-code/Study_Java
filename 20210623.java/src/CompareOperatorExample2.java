// �� ������
public class CompareOperatorExample2 {
   public static void main(String[] args) {
      int v2 = 1;
      double v3 = 1.0;
      System.out.println(v2 == v3); // true
      
      double v4 = 0.1;
      float v5 = 0.1f;
//�ε��Ҽ����� ǥ���Ҷ��� �ڿ� f������
//�ε��Ҽ���0.1�� �ٻ�ġ��
//0.12024...
      
      System.out.println(v4 == v5); // false;
      System.out.println((float)v4 == v5); // true;
      //v4�� �ε��Ҽ���������ȭ�Ǿ ���� ���� ��
      System.out.println((int)(v4*10) == (int)(v5*10)); // true;
      //v4�� v5�� ����ȭ�Ǿ ���� ���� �ȴ�
   }
}