// ��Ȯ�ϰ� ����� ������ �ε��Ҽ��� Ÿ���� ������� �ʴ´�.
public class AccuracyExample1 {
   public static void main(String[] args) {
      int apple = 1;//������������ 1����
      double pieceUnit = 0.1;//�������Ǽ��������߿�
      //������ū���� 0.1����
      int number = 7;
      //������������ 7�� ����
      
      double result = apple - number * pieceUnit;
      //����켱����
      // ( ) �� ���ϸ��� ����� ��
      //*�� /�� ��꿡�� ���� ����
      // + �ϰ� -�� �״����� ����� ��
      //�ǹ����� ���� ���� ������Ÿ����
      //int�ϰ� double���̿���
      //string���ڿ��� �۾�
      System.out.println("��� �Ѱ����� ");
      System.out.println("0.7 ������ ����.");
      System.out.println(result + "������ ���´�.");
   }
}