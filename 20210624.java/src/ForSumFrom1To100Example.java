//1 ���� 100���� ����ϱ�
public class ForSumFrom1To100Example {
   
   public static void main(String[] args) {
      int sum = 0; // �հ� ����
      int endNum = 100;
      //for������ ���������� ������ �Ǵ� ���� �����μ� ó���ߴ�
      for(int i = 1; i <= endNum; i++) {
         sum += i;
         //������
      }
      System.out.println("\n1���� " + endNum + "���� ��: " + sum);
   }
}