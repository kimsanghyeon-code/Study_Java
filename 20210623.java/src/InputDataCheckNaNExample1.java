// "NaN" ���ڿ��� ������
public class InputDataCheckNaNExample1 {
   public static void main(String[] args) {
      String userInput = "NaN";  // ����ڷκ��� �Է¹��� ��
double val = Double.valueOf(userInput); // �Է°��� double Ÿ������ ��ȯ
//NaN�� Ű���尡 �Ǽ� ���ڿ������� ����
//doubleŸ�Կ��������̾Ҵµ� 
//�μ��� NaN���ڰ� ����־ �̷����·� �ϸ� 
//��¥ NaN�� ��Ÿ��
//val���� NaN�� ���� ��
      
double currentBalance = 10000.0;
//���� ������ �����ִ� �����ε�
      
currentBalance += val; // currentBalance�� NaN�� �����
//��Ʈ��Ʈ�뷱�������� NaN�� ����ִ� val������ ���ߴ���
      System.out.println(currentBalance);
//����ߴ��� ������ ���� ���ư��� NaN�� ������
   }
}